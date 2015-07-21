/**
 * 
 */
package ac.soton.awm.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

/**
 * @author vitaly
 *
 */
public class BooleanOperatorConverter extends AbstractLexerBasedConverter<String> implements EventBSymbols {

	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException( "Couldn't convert empty string to an operator.", node, null);
		if (string.equals("=>"))
			return B_IMPL;
		if (string.equals("or"))
			return B_OR;
		if (string.equals("and"))
			return B_AND;
		return string;
	}

}
