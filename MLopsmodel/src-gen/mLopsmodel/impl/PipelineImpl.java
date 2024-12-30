/**
 */
package mLopsmodel.impl;

import java.util.Collection;

import mLopsmodel.DataProcessing;
import mLopsmodel.Dependency;
import mLopsmodel.Deployment;
import mLopsmodel.MLopsmodelPackage;
import mLopsmodel.Pipeline;
import mLopsmodel.Training;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLopsmodel.impl.PipelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link mLopsmodel.impl.PipelineImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mLopsmodel.impl.PipelineImpl#getTraining <em>Training</em>}</li>
 *   <li>{@link mLopsmodel.impl.PipelineImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link mLopsmodel.impl.PipelineImpl#getDataprocessing <em>Dataprocessing</em>}</li>
 *   <li>{@link mLopsmodel.impl.PipelineImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraining() <em>Training</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraining()
	 * @generated
	 * @ordered
	 */
	protected Training training;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependency;

	/**
	 * The cached value of the '{@link #getDataprocessing() <em>Dataprocessing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataprocessing()
	 * @generated
	 * @ordered
	 */
	protected DataProcessing dataprocessing;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLopsmodelPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLopsmodelPackage.PIPELINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLopsmodelPackage.PIPELINE__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Training getTraining() {
		return training;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraining(Training newTraining, NotificationChain msgs) {
		Training oldTraining = training;
		training = newTraining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLopsmodelPackage.PIPELINE__TRAINING, oldTraining, newTraining);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraining(Training newTraining) {
		if (newTraining != training) {
			NotificationChain msgs = null;
			if (training != null)
				msgs = ((InternalEObject) training).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MLopsmodelPackage.PIPELINE__TRAINING, null, msgs);
			if (newTraining != null)
				msgs = ((InternalEObject) newTraining).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MLopsmodelPackage.PIPELINE__TRAINING, null, msgs);
			msgs = basicSetTraining(newTraining, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLopsmodelPackage.PIPELINE__TRAINING, newTraining,
					newTraining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<Dependency>(Dependency.class, this,
					MLopsmodelPackage.PIPELINE__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProcessing getDataprocessing() {
		return dataprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataprocessing(DataProcessing newDataprocessing, NotificationChain msgs) {
		DataProcessing oldDataprocessing = dataprocessing;
		dataprocessing = newDataprocessing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLopsmodelPackage.PIPELINE__DATAPROCESSING, oldDataprocessing, newDataprocessing);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataprocessing(DataProcessing newDataprocessing) {
		if (newDataprocessing != dataprocessing) {
			NotificationChain msgs = null;
			if (dataprocessing != null)
				msgs = ((InternalEObject) dataprocessing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MLopsmodelPackage.PIPELINE__DATAPROCESSING, null, msgs);
			if (newDataprocessing != null)
				msgs = ((InternalEObject) newDataprocessing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MLopsmodelPackage.PIPELINE__DATAPROCESSING, null, msgs);
			msgs = basicSetDataprocessing(newDataprocessing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLopsmodelPackage.PIPELINE__DATAPROCESSING,
					newDataprocessing, newDataprocessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment getDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		Deployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLopsmodelPackage.PIPELINE__DEPLOYMENT, oldDeployment, newDeployment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != deployment) {
			NotificationChain msgs = null;
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MLopsmodelPackage.PIPELINE__DEPLOYMENT, null, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MLopsmodelPackage.PIPELINE__DEPLOYMENT, null, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLopsmodelPackage.PIPELINE__DEPLOYMENT, newDeployment,
					newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLopsmodelPackage.PIPELINE__TRAINING:
			return basicSetTraining(null, msgs);
		case MLopsmodelPackage.PIPELINE__DEPENDENCY:
			return ((InternalEList<?>) getDependency()).basicRemove(otherEnd, msgs);
		case MLopsmodelPackage.PIPELINE__DATAPROCESSING:
			return basicSetDataprocessing(null, msgs);
		case MLopsmodelPackage.PIPELINE__DEPLOYMENT:
			return basicSetDeployment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLopsmodelPackage.PIPELINE__NAME:
			return getName();
		case MLopsmodelPackage.PIPELINE__VERSION:
			return getVersion();
		case MLopsmodelPackage.PIPELINE__TRAINING:
			return getTraining();
		case MLopsmodelPackage.PIPELINE__DEPENDENCY:
			return getDependency();
		case MLopsmodelPackage.PIPELINE__DATAPROCESSING:
			return getDataprocessing();
		case MLopsmodelPackage.PIPELINE__DEPLOYMENT:
			return getDeployment();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MLopsmodelPackage.PIPELINE__NAME:
			setName((String) newValue);
			return;
		case MLopsmodelPackage.PIPELINE__VERSION:
			setVersion((String) newValue);
			return;
		case MLopsmodelPackage.PIPELINE__TRAINING:
			setTraining((Training) newValue);
			return;
		case MLopsmodelPackage.PIPELINE__DEPENDENCY:
			getDependency().clear();
			getDependency().addAll((Collection<? extends Dependency>) newValue);
			return;
		case MLopsmodelPackage.PIPELINE__DATAPROCESSING:
			setDataprocessing((DataProcessing) newValue);
			return;
		case MLopsmodelPackage.PIPELINE__DEPLOYMENT:
			setDeployment((Deployment) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case MLopsmodelPackage.PIPELINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MLopsmodelPackage.PIPELINE__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case MLopsmodelPackage.PIPELINE__TRAINING:
			setTraining((Training) null);
			return;
		case MLopsmodelPackage.PIPELINE__DEPENDENCY:
			getDependency().clear();
			return;
		case MLopsmodelPackage.PIPELINE__DATAPROCESSING:
			setDataprocessing((DataProcessing) null);
			return;
		case MLopsmodelPackage.PIPELINE__DEPLOYMENT:
			setDeployment((Deployment) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MLopsmodelPackage.PIPELINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MLopsmodelPackage.PIPELINE__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case MLopsmodelPackage.PIPELINE__TRAINING:
			return training != null;
		case MLopsmodelPackage.PIPELINE__DEPENDENCY:
			return dependency != null && !dependency.isEmpty();
		case MLopsmodelPackage.PIPELINE__DATAPROCESSING:
			return dataprocessing != null;
		case MLopsmodelPackage.PIPELINE__DEPLOYMENT:
			return deployment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
