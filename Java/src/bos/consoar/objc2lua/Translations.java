package bos.consoar.objc2lua;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Isaac Clark read translations from external file
 *         and produce them on demand
 */
public class Translations {
    private static Map<String, TranslationMap> allTranslations = new HashMap<String, TranslationMap>();
    public static final String GLOBALMAPKEY = "GLOBALMAPKEY";
    /**
     * name of default external translation file
     */
    public static final String TRANSLATIONFILE = "translate.dat";

    /**
     * Read id and function translations from an external file
     *
     * @param fileName
     * @return true if successful at finding translation file
     */
    public static boolean readTranslations(String fileName) {
        File f = new File(fileName);
        ArrayList<String> fileNames = new ArrayList<String>();
        Scanner sc = null;
        List<String> lines = new ArrayList<String>();
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            return false;
        }
        boolean appendNext = false;
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.length() == 0 || line.charAt(0) == '#') {
                continue;
            }
            if (appendNext) {
                line = lines.get(lines.size() - 1) + line;
                lines.remove(lines.size() - 1);
                appendNext = false;
            }
            if (line.length() - 1 == '\\') {
                appendNext = true;
                line = line.substring(0, line.length() - 1);
            }
            lines.add(line);
        }
        sc.close();
        // convert lines to translations
        for (String line : lines) {
            if (line.startsWith("fileNames:")) {
                String[] parts = line.split(":", 2);
                if (parts.length > 2 && !parts[1].trim().isEmpty()) {

                }
            }
            String[] parts = line.split("[\t ]+", 2);
            if (parts[0].toLowerCase().equals("-replaceid")) {
                ArrayList<String> args = splitEscapeUnquote(parts[1]);
                saveTranslation(fileNames, TranslationType.ID, args.get(0),
                        args.get(1));
            } else if (parts[0].toLowerCase().equals("-replacefunc")) {
                ArrayList<String> args = splitEscapeUnquote(parts[1]);
                String arg2 = args.get(1);
                if (arg2.length() > 0
                        && arg2.substring(arg2.length() - 1).equals("-")) {
                    arg2 = arg2.substring(0, arg2.length() - 2)
                            + CodeFormatter.REVERSE_ARGS_MARKER + "(";
                }
                saveTranslation(fileNames, TranslationType.FUNCTION,
                        args.get(0), arg2);
            } else if (parts[0].toLowerCase().equals("-replaceregex")) {
                ArrayList<String> args = splitEscapeUnquote(parts[1]);
                saveTranslation(fileNames, TranslationType.REGEX, args.get(0),
                        args.get(1));
            } else if (parts[0].toLowerCase().equals("replacecode")) {

            }
        }
        return true;
    }

    private static ArrayList<String> splitEscapeUnquote(String string) {
        ArrayList<String> args = new ArrayList<String>();
        boolean insideDoubleQuote = false;
        boolean insideSingleQuote = false;
        int breakPoint = -1;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!insideDoubleQuote && !insideSingleQuote) {
                if (c == ' ' || c == '\t') {
                    breakPoint = i;
                    break;
                } else if (c == '\"') {
                    if (i == 0) {
                        insideDoubleQuote = true;
                    } else if (string.charAt(i - 1) != '\\') {
                        insideDoubleQuote = true;
                    }
                } else if (c == '\'') {
                    if (i == 0) {
                        insideSingleQuote = true;
                    } else if (string.charAt(i - 1) != '\\') {
                        insideSingleQuote = true;
                    }
                }
            } else if (insideDoubleQuote) {
                if (c == '\"' && string.charAt(i - 1) != '\\') {
                    insideDoubleQuote = false;
                }
            } else if (insideSingleQuote) {
                if (c == '\'' && string.charAt(i - 1) != '\\') {
                    insideDoubleQuote = false;
                }
            }
        }
        if (breakPoint != -1) {
            String arg1 = string.substring(0, breakPoint).trim();
            String arg2 = string.substring(breakPoint).trim();
            arg1 = arg1.substring(1, arg1.length() - 1);
            arg2 = arg2.substring(1, arg2.length() - 1);
            args.add(unescape(arg1));
            args.add(unescape(arg2));
        }
        return args;
    }

    private static String unescape(String arg) {
        arg = arg.replaceAll("\\n", "\n");
        arg = arg.replaceAll("\\t", "\t");
        arg = arg.replaceAll("\\r", "\r");
        arg = arg.replaceAll("\\\"", "\"");
        arg = arg.replaceAll("\\\'", "\'");
        // arg.replaceAll("\\\\", "\\");
        return arg;
    }

    /**
     * @author Isaac Clark
     *         Holds the set of mappings for a set of files
     */
    public static class TranslationMap {
        Map<String, String> functionMap;
        Map<String, String> identificationMap;
        Map<String, String> regexMap;

        TranslationMap() {
            functionMap = new HashMap<String, String>();
            identificationMap = new HashMap<String, String>();
            regexMap = new HashMap<String, String>();
        }

        private Map<String, String> getTranslation(TranslationType type) {
            Map<String, String> myMap = null;
            switch (type) {
                case FUNCTION:
                    myMap = functionMap;
                    break;
                case ID:
                    myMap = identificationMap;
                    break;
                case REGEX:
                    myMap = regexMap;
                    break;

            }
            return myMap;
        }
    }

    /**
     * @param fileName
     * @param type
     * @return the corresponding map for the filename and type; null if not found
     */
    public static Map<String, String> getTranslation(String fileName,
                                                     TranslationType type) {
        TranslationMap mp = allTranslations.get(fileName);
        if (mp == null) {
            return null;
        }
        return mp.getTranslation(type);
    }

    private static void saveTranslation(ArrayList<String> files,
                                        TranslationType type, String match, String code) {
        ArrayList<String> fileList = new ArrayList<String>();
        if (fileList.size() == 0) {
            fileList.add(GLOBALMAPKEY);
        } else {
            fileList.addAll(files);
        }
        TranslationMap myMaps = null;
        for (String key : fileList) {
            myMaps = allTranslations.get(key);
            if (myMaps == null) {
                myMaps = new TranslationMap();
                allTranslations.put(key, myMaps);
            }
            Map<String, String> myTranslation = myMaps.getTranslation(type);
            myTranslation.put(match, code);
        }
    }

    /**
     * @author Isaac Clark
     */
    public enum TranslationType {
        FUNCTION, ID, REGEX
    }

    ;
}
