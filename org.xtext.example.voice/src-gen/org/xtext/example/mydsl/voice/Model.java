/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.voice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.voice.Model#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.voice.VoicePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.voice.Agent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' containment reference list.
   * @see org.xtext.example.mydsl.voice.VoicePackage#getModel_Agent()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgent();

} // Model
