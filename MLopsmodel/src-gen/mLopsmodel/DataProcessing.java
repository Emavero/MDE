/**
 */
package mLopsmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLopsmodel.DataProcessing#getInputPath <em>Input Path</em>}</li>
 *   <li>{@link mLopsmodel.DataProcessing#getOutputPath <em>Output Path</em>}</li>
 * </ul>
 *
 * @see mLopsmodel.MLopsmodelPackage#getDataProcessing()
 * @model
 * @generated
 */
public interface DataProcessing extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Path</em>' attribute.
	 * @see #setInputPath(String)
	 * @see mLopsmodel.MLopsmodelPackage#getDataProcessing_InputPath()
	 * @model
	 * @generated
	 */
	String getInputPath();

	/**
	 * Sets the value of the '{@link mLopsmodel.DataProcessing#getInputPath <em>Input Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Path</em>' attribute.
	 * @see #getInputPath()
	 * @generated
	 */
	void setInputPath(String value);

	/**
	 * Returns the value of the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Path</em>' attribute.
	 * @see #setOutputPath(String)
	 * @see mLopsmodel.MLopsmodelPackage#getDataProcessing_OutputPath()
	 * @model
	 * @generated
	 */
	String getOutputPath();

	/**
	 * Sets the value of the '{@link mLopsmodel.DataProcessing#getOutputPath <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Path</em>' attribute.
	 * @see #getOutputPath()
	 * @generated
	 */
	void setOutputPath(String value);

} // DataProcessing
