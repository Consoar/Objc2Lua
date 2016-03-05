package bos.consoar.objc2lua;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dad
 *         Maintains a list of the declarations obtained while parsing
 */
public class ClassDescription {
    private Map<String, ClassDeclaration> headers;
    private Map<String, ClassDeclaration> mFiles;
    private String tempClassName;

    /**
     * @return headers
     */
    public Map<String, ClassDeclaration> getHeaders() {
        return headers;
    }

    /**
     * @param headers
     */
    public void setHeaders(Map<String, ClassDeclaration> headers) {
        this.headers = headers;
    }

    /**
     * @return descriptions for dot-M files
     */
    public Map<String, ClassDeclaration> getmFiles() {
        return mFiles;
    }

    /**
     * @param mFiles
     */
    public void setmFiles(Map<String, ClassDeclaration> mFiles) {
        this.mFiles = mFiles;
    }

    /**
     * @return temp class name based on file name
     */
    public String getTempClassName() {
        return tempClassName;
    }

    /**
     * @param classFileName
     */
    public void setTempClassName(String classFileName) {
        this.tempClassName = classFileName;
    }

    ClassDescription(Map<String, ClassDeclaration> headerFile) {
        this.headers = headerFile;
        this.mFiles = new HashMap<String, ClassDeclaration>();
    }

    ClassDescription() {
        this.headers = new HashMap<String, ClassDeclaration>();
        this.mFiles = new HashMap<String, ClassDeclaration>();
    }

    /**
     * @author Dad
     *         Maintains a list of the methods variables
     *         properties find while parsing and converting to Java
     */
    public static class ClassDeclaration {

        /**
         * @return superClassName
         */
        public String getSuperClassName() {
            return superClassName;
        }

        /**
         * @param superClassName
         */
        public void setSuperClassName(String superClassName) {
            this.superClassName = superClassName;
        }

        /**
         * @return protocol collection
         */
        public ArrayList<String> getProtocols() {
            return protocols;
        }

        /**
         *
         */
        public void clearProtocols() {
            protocols.clear();
        }

        /**
         * @param protocol add protocol to collection
         */
        public void addProtocol(String protocol) {
            protocols.add(protocol);
        }

        /**
         * @return variables
         */
        public ArrayList<String> getVariables() {
            return variables;
        }

        /**
         * clear variables
         */
        public void clearVariables() {
            variables.clear();
        }

        /**
         * @param variable
         */
        public void addVariable(String variable) {
            variables.add(variable);
        }

        /**
         * @param variables
         */
        public void addVariables(ArrayList<String> variables) {
            for (String variable : variables) {
                this.addVariable(variable);
            }
        }

        /**
         * @return property collection
         */
        public ArrayList<String> getProperties() {
            return properties;
        }

        /**
         *
         */
        public void clearProperties() {
            properties.clear();
        }

        /**
         * @param property
         */
        public void addProperty(String property) {
            properties.add(property);
        }

        /**
         * @param declarations
         */
        public void addProperties(ArrayList<String> declarations) {
            for (String decl : declarations) {
                this.addProperty(decl);
            }
        }

        /**
         * @return synthesized collection
         */
        public ArrayList<String> getSynthesized() {
            return synthesized;
        }

        /**
         *
         */
        public void clearSynthesized() {
            synthesized.clear();
        }

        /**
         * @param synthesize
         */
        public void addSynthesized(String synthesize) {
            synthesized.add(synthesize);
        }

        /**
         * @param definitions
         */
        public void addSynthesized(ArrayList<String> definitions) {
            for (String def : definitions) {
                this.addSynthesized(def);
            }
        }

        /**
         * @return dynamic synthesizer collection
         */
        public ArrayList<String> getDynamic() {
            return dynamic;
        }

        /**
         *
         */
        public void clearDynamic() {
            dynamic.clear();
        }

        /**
         * @param dyn
         */
        public void addDynamic(String dyn) {
            dynamic.add(dyn);
        }

        /**
         * @param dynamic
         */
        public void addDynamic(ArrayList<String> dynamic) {
            for (String def : dynamic) {
                this.addDynamic(def);
            }
        }

        /**
         * @return enums collection
         */
        public ArrayList<String> getEnums() {
            return enums;
        }

        /**
         *
         */
        public void clearEnums() {
            enums.clear();
        }

