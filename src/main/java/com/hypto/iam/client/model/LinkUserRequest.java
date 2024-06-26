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
import java.util.Objects;

/** Payload to link a user to another user of same/different organization */
@ApiModel(description = "Payload to link a user to another user of same/different organization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkUserRequest {
    /** Gets or Sets type */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        PASSCODE("PASSCODE"),

        USERNAME_PASSWORD("USERNAME_PASSWORD"),

        TOKEN_CREDENTIAL("TOKEN_CREDENTIAL");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private TypeEnum type;

    public static final String SERIALIZED_NAME_PASSCODE_CONFIG = "passcodeConfig";

    @SerializedName(SERIALIZED_NAME_PASSCODE_CONFIG)
    private PasscodeConfig passcodeConfig;

    public static final String SERIALIZED_NAME_USERNAME_PASSWORD_CONFIG = "usernamePasswordConfig";

    @SerializedName(SERIALIZED_NAME_USERNAME_PASSWORD_CONFIG)
    private UsernamePasswordConfig usernamePasswordConfig;

    public static final String SERIALIZED_NAME_TOKEN_CREDENTIAL_CONFIG = "tokenCredentialConfig";

    @SerializedName(SERIALIZED_NAME_TOKEN_CREDENTIAL_CONFIG)
    private TokenCredentialConfig tokenCredentialConfig;

    public LinkUserRequest() {}

    public LinkUserRequest type(TypeEnum type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public LinkUserRequest passcodeConfig(PasscodeConfig passcodeConfig) {

        this.passcodeConfig = passcodeConfig;
        return this;
    }

    /**
     * Get passcodeConfig
     *
     * @return passcodeConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PasscodeConfig getPasscodeConfig() {
        return passcodeConfig;
    }

    public void setPasscodeConfig(PasscodeConfig passcodeConfig) {
        this.passcodeConfig = passcodeConfig;
    }

    public LinkUserRequest usernamePasswordConfig(UsernamePasswordConfig usernamePasswordConfig) {

        this.usernamePasswordConfig = usernamePasswordConfig;
        return this;
    }

    /**
     * Get usernamePasswordConfig
     *
     * @return usernamePasswordConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UsernamePasswordConfig getUsernamePasswordConfig() {
        return usernamePasswordConfig;
    }

    public void setUsernamePasswordConfig(UsernamePasswordConfig usernamePasswordConfig) {
        this.usernamePasswordConfig = usernamePasswordConfig;
    }

    public LinkUserRequest tokenCredentialConfig(TokenCredentialConfig tokenCredentialConfig) {

        this.tokenCredentialConfig = tokenCredentialConfig;
        return this;
    }

    /**
     * Get tokenCredentialConfig
     *
     * @return tokenCredentialConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TokenCredentialConfig getTokenCredentialConfig() {
        return tokenCredentialConfig;
    }

    public void setTokenCredentialConfig(TokenCredentialConfig tokenCredentialConfig) {
        this.tokenCredentialConfig = tokenCredentialConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkUserRequest linkUserRequest = (LinkUserRequest) o;
        return Objects.equals(this.type, linkUserRequest.type)
                && Objects.equals(this.passcodeConfig, linkUserRequest.passcodeConfig)
                && Objects.equals(
                        this.usernamePasswordConfig, linkUserRequest.usernamePasswordConfig)
                && Objects.equals(
                        this.tokenCredentialConfig, linkUserRequest.tokenCredentialConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, passcodeConfig, usernamePasswordConfig, tokenCredentialConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkUserRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    passcodeConfig: ").append(toIndentedString(passcodeConfig)).append("\n");
        sb.append("    usernamePasswordConfig: ")
                .append(toIndentedString(usernamePasswordConfig))
                .append("\n");
        sb.append("    tokenCredentialConfig: ")
                .append(toIndentedString(tokenCredentialConfig))
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
