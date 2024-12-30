/**
 */
package mLopsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLopsmodel.Pipeline#getName <em>Name</em>}</li>
 *   <li>{@link mLopsmodel.Pipeline#getVersion <em>Version</em>}</li>
 *   <li>{@link mLopsmodel.Pipeline#getTraining <em>Training</em>}</li>
 *   <li>{@link mLopsmodel.Pipeline#getDependency <em>Dependency</em>}</li>
 *   <li>{@link mLopsmodel.Pipeline#getDataprocessing <em>Dataprocessing</em>}</li>
 *   <li>{@link mLopsmodel.Pipeline#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see mLopsmodel.MLopsmodelPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mLopsmodel.MLopsmodelPackage#getPipeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mLopsmodel.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mLopsmodel.MLopsmodelPackage#getPipeline_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mLopsmodel.Pipeline#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Training</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training</em>' containment reference.
	 * @see #setTraining(Training)
	 * @see mLopsmodel.MLopsmodelPackage#getPipeline_Training()
	 * @model containment="true"
	 * @generated
	 */
	Training getTraining();

	/**
	 * Sets the value of the '{@link mLopsmodel.Pipeline#getTraining <em>Training</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training</em>' containment reference.
	 * @see #getTraining()
	 * @generated
	 */
	void setTraining(Training value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link mLopsmodel.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see mLopsmodel.MLopsmodelPackage#getPipeline_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Dataprocessing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataprocessing</em>' containment reference.
	 * @see #setDataprocessing(DataProcessing)
	 * @see mLopsmodel.MLopsmodelPackage#getPipeline_Dataprocessing()
	 * @model containment="true"
	 * @generated
	 */
	DataProcessing getDataprocessing();

	/**
	 * Sets the value of the '{@link mLopsmodel.Pipeline#getDataprocessing <em>Dataprocessing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataprocessing</em>' containment reference.
	 * @see #getDataprocessing()
	 * @generated
	 */
	void setDataprocessing(DataProcessing value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference.
	 * @see #setDeployment(Deployment)
	 * @see mLopsmodel.MLopsmodelPackage#getPipeline_Deployment()
	 * @model containment="true"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link mLopsmodel.Pipeline#getDeployment <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' containment reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

} // Pipeline
