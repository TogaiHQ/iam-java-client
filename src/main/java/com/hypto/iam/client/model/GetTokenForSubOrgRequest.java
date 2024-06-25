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

/** GetTokenForSubOrgRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetTokenForSubOrgRequest {
    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public static final String SERIALIZED_NAME_EXPIRY = "expiry";

    @SerializedName(SERIALIZED_NAME_EXPIRY)
    private Integer expiry;

    public GetTokenForSubOrgRequest() {}

    public GetTokenForSubOrgRequest email(String email) {

        this.email = email;
        return this;
    }

    /**
     * Email of the sub organization user to get token for
     *
     * @return email
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "Email of the sub organization user to get token for")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GetTokenForSubOrgRequest expiry(Integer expiry) {

        this.expiry = expiry;
        return this;
    }

    /**
     * Expiry in seconds from the time of generation. If not provided, the token will have the
     * expiry of 24 hours
     *
     * @return expiry
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Expiry in seconds from the time of generation. If not provided, the token will"
                            + " have the expiry of 24 hours ")
    public Integer getExpiry() {
        return expiry;
    }

    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTokenForSubOrgRequest getTokenForSubOrgRequest = (GetTokenForSubOrgRequest) o;
        return Objects.equals(this.email, getTokenForSubOrgRequest.email)
                && Objects.equals(this.expiry, getTokenForSubOrgRequest.expiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, expiry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTokenForSubOrgRequest {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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
