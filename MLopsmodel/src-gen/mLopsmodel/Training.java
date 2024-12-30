/**
 */
package mLopsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLopsmodel.Training#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mLopsmodel.Training#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see mLopsmodel.MLopsmodelPackage#getTraining()
 * @model
 * @generated
 */
public interface Training extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see mLopsmodel.MLopsmodelPackage#getTraining_Algorithm()
	 * @model
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link mLopsmodel.Training#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link mLopsmodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see mLopsmodel.MLopsmodelPackage#getTraining_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Training
