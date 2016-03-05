package bos.consoar.objc2lua;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Isaac Clark
 *         Holds Parsing Options
 */
public class ParseOptions {
    private ArrayList<String> constructorSignatures;
    private String outputFileName;
    private String inputFileName;
    private String className;
    private String packageName;
    private String directoryTypes;
    private boolean parsingheader;
    private boolean smartConstructorGeneration;
    private boolean constructor;
    private boolean useExternalTranslations;
    private Map<String, String> identityPairs;

    ParseOptions() {
        constructorSignatures = new ArrayList<String>();
        setDirectoryTypes("<String, String>");
        setSmartConstructorGeneration(true);
        setPackageName("");
        this.setUseExternalTranslations(false);
        identityPairs = new HashMap<String, String>();
    }

    /**
     * @return signature collection
     */
    public ArrayList<String> getConstructorSignatures() {
        return constructorSignatures;
    }

    /**
     * @param constructorSignatures
     */
    public void setConstructorSignatures(ArrayList<String> constructorSignatures) {
        this.constructorSignatures = constructorSignatures;
    }

    /**
     * @return output file name
     */
    public String getOutputFileName() {
        return outputFileName;
    }

    /**
     * @param outputFileName
     */
    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    /**
     * @return the inputFileName
     */
    public String getInputFileName() {
        return inputFileName;
    }

    /**
     * @param inputFileName the inputFileName to set
     */
    public void setInputFileName(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    /**
     * @return class name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * @param packageName the packageName to set
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * @return the identityPairs
     */
    public Map<String, String> getIdentityPairs() {
        return identityPairs;
    }

    /**
     * @param key
     * @param value add new identityPair
     */
    public void addIdentityPair(String key, String value) {
        this.identityPairs.put(key, value);
    }

    /**
     * @return true if parsing a header file; false if implementation file
     */
    public boolean isParsingheader() {
        return parsingheader;
    }

    /**
     * @param parsingheader
     */
    public void setParsingheader(boolean parsingheader) {
        this.parsingheader = parsingheader;
    }

    /**
     * @return the smartConstructorGeneration
     */
    public boolean useSmartConstructorGeneration() {
        return smartConstructorGeneration;
    }

    /**
     * @param smartConstructorGeneration the smartConstructorGeneration to set
     */
    public void setSmartConstructorGeneration(boolean smartConstructorGeneration) {
        this.smartConstructorGeneration = smartConstructorGeneration;
    }

    /**
     * @return the directoryTypes
     */
    public String getDirectoryTypes() {
        return directoryTypes;
    }

    /**
     * @param directoryTypes the directoryTypes to set
     */
    public void setDirectoryTypes(String directoryTypes) {
        this.directoryTypes = directoryTypes;
    }

    /**
     * @return the constructor
     */
    public boolean isConstructorMethod() {
        return constructor;
    }

    /**
     * @param constructor the constructor to set
     */
    public void setConstructorMethod(boolean constructor) {
        this.constructor = constructor;
    }

    /**
     * @return the useExternalTranslations
     */
    public boolean useExternalTranslations() {
        return useExternalTranslations;
    }

    /**
     * @param useExternalTranslations the useExternalTranslations to set
     */
    public void setUseExternalTranslations(boolean useExternalTranslations) {
        this.useExternalTranslations = useExternalTranslations;
    }

}
