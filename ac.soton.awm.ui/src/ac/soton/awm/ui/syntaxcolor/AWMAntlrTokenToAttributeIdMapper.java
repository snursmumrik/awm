/**
 * 
 */
package ac.soton.awm.ui.syntaxcolor;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

/**
 * @author vitaly
 *
 */
public class AWMAntlrTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_PROC".equals(tokenName)) {
			return AWMLexicalHighlightingConfiguration.PROCESS_ID;
		}
		if ("RULE_REG".equals(tokenName)) {
			return AWMLexicalHighlightingConfiguration.REGISTER_ID;
		}
		if ("RULE_ADDR".equals(tokenName)) {
			return AWMLexicalHighlightingConfiguration.ADDRESS_ID;
		}
		if ("RULE_COMMENT".equals(tokenName)) {
			return AWMLexicalHighlightingConfiguration.COMMENT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
}