        /**
         * @param en
         */
        public void addEnum(String en) {
            enums.add(en);
        }

        /**
         * @return method definition collection
         */
        public ArrayList<String> getMethod_definitions() {
            return method_definitions;
        }

        /**
         * @param method_definition
         */
        public void addMethod_definition(String method_definition) {
            this.method_definitions.add(method_definition);
        }

        /**
         * @param definitions
         */
        public void addMethod_definitions(ArrayList<String> definitions) {
            for (String def : definitions) {
                this.addMethod_definition(def);
            }
        }

        /**
         *
         */
        public void clearMethod_definition() {
            this.method_definitions.clear();
        }

        /**
         * @return constructor definition collection
         */
        public ArrayList<String> getConstructor_definitions() {
            return constructor_definitions;
        }

        /**
         * @param constructor_definition
         */
        public void addConstructor_definition(String constructor_definition) {
            this.constructor_definitions.add(constructor_definition);
        }

        /**
         * @param definitions
         */
        public void addConstructor_definitions(ArrayList<String> definitions) {
            for (String def : definitions) {
                this.addConstructor_definition(def);
            }
        }

        /**
         *
         */
        public void clearConstructor_definition() {
            this.constructor_definitions.clear();
        }

        /**
         * @return function definition collection
         */
        public ArrayList<String> getFunction_definitions() {
            return function_definitions;
        }

        /**
         * @param function_definition
         */
        public void addFunction_definition(String function_definition) {
            this.function_definitions.add(function_definition);
        }

        /**
         * @param definitions
         */
        public void addFunction_definitions(ArrayList<String> definitions) {
            for (String def : definitions) {
                this.addFunction_definition(def);
            }
        }

        /**
         *
         */
        public void clearFunction_definition() {
            this.function_definitions.clear();
        }

        /**
         * @return method declaration collection
         */
        public ArrayList<String> getMethod_declarations() {
            return method_declarations;
        }

        /**
         * @param declaration
         */
        public void addMethod_declarations(ArrayList<String> declaration) {
            for (String decl : declaration) {
                this.addMethod_declaration(decl);
            }
        }

        /**
         * @param method_declaration
         */
        public void addMethod_declaration(String method_declaration) {
            this.method_declarations.add(method_declaration);
        }

        /**
         *
         */
        public void clearMethod_declaration() {
            this.method_declarations.clear();
        }

        /**
         * @return function collection
         */
        public ArrayList<String> getFunction_declarations() {
            return function_declarations;
        }

        /**
         * @param function_declaration
         */
        public void addFunction_declaration(String function_declaration) {
            this.function_declarations.add(function_declaration);
        }

        /**
         *
         */
        public void clearFunction_declaration() {
            this.function_declarations.clear();
        }

        /**
         * @return the tag
         */
        public String getTag() {
            return tag;
        }

        /**
         * @param tag the tag to set
         */
        public void setTag(String tag) {
            this.tag = tag;
        }

        private ArrayList<String> protocols;
        private ArrayList<String> variables;
        private ArrayList<String> properties;
        private ArrayList<String> method_definitions;
        private ArrayList<String> constructor_definitions;
        private ArrayList<String> function_definitions;
        private ArrayList<String> method_declarations;
        private ArrayList<String> function_declarations;
        // used to declare and make setters getters
        private ArrayList<String> synthesized;
        private ArrayList<String> dynamic;
        private ArrayList<String> enums;
        private String superClassName;
        private String tag;

        ClassDeclaration() {
            protocols = new ArrayList<String>();
            variables = new ArrayList<String>();
            properties = new ArrayList<String>();
            synthesized = new ArrayList<String>();
            dynamic = new ArrayList<String>();
            enums = new ArrayList<String>();
            method_definitions = new ArrayList<String>();
            constructor_definitions = new ArrayList<String>();
            function_definitions = new ArrayList<String>();
            method_declarations = new ArrayList<String>();
            function_declarations = new ArrayList<String>();
            setTag("");
            setSuperClassName("");
        }

        /**
         * @param map
         * @param className
         * @return a declaration holder for the className
         */
        public static ClassDeclaration getClassDeclaration(
                Map<String, ClassDeclaration> map, String className) {
            ClassDeclaration cd = map.get(className);
            if (cd == null) {
                cd = new ClassDeclaration();
                cd.setTag(className);
                map.put(className, cd);
            }
            return cd;
        }
    }
}
