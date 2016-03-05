package bos.consoar.objc2lua.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link ObjCListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class ObjCBaseListener implements ObjCListener {
    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTranslation_unit(ObjCParser.Translation_unitContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTranslation_unit(ObjCParser.Translation_unitContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExternal_declaration(ObjCParser.External_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExternal_declaration(ObjCParser.External_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDefine_statement(ObjCParser.Define_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDefine_statement(ObjCParser.Define_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMacro_specification(ObjCParser.Macro_specificationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMacro_specification(ObjCParser.Macro_specificationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass_interface(ObjCParser.Class_interfaceContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass_interface(ObjCParser.Class_interfaceContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCategory_interface(ObjCParser.Category_interfaceContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCategory_interface(ObjCParser.Category_interfaceContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass_implementation(ObjCParser.Class_implementationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass_implementation(ObjCParser.Class_implementationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCategory_implementation(ObjCParser.Category_implementationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCategory_implementation(ObjCParser.Category_implementationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_declaration(ObjCParser.Protocol_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_declaration(ObjCParser.Protocol_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_requirement(ObjCParser.Protocol_requirementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_requirement(ObjCParser.Protocol_requirementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass_declaration_list(ObjCParser.Class_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass_declaration_list(ObjCParser.Class_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass_list(ObjCParser.Class_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass_list(ObjCParser.Class_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_list(ObjCParser.Protocol_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_list(ObjCParser.Protocol_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProperty_declaration(ObjCParser.Property_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProperty_declaration(ObjCParser.Property_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProperty_attribute(ObjCParser.Property_attributeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProperty_attribute(ObjCParser.Property_attributeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIb_outlet_specifier(ObjCParser.Ib_outlet_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIb_outlet_specifier(ObjCParser.Ib_outlet_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass_name(ObjCParser.Class_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass_name(ObjCParser.Class_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSuperclass_name(ObjCParser.Superclass_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSuperclass_name(ObjCParser.Superclass_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCategory_name(ObjCParser.Category_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCategory_name(ObjCParser.Category_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_name(ObjCParser.Protocol_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_name(ObjCParser.Protocol_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInstance_decl(ObjCParser.Instance_declContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInstance_decl(ObjCParser.Instance_declContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInstance_sdecl(ObjCParser.Instance_sdeclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInstance_sdecl(ObjCParser.Instance_sdeclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInstance_idecl(ObjCParser.Instance_ideclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInstance_idecl(ObjCParser.Instance_ideclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInstance_sidecl(ObjCParser.Instance_sideclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInstance_sidecl(ObjCParser.Instance_sideclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterVisibility_specification(ObjCParser.Visibility_specificationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitVisibility_specification(ObjCParser.Visibility_specificationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass_method_declaration(ObjCParser.Class_method_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass_method_declaration(ObjCParser.Class_method_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMethod_declaration(ObjCParser.Method_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMethod_declaration(ObjCParser.Method_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterImplementation_definition(ObjCParser.Implementation_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitImplementation_definition(ObjCParser.Implementation_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass_method_definition(ObjCParser.Class_method_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass_method_definition(ObjCParser.Class_method_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMethod_definition(ObjCParser.Method_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMethod_definition(ObjCParser.Method_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMethod_selector(ObjCParser.Method_selectorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMethod_selector(ObjCParser.Method_selectorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSelector(ObjCParser.SelectorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSelector(ObjCParser.SelectorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMethod_type(ObjCParser.Method_typeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMethod_type(ObjCParser.Method_typeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProperty_implementation(ObjCParser.Property_implementationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProperty_implementation(ObjCParser.Property_implementationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlock_type(ObjCParser.Block_typeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlock_type(ObjCParser.Block_typeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterType_specifier(ObjCParser.Type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitType_specifier(ObjCParser.Type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIdTypeSpec(ObjCParser.IdTypeSpecContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIdTypeSpec(ObjCParser.IdTypeSpecContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStructTypeSpec(ObjCParser.StructTypeSpecContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStructTypeSpec(ObjCParser.StructTypeSpecContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterUnusual_type_specifier(ObjCParser.Unusual_type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitUnusual_type_specifier(ObjCParser.Unusual_type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSimple_type_specifier(ObjCParser.Simple_type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSimple_type_specifier(ObjCParser.Simple_type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPrimitive_type_specifier(ObjCParser.Primitive_type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPrimitive_type_specifier(ObjCParser.Primitive_type_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIgnoreTypeQualifier(ObjCParser.IgnoreTypeQualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIgnoreTypeQualifier(ObjCParser.IgnoreTypeQualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPrimary_expression(ObjCParser.Primary_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPrimary_expression(ObjCParser.Primary_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSimple_expression(ObjCParser.Simple_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSimple_expression(ObjCParser.Simple_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterParenthetical_expression(ObjCParser.Parenthetical_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitParenthetical_expression(ObjCParser.Parenthetical_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSelf_expression(ObjCParser.Self_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSelf_expression(ObjCParser.Self_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSuper_expression(ObjCParser.Super_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSuper_expression(ObjCParser.Super_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterUnsupported_instruction(ObjCParser.Unsupported_instructionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitUnsupported_instruction(ObjCParser.Unsupported_instructionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterString_constant(ObjCParser.String_constantContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitString_constant(ObjCParser.String_constantContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDictionary_pair(ObjCParser.Dictionary_pairContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDictionary_pair(ObjCParser.Dictionary_pairContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDictionary_expression(ObjCParser.Dictionary_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDictionary_expression(ObjCParser.Dictionary_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterArray_expression(ObjCParser.Array_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitArray_expression(ObjCParser.Array_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBox_expression(ObjCParser.Box_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBox_expression(ObjCParser.Box_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlock_parameters(ObjCParser.Block_parametersContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlock_parameters(ObjCParser.Block_parametersContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlock_expression(ObjCParser.Block_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlock_expression(ObjCParser.Block_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMessage_expression(ObjCParser.Message_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMessage_expression(ObjCParser.Message_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterReceiver(ObjCParser.ReceiverContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitReceiver(ObjCParser.ReceiverContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMessage_selector(ObjCParser.Message_selectorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMessage_selector(ObjCParser.Message_selectorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterKeyword_argument(ObjCParser.Keyword_argumentContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitKeyword_argument(ObjCParser.Keyword_argumentContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSelector_expression(ObjCParser.Selector_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSelector_expression(ObjCParser.Selector_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSelector_name(ObjCParser.Selector_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSelector_name(ObjCParser.Selector_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProtocol_expression(ObjCParser.Protocol_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProtocol_expression(ObjCParser.Protocol_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEncode_expression(ObjCParser.Encode_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEncode_expression(ObjCParser.Encode_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterException_declarator(ObjCParser.Exception_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitException_declarator(ObjCParser.Exception_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterType_variable_declarator(ObjCParser.Type_variable_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitType_variable_declarator(ObjCParser.Type_variable_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTry_statement(ObjCParser.Try_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTry_statement(ObjCParser.Try_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCatch_statement(ObjCParser.Catch_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCatch_statement(ObjCParser.Catch_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFinally_statement(ObjCParser.Finally_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFinally_statement(ObjCParser.Finally_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterThrow_statement(ObjCParser.Throw_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitThrow_statement(ObjCParser.Throw_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTry_block(ObjCParser.Try_blockContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTry_block(ObjCParser.Try_blockContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSynchronized_statement(ObjCParser.Synchronized_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSynchronized_statement(ObjCParser.Synchronized_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAutorelease_statement(ObjCParser.Autorelease_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAutorelease_statement(ObjCParser.Autorelease_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFunction_definition(ObjCParser.Function_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFunction_definition(ObjCParser.Function_definitionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclaration_minus_semi(ObjCParser.Declaration_minus_semiContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclaration_minus_semi(ObjCParser.Declaration_minus_semiContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclaration(ObjCParser.DeclarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclaration(ObjCParser.DeclarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclaration_specifier(ObjCParser.Declaration_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclaration_specifier(ObjCParser.Declaration_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterArc_behaviour_specifier(ObjCParser.Arc_behaviour_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitArc_behaviour_specifier(ObjCParser.Arc_behaviour_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStaticStoreClass(ObjCParser.StaticStoreClassContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStaticStoreClass(ObjCParser.StaticStoreClassContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInit_declarator_list(ObjCParser.Init_declarator_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInit_declarator_list(ObjCParser.Init_declarator_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInit_declarator(ObjCParser.Init_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInit_declarator(ObjCParser.Init_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStruct_declaration(ObjCParser.Struct_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStruct_declaration(ObjCParser.Struct_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSpecifier_qualifier(ObjCParser.Specifier_qualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSpecifier_qualifier(ObjCParser.Specifier_qualifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStruct_declarator(ObjCParser.Struct_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStruct_declarator(ObjCParser.Struct_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEnum_specifier(ObjCParser.Enum_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEnum_specifier(ObjCParser.Enum_specifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEnumerator_list(ObjCParser.Enumerator_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEnumerator_list(ObjCParser.Enumerator_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEnumerator(ObjCParser.EnumeratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEnumerator(ObjCParser.EnumeratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclarator(ObjCParser.DeclaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclarator(ObjCParser.DeclaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDirect_declarator(ObjCParser.Direct_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDirect_declarator(ObjCParser.Direct_declaratorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterParameter_list(ObjCParser.Parameter_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitParameter_list(ObjCParser.Parameter_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterParameter_declaration(ObjCParser.Parameter_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitParameter_declaration(ObjCParser.Parameter_declarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInitializer(ObjCParser.InitializerContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInitializer(ObjCParser.InitializerContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterType_name(ObjCParser.Type_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitType_name(ObjCParser.Type_nameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAdecType(ObjCParser.AdecTypeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAdecType(ObjCParser.AdecTypeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAdecRecurse(ObjCParser.AdecRecurseContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAdecRecurse(ObjCParser.AdecRecurseContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAdecConst(ObjCParser.AdecConstContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAdecConst(ObjCParser.AdecConstContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAdecNone(ObjCParser.AdecNoneContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAdecNone(ObjCParser.AdecNoneContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStatement_list(ObjCParser.Statement_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStatement_list(ObjCParser.Statement_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStatement(ObjCParser.StatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStatement(ObjCParser.StatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSemi_statement(ObjCParser.Semi_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSemi_statement(ObjCParser.Semi_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLabelid(ObjCParser.LabelidContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLabelid(ObjCParser.LabelidContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCase(ObjCParser.CaseContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCase(ObjCParser.CaseContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDefault(ObjCParser.DefaultContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDefault(ObjCParser.DefaultContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCompound_statement(ObjCParser.Compound_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCompound_statement(ObjCParser.Compound_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCompound_statement_parts(ObjCParser.Compound_statement_partsContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCompound_statement_parts(ObjCParser.Compound_statement_partsContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIfstmt(ObjCParser.IfstmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIfstmt(ObjCParser.IfstmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSwitch(ObjCParser.SwitchContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSwitch(ObjCParser.SwitchContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWhile_statement(ObjCParser.While_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWhile_statement(ObjCParser.While_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFor_statement(ObjCParser.For_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFor_statement(ObjCParser.For_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDo_while_statement(ObjCParser.Do_while_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDo_while_statement(ObjCParser.Do_while_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFor_complete(ObjCParser.For_completeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFor_complete(ObjCParser.For_completeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterForcomplete1(ObjCParser.Forcomplete1Context ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitForcomplete1(ObjCParser.Forcomplete1Context ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterForcomplete2(ObjCParser.Forcomplete2Context ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitForcomplete2(ObjCParser.Forcomplete2Context ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterJump_statement(ObjCParser.Jump_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitJump_statement(ObjCParser.Jump_statementContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSetter_call(ObjCParser.Setter_callContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSetter_call(ObjCParser.Setter_callContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterGetter_call(ObjCParser.Getter_callContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitGetter_call(ObjCParser.Getter_callContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDotidentifier(ObjCParser.DotidentifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDotidentifier(ObjCParser.DotidentifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExpression(ObjCParser.ExpressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExpression(ObjCParser.ExpressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAssignment_expression(ObjCParser.Assignment_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAssignment_expression(ObjCParser.Assignment_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAssignment_operator(ObjCParser.Assignment_operatorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAssignment_operator(ObjCParser.Assignment_operatorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterConditional_expression(ObjCParser.Conditional_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitConditional_expression(ObjCParser.Conditional_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterConstant_expression(ObjCParser.Constant_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitConstant_expression(ObjCParser.Constant_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAnd_expression(ObjCParser.And_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAnd_expression(ObjCParser.And_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEquality_expression(ObjCParser.Equality_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEquality_expression(ObjCParser.Equality_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEquality_op(ObjCParser.Equality_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEquality_op(ObjCParser.Equality_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRelational_expression(ObjCParser.Relational_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRelational_expression(ObjCParser.Relational_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRelational_op(ObjCParser.Relational_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRelational_op(ObjCParser.Relational_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterShift_expression(ObjCParser.Shift_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitShift_expression(ObjCParser.Shift_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterShift_op(ObjCParser.Shift_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitShift_op(ObjCParser.Shift_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAdditive_expression(ObjCParser.Additive_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAdditive_expression(ObjCParser.Additive_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAdd_op(ObjCParser.Add_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAdd_op(ObjCParser.Add_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMultiply_op(ObjCParser.Multiply_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMultiply_op(ObjCParser.Multiply_opContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCast_expression(ObjCParser.Cast_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCast_expression(ObjCParser.Cast_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterUnary_expression(ObjCParser.Unary_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitUnary_expression(ObjCParser.Unary_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterUnary_operator(ObjCParser.Unary_operatorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitUnary_operator(ObjCParser.Unary_operatorContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPostfix_expression(ObjCParser.Postfix_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPostfix_expression(ObjCParser.Postfix_expressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterPostfix_expression_complete(ObjCParser.Postfix_expression_completeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPostfix_expression_complete(ObjCParser.Postfix_expression_completeContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterComment(ObjCParser.CommentContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitComment(ObjCParser.CommentContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterArgument_expression_list(ObjCParser.Argument_expression_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitArgument_expression_list(ObjCParser.Argument_expression_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIdentifier(ObjCParser.IdentifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIdentifier(ObjCParser.IdentifierContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCode_block(ObjCParser.Code_blockContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCode_block(ObjCParser.Code_blockContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterConstant(ObjCParser.ConstantContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitConstant(ObjCParser.ConstantContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}