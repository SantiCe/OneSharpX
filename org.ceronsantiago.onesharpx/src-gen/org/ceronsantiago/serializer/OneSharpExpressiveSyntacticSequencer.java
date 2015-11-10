/*
 * generated by Xtext
 */
package org.ceronsantiago.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.ceronsantiago.services.OneSharpExpressiveGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class OneSharpExpressiveSyntacticSequencer extends AbstractSyntacticSequencer {

	protected OneSharpExpressiveGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Call_IDTerminalRuleCall_4_2_or_INTTerminalRuleCall_4_0_or_OSTerminalRuleCall_4_1;
	protected AbstractElementAlias match_Call___CommaKeyword_5_0___IDTerminalRuleCall_5_1_2_or_INTTerminalRuleCall_5_1_0_or_OSTerminalRuleCall_5_1_1____a;
	protected AbstractElementAlias match_FunctionHeader___CommaKeyword_3_0___IntKeyword_3_1_0_0_or_StringKeyword_3_1_0_1___IDTerminalRuleCall_3_1_1__a;
	protected AbstractElementAlias match_FunctionHeader_____IntKeyword_2_0_0_or_StringKeyword_2_0_1___IDTerminalRuleCall_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OneSharpExpressiveGrammarAccess) access;
		match_Call_IDTerminalRuleCall_4_2_or_INTTerminalRuleCall_4_0_or_OSTerminalRuleCall_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCallAccess().getIDTerminalRuleCall_4_2()), new TokenAlias(false, false, grammarAccess.getCallAccess().getINTTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getCallAccess().getOSTerminalRuleCall_4_1()));
		match_Call___CommaKeyword_5_0___IDTerminalRuleCall_5_1_2_or_INTTerminalRuleCall_5_1_0_or_OSTerminalRuleCall_5_1_1____a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCallAccess().getCommaKeyword_5_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCallAccess().getIDTerminalRuleCall_5_1_2()), new TokenAlias(false, false, grammarAccess.getCallAccess().getINTTerminalRuleCall_5_1_0()), new TokenAlias(false, false, grammarAccess.getCallAccess().getOSTerminalRuleCall_5_1_1())));
		match_FunctionHeader___CommaKeyword_3_0___IntKeyword_3_1_0_0_or_StringKeyword_3_1_0_1___IDTerminalRuleCall_3_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getCommaKeyword_3_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getIntKeyword_3_1_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getStringKeyword_3_1_0_1())), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getIDTerminalRuleCall_3_1_1()));
		match_FunctionHeader_____IntKeyword_2_0_0_or_StringKeyword_2_0_1___IDTerminalRuleCall_2_1__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getIntKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getStringKeyword_2_0_1())), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getIDTerminalRuleCall_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOSRule())
			return getOSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID: 	LETTER+ (LETTER|DIGIT|OS)*
	 * ;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT:
	 * 	('0'..'9')+
	 * ;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal OS:
	 * 	('1'|'#')+
	 * ;
	 */
	protected String getOSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "1";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Call_IDTerminalRuleCall_4_2_or_INTTerminalRuleCall_4_0_or_OSTerminalRuleCall_4_1.equals(syntax))
				emit_Call_IDTerminalRuleCall_4_2_or_INTTerminalRuleCall_4_0_or_OSTerminalRuleCall_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call___CommaKeyword_5_0___IDTerminalRuleCall_5_1_2_or_INTTerminalRuleCall_5_1_0_or_OSTerminalRuleCall_5_1_1____a.equals(syntax))
				emit_Call___CommaKeyword_5_0___IDTerminalRuleCall_5_1_2_or_INTTerminalRuleCall_5_1_0_or_OSTerminalRuleCall_5_1_1____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader___CommaKeyword_3_0___IntKeyword_3_1_0_0_or_StringKeyword_3_1_0_1___IDTerminalRuleCall_3_1_1__a.equals(syntax))
				emit_FunctionHeader___CommaKeyword_3_0___IntKeyword_3_1_0_0_or_StringKeyword_3_1_0_1___IDTerminalRuleCall_3_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_____IntKeyword_2_0_0_or_StringKeyword_2_0_1___IDTerminalRuleCall_2_1__q.equals(syntax))
				emit_FunctionHeader_____IntKeyword_2_0_0_or_StringKeyword_2_0_1___IDTerminalRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     INT | OS | ID
	 *
	 * This ambiguous syntax occurs at:
	 *     function=ID '(' (ambiguity) (',' (INT | OS | ID))* ')' (rule end)
	 */
	protected void emit_Call_IDTerminalRuleCall_4_2_or_INTTerminalRuleCall_4_0_or_OSTerminalRuleCall_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (',' (INT | OS | ID))*
	 *
	 * This ambiguous syntax occurs at:
	 *     function=ID '(' (INT | OS | ID) (ambiguity) ')' (rule end)
	 */
	protected void emit_Call___CommaKeyword_5_0___IDTerminalRuleCall_5_1_2_or_INTTerminalRuleCall_5_1_0_or_OSTerminalRuleCall_5_1_1____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (',' ('int' | 'string') ID)*
	 *
	 * This ambiguous syntax occurs at:
	 *     funcName=ID '(' (('int' | 'string') ID)? (ambiguity) ')' (rule end)
	 */
	protected void emit_FunctionHeader___CommaKeyword_3_0___IntKeyword_3_1_0_0_or_StringKeyword_3_1_0_1___IDTerminalRuleCall_3_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('int' | 'string') ID)?
	 *
	 * This ambiguous syntax occurs at:
	 *     funcName=ID '(' (ambiguity) (',' ('int' | 'string') ID)* ')' (rule end)
	 */
	protected void emit_FunctionHeader_____IntKeyword_2_0_0_or_StringKeyword_2_0_1___IDTerminalRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}