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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Payload to send verification link to email */
@ApiModel(description = "Payload to send verification link to email")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifyEmailRequest {
    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public static final String SERIALIZED_NAME_USER_HRN = "userHrn";

    @SerializedName(SERIALIZED_NAME_USER_HRN)
    private String userHrn;

    public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";

    @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
    private String organizationId;

    public static final String SERIALIZED_NAME_SUB_ORGANIZATION_NAME = "subOrganizationName";

    @SerializedName(SERIALIZED_NAME_SUB_ORGANIZATION_NAME)
    private String subOrganizationName;

    /** Gets or Sets purpose */
    @JsonAdapter(PurposeEnum.Adapter.class)
    public enum PurposeEnum {
        RESET("reset"),

        SIGNUP("signup"),

        INVITE("invite"),

        LINK_USER("link_user");

        private String value;

        PurposeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PurposeEnum fromValue(String value) {
            for (PurposeEnum b : PurposeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PurposeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PurposeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PurposeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PurposeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_PURPOSE = "purpose";

    @SerializedName(SERIALIZED_NAME_PURPOSE)
    private PurposeEnum purpose;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    private Map<String, Object> metadata = null;

    public VerifyEmailRequest() {}

    public VerifyEmailRequest email(String email) {

        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VerifyEmailRequest userHrn(String userHrn) {

        this.userHrn = userHrn;
        return this;
    }

    /**
     * Get userHrn
     *
     * @return userHrn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUserHrn() {
        return userHrn;
    }

    public void setUserHrn(String userHrn) {
        this.userHrn = userHrn;
    }

    public VerifyEmailRequest organizationId(String organizationId) {

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

    public VerifyEmailRequest subOrganizationName(String subOrganizationName) {

        this.subOrganizationName = subOrganizationName;
        return this;
    }

    /**
     * Get subOrganizationName
     *
     * @return subOrganizationName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubOrganizationName() {
        return subOrganizationName;
    }

    public void setSubOrganizationName(String subOrganizationName) {
        this.subOrganizationName = subOrganizationName;
    }

    public VerifyEmailRequest purpose(PurposeEnum purpose) {

        this.purpose = purpose;
        return this;
    }

    /**
     * Get purpose
     *
     * @return purpose
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public PurposeEnum getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }

    public VerifyEmailRequest metadata(Map<String, Object> metadata) {

        this.metadata = metadata;
        return this;
    }

    public VerifyEmailRequest putMetadataItem(String key, Object metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
     * Additional metadata to be sent along with the request. Every purpose requires different
     * metadata. - signup : if user provides admin user and org details in metadata, they don&#39;t
     * need to be provided in the request body during CreateOrganization request. Supported metadata
     * keys: 1. name : string (required): name of the organization 2. description : string
     * (optional) - description of the organization 3. rootUserPassword : string (required) -
     * password of the root user 4. rootUserName : string (optional) - name of the root user 5.
     * rootUserPreferredUsername : string (optional) - preferred username of the root user 6.
     * rootUserPhone : string (optional) - phone number of the root user - invite: 1. inviterUserHrn
     * : string (required) - hrn of the user who is inviting the new user 2. policies:
     * array&lt;string&gt; (required) - policies to be attached to the new user
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Additional metadata to be sent along with the request. Every purpose requires"
                        + " different metadata. - signup :     if user provides admin user and org"
                        + " details in metadata, they don't need to be provided in the request body"
                        + " during CreateOrganization request.     Supported metadata keys:     1."
                        + " name : string (required): name of the organization     2. description :"
                        + " string (optional) - description of the organization     3."
                        + " rootUserPassword : string (required) - password of the root user     4."
                        + " rootUserName : string (optional) - name of the root user     5."
                        + " rootUserPreferredUsername : string (optional) - preferred username of"
                        + " the root user     6. rootUserPhone : string (optional) - phone number"
                        + " of the root user - invite:     1. inviterUserHrn : string (required) -"
                        + " hrn of the user who is inviting the new user     2. policies:"
                        + " array<string> (required) - policies to be attached to the new user ")
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyEmailRequest verifyEmailRequest = (VerifyEmailRequest) o;
        return Objects.equals(this.email, verifyEmailRequest.email)
                && Objects.equals(this.userHrn, verifyEmailRequest.userHrn)
                && Objects.equals(this.organizationId, verifyEmailRequest.organizationId)
                && Objects.equals(this.subOrganizationName, verifyEmailRequest.subOrganizationName)
                && Objects.equals(this.purpose, verifyEmailRequest.purpose)
                && Objects.equals(this.metadata, verifyEmailRequest.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, userHrn, organizationId, subOrganizationName, purpose, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyEmailRequest {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    userHrn: ").append(toIndentedString(userHrn)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    subOrganizationName: ")
                .append(toIndentedString(subOrganizationName))
                .append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
