package org.classupplier.jobs.export;

import org.classupplier.Messages;
import org.classupplier.jobs.ContainerJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.osgi.framework.Version;

public abstract class AbstractExporter extends ContainerJob implements Exporter {

	public AbstractExporter() {
		super(Messages.JobNameExport);
	}

	private IPath destination;

	private Version version;

	@Override
	public IStatus work(IProgressMonitor monitor) throws CoreException {
		return export(monitor);
	}

	@Override
	public IPath getExportDestination() {
		return destination;
	}

	@Override
	public void setExportDestination(IPath path) {
		this.destination = path;
	}

	@Override
	public Version getVersion() {
		return version;
	}

	@Override
	public void setVersion(Version version) {
		this.version = version;
	}

}