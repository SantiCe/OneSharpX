/*
 * generated by Xtext 2.9.0
 */
package ceronsantiago.parser.antlr;

import ceronsantiago.parser.antlr.internal.InternalOneSharpExpressiveParser;
import ceronsantiago.services.OneSharpExpressiveGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OneSharpExpressiveParser extends AbstractAntlrParser {

	@Inject
	private OneSharpExpressiveGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOneSharpExpressiveParser createParser(XtextTokenStream stream) {
		return new InternalOneSharpExpressiveParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public OneSharpExpressiveGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OneSharpExpressiveGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
