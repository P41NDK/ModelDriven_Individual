/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class VoiceStandaloneSetup extends VoiceStandaloneSetupGenerated {

	public static void doSetup() {
		new VoiceStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
