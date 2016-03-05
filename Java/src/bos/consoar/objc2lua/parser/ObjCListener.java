package bos.consoar.objc2lua.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjCParser}.
 */
public interface ObjCListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by the {@code translation_unit}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterTranslation_unit(ObjCParser.Translation_unitContext ctx);

    /**
     * Exit a parse tree produced by the {@code translation_unit}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitTranslation_unit(ObjCParser.Translation_unitContext ctx);

    /**
     * Enter a parse tree produced by the {@code external_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterExternal_declaration(ObjCParser.External_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code external_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitExternal_declaration(ObjCParser.External_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code preprocessor_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code preprocessor_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code define_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDefine_statement(ObjCParser.Define_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code define_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDefine_statement(ObjCParser.Define_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code macro_specification}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMacro_specification(ObjCParser.Macro_specificationContext ctx);

    /**
     * Exit a parse tree produced by the {@code macro_specification}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMacro_specification(ObjCParser.Macro_specificationContext ctx);

    /**
     * Enter a parse tree produced by the {@code class_interface}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterClass_interface(ObjCParser.Class_interfaceContext ctx);

    /**
     * Exit a parse tree produced by the {@code class_interface}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitClass_interface(ObjCParser.Class_interfaceContext ctx);

    /**
     * Enter a parse tree produced by the {@code category_interface}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCategory_interface(ObjCParser.Category_interfaceContext ctx);

    /**
     * Exit a parse tree produced by the {@code category_interface}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCategory_interface(ObjCParser.Category_interfaceContext ctx);

    /**
     * Enter a parse tree produced by the {@code class_implementation}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterClass_implementation(ObjCParser.Class_implementationContext ctx);

    /**
     * Exit a parse tree produced by the {@code class_implementation}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitClass_implementation(ObjCParser.Class_implementationContext ctx);

    /**
     * Enter a parse tree produced by the {@code category_implementation}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCategory_implementation(ObjCParser.Category_implementationContext ctx);

    /**
     * Exit a parse tree produced by the {@code category_implementation}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCategory_implementation(ObjCParser.Category_implementationContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_requirement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_requirement(ObjCParser.Protocol_requirementContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_requirement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_requirement(ObjCParser.Protocol_requirementContext ctx);

    /**
     * Enter a parse tree produced by the {@code class_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code class_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code class_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterClass_list(ObjCParser.Class_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code class_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitClass_list(ObjCParser.Class_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_reference_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_reference_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_list(ObjCParser.Protocol_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_list(ObjCParser.Protocol_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code property_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProperty_declaration(ObjCParser.Property_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code property_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProperty_declaration(ObjCParser.Property_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code property_attributes_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code property_attributes_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code property_attributes_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code property_attributes_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code property_attribute}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProperty_attribute(ObjCParser.Property_attributeContext ctx);

    /**
     * Exit a parse tree produced by the {@code property_attribute}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProperty_attribute(ObjCParser.Property_attributeContext ctx);

    /**
     * Enter a parse tree produced by the {@code ib_outlet_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterIb_outlet_specifier(ObjCParser.Ib_outlet_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code ib_outlet_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitIb_outlet_specifier(ObjCParser.Ib_outlet_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code class_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterClass_name(ObjCParser.Class_nameContext ctx);

    /**
     * Exit a parse tree produced by the {@code class_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitClass_name(ObjCParser.Class_nameContext ctx);

    /**
     * Enter a parse tree produced by the {@code superclass_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSuperclass_name(ObjCParser.Superclass_nameContext ctx);

    /**
     * Exit a parse tree produced by the {@code superclass_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSuperclass_name(ObjCParser.Superclass_nameContext ctx);

    /**
     * Enter a parse tree produced by the {@code category_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCategory_name(ObjCParser.Category_nameContext ctx);

    /**
     * Exit a parse tree produced by the {@code category_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCategory_name(ObjCParser.Category_nameContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_name(ObjCParser.Protocol_nameContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_name(ObjCParser.Protocol_nameContext ctx);

    /**
     * Enter a parse tree produced by the {@code instance_decl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void enterInstance_decl(ObjCParser.Instance_declContext ctx);

    /**
     * Exit a parse tree produced by the {@code instance_decl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void exitInstance_decl(ObjCParser.Instance_declContext ctx);

    /**
     * Enter a parse tree produced by the {@code instance_sdecl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void enterInstance_sdecl(ObjCParser.Instance_sdeclContext ctx);

    /**
     * Exit a parse tree produced by the {@code instance_sdecl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void exitInstance_sdecl(ObjCParser.Instance_sdeclContext ctx);

    /**
     * Enter a parse tree produced by the {@code instance_idecl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void enterInstance_idecl(ObjCParser.Instance_ideclContext ctx);

    /**
     * Exit a parse tree produced by the {@code instance_idecl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void exitInstance_idecl(ObjCParser.Instance_ideclContext ctx);

    /**
     * Enter a parse tree produced by the {@code instance_sidecl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void enterInstance_sidecl(ObjCParser.Instance_sideclContext ctx);

    /**
     * Exit a parse tree produced by the {@code instance_sidecl}
     * labeled alternative in {@link ObjCParser#instance_variables}.
     *
     * @param ctx the parse tree
     */
    void exitInstance_sidecl(ObjCParser.Instance_sideclContext ctx);

    /**
     * Enter a parse tree produced by the {@code visibility_specification}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterVisibility_specification(ObjCParser.Visibility_specificationContext ctx);

    /**
     * Exit a parse tree produced by the {@code visibility_specification}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitVisibility_specification(ObjCParser.Visibility_specificationContext ctx);

    /**
     * Enter a parse tree produced by the {@code interface_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code interface_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code class_method_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code class_method_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code instance_method_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code instance_method_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code method_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMethod_declaration(ObjCParser.Method_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code method_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMethod_declaration(ObjCParser.Method_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code implementation_definition_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code implementation_definition_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code implementation_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterImplementation_definition(ObjCParser.Implementation_definitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code implementation_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitImplementation_definition(ObjCParser.Implementation_definitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code class_method_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterClass_method_definition(ObjCParser.Class_method_definitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code class_method_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitClass_method_definition(ObjCParser.Class_method_definitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code instance_method_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code instance_method_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code method_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMethod_definition(ObjCParser.Method_definitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code method_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMethod_definition(ObjCParser.Method_definitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code method_selector}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMethod_selector(ObjCParser.Method_selectorContext ctx);

    /**
     * Exit a parse tree produced by the {@code method_selector}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMethod_selector(ObjCParser.Method_selectorContext ctx);

    /**
     * Enter a parse tree produced by the {@code keyword_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code keyword_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code selector}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSelector(ObjCParser.SelectorContext ctx);

    /**
     * Exit a parse tree produced by the {@code selector}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSelector(ObjCParser.SelectorContext ctx);

    /**
     * Enter a parse tree produced by the {@code method_type}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMethod_type(ObjCParser.Method_typeContext ctx);

    /**
     * Exit a parse tree produced by the {@code method_type}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMethod_type(ObjCParser.Method_typeContext ctx);

    /**
     * Enter a parse tree produced by the {@code property_implementation}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProperty_implementation(ObjCParser.Property_implementationContext ctx);

    /**
     * Exit a parse tree produced by the {@code property_implementation}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProperty_implementation(ObjCParser.Property_implementationContext ctx);

    /**
     * Enter a parse tree produced by the {@code property_synthesize_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code property_synthesize_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code property_synthesize_item}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);

    /**
     * Exit a parse tree produced by the {@code property_synthesize_item}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);

    /**
     * Enter a parse tree produced by the {@code block_type}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterBlock_type(ObjCParser.Block_typeContext ctx);

    /**
     * Exit a parse tree produced by the {@code block_type}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitBlock_type(ObjCParser.Block_typeContext ctx);

    /**
     * Enter a parse tree produced by the {@code type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterType_specifier(ObjCParser.Type_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitType_specifier(ObjCParser.Type_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code idTypeSpec}
     * labeled alternative in {@link ObjCParser#other_type_specifier}.
     *
     * @param ctx the parse tree
     */
    void enterIdTypeSpec(ObjCParser.IdTypeSpecContext ctx);

    /**
     * Exit a parse tree produced by the {@code idTypeSpec}
     * labeled alternative in {@link ObjCParser#other_type_specifier}.
     *
     * @param ctx the parse tree
     */
    void exitIdTypeSpec(ObjCParser.IdTypeSpecContext ctx);

    /**
     * Enter a parse tree produced by the {@code classTypeSpec}
     * labeled alternative in {@link ObjCParser#other_type_specifier}.
     *
     * @param ctx the parse tree
     */
    void enterClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx);

    /**
     * Exit a parse tree produced by the {@code classTypeSpec}
     * labeled alternative in {@link ObjCParser#other_type_specifier}.
     *
     * @param ctx the parse tree
     */
    void exitClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx);

    /**
     * Enter a parse tree produced by the {@code structTypeSpec}
     * labeled alternative in {@link ObjCParser#other_type_specifier}.
     *
     * @param ctx the parse tree
     */
    void enterStructTypeSpec(ObjCParser.StructTypeSpecContext ctx);

    /**
     * Exit a parse tree produced by the {@code structTypeSpec}
     * labeled alternative in {@link ObjCParser#other_type_specifier}.
     *
     * @param ctx the parse tree
     */
    void exitStructTypeSpec(ObjCParser.StructTypeSpecContext ctx);

    /**
     * Enter a parse tree produced by the {@code unusual_type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterUnusual_type_specifier(ObjCParser.Unusual_type_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code unusual_type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitUnusual_type_specifier(ObjCParser.Unusual_type_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code simple_type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSimple_type_specifier(ObjCParser.Simple_type_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code simple_type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSimple_type_specifier(ObjCParser.Simple_type_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code primitive_type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitive_type_specifier(ObjCParser.Primitive_type_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code primitive_type_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitive_type_specifier(ObjCParser.Primitive_type_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code constTypeQualifier}
     * labeled alternative in {@link ObjCParser#type_qualifier}.
     *
     * @param ctx the parse tree
     */
    void enterConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code constTypeQualifier}
     * labeled alternative in {@link ObjCParser#type_qualifier}.
     *
     * @param ctx the parse tree
     */
    void exitConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code ignoreTypeQualifier}
     * labeled alternative in {@link ObjCParser#type_qualifier}.
     *
     * @param ctx the parse tree
     */
    void enterIgnoreTypeQualifier(ObjCParser.IgnoreTypeQualifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code ignoreTypeQualifier}
     * labeled alternative in {@link ObjCParser#type_qualifier}.
     *
     * @param ctx the parse tree
     */
    void exitIgnoreTypeQualifier(ObjCParser.IgnoreTypeQualifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_qualifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_qualifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code primary_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterPrimary_expression(ObjCParser.Primary_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code primary_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitPrimary_expression(ObjCParser.Primary_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code simple_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSimple_expression(ObjCParser.Simple_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code simple_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSimple_expression(ObjCParser.Simple_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code parenthetical_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterParenthetical_expression(ObjCParser.Parenthetical_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code parenthetical_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitParenthetical_expression(ObjCParser.Parenthetical_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code self_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSelf_expression(ObjCParser.Self_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code self_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSelf_expression(ObjCParser.Self_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code super_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSuper_expression(ObjCParser.Super_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code super_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSuper_expression(ObjCParser.Super_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code unsupported_instruction}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterUnsupported_instruction(ObjCParser.Unsupported_instructionContext ctx);

    /**
     * Exit a parse tree produced by the {@code unsupported_instruction}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitUnsupported_instruction(ObjCParser.Unsupported_instructionContext ctx);

    /**
     * Enter a parse tree produced by the {@code string_constant}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterString_constant(ObjCParser.String_constantContext ctx);

    /**
     * Exit a parse tree produced by the {@code string_constant}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitString_constant(ObjCParser.String_constantContext ctx);

    /**
     * Enter a parse tree produced by the {@code dictionary_pair}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDictionary_pair(ObjCParser.Dictionary_pairContext ctx);

    /**
     * Exit a parse tree produced by the {@code dictionary_pair}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDictionary_pair(ObjCParser.Dictionary_pairContext ctx);

    /**
     * Enter a parse tree produced by the {@code dictionary_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDictionary_expression(ObjCParser.Dictionary_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code dictionary_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDictionary_expression(ObjCParser.Dictionary_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code array_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterArray_expression(ObjCParser.Array_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code array_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitArray_expression(ObjCParser.Array_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code box_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterBox_expression(ObjCParser.Box_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code box_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitBox_expression(ObjCParser.Box_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code block_parameters}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterBlock_parameters(ObjCParser.Block_parametersContext ctx);

    /**
     * Exit a parse tree produced by the {@code block_parameters}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitBlock_parameters(ObjCParser.Block_parametersContext ctx);

    /**
     * Enter a parse tree produced by the {@code block_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterBlock_expression(ObjCParser.Block_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code block_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitBlock_expression(ObjCParser.Block_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code message_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMessage_expression(ObjCParser.Message_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code message_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMessage_expression(ObjCParser.Message_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code receiver}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterReceiver(ObjCParser.ReceiverContext ctx);

    /**
     * Exit a parse tree produced by the {@code receiver}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitReceiver(ObjCParser.ReceiverContext ctx);

    /**
     * Enter a parse tree produced by the {@code message_selector}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMessage_selector(ObjCParser.Message_selectorContext ctx);

    /**
     * Exit a parse tree produced by the {@code message_selector}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMessage_selector(ObjCParser.Message_selectorContext ctx);

    /**
     * Enter a parse tree produced by the {@code keyword_argument}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterKeyword_argument(ObjCParser.Keyword_argumentContext ctx);

    /**
     * Exit a parse tree produced by the {@code keyword_argument}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitKeyword_argument(ObjCParser.Keyword_argumentContext ctx);

    /**
     * Enter a parse tree produced by the {@code selector_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSelector_expression(ObjCParser.Selector_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code selector_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSelector_expression(ObjCParser.Selector_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code selector_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSelector_name(ObjCParser.Selector_nameContext ctx);

    /**
     * Exit a parse tree produced by the {@code selector_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSelector_name(ObjCParser.Selector_nameContext ctx);

    /**
     * Enter a parse tree produced by the {@code protocol_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterProtocol_expression(ObjCParser.Protocol_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code protocol_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitProtocol_expression(ObjCParser.Protocol_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code encode_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterEncode_expression(ObjCParser.Encode_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code encode_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitEncode_expression(ObjCParser.Encode_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code exception_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterException_declarator(ObjCParser.Exception_declaratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code exception_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitException_declarator(ObjCParser.Exception_declaratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code type_variable_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterType_variable_declarator(ObjCParser.Type_variable_declaratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code type_variable_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitType_variable_declarator(ObjCParser.Type_variable_declaratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code try_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterTry_statement(ObjCParser.Try_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code try_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitTry_statement(ObjCParser.Try_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code catch_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCatch_statement(ObjCParser.Catch_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code catch_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCatch_statement(ObjCParser.Catch_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code finally_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterFinally_statement(ObjCParser.Finally_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code finally_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitFinally_statement(ObjCParser.Finally_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code throw_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterThrow_statement(ObjCParser.Throw_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code throw_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitThrow_statement(ObjCParser.Throw_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code try_block}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterTry_block(ObjCParser.Try_blockContext ctx);

    /**
     * Exit a parse tree produced by the {@code try_block}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitTry_block(ObjCParser.Try_blockContext ctx);

    /**
     * Enter a parse tree produced by the {@code synchronized_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code synchronized_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code autorelease_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAutorelease_statement(ObjCParser.Autorelease_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code autorelease_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAutorelease_statement(ObjCParser.Autorelease_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code function_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterFunction_definition(ObjCParser.Function_definitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code function_definition}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitFunction_definition(ObjCParser.Function_definitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code declaration_minus_semi}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDeclaration_minus_semi(ObjCParser.Declaration_minus_semiContext ctx);

    /**
     * Exit a parse tree produced by the {@code declaration_minus_semi}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDeclaration_minus_semi(ObjCParser.Declaration_minus_semiContext ctx);

    /**
     * Enter a parse tree produced by the {@code declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDeclaration(ObjCParser.DeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDeclaration(ObjCParser.DeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code declaration_specifiers}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);

    /**
     * Exit a parse tree produced by the {@code declaration_specifiers}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);

    /**
     * Enter a parse tree produced by the {@code declaration_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDeclaration_specifier(ObjCParser.Declaration_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code declaration_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDeclaration_specifier(ObjCParser.Declaration_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code arc_behaviour_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterArc_behaviour_specifier(ObjCParser.Arc_behaviour_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code arc_behaviour_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitArc_behaviour_specifier(ObjCParser.Arc_behaviour_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code ignoreStoreClass}
     * labeled alternative in {@link ObjCParser#storage_class_specifier}.
     *
     * @param ctx the parse tree
     */
    void enterIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx);

    /**
     * Exit a parse tree produced by the {@code ignoreStoreClass}
     * labeled alternative in {@link ObjCParser#storage_class_specifier}.
     *
     * @param ctx the parse tree
     */
    void exitIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx);

    /**
     * Enter a parse tree produced by the {@code staticStoreClass}
     * labeled alternative in {@link ObjCParser#storage_class_specifier}.
     *
     * @param ctx the parse tree
     */
    void enterStaticStoreClass(ObjCParser.StaticStoreClassContext ctx);

    /**
     * Exit a parse tree produced by the {@code staticStoreClass}
     * labeled alternative in {@link ObjCParser#storage_class_specifier}.
     *
     * @param ctx the parse tree
     */
    void exitStaticStoreClass(ObjCParser.StaticStoreClassContext ctx);

    /**
     * Enter a parse tree produced by the {@code init_declarator_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code init_declarator_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code init_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterInit_declarator(ObjCParser.Init_declaratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code init_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitInit_declarator(ObjCParser.Init_declaratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code struct_or_union_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code struct_or_union_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code struct_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterStruct_declaration(ObjCParser.Struct_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code struct_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitStruct_declaration(ObjCParser.Struct_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code specifier_qualifier_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code specifier_qualifier_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code specifier_qualifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSpecifier_qualifier(ObjCParser.Specifier_qualifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code specifier_qualifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSpecifier_qualifier(ObjCParser.Specifier_qualifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code struct_declarator_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code struct_declarator_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code struct_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterStruct_declarator(ObjCParser.Struct_declaratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code struct_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitStruct_declarator(ObjCParser.Struct_declaratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code enum_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterEnum_specifier(ObjCParser.Enum_specifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code enum_specifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitEnum_specifier(ObjCParser.Enum_specifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code enumerator_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterEnumerator_list(ObjCParser.Enumerator_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code enumerator_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitEnumerator_list(ObjCParser.Enumerator_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code enumerator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterEnumerator(ObjCParser.EnumeratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code enumerator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitEnumerator(ObjCParser.EnumeratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDeclarator(ObjCParser.DeclaratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDeclarator(ObjCParser.DeclaratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code direct_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDirect_declarator(ObjCParser.Direct_declaratorContext ctx);

    /**
     * Exit a parse tree produced by the {@code direct_declarator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDirect_declarator(ObjCParser.Direct_declaratorContext ctx);

    /**
     * Enter a parse tree produced by the {@code declarator_suffix}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);

    /**
     * Exit a parse tree produced by the {@code declarator_suffix}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);

    /**
     * Enter a parse tree produced by the {@code parameter_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterParameter_list(ObjCParser.Parameter_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code parameter_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitParameter_list(ObjCParser.Parameter_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code parameter_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterParameter_declaration(ObjCParser.Parameter_declarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code parameter_declaration}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitParameter_declaration(ObjCParser.Parameter_declarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code initializer}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterInitializer(ObjCParser.InitializerContext ctx);

    /**
     * Exit a parse tree produced by the {@code initializer}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitInitializer(ObjCParser.InitializerContext ctx);

    /**
     * Enter a parse tree produced by the {@code type_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterType_name(ObjCParser.Type_nameContext ctx);

    /**
     * Exit a parse tree produced by the {@code type_name}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitType_name(ObjCParser.Type_nameContext ctx);

    /**
     * Enter a parse tree produced by the {@code adecType}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void enterAdecType(ObjCParser.AdecTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code adecType}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void exitAdecType(ObjCParser.AdecTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code adecRecurse}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void enterAdecRecurse(ObjCParser.AdecRecurseContext ctx);

    /**
     * Exit a parse tree produced by the {@code adecRecurse}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void exitAdecRecurse(ObjCParser.AdecRecurseContext ctx);

    /**
     * Enter a parse tree produced by the {@code adecConst}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void enterAdecConst(ObjCParser.AdecConstContext ctx);

    /**
     * Exit a parse tree produced by the {@code adecConst}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void exitAdecConst(ObjCParser.AdecConstContext ctx);

    /**
     * Enter a parse tree produced by the {@code adecNone}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void enterAdecNone(ObjCParser.AdecNoneContext ctx);

    /**
     * Exit a parse tree produced by the {@code adecNone}
     * labeled alternative in {@link ObjCParser#abstract_declarator}.
     *
     * @param ctx the parse tree
     */
    void exitAdecNone(ObjCParser.AdecNoneContext ctx);

    /**
     * Enter a parse tree produced by the {@code abstract_declarator_suffix}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);

    /**
     * Exit a parse tree produced by the {@code abstract_declarator_suffix}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);

    /**
     * Enter a parse tree produced by the {@code parameter_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code parameter_declaration_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code statement_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement_list(ObjCParser.Statement_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code statement_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement_list(ObjCParser.Statement_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(ObjCParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by the {@code statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(ObjCParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code semi_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSemi_statement(ObjCParser.Semi_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code semi_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSemi_statement(ObjCParser.Semi_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code labelid}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterLabelid(ObjCParser.LabelidContext ctx);

    /**
     * Exit a parse tree produced by the {@code labelid}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitLabelid(ObjCParser.LabelidContext ctx);

    /**
     * Enter a parse tree produced by the {@code case}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCase(ObjCParser.CaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code case}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCase(ObjCParser.CaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code default}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDefault(ObjCParser.DefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code default}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDefault(ObjCParser.DefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code compound_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCompound_statement(ObjCParser.Compound_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code compound_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCompound_statement(ObjCParser.Compound_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code compound_statement_parts}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCompound_statement_parts(ObjCParser.Compound_statement_partsContext ctx);

    /**
     * Exit a parse tree produced by the {@code compound_statement_parts}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCompound_statement_parts(ObjCParser.Compound_statement_partsContext ctx);

    /**
     * Enter a parse tree produced by the {@code ifstmt}
     * labeled alternative in {@link ObjCParser#selection_statement}.
     *
     * @param ctx the parse tree
     */
    void enterIfstmt(ObjCParser.IfstmtContext ctx);

    /**
     * Exit a parse tree produced by the {@code ifstmt}
     * labeled alternative in {@link ObjCParser#selection_statement}.
     *
     * @param ctx the parse tree
     */
    void exitIfstmt(ObjCParser.IfstmtContext ctx);

    /**
     * Enter a parse tree produced by the {@code switch}
     * labeled alternative in {@link ObjCParser#selection_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSwitch(ObjCParser.SwitchContext ctx);

    /**
     * Exit a parse tree produced by the {@code switch}
     * labeled alternative in {@link ObjCParser#selection_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSwitch(ObjCParser.SwitchContext ctx);

    /**
     * Enter a parse tree produced by the {@code while_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterWhile_statement(ObjCParser.While_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code while_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitWhile_statement(ObjCParser.While_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code for_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterFor_statement(ObjCParser.For_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code for_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitFor_statement(ObjCParser.For_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code do_while_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDo_while_statement(ObjCParser.Do_while_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code do_while_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDo_while_statement(ObjCParser.Do_while_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code for_complete}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterFor_complete(ObjCParser.For_completeContext ctx);

    /**
     * Exit a parse tree produced by the {@code for_complete}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitFor_complete(ObjCParser.For_completeContext ctx);

    /**
     * Enter a parse tree produced by the {@code forcomplete1}
     * labeled alternative in {@link ObjCParser#for_declaration_complete}.
     *
     * @param ctx the parse tree
     */
    void enterForcomplete1(ObjCParser.Forcomplete1Context ctx);

    /**
     * Exit a parse tree produced by the {@code forcomplete1}
     * labeled alternative in {@link ObjCParser#for_declaration_complete}.
     *
     * @param ctx the parse tree
     */
    void exitForcomplete1(ObjCParser.Forcomplete1Context ctx);

    /**
     * Enter a parse tree produced by the {@code forcomplete2}
     * labeled alternative in {@link ObjCParser#for_declaration_complete}.
     *
     * @param ctx the parse tree
     */
    void enterForcomplete2(ObjCParser.Forcomplete2Context ctx);

    /**
     * Exit a parse tree produced by the {@code forcomplete2}
     * labeled alternative in {@link ObjCParser#for_declaration_complete}.
     *
     * @param ctx the parse tree
     */
    void exitForcomplete2(ObjCParser.Forcomplete2Context ctx);

    /**
     * Enter a parse tree produced by the {@code jump_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterJump_statement(ObjCParser.Jump_statementContext ctx);

    /**
     * Exit a parse tree produced by the {@code jump_statement}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitJump_statement(ObjCParser.Jump_statementContext ctx);

    /**
     * Enter a parse tree produced by the {@code setter_call}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSetter_call(ObjCParser.Setter_callContext ctx);

    /**
     * Exit a parse tree produced by the {@code setter_call}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSetter_call(ObjCParser.Setter_callContext ctx);

    /**
     * Enter a parse tree produced by the {@code getter_call}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterGetter_call(ObjCParser.Getter_callContext ctx);

    /**
     * Exit a parse tree produced by the {@code getter_call}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitGetter_call(ObjCParser.Getter_callContext ctx);

    /**
     * Enter a parse tree produced by the {@code dotidentifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterDotidentifier(ObjCParser.DotidentifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code dotidentifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitDotidentifier(ObjCParser.DotidentifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(ObjCParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(ObjCParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code assignment_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment_expression(ObjCParser.Assignment_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code assignment_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment_expression(ObjCParser.Assignment_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code assignment_operator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment_operator(ObjCParser.Assignment_operatorContext ctx);

    /**
     * Exit a parse tree produced by the {@code assignment_operator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment_operator(ObjCParser.Assignment_operatorContext ctx);

    /**
     * Enter a parse tree produced by the {@code conditional_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterConditional_expression(ObjCParser.Conditional_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code conditional_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitConditional_expression(ObjCParser.Conditional_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code constant_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterConstant_expression(ObjCParser.Constant_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code constant_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitConstant_expression(ObjCParser.Constant_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code logical_or_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code logical_or_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code logical_and_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code logical_and_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code inclusive_or_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code inclusive_or_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code exclusive_or_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code exclusive_or_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code and_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAnd_expression(ObjCParser.And_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code and_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAnd_expression(ObjCParser.And_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code equality_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterEquality_expression(ObjCParser.Equality_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code equality_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitEquality_expression(ObjCParser.Equality_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code equality_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterEquality_op(ObjCParser.Equality_opContext ctx);

    /**
     * Exit a parse tree produced by the {@code equality_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitEquality_op(ObjCParser.Equality_opContext ctx);

    /**
     * Enter a parse tree produced by the {@code relational_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterRelational_expression(ObjCParser.Relational_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code relational_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitRelational_expression(ObjCParser.Relational_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code relational_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterRelational_op(ObjCParser.Relational_opContext ctx);

    /**
     * Exit a parse tree produced by the {@code relational_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitRelational_op(ObjCParser.Relational_opContext ctx);

    /**
     * Enter a parse tree produced by the {@code shift_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterShift_expression(ObjCParser.Shift_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code shift_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitShift_expression(ObjCParser.Shift_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code shift_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterShift_op(ObjCParser.Shift_opContext ctx);

    /**
     * Exit a parse tree produced by the {@code shift_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitShift_op(ObjCParser.Shift_opContext ctx);

    /**
     * Enter a parse tree produced by the {@code additive_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAdditive_expression(ObjCParser.Additive_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code additive_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAdditive_expression(ObjCParser.Additive_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code add_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterAdd_op(ObjCParser.Add_opContext ctx);

    /**
     * Exit a parse tree produced by the {@code add_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitAdd_op(ObjCParser.Add_opContext ctx);

    /**
     * Enter a parse tree produced by the {@code multiplicative_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code multiplicative_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code multiply_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMultiply_op(ObjCParser.Multiply_opContext ctx);

    /**
     * Exit a parse tree produced by the {@code multiply_op}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMultiply_op(ObjCParser.Multiply_opContext ctx);

    /**
     * Enter a parse tree produced by the {@code cast_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCast_expression(ObjCParser.Cast_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code cast_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCast_expression(ObjCParser.Cast_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code unary_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterUnary_expression(ObjCParser.Unary_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code unary_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitUnary_expression(ObjCParser.Unary_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code unary_operator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterUnary_operator(ObjCParser.Unary_operatorContext ctx);

    /**
     * Exit a parse tree produced by the {@code unary_operator}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitUnary_operator(ObjCParser.Unary_operatorContext ctx);

    /**
     * Enter a parse tree produced by the {@code postfix_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterPostfix_expression(ObjCParser.Postfix_expressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code postfix_expression}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitPostfix_expression(ObjCParser.Postfix_expressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code postfix_expression_complete}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterPostfix_expression_complete(ObjCParser.Postfix_expression_completeContext ctx);

    /**
     * Exit a parse tree produced by the {@code postfix_expression_complete}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitPostfix_expression_complete(ObjCParser.Postfix_expression_completeContext ctx);

    /**
     * Enter a parse tree produced by the {@code comment}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterComment(ObjCParser.CommentContext ctx);

    /**
     * Exit a parse tree produced by the {@code comment}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitComment(ObjCParser.CommentContext ctx);

    /**
     * Enter a parse tree produced by the {@code argument_expression_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);

    /**
     * Exit a parse tree produced by the {@code argument_expression_list}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);

    /**
     * Enter a parse tree produced by the {@code identifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(ObjCParser.IdentifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code identifier}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(ObjCParser.IdentifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code code_block}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterCode_block(ObjCParser.Code_blockContext ctx);

    /**
     * Exit a parse tree produced by the {@code code_block}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitCode_block(ObjCParser.Code_blockContext ctx);

    /**
     * Enter a parse tree produced by the {@code constant}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(ObjCParser.ConstantContext ctx);

    /**
     * Exit a parse tree produced by the {@code constant}
     * labeled alternative in {@link ObjCParser#labeled_statement}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(ObjCParser.ConstantContext ctx);
}