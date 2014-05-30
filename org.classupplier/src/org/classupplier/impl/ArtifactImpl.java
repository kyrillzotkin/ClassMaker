/**
 */
package org.classupplier.impl;

import org.classupplier.Artifact;
import org.classupplier.ClasSupplierPackage;
import org.classupplier.State;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Artifact</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getName <em>Name</em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getEPackage <em>EPackage</em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getPrototypeEPackage <em>
 * Prototype EPackage</em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getVersion <em>Version</em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getProjectName <em>Project Name
 * </em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getState <em>State</em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getStatus <em>Status</em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getLoadedEPackage <em>Loaded
 * EPackage</em>}</li>
 * <li>{@link org.classupplier.impl.ArtifactImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ArtifactImpl extends EObjectImpl implements Artifact {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrototypeEPackage()
	 * <em>Prototype EPackage</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPrototypeEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage prototypeEPackage;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.CREATED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IStatus STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected IStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadedEPackage()
	 * <em>Loaded EPackage</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLoadedEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage loadedEPackage;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final Resource RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource = RESOURCE_EDEFAULT;

	private Adapter adapter = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeatureID(getClass()) == ClasSupplierPackage.ARTIFACT__NAME
					&& msg.getEventType() == Notification.SET
					&& msg.getNewStringValue() != null)
				setProjectName(msg.getNewStringValue().toLowerCase());
			if (msg.getFeatureID(getClass()) == ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE
					&& msg.getNewValue() != null) {
				setStatus(STATUS_EDEFAULT);
				setState(State.PROTOTYPE);
			}
			if ((msg.getFeatureID(getClass()) == ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE || msg
					.getFeatureID(getClass()) == ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE)
					&& msg.getEventType() == Notification.SET
					&& eIsSet(EcorePackage.EOBJECT___ECONTAINER))
				((InfrastructureImpl) eContainer())
						.notifyEPackageAdd((Artifact) msg.getNotifier());
			if ((msg.getFeatureID(getClass()) == ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE || msg
					.getFeatureID(getClass()) == ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE)
					&& msg.getEventType() == Notification.UNSET
					&& eIsSet(EcorePackage.EOBJECT___ECONTAINER))
				((InfrastructureImpl) eContainer())
						.notifyEPackageRemove((Artifact) msg.getNotifier());
		}

	};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ArtifactImpl() {
		super();
		eAdapters().add(adapter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClasSupplierPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getName() {
		if (eIsSet(ClasSupplierPackage.ARTIFACT__NAME))
			return name;
		if ((getState() == State.PROTOTYPE || getState() == State.PROCESSING)
				&& eIsSet(ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE))
			return getPrototypeEPackage().getName();
		if (getState() == State.COMPLETE)
			return getEPackage().getName();
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EPackage getEPackage() {
		EPackage ePackage = basicGetEPackage();
		return ePackage != null && ePackage.eIsProxy() ? (EPackage) eResolveProxy((InternalEObject) ePackage)
				: ePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EPackage basicGetEPackage() {
		switch (getState().getValue()) {
		case State.PROTOTYPE_VALUE:
			return getPrototypeEPackage();
		case State.COMPLETE_VALUE:
			return getLoadedEPackage();
		default:
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EPackage getPrototypeEPackage() {
		if (prototypeEPackage != null && prototypeEPackage.eIsProxy()) {
			InternalEObject oldPrototypeEPackage = (InternalEObject) prototypeEPackage;
			prototypeEPackage = (EPackage) eResolveProxy(oldPrototypeEPackage);
			if (prototypeEPackage != oldPrototypeEPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE,
							oldPrototypeEPackage, prototypeEPackage));
			}
		}
		return prototypeEPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EPackage basicGetPrototypeEPackage() {
		return prototypeEPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setPrototypeEPackage(EPackage newPrototypeEPackage) {
		EPackage oldPrototypeEPackage = prototypeEPackage;
		prototypeEPackage = newPrototypeEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE,
					oldPrototypeEPackage, prototypeEPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Version getVersion() {
		if (!eIsSet(ClasSupplierPackage.Literals.ARTIFACT__VERSION))
			setVersion(Version.emptyVersion);
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__PROJECT_NAME, oldProjectName,
					projectName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setStatus(IStatus newStatus) {
		IStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EPackage getLoadedEPackage() {
		if (loadedEPackage != null && loadedEPackage.eIsProxy()) {
			InternalEObject oldLoadedEPackage = (InternalEObject) loadedEPackage;
			loadedEPackage = (EPackage) eResolveProxy(oldLoadedEPackage);
			if (loadedEPackage != oldLoadedEPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE,
							oldLoadedEPackage, loadedEPackage));
			}
		}
		return loadedEPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EPackage basicGetLoadedEPackage() {
		return loadedEPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setLoadedEPackage(EPackage newLoadedEPackage) {
		EPackage oldLoadedEPackage = loadedEPackage;
		loadedEPackage = newLoadedEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE,
					oldLoadedEPackage, loadedEPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClasSupplierPackage.ARTIFACT__RESOURCE, oldResource,
					resource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void produce(IProgressMonitor monitor) {
		if (getState().equals(State.PROCESSING))
			return;
		if (getStatus() != STATUS_EDEFAULT && !getStatus().isOK()) {
			getStatus().getException().printStackTrace();
			return;
		}
		setState(State.PROCESSING);
		try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			// workspace.getRoot().refreshLocal(IResource.DEPTH_ZERO, monitor);
			String projectName = getProjectName();
			IProject project = workspace.getRoot().getProject(projectName);
			if (!project.exists())
				project.create(monitor);
			project.open(monitor);
			boolean autoBuild = workspace.isAutoBuilding();
			setAutoBuilding(workspace, false);
			ResourceHelper.addNature(project, OSGi.NATURE_ID, monitor);
			project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
			setAutoBuilding(workspace, autoBuild);
		} catch (CoreException e) {
			if (e.getStatus().getSeverity() == IStatus.ERROR) {
				setStatus(e.getStatus());
				setState(State.PROTOTYPE);
				setLoadedEPackage(null);
			}
			e.printStackTrace();
			monitor.setCanceled(true);
			return;
		}
		setStatus(new Status(IStatus.OK, OSGi.PLUGIN_ID, "Artifact is ready."));
		setState(State.COMPLETE);
		monitor.done();
	}

	private void setAutoBuilding(IWorkspace workspace, boolean value)
			throws CoreException {
		IWorkspaceDescription d = workspace.getDescription();
		d.setAutoBuilding(value);
		workspace.setDescription(d);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClasSupplierPackage.ARTIFACT__NAME:
			return getName();
		case ClasSupplierPackage.ARTIFACT__EPACKAGE:
			if (resolve)
				return getEPackage();
			return basicGetEPackage();
		case ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE:
			if (resolve)
				return getPrototypeEPackage();
			return basicGetPrototypeEPackage();
		case ClasSupplierPackage.ARTIFACT__VERSION:
			return getVersion();
		case ClasSupplierPackage.ARTIFACT__PROJECT_NAME:
			return getProjectName();
		case ClasSupplierPackage.ARTIFACT__STATE:
			return getState();
		case ClasSupplierPackage.ARTIFACT__STATUS:
			return getStatus();
		case ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE:
			if (resolve)
				return getLoadedEPackage();
			return basicGetLoadedEPackage();
		case ClasSupplierPackage.ARTIFACT__RESOURCE:
			return getResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ClasSupplierPackage.ARTIFACT__NAME:
			setName((String) newValue);
			return;
		case ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE:
			setPrototypeEPackage((EPackage) newValue);
			return;
		case ClasSupplierPackage.ARTIFACT__VERSION:
			setVersion((Version) newValue);
			return;
		case ClasSupplierPackage.ARTIFACT__PROJECT_NAME:
			setProjectName((String) newValue);
			return;
		case ClasSupplierPackage.ARTIFACT__STATE:
			setState((State) newValue);
			return;
		case ClasSupplierPackage.ARTIFACT__STATUS:
			setStatus((IStatus) newValue);
			return;
		case ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE:
			setLoadedEPackage((EPackage) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ClasSupplierPackage.ARTIFACT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE:
			setPrototypeEPackage((EPackage) null);
			return;
		case ClasSupplierPackage.ARTIFACT__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case ClasSupplierPackage.ARTIFACT__PROJECT_NAME:
			setProjectName(PROJECT_NAME_EDEFAULT);
			return;
		case ClasSupplierPackage.ARTIFACT__STATE:
			setState(STATE_EDEFAULT);
			return;
		case ClasSupplierPackage.ARTIFACT__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE:
			setLoadedEPackage((EPackage) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ClasSupplierPackage.ARTIFACT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ClasSupplierPackage.ARTIFACT__EPACKAGE:
			return basicGetEPackage() != null;
		case ClasSupplierPackage.ARTIFACT__PROTOTYPE_EPACKAGE:
			return prototypeEPackage != null;
		case ClasSupplierPackage.ARTIFACT__VERSION:
			return VERSION_EDEFAULT == null ? version != null
					: !VERSION_EDEFAULT.equals(version);
		case ClasSupplierPackage.ARTIFACT__PROJECT_NAME:
			return PROJECT_NAME_EDEFAULT == null ? projectName != null
					: !PROJECT_NAME_EDEFAULT.equals(projectName);
		case ClasSupplierPackage.ARTIFACT__STATE:
			return state != STATE_EDEFAULT;
		case ClasSupplierPackage.ARTIFACT__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT
					.equals(status);
		case ClasSupplierPackage.ARTIFACT__LOADED_EPACKAGE:
			return loadedEPackage != null;
		case ClasSupplierPackage.ARTIFACT__RESOURCE:
			return RESOURCE_EDEFAULT == null ? resource != null
					: !RESOURCE_EDEFAULT.equals(resource);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", state: ");
		result.append(state);
		result.append(", status: ");
		result.append(status);
		result.append(", resource: ");
		result.append(resource);
		result.append(')');
		return result.toString();
	}

} // ArtifactImpl
