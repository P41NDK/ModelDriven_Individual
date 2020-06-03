/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.voice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.voice.QuestionEntity#getWithEntity <em>With Entity</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.voice.VoicePackage#getQuestionEntity()
 * @model
 * @generated
 */
public interface QuestionEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>With Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Entity</em>' containment reference.
   * @see #setWithEntity(Reference)
   * @see org.xtext.example.mydsl.voice.VoicePackage#getQuestionEntity_WithEntity()
   * @model containment="true"
   * @generated
   */
  Reference getWithEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.voice.QuestionEntity#getWithEntity <em>With Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Entity</em>' containment reference.
   * @see #getWithEntity()
   * @generated
   */
  void setWithEntity(Reference value);

} // QuestionEntity
