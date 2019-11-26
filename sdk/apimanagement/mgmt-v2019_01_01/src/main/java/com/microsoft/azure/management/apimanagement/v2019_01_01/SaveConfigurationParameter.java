/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Save Tenant Configuration Contract details.
 */
@JsonFlatten
public class SaveConfigurationParameter {
    /**
     * The name of the Git branch in which to commit the current configuration
     * snapshot.
     */
    @JsonProperty(value = "properties.branch", required = true)
    private String branch;

    /**
     * The value if true, the current configuration database is committed to
     * the Git repository, even if the Git repository has newer changes that
     * would be overwritten.
     */
    @JsonProperty(value = "properties.force")
    private Boolean force;

    /**
     * Get the name of the Git branch in which to commit the current configuration snapshot.
     *
     * @return the branch value
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the name of the Git branch in which to commit the current configuration snapshot.
     *
     * @param branch the branch value to set
     * @return the SaveConfigurationParameter object itself.
     */
    public SaveConfigurationParameter withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the value if true, the current configuration database is committed to the Git repository, even if the Git repository has newer changes that would be overwritten.
     *
     * @return the force value
     */
    public Boolean force() {
        return this.force;
    }

    /**
     * Set the value if true, the current configuration database is committed to the Git repository, even if the Git repository has newer changes that would be overwritten.
     *
     * @param force the force value to set
     * @return the SaveConfigurationParameter object itself.
     */
    public SaveConfigurationParameter withForce(Boolean force) {
        this.force = force;
        return this;
    }

}