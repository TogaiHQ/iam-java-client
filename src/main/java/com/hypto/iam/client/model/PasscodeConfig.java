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

/** PasscodeConfig */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PasscodeConfig {
    public static final String SERIALIZED_NAME_PASSCODE = "passcode";

    @SerializedName(SERIALIZED_NAME_PASSCODE)
    private String passcode;

    public PasscodeConfig() {}

    public PasscodeConfig passcode(String passcode) {

        this.passcode = passcode;
        return this;
    }

    /**
     * Get passcode
     *
     * @return passcode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PasscodeConfig passcodeConfig = (PasscodeConfig) o;
        return Objects.equals(this.passcode, passcodeConfig.passcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passcode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasscodeConfig {\n");
        sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
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
