/*
* generated by Xtext
*/
package ac.soton.awm;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AWMUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return ac.soton.awm.ui.internal.AWMActivator.getInstance().getInjector("ac.soton.awm.AWM");
	}
	
}
