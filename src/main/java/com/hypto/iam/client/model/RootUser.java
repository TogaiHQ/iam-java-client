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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Root user details for the organization */
@ApiModel(description = "Root user details for the organization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RootUser {
    public static final String SERIALIZED_NAME_PREFERRED_USERNAME = "preferredUsername";

    @SerializedName(SERIALIZED_NAME_PREFERRED_USERNAME)
    private String preferredUsername;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PASSWORD_HASH = "passwordHash";

    @SerializedName(SERIALIZED_NAME_PASSWORD_HASH)
    private String passwordHash;

    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public static final String SERIALIZED_NAME_PHONE = "phone";

    @SerializedName(SERIALIZED_NAME_PHONE)
    private String phone;

    public RootUser() {}

    public RootUser preferredUsername(String preferredUsername) {

        this.preferredUsername = preferredUsername;
        return this;
    }

    /**
     * Get preferredUsername
     *
     * @return preferredUsername
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPreferredUsername() {
        return preferredUsername;
    }

    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }

    public RootUser name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RootUser passwordHash(String passwordHash) {

        this.passwordHash = passwordHash;
        return this;
    }

    /**
     * Get passwordHash
     *
     * @return passwordHash
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public RootUser email(String email) {

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

    public RootUser phone(String phone) {

        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RootUser rootUser = (RootUser) o;
        return Objects.equals(this.preferredUsername, rootUser.preferredUsername)
                && Objects.equals(this.name, rootUser.name)
                && Objects.equals(this.passwordHash, rootUser.passwordHash)
                && Objects.equals(this.email, rootUser.email)
                && Objects.equals(this.phone, rootUser.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preferredUsername, name, passwordHash, email, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RootUser {\n");
        sb.append("    preferredUsername: ")
                .append(toIndentedString(preferredUsername))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
