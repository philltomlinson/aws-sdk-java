/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the delete project operation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The current status of the delete project operation.
     * </p>
     * 
     * @param status
     *        The current status of the delete project operation.
     * @see ProjectStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the delete project operation.
     * </p>
     * 
     * @return The current status of the delete project operation.
     * @see ProjectStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the delete project operation.
     * </p>
     * 
     * @param status
     *        The current status of the delete project operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public DeleteProjectResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the delete project operation.
     * </p>
     * 
     * @param status
     *        The current status of the delete project operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public DeleteProjectResult withStatus(ProjectStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProjectResult == false)
            return false;
        DeleteProjectResult other = (DeleteProjectResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProjectResult clone() {
        try {
            return (DeleteProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
