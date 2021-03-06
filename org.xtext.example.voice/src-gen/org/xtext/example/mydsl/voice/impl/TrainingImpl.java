/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.voice.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.voice.Training;
import org.xtext.example.mydsl.voice.TrainingRef;
import org.xtext.example.mydsl.voice.VoicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.voice.impl.TrainingImpl#getTrainingref <em>Trainingref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingImpl extends MinimalEObjectImpl.Container implements Training
{
  /**
   * The cached value of the '{@link #getTrainingref() <em>Trainingref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrainingref()
   * @generated
   * @ordered
   */
  protected EList<TrainingRef> trainingref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrainingImpl()
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
    return VoicePackage.Literals.TRAINING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TrainingRef> getTrainingref()
  {
    if (trainingref == null)
    {
      trainingref = new EObjectContainmentEList<TrainingRef>(TrainingRef.class, this, VoicePackage.TRAINING__TRAININGREF);
    }
    return trainingref;
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
      case VoicePackage.TRAINING__TRAININGREF:
        return ((InternalEList<?>)getTrainingref()).basicRemove(otherEnd, msgs);
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
      case VoicePackage.TRAINING__TRAININGREF:
        return getTrainingref();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VoicePackage.TRAINING__TRAININGREF:
        getTrainingref().clear();
        getTrainingref().addAll((Collection<? extends TrainingRef>)newValue);
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
      case VoicePackage.TRAINING__TRAININGREF:
        getTrainingref().clear();
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
      case VoicePackage.TRAINING__TRAININGREF:
        return trainingref != null && !trainingref.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TrainingImpl
