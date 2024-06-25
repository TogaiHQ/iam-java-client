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

/** TokenCredentialConfig */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenCredentialConfig {
    public static final String SERIALIZED_NAME_TOKEN = "token";

    @SerializedName(SERIALIZED_NAME_TOKEN)
    private String token;

    public TokenCredentialConfig() {}

    public TokenCredentialConfig token(String token) {

        this.token = token;
        return this;
    }

    /**
     * Get token
     *
     * @return token
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenCredentialConfig tokenCredentialConfig = (TokenCredentialConfig) o;
        return Objects.equals(this.token, tokenCredentialConfig.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenCredentialConfig {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
