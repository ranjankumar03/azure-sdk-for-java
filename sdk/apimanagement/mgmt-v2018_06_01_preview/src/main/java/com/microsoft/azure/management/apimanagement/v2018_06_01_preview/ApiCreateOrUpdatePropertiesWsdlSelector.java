/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Criteria to limit import of WSDL to a subset of the document.
 */
public class ApiCreateOrUpdatePropertiesWsdlSelector {
    /**
     * Name of service to import from WSDL.
     */
    @JsonProperty(value = "wsdlServiceName")
    private String wsdlServiceName;

    /**
     * Name of endpoint(port) to import from WSDL.
     */
    @JsonProperty(value = "wsdlEndpointName")
    private String wsdlEndpointName;

    /**
     * Get name of service to import from WSDL.
     *
     * @return the wsdlServiceName value
     */
    public String wsdlServiceName() {
        return this.wsdlServiceName;
    }

    /**
     * Set name of service to import from WSDL.
     *
     * @param wsdlServiceName the wsdlServiceName value to set
     * @return the ApiCreateOrUpdatePropertiesWsdlSelector object itself.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector withWsdlServiceName(String wsdlServiceName) {
        this.wsdlServiceName = wsdlServiceName;
        return this;
    }

    /**
     * Get name of endpoint(port) to import from WSDL.
     *
     * @return the wsdlEndpointName value
     */
    public String wsdlEndpointName() {
        return this.wsdlEndpointName;
    }

    /**
     * Set name of endpoint(port) to import from WSDL.
     *
     * @param wsdlEndpointName the wsdlEndpointName value to set
     * @return the ApiCreateOrUpdatePropertiesWsdlSelector object itself.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector withWsdlEndpointName(String wsdlEndpointName) {
        this.wsdlEndpointName = wsdlEndpointName;
        return this;
    }

}