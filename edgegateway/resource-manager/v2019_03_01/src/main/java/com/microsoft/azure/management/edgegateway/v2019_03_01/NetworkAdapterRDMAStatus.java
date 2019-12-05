/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkAdapterRDMAStatus.
 */
public final class NetworkAdapterRDMAStatus extends ExpandableStringEnum<NetworkAdapterRDMAStatus> {
    /** Static value Incapable for NetworkAdapterRDMAStatus. */
    public static final NetworkAdapterRDMAStatus INCAPABLE = fromString("Incapable");

    /** Static value Capable for NetworkAdapterRDMAStatus. */
    public static final NetworkAdapterRDMAStatus CAPABLE = fromString("Capable");

    /**
     * Creates or finds a NetworkAdapterRDMAStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkAdapterRDMAStatus
     */
    @JsonCreator
    public static NetworkAdapterRDMAStatus fromString(String name) {
        return fromString(name, NetworkAdapterRDMAStatus.class);
    }

    /**
     * @return known NetworkAdapterRDMAStatus values
     */
    public static Collection<NetworkAdapterRDMAStatus> values() {
        return values(NetworkAdapterRDMAStatus.class);
    }
}