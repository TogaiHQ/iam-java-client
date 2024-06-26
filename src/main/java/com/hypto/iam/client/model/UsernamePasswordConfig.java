/*
 * Hypto IAM
 * APIs for Hypto IAM Service.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@hypto.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.hypto.iam.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UsernamePasswordConfig */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsernamePasswordConfig {
    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    private String password;

    public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";

    @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
    private String organizationId;

    public static final String SERIALIZED_NAME_SUB_ORGANIZATION_ID = "subOrganizationId";

    @SerializedName(SERIALIZED_NAME_SUB_ORGANIZATION_ID)
    private String subOrganizationId;

    public UsernamePasswordConfig() {}

    public UsernamePasswordConfig email(String email) {

        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsernamePasswordConfig password(String password) {

        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsernamePasswordConfig organizationId(String organizationId) {

        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get organizationId
     *
     * @return organizationId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public UsernamePasswordConfig subOrganizationId(String subOrganizationId) {

        this.subOrganizationId = subOrganizationId;
        return this;
    }

    /**
     * Get subOrganizationId
     *
     * @return subOrganizationId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubOrganizationId() {
        return subOrganizationId;
    }

    public void setSubOrganizationId(String subOrganizationId) {
        this.subOrganizationId = subOrganizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsernamePasswordConfig usernamePasswordConfig = (UsernamePasswordConfig) o;
        return Objects.equals(this.email, usernamePasswordConfig.email)
                && Objects.equals(this.password, usernamePasswordConfig.password)
                && Objects.equals(this.organizationId, usernamePasswordConfig.organizationId)
                && Objects.equals(this.subOrganizationId, usernamePasswordConfig.subOrganizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, organizationId, subOrganizationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsernamePasswordConfig {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    subOrganizationId: ")
                .append(toIndentedString(subOrganizationId))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
