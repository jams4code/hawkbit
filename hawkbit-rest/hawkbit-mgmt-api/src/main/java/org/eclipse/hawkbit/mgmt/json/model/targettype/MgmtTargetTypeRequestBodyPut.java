/**
 * Copyright (c) 2021 Bosch.IO GmbH and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.hawkbit.mgmt.json.model.targettype;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request Body for TargetType PUT.
 *
 */
public class MgmtTargetTypeRequestBodyPut {

    @JsonProperty(required = true)
    private String name;

    @JsonProperty
    private String description;

    @JsonProperty
    private String colour;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     *
     * @return updated body
     */
    public MgmtTargetTypeRequestBodyPut setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *          Description
     * @return Updated body
     */
    public MgmtTargetTypeRequestBodyPut setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * @return Colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour
     *          Colour
     * @return Updated body
     */
    public MgmtTargetTypeRequestBodyPut setColour(final String colour) {
        this.colour = colour;
        return this;
    }
}
