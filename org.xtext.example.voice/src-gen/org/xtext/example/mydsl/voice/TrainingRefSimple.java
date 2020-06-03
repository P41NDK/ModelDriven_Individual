/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.voice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Ref Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.voice.TrainingRefSimple#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.voice.VoicePackage#getTrainingRefSimple()
 * @model
 * @generated
 */
public interface TrainingRefSimple extends TrainingRef
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.voice.Declaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.xtext.example.mydsl.voice.VoicePackage#getTrainingRefSimple_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // TrainingRefSimple