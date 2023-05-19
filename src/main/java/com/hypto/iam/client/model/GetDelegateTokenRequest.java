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

/** payload to generate a delegate_token */
@ApiModel(description = "payload to generate a delegate_token")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDelegateTokenRequest {
    public static final String SERIALIZED_NAME_PRINCIPAL = "principal";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL)
    private String principal;

    public static final String SERIALIZED_NAME_EXPIRY = "expiry";

    @SerializedName(SERIALIZED_NAME_EXPIRY)
    private Long expiry;

    public static final String SERIALIZED_NAME_POLICY = "policy";

    @SerializedName(SERIALIZED_NAME_POLICY)
    private String policy;

    public GetDelegateTokenRequest() {}

    public GetDelegateTokenRequest principal(String principal) {

        this.principal = principal;
        return this;
    }

    /**
     * Principal to delegate the token to. Will default to the requestor if not provided
     *
     * @return principal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Principal to delegate the token to. Will default to the requestor if not"
                            + " provided")
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public GetDelegateTokenRequest expiry(Long expiry) {

        this.expiry = expiry;
        return this;
    }

    /**
     * Expiry in seconds from the time of generation. If not provided, generated token will have the
     * expiry of the token used for requesting. If a credential is used for requesting, expiry will
     * be 24 hours from the time of requesting.
     *
     * @return expiry
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Expiry in seconds from the time of generation.  If not provided, generated"
                            + " token will have the expiry of the token used for requesting. If a"
                            + " credential is used for requesting, expiry will be 24 hours from the"
                            + " time of requesting. ")
    public Long getExpiry() {
        return expiry;
    }

    public void setExpiry(Long expiry) {
        this.expiry = expiry;
    }

    public GetDelegateTokenRequest policy(String policy) {

        this.policy = policy;
        return this;
    }

    /**
     * Policy with which to generate the delegate token. Can be just the name of the policy if it is
     * in the requestors organization or a complete policy resourceHrn
     *
     * @return policy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value =
                    "Policy with which to generate the delegate token. Can be just the name of the"
                            + " policy if it is in the requestors organization or a complete policy"
                            + " resourceHrn ")
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetDelegateTokenRequest getDelegateTokenRequest = (GetDelegateTokenRequest) o;
        return Objects.equals(this.principal, getDelegateTokenRequest.principal)
                && Objects.equals(this.expiry, getDelegateTokenRequest.expiry)
                && Objects.equals(this.policy, getDelegateTokenRequest.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, expiry, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDelegateTokenRequest {\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
