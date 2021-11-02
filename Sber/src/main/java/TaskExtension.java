import org.gradle.api.Project;

public class TaskExtension {
    public Project project;
    public String serviceGroup;
    public String serviceName;
    public String serviceVersion;

    TaskExtension(Project project,
            String serviceGroup,
            String serviceName,
            String serviceVersion){
        this.project = project;
        this.serviceName = serviceName;
        this.serviceVersion = serviceVersion;
        this.serviceGroup = serviceGroup;
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }
}
