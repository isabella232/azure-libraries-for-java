/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a network interface reference.
 */
@JsonFlatten
public class NetworkInterfaceReference extends SubResource {
    /**
     * Specifies the primary network interface in case the virtual machine has
     * more than 1 network interface.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /**
     * Get specifies the primary network interface in case the virtual machine has more than 1 network interface.
     *
     * @return the primary value
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set specifies the primary network interface in case the virtual machine has more than 1 network interface.
     *
     * @param primary the primary value to set
     * @return the NetworkInterfaceReference object itself.
     */
    public NetworkInterfaceReference withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

}
