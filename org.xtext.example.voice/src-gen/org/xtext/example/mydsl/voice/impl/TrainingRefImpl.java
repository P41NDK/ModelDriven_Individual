/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.voice.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.voice.Declaration;
import org.xtext.example.mydsl.voice.TrainingRef;
import org.xtext.example.mydsl.voice.VoicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.voice.impl.TrainingRefImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.voice.impl.TrainingRefImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingRefImpl extends MinimalEObjectImpl.Container implements TrainingRef
{
  /**
   * The default value of the '{@link #getPhrase() <em>Phrase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhrase()
   * @generated
   * @ordered
   */
  protected static final String PHRASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhrase() <em>Phrase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhrase()
   * @generated
   * @ordered
   */
  protected String phrase = PHRASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected Declaration declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrainingRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VoicePackage.Literals.TRAINING_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPhrase()
  {
    return phrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhrase(String newPhrase)
  {
    String oldPhrase = phrase;
    phrase = newPhrase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VoicePackage.TRAINING_REF__PHRASE, oldPhrase, phrase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration getDeclarations()
  {
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarations(Declaration newDeclarations, NotificationChain msgs)
  {
    Declaration oldDeclarations = declarations;
    declarations = newDeclarations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VoicePackage.TRAINING_REF__DECLARATIONS, oldDeclarations, newDeclarations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeclarations(Declaration newDeclarations)
  {
    if (newDeclarations != declarations)
    {
      NotificationChain msgs = null;
      if (declarations != null)
        msgs = ((InternalEObject)declarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VoicePackage.TRAINING_REF__DECLARATIONS, null, msgs);
      if (newDeclarations != null)
        msgs = ((InternalEObject)newDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VoicePackage.TRAINING_REF__DECLARATIONS, null, msgs);
      msgs = basicSetDeclarations(newDeclarations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VoicePackage.TRAINING_REF__DECLARATIONS, newDeclarations, newDeclarations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VoicePackage.TRAINING_REF__DECLARATIONS:
        return basicSetDeclarations(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VoicePackage.TRAINING_REF__PHRASE:
        return getPhrase();
      case VoicePackage.TRAINING_REF__DECLARATIONS:
        return getDeclarations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VoicePackage.TRAINING_REF__PHRASE:
        setPhrase((String)newValue);
        return;
      case VoicePackage.TRAINING_REF__DECLARATIONS:
        setDeclarations((Declaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VoicePackage.TRAINING_REF__PHRASE:
        setPhrase(PHRASE_EDEFAULT);
        return;
      case VoicePackage.TRAINING_REF__DECLARATIONS:
        setDeclarations((Declaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VoicePackage.TRAINING_REF__PHRASE:
        return PHRASE_EDEFAULT == null ? phrase != null : !PHRASE_EDEFAULT.equals(phrase);
      case VoicePackage.TRAINING_REF__DECLARATIONS:
        return declarations != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (phrase: ");
    result.append(phrase);
    result.append(')');
    return result.toString();
  }

} //TrainingRefImpl
