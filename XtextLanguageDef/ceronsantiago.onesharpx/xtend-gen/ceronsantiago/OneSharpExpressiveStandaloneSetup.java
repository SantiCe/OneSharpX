/**
 * generated by Xtext 2.9.0
 */
package ceronsantiago;

import ceronsantiago.OneSharpExpressiveStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class OneSharpExpressiveStandaloneSetup extends OneSharpExpressiveStandaloneSetupGenerated {
  public static void doSetup() {
    OneSharpExpressiveStandaloneSetup _oneSharpExpressiveStandaloneSetup = new OneSharpExpressiveStandaloneSetup();
    _oneSharpExpressiveStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
