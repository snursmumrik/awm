/**
 * 
 */
package ac.soton.awm;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import ac.soton.awm.conversion.BooleanOperatorConverter;

import com.google.inject.Inject;

/**
 * @author vitaly
 *
 */
public class AWMTerminalConverters extends DefaultTerminalConverters {
	@Inject
	private BooleanOperatorConverter booleanOperatorConverter;

	@ValueConverter(rule = "IMPLY")
	public IValueConverter<String> IMPLY() {
		return booleanOperatorConverter;
	}
	
	@ValueConverter(rule = "OR")
	public IValueConverter<String> OR() {
		return booleanOperatorConverter;
	}
	
	@ValueConverter(rule = "AND")
	public IValueConverter<String> AND() {
		return booleanOperatorConverter;
	}
}
