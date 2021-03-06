/*
 * generated by Xtext 2.9.0
 */
package ceronsantiago.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class OneSharpExpressiveGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunctionsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFunctionsFunctionDeclarationParserRuleCall_0_0 = (RuleCall)cFunctionsAssignment_0.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyCommandBlockParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		
		////TODO: Factorize
		////-------------------------------
		//// START SYMBOL - 1#X Program
		////-------------------------------
		//Program:
		//	functions+=FunctionDeclaration*
		//	body=CommandBlock;
		@Override public ParserRule getRule() { return rule; }
		
		//functions+=FunctionDeclaration* body=CommandBlock
		public Group getGroup() { return cGroup; }
		
		//functions+=FunctionDeclaration*
		public Assignment getFunctionsAssignment_0() { return cFunctionsAssignment_0; }
		
		//FunctionDeclaration
		public RuleCall getFunctionsFunctionDeclarationParserRuleCall_0_0() { return cFunctionsFunctionDeclarationParserRuleCall_0_0; }
		
		//body=CommandBlock
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//CommandBlock
		public RuleCall getBodyCommandBlockParserRuleCall_1_0() { return cBodyCommandBlockParserRuleCall_1_0; }
	}
	public class RegisterParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.RegisterParam");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cParamAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cParamIntParamDecCrossReference_0_0 = (CrossReference)cParamAssignment_0.eContents().get(0);
		private final RuleCall cParamIntParamDecIDTerminalRuleCall_0_0_1 = (RuleCall)cParamIntParamDecCrossReference_0_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		////-------------------------------
		////Variables
		////-------------------------------
		//RegisterParam:
		//	param=[IntParamDec] | value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//param=[IntParamDec] | value=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//param=[IntParamDec]
		public Assignment getParamAssignment_0() { return cParamAssignment_0; }
		
		//[IntParamDec]
		public CrossReference getParamIntParamDecCrossReference_0_0() { return cParamIntParamDecCrossReference_0_0; }
		
		//ID
		public RuleCall getParamIntParamDecIDTerminalRuleCall_0_0_1() { return cParamIntParamDecIDTerminalRuleCall_0_0_1; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class WordParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.WordParam");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cParamAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cParamStringParamDecCrossReference_0_0 = (CrossReference)cParamAssignment_0.eContents().get(0);
		private final RuleCall cParamStringParamDecIDTerminalRuleCall_0_0_1 = (RuleCall)cParamStringParamDecCrossReference_0_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValueOSTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//WordParam:
		//	param=[StringParamDec] | value=OS;
		@Override public ParserRule getRule() { return rule; }
		
		//param=[StringParamDec] | value=OS
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//param=[StringParamDec]
		public Assignment getParamAssignment_0() { return cParamAssignment_0; }
		
		//[StringParamDec]
		public CrossReference getParamStringParamDecCrossReference_0_0() { return cParamStringParamDecCrossReference_0_0; }
		
		//ID
		public RuleCall getParamStringParamDecIDTerminalRuleCall_0_0_1() { return cParamStringParamDecIDTerminalRuleCall_0_0_1; }
		
		//value=OS
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//OS
		public RuleCall getValueOSTerminalRuleCall_1_0() { return cValueOSTerminalRuleCall_1_0; }
	}
	public class CallParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.CallParam");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cIntValAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cIntValINTTerminalRuleCall_0_0 = (RuleCall)cIntValAssignment_0.eContents().get(0);
		private final Assignment cStringValAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cStringValOSTerminalRuleCall_1_0 = (RuleCall)cStringValAssignment_1.eContents().get(0);
		private final Assignment cParamAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final CrossReference cParamParamDecCrossReference_2_0 = (CrossReference)cParamAssignment_2.eContents().get(0);
		private final RuleCall cParamParamDecIDTerminalRuleCall_2_0_1 = (RuleCall)cParamParamDecCrossReference_2_0.eContents().get(1);
		
		//CallParam:
		//	intVal=INT | stringVal=OS | param=[ParamDec];
		@Override public ParserRule getRule() { return rule; }
		
		//intVal=INT | stringVal=OS | param=[ParamDec]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//intVal=INT
		public Assignment getIntValAssignment_0() { return cIntValAssignment_0; }
		
		//INT
		public RuleCall getIntValINTTerminalRuleCall_0_0() { return cIntValINTTerminalRuleCall_0_0; }
		
		//stringVal=OS
		public Assignment getStringValAssignment_1() { return cStringValAssignment_1; }
		
		//OS
		public RuleCall getStringValOSTerminalRuleCall_1_0() { return cStringValOSTerminalRuleCall_1_0; }
		
		//param=[ParamDec]
		public Assignment getParamAssignment_2() { return cParamAssignment_2; }
		
		//[ParamDec]
		public CrossReference getParamParamDecCrossReference_2_0() { return cParamParamDecCrossReference_2_0; }
		
		//ID
		public RuleCall getParamParamDecIDTerminalRuleCall_2_0_1() { return cParamParamDecIDTerminalRuleCall_2_0_1; }
	}
	public class WriteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.Write");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWriteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRegisterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRegisterRegisterParamParserRuleCall_1_0 = (RuleCall)cRegisterAssignment_1.eContents().get(0);
		private final Assignment cWordAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cWordWordParamParserRuleCall_2_0 = (RuleCall)cWordAssignment_2.eContents().get(0);
		
		////-------------------------------
		//// PRIMITIVE FUNCTIONS
		////-------------------------------
		//Write:
		//	'write' register=RegisterParam word=WordParam;
		@Override public ParserRule getRule() { return rule; }
		
		//'write' register=RegisterParam word=WordParam
		public Group getGroup() { return cGroup; }
		
		//'write'
		public Keyword getWriteKeyword_0() { return cWriteKeyword_0; }
		
		//register=RegisterParam
		public Assignment getRegisterAssignment_1() { return cRegisterAssignment_1; }
		
		//RegisterParam
		public RuleCall getRegisterRegisterParamParserRuleCall_1_0() { return cRegisterRegisterParamParserRuleCall_1_0; }
		
		//word=WordParam
		public Assignment getWordAssignment_2() { return cWordAssignment_2; }
		
		//WordParam
		public RuleCall getWordWordParamParserRuleCall_2_0() { return cWordWordParamParserRuleCall_2_0; }
	}
	public class NormalCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.NormalCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSwitchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRegisterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRegisterRegisterParamParserRuleCall_1_0 = (RuleCall)cRegisterAssignment_1.eContents().get(0);
		private final Keyword cCaseKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCaseEmptyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCaseEmptyCommandBlockParserRuleCall_3_0 = (RuleCall)cCaseEmptyAssignment_3.eContents().get(0);
		private final Keyword cCaseKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCaseOneAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCaseOneCommandBlockParserRuleCall_5_0 = (RuleCall)cCaseOneAssignment_5.eContents().get(0);
		private final Keyword cCaseKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cCaseSharpAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cCaseSharpCommandBlockParserRuleCall_7_0 = (RuleCall)cCaseSharpAssignment_7.eContents().get(0);
		private final Keyword cEndKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//NormalCase:
		//	'switch' register=RegisterParam 'case' caseEmpty=CommandBlock 'case' caseOne=CommandBlock 'case'
		//	caseSharp=CommandBlock 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'switch' register=RegisterParam 'case' caseEmpty=CommandBlock 'case' caseOne=CommandBlock 'case' caseSharp=CommandBlock
		//'end'
		public Group getGroup() { return cGroup; }
		
		//'switch'
		public Keyword getSwitchKeyword_0() { return cSwitchKeyword_0; }
		
		//register=RegisterParam
		public Assignment getRegisterAssignment_1() { return cRegisterAssignment_1; }
		
		//RegisterParam
		public RuleCall getRegisterRegisterParamParserRuleCall_1_0() { return cRegisterRegisterParamParserRuleCall_1_0; }
		
		//'case'
		public Keyword getCaseKeyword_2() { return cCaseKeyword_2; }
		
		//caseEmpty=CommandBlock
		public Assignment getCaseEmptyAssignment_3() { return cCaseEmptyAssignment_3; }
		
		//CommandBlock
		public RuleCall getCaseEmptyCommandBlockParserRuleCall_3_0() { return cCaseEmptyCommandBlockParserRuleCall_3_0; }
		
		//'case'
		public Keyword getCaseKeyword_4() { return cCaseKeyword_4; }
		
		//caseOne=CommandBlock
		public Assignment getCaseOneAssignment_5() { return cCaseOneAssignment_5; }
		
		//CommandBlock
		public RuleCall getCaseOneCommandBlockParserRuleCall_5_0() { return cCaseOneCommandBlockParserRuleCall_5_0; }
		
		//'case'
		public Keyword getCaseKeyword_6() { return cCaseKeyword_6; }
		
		//caseSharp=CommandBlock
		public Assignment getCaseSharpAssignment_7() { return cCaseSharpAssignment_7; }
		
		//CommandBlock
		public RuleCall getCaseSharpCommandBlockParserRuleCall_7_0() { return cCaseSharpCommandBlockParserRuleCall_7_0; }
		
		//'end'
		public Keyword getEndKeyword_8() { return cEndKeyword_8; }
	}
	public class GotoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.Goto");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGotoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLabelAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cLabelCommandCrossReference_1_0 = (CrossReference)cLabelAssignment_1.eContents().get(0);
		private final RuleCall cLabelCommandIDTerminalRuleCall_1_0_1 = (RuleCall)cLabelCommandCrossReference_1_0.eContents().get(1);
		
		/// *LoopCase:
		//	'rswitch' register=IdOrInt 'case' caseOne=CommandBlock 'case' caseSharp=CommandBlock 'end'
		//;* / //TODO: This seems like unnecessary syntactic sugar.
		//Goto:
		//	'goto' label=[Command];
		@Override public ParserRule getRule() { return rule; }
		
		//'goto' label=[Command]
		public Group getGroup() { return cGroup; }
		
		//'goto'
		public Keyword getGotoKeyword_0() { return cGotoKeyword_0; }
		
		//label=[Command]
		public Assignment getLabelAssignment_1() { return cLabelAssignment_1; }
		
		//[Command]
		public CrossReference getLabelCommandCrossReference_1_0() { return cLabelCommandCrossReference_1_0; }
		
		//ID
		public RuleCall getLabelCommandIDTerminalRuleCall_1_0_1() { return cLabelCommandIDTerminalRuleCall_1_0_1; }
	}
	public class CallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.Call");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunctionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFunctionFunctionDeclarationCrossReference_0_0 = (CrossReference)cFunctionAssignment_0.eContents().get(0);
		private final RuleCall cFunctionFunctionDeclarationIDTerminalRuleCall_0_0_1 = (RuleCall)cFunctionFunctionDeclarationCrossReference_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParamsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParamsCallParamParserRuleCall_2_0_0 = (RuleCall)cParamsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParamsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParamsCallParamParserRuleCall_2_1_1_0 = (RuleCall)cParamsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Call:
		//	function=[FunctionDeclaration] '(' (params+=CallParam (',' params+=CallParam)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//function=[FunctionDeclaration] '(' (params+=CallParam (',' params+=CallParam)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//function=[FunctionDeclaration]
		public Assignment getFunctionAssignment_0() { return cFunctionAssignment_0; }
		
		//[FunctionDeclaration]
		public CrossReference getFunctionFunctionDeclarationCrossReference_0_0() { return cFunctionFunctionDeclarationCrossReference_0_0; }
		
		//ID
		public RuleCall getFunctionFunctionDeclarationIDTerminalRuleCall_0_0_1() { return cFunctionFunctionDeclarationIDTerminalRuleCall_0_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(params+=CallParam (',' params+=CallParam)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//params+=CallParam
		public Assignment getParamsAssignment_2_0() { return cParamsAssignment_2_0; }
		
		//CallParam
		public RuleCall getParamsCallParamParserRuleCall_2_0_0() { return cParamsCallParamParserRuleCall_2_0_0; }
		
		//(',' params+=CallParam)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//params+=CallParam
		public Assignment getParamsAssignment_2_1_1() { return cParamsAssignment_2_1_1; }
		
		//CallParam
		public RuleCall getParamsCallParamParserRuleCall_2_1_1_0() { return cParamsCallParamParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.Command");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cCommandAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCommandUnlabeledCommandParserRuleCall_1_0 = (RuleCall)cCommandAssignment_1.eContents().get(0);
		
		////--------------------------------
		//// Commands
		////--------------------------------
		//Command:
		//	(name=ID ':')? command=UnlabeledCommand;
		@Override public ParserRule getRule() { return rule; }
		
		//(name=ID ':')? command=UnlabeledCommand
		public Group getGroup() { return cGroup; }
		
		//(name=ID ':')?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//command=UnlabeledCommand
		public Assignment getCommandAssignment_1() { return cCommandAssignment_1; }
		
		//UnlabeledCommand
		public RuleCall getCommandUnlabeledCommandParserRuleCall_1_0() { return cCommandUnlabeledCommandParserRuleCall_1_0; }
	}
	public class UnlabeledCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.UnlabeledCommand");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWriteParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNormalCaseParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGotoParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCallParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//UnlabeledCommand:
		//	Write | NormalCase / *|LoopCase* / | Goto | Call;
		@Override public ParserRule getRule() { return rule; }
		
		//Write | NormalCase / *|LoopCase* / | Goto | Call
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Write
		public RuleCall getWriteParserRuleCall_0() { return cWriteParserRuleCall_0; }
		
		//NormalCase
		public RuleCall getNormalCaseParserRuleCall_1() { return cNormalCaseParserRuleCall_1; }
		
		//Goto
		public RuleCall getGotoParserRuleCall_2() { return cGotoParserRuleCall_2; }
		
		//Call
		public RuleCall getCallParserRuleCall_3() { return cCallParserRuleCall_3; }
	}
	public class IntParamDecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.IntParamDec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		////--------------------------------
		//// Functions
		////--------------------------------
		//IntParamDec:
		//	'int' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'int' name=ID
		public Group getGroup() { return cGroup; }
		
		//'int'
		public Keyword getIntKeyword_0() { return cIntKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class StringParamDecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.StringParamDec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//StringParamDec:
		//	'string' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'string' name=ID
		public Group getGroup() { return cGroup; }
		
		//'string'
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ParamDecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.ParamDec");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntParamDecParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringParamDecParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ParamDec:
		//	IntParamDec | StringParamDec;
		@Override public ParserRule getRule() { return rule; }
		
		//IntParamDec | StringParamDec
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IntParamDec
		public RuleCall getIntParamDecParserRuleCall_0() { return cIntParamDecParserRuleCall_0; }
		
		//StringParamDec
		public RuleCall getStringParamDecParserRuleCall_1() { return cStringParamDecParserRuleCall_1; }
	}
	public class FunctionDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.FunctionDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParamsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParamsParamDecParserRuleCall_2_0_0 = (RuleCall)cParamsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParamsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParamsParamDecParserRuleCall_2_1_1_0 = (RuleCall)cParamsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cBeginKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyCommandBlockParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//FunctionDeclaration:
		//	name=ID '(' (params+=ParamDec (',' params+=ParamDec)*)? ')' 'begin' body=CommandBlock 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '(' (params+=ParamDec (',' params+=ParamDec)*)? ')' 'begin' body=CommandBlock 'end'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(params+=ParamDec (',' params+=ParamDec)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//params+=ParamDec
		public Assignment getParamsAssignment_2_0() { return cParamsAssignment_2_0; }
		
		//ParamDec
		public RuleCall getParamsParamDecParserRuleCall_2_0_0() { return cParamsParamDecParserRuleCall_2_0_0; }
		
		//(',' params+=ParamDec)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//params+=ParamDec
		public Assignment getParamsAssignment_2_1_1() { return cParamsAssignment_2_1_1; }
		
		//ParamDec
		public RuleCall getParamsParamDecParserRuleCall_2_1_1_0() { return cParamsParamDecParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//'begin'
		public Keyword getBeginKeyword_4() { return cBeginKeyword_4; }
		
		//body=CommandBlock
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }
		
		//CommandBlock
		public RuleCall getBodyCommandBlockParserRuleCall_5_0() { return cBodyCommandBlockParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class CommandBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.CommandBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCommandBlockAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCommandsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_1_0 = (RuleCall)cCommandsAssignment_1.eContents().get(0);
		
		////--------------------------------
		//// Scoping containers
		////--------------------------------
		/// *
		// * A list of commands, that works as a scope for labels.
		// * / CommandBlock:
		//	{CommandBlock} commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//{CommandBlock} commands+=Command*
		public Group getGroup() { return cGroup; }
		
		//{CommandBlock}
		public Action getCommandBlockAction_0() { return cCommandBlockAction_0; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment_1() { return cCommandsAssignment_1; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_1_0() { return cCommandsCommandParserRuleCall_1_0; }
	}
	
	
	private final ProgramElements pProgram;
	private final TerminalRule tLETTER;
	private final TerminalRule tDIGIT;
	private final TerminalRule tINT;
	private final TerminalRule tID;
	private final TerminalRule tOS;
	private final TerminalRule tWS;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final RegisterParamElements pRegisterParam;
	private final WordParamElements pWordParam;
	private final CallParamElements pCallParam;
	private final WriteElements pWrite;
	private final NormalCaseElements pNormalCase;
	private final GotoElements pGoto;
	private final CallElements pCall;
	private final CommandElements pCommand;
	private final UnlabeledCommandElements pUnlabeledCommand;
	private final IntParamDecElements pIntParamDec;
	private final StringParamDecElements pStringParamDec;
	private final ParamDecElements pParamDec;
	private final FunctionDeclarationElements pFunctionDeclaration;
	private final CommandBlockElements pCommandBlock;
	
	private final Grammar grammar;

	@Inject
	public OneSharpExpressiveGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pProgram = new ProgramElements();
		this.tLETTER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.LETTER");
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.DIGIT");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.INT");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.ID");
		this.tOS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.OS");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.WS");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ceronsantiago.OneSharpExpressive.SL_COMMENT");
		this.pRegisterParam = new RegisterParamElements();
		this.pWordParam = new WordParamElements();
		this.pCallParam = new CallParamElements();
		this.pWrite = new WriteElements();
		this.pNormalCase = new NormalCaseElements();
		this.pGoto = new GotoElements();
		this.pCall = new CallElements();
		this.pCommand = new CommandElements();
		this.pUnlabeledCommand = new UnlabeledCommandElements();
		this.pIntParamDec = new IntParamDecElements();
		this.pStringParamDec = new StringParamDecElements();
		this.pParamDec = new ParamDecElements();
		this.pFunctionDeclaration = new FunctionDeclarationElements();
		this.pCommandBlock = new CommandBlockElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("ceronsantiago.OneSharpExpressive".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	////TODO: Factorize
	////-------------------------------
	//// START SYMBOL - 1#X Program
	////-------------------------------
	//Program:
	//	functions+=FunctionDeclaration*
	//	body=CommandBlock;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//terminal fragment LETTER: //Latin alphabet
	//	'A'..'Z' | 'a'..'z' | '_';
	public TerminalRule getLETTERRule() {
		return tLETTER;
	}
	
	//terminal fragment DIGIT:
	//	'0'..'9';
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	}
	
	//terminal INT returns ecore::EInt:
	//	'1'..'9' DIGIT*;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal ID:
	//	LETTER+ (LETTER | DIGIT | '#')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal OS:
	//	'\"' ('1' | '#')+ '\"';
	public TerminalRule getOSRule() {
		return tOS;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	('//' | ';') !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	////-------------------------------
	////Variables
	////-------------------------------
	//RegisterParam:
	//	param=[IntParamDec] | value=INT;
	public RegisterParamElements getRegisterParamAccess() {
		return pRegisterParam;
	}
	
	public ParserRule getRegisterParamRule() {
		return getRegisterParamAccess().getRule();
	}
	
	//WordParam:
	//	param=[StringParamDec] | value=OS;
	public WordParamElements getWordParamAccess() {
		return pWordParam;
	}
	
	public ParserRule getWordParamRule() {
		return getWordParamAccess().getRule();
	}
	
	//CallParam:
	//	intVal=INT | stringVal=OS | param=[ParamDec];
	public CallParamElements getCallParamAccess() {
		return pCallParam;
	}
	
	public ParserRule getCallParamRule() {
		return getCallParamAccess().getRule();
	}
	
	////-------------------------------
	//// PRIMITIVE FUNCTIONS
	////-------------------------------
	//Write:
	//	'write' register=RegisterParam word=WordParam;
	public WriteElements getWriteAccess() {
		return pWrite;
	}
	
	public ParserRule getWriteRule() {
		return getWriteAccess().getRule();
	}
	
	//NormalCase:
	//	'switch' register=RegisterParam 'case' caseEmpty=CommandBlock 'case' caseOne=CommandBlock 'case'
	//	caseSharp=CommandBlock 'end';
	public NormalCaseElements getNormalCaseAccess() {
		return pNormalCase;
	}
	
	public ParserRule getNormalCaseRule() {
		return getNormalCaseAccess().getRule();
	}
	
	/// *LoopCase:
	//	'rswitch' register=IdOrInt 'case' caseOne=CommandBlock 'case' caseSharp=CommandBlock 'end'
	//;* / //TODO: This seems like unnecessary syntactic sugar.
	//Goto:
	//	'goto' label=[Command];
	public GotoElements getGotoAccess() {
		return pGoto;
	}
	
	public ParserRule getGotoRule() {
		return getGotoAccess().getRule();
	}
	
	//Call:
	//	function=[FunctionDeclaration] '(' (params+=CallParam (',' params+=CallParam)*)? ')';
	public CallElements getCallAccess() {
		return pCall;
	}
	
	public ParserRule getCallRule() {
		return getCallAccess().getRule();
	}
	
	////--------------------------------
	//// Commands
	////--------------------------------
	//Command:
	//	(name=ID ':')? command=UnlabeledCommand;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//UnlabeledCommand:
	//	Write | NormalCase / *|LoopCase* / | Goto | Call;
	public UnlabeledCommandElements getUnlabeledCommandAccess() {
		return pUnlabeledCommand;
	}
	
	public ParserRule getUnlabeledCommandRule() {
		return getUnlabeledCommandAccess().getRule();
	}
	
	////--------------------------------
	//// Functions
	////--------------------------------
	//IntParamDec:
	//	'int' name=ID;
	public IntParamDecElements getIntParamDecAccess() {
		return pIntParamDec;
	}
	
	public ParserRule getIntParamDecRule() {
		return getIntParamDecAccess().getRule();
	}
	
	//StringParamDec:
	//	'string' name=ID;
	public StringParamDecElements getStringParamDecAccess() {
		return pStringParamDec;
	}
	
	public ParserRule getStringParamDecRule() {
		return getStringParamDecAccess().getRule();
	}
	
	//ParamDec:
	//	IntParamDec | StringParamDec;
	public ParamDecElements getParamDecAccess() {
		return pParamDec;
	}
	
	public ParserRule getParamDecRule() {
		return getParamDecAccess().getRule();
	}
	
	//FunctionDeclaration:
	//	name=ID '(' (params+=ParamDec (',' params+=ParamDec)*)? ')' 'begin' body=CommandBlock 'end';
	public FunctionDeclarationElements getFunctionDeclarationAccess() {
		return pFunctionDeclaration;
	}
	
	public ParserRule getFunctionDeclarationRule() {
		return getFunctionDeclarationAccess().getRule();
	}
	
	////--------------------------------
	//// Scoping containers
	////--------------------------------
	/// *
	// * A list of commands, that works as a scope for labels.
	// * / CommandBlock:
	//	{CommandBlock} commands+=Command*;
	public CommandBlockElements getCommandBlockAccess() {
		return pCommandBlock;
	}
	
	public ParserRule getCommandBlockRule() {
		return getCommandBlockAccess().getRule();
	}
}
