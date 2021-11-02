import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ConfigurationContainer;

import java.lang.module.Configuration;

public class Task implements Plugin<Project> {
    TaskExtension extension;

    @Override
    public void apply(Project project) {
        extension = project.getExtensions().create("changeVer", TaskExtension.class, project);

        project.task("update").doFirst(task -> {
            ConfigurationContainer configurations = project.getConfigurations();
            configurations.forEach(config -> config.getResolutionStrategy().eachDependency(requested -> {
                if(requested.getRequested().getGroup().equals(extension.getServiceGroup()) && requested.getRequested().getName().equals(extension.getServiceName())){
                    requested.useVersion(extension.getServiceVersion());
                }
            }));
        });
    }
}
