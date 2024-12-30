/**
 */
package mLopsmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mLopsmodel.MLopsmodelFactory
 * @model kind="package"
 * @generated
 */
public interface MLopsmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mLopsmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mLopsmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mLopsmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MLopsmodelPackage eINSTANCE = mLopsmodel.impl.MLopsmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mLopsmodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLopsmodel.impl.PipelineImpl
	 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Training</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRAINING = 2;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Dataprocessing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DATAPROCESSING = 4;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DEPLOYMENT = 5;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLopsmodel.impl.TrainingImpl <em>Training</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLopsmodel.impl.TrainingImpl
	 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getTraining()
	 * @generated
	 */
	int TRAINING = 1;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLopsmodel.impl.DataProcessingImpl <em>Data Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLopsmodel.impl.DataProcessingImpl
	 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getDataProcessing()
	 * @generated
	 */
	int DATA_PROCESSING = 2;

	/**
	 * The feature id for the '<em><b>Input Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING__INPUT_PATH = 0;

	/**
	 * The feature id for the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING__OUTPUT_PATH = 1;

	/**
	 * The number of structural features of the '<em>Data Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLopsmodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLopsmodel.impl.ParameterImpl
	 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLopsmodel.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLopsmodel.impl.DeploymentImpl
	 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Target Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__TARGET_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Scalability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SCALABILITY = 1;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLopsmodel.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLopsmodel.impl.DependencyImpl
	 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mLopsmodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see mLopsmodel.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLopsmodel.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Pipeline#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mLopsmodel.Pipeline#getVersion()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Version();

	/**
	 * Returns the meta object for the containment reference '{@link mLopsmodel.Pipeline#getTraining <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Training</em>'.
	 * @see mLopsmodel.Pipeline#getTraining()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Training();

	/**
	 * Returns the meta object for the containment reference list '{@link mLopsmodel.Pipeline#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see mLopsmodel.Pipeline#getDependency()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Dependency();

	/**
	 * Returns the meta object for the containment reference '{@link mLopsmodel.Pipeline#getDataprocessing <em>Dataprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataprocessing</em>'.
	 * @see mLopsmodel.Pipeline#getDataprocessing()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Dataprocessing();

	/**
	 * Returns the meta object for the containment reference '{@link mLopsmodel.Pipeline#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment</em>'.
	 * @see mLopsmodel.Pipeline#getDeployment()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Deployment();

	/**
	 * Returns the meta object for class '{@link mLopsmodel.Training <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training</em>'.
	 * @see mLopsmodel.Training
	 * @generated
	 */
	EClass getTraining();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Training#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see mLopsmodel.Training#getAlgorithm()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Algorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link mLopsmodel.Training#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see mLopsmodel.Training#getParameter()
	 * @see #getTraining()
	 * @generated
	 */
	EReference getTraining_Parameter();

	/**
	 * Returns the meta object for class '{@link mLopsmodel.DataProcessing <em>Data Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing</em>'.
	 * @see mLopsmodel.DataProcessing
	 * @generated
	 */
	EClass getDataProcessing();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.DataProcessing#getInputPath <em>Input Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Path</em>'.
	 * @see mLopsmodel.DataProcessing#getInputPath()
	 * @see #getDataProcessing()
	 * @generated
	 */
	EAttribute getDataProcessing_InputPath();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.DataProcessing#getOutputPath <em>Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Path</em>'.
	 * @see mLopsmodel.DataProcessing#getOutputPath()
	 * @see #getDataProcessing()
	 * @generated
	 */
	EAttribute getDataProcessing_OutputPath();

	/**
	 * Returns the meta object for class '{@link mLopsmodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see mLopsmodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mLopsmodel.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mLopsmodel.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link mLopsmodel.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see mLopsmodel.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Deployment#getTargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Platform</em>'.
	 * @see mLopsmodel.Deployment#getTargetPlatform()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_TargetPlatform();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Deployment#getScalability <em>Scalability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalability</em>'.
	 * @see mLopsmodel.Deployment#getScalability()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Scalability();

	/**
	 * Returns the meta object for class '{@link mLopsmodel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see mLopsmodel.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Dependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLopsmodel.Dependency#getName()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Name();

	/**
	 * Returns the meta object for the attribute '{@link mLopsmodel.Dependency#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mLopsmodel.Dependency#getVersion()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Version();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MLopsmodelFactory getMLopsmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mLopsmodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLopsmodel.impl.PipelineImpl
		 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__VERSION = eINSTANCE.getPipeline_Version();

		/**
		 * The meta object literal for the '<em><b>Training</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRAINING = eINSTANCE.getPipeline_Training();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DEPENDENCY = eINSTANCE.getPipeline_Dependency();

		/**
		 * The meta object literal for the '<em><b>Dataprocessing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DATAPROCESSING = eINSTANCE.getPipeline_Dataprocessing();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DEPLOYMENT = eINSTANCE.getPipeline_Deployment();

		/**
		 * The meta object literal for the '{@link mLopsmodel.impl.TrainingImpl <em>Training</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLopsmodel.impl.TrainingImpl
		 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getTraining()
		 * @generated
		 */
		EClass TRAINING = eINSTANCE.getTraining();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__ALGORITHM = eINSTANCE.getTraining_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING__PARAMETER = eINSTANCE.getTraining_Parameter();

		/**
		 * The meta object literal for the '{@link mLopsmodel.impl.DataProcessingImpl <em>Data Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLopsmodel.impl.DataProcessingImpl
		 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getDataProcessing()
		 * @generated
		 */
		EClass DATA_PROCESSING = eINSTANCE.getDataProcessing();

		/**
		 * The meta object literal for the '<em><b>Input Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROCESSING__INPUT_PATH = eINSTANCE.getDataProcessing_InputPath();

		/**
		 * The meta object literal for the '<em><b>Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROCESSING__OUTPUT_PATH = eINSTANCE.getDataProcessing_OutputPath();

		/**
		 * The meta object literal for the '{@link mLopsmodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLopsmodel.impl.ParameterImpl
		 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link mLopsmodel.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLopsmodel.impl.DeploymentImpl
		 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Target Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__TARGET_PLATFORM = eINSTANCE.getDeployment_TargetPlatform();

		/**
		 * The meta object literal for the '<em><b>Scalability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__SCALABILITY = eINSTANCE.getDeployment_Scalability();

		/**
		 * The meta object literal for the '{@link mLopsmodel.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLopsmodel.impl.DependencyImpl
		 * @see mLopsmodel.impl.MLopsmodelPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__VERSION = eINSTANCE.getDependency_Version();

	}

} //MLopsmodelPackage
