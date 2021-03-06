package org.jfrog.artifactory.client.model.repository.settings.impl

import groovy.transform.EqualsAndHashCode
import org.jfrog.artifactory.client.model.PackageType
import org.jfrog.artifactory.client.model.impl.PackageTypeImpl
import org.jfrog.artifactory.client.model.repository.settings.BowerRepositorySettings

/**
 * GroovyBean implementation of the {@link BowerRepositorySettings}
 * 
 * @author Ivan Vasylivskyi (ivanvas@jfrog.com)
 */
@EqualsAndHashCode
class BowerRepositorySettingsImpl extends VcsRepositorySettingsImpl implements BowerRepositorySettings {
    static defaultLayout = "bower-default"

    String bowerRegistryUrl
    Boolean externalDependenciesEnabled
    Collection<String> externalDependenciesPatterns
    String externalDependenciesRemoteRepo

    public BowerRepositorySettingsImpl() {
        this.repoLayoutRef = defaultLayout
    }

    @Override
    public PackageType getPackageType() {
        return PackageTypeImpl.bower
    }
}
