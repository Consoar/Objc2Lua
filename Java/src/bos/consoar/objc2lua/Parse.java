package bos.consoar.objc2lua;

import bos.consoar.objc2lua.parser.ObjCLexer;
import bos.consoar.objc2lua.parser.ObjCParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Isaac Clark Driver class for running the parser from the command line
 */

public class Parse {
    private static String outputFileName = "";
    private static String directoryName = "";
    private static ArrayList<String> inputFileNames = new ArrayList<String>();
    private static String baseName = "";
    private static String packageName = "";
    private static ArrayList<String> cStructSignals = new ArrayList<String>();

    public void Convert(String directoryInput) throws IOException {

        ParseOptions options = new ParseOptions();
        options.setUseExternalTranslations(Translations.readTranslations(Translations.TRANSLATIONFILE));

        directoryName = directoryInput;
        File f = new File(directoryName);
        File[] files = f.listFiles();
        inputFileNames.clear();
        for (File file : files) {
            if (file.isFile()) {
                if (file.getAbsolutePath().endsWith(".m")) {
                    inputFileNames.add(file.getAbsolutePath());
                }
            }
        }

        for (String con : cStructSignals) {
            options.getConstructorSignatures().add(con);
        }
        ClassDescription cd = new ClassDescription();
        Map<String, ClassDescription.ClassDeclaration> headerDeclarations = cd
                .getHeaders();

        // Set<String> keys = cd.getHeaders().keySet();
        options.setParsingheader(false);
        options.setPackageName(packageName);
        for (String inputFileName : inputFileNames) {
            baseName = baseNameFromPath(inputFileName);
            options.setInputFileName(inputFileName);
            if (inputFileName.length() > 0) {
                BufferedInputStream instream = null;
                instream = new BufferedInputStream(new FileInputStream(
                        inputFileName));
                ANTLRInputStream antlrStream = null;
                antlrStream = new ANTLRInputStream(instream);
                // lexing
                ObjCLexer lexer = new ObjCLexer(antlrStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ObjCParser parser = new ObjCParser(tokens);
                RuleContext tree = parser.translation_unit();

                // walk the tree and activate so we can listen
                ParseTreeWalker walker = new ParseTreeWalker();
                cd = new ClassDescription(headerDeclarations);
                options.setClassName(baseName);
                cd.setTempClassName(baseName);
                options.setParsingheader(false);
                String fName = outputFileName;
                if (fName.length() == 0) {
                    fName = combinePathWithFileName(
                            directoryName, baseName + ".lua");
                }
                options.setOutputFileName(fName);

                walker.walk(new ParserObjcListener(cd, tokens, options), tree);
                System.out.print(options.getOutputFileName() + "\n");

            }
        }
    }

    /**
     * @param fName filename
     * @return returns the base for the given file name
     */
    public static String getBaseName(String fName) {
        String bName = fName;
        int index = fName.lastIndexOf('.');
        if (index >= 0) {
            bName = fName.substring(0, index);
        }
        return bName;
    }

    static String baseNameFromPath(String fName) {
        File f = new File(fName);
        String bName = f.getName();
        return getBaseName(bName);
    }

    private static String combinePathWithFileName(String directory, String fName) {
        return directory + fName;
    }
}
