/*
 * generated by Xtext
 */
package ac.soton.awm;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class AWMRuntimeModule extends ac.soton.awm.AbstractAWMRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return AWMQualifiedNameProvider.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return AWMTerminalConverters.class;
	}
}
