/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.ImageStorageProfile;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The source user image virtual hard disk. The virtual hard disk will be
 * copied before being attached to the virtual machine. If SourceImage is
 * provided, the destination virtual hard drive must not exist.
 */
@JsonFlatten
public class ImageInner extends Resource {
    /**
     * The source virtual machine from which Image is created.
     */
    @JsonProperty(value = "properties.sourceVirtualMachine")
    private SubResource sourceVirtualMachine;

    /**
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private ImageStorageProfile storageProfile;

    /**
     * The provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the source virtual machine from which Image is created.
     *
     * @return the sourceVirtualMachine value
     */
    public SubResource sourceVirtualMachine() {
        return this.sourceVirtualMachine;
    }

    /**
     * Set the source virtual machine from which Image is created.
     *
     * @param sourceVirtualMachine the sourceVirtualMachine value to set
     * @return the ImageInner object itself.
     */
    public ImageInner withSourceVirtualMachine(SubResource sourceVirtualMachine) {
        this.sourceVirtualMachine = sourceVirtualMachine;
        return this;
    }

    /**
     * Get specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value
     */
    public ImageStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ImageInner object itself.
     */
    public ImageInner withStorageProfile(ImageStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
