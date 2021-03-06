/*
 * generated by Xtext 2.9.0
 */
package ceronsantiago.ui;

import ceronsantiago.onesharpx.ui.internal.OnesharpxActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OneSharpExpressiveExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return OnesharpxActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return OnesharpxActivator.getInstance().getInjector(OnesharpxActivator.CERONSANTIAGO_ONESHARPEXPRESSIVE);
	}
	
}
