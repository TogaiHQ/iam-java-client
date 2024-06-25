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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LinkUsersPaginatedResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkUsersPaginatedResponse {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private List<LinkUserResponse> data = null;

    public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";

    @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
    private String nextToken;

    public static final String SERIALIZED_NAME_CONTEXT = "context";

    @SerializedName(SERIALIZED_NAME_CONTEXT)
    private PaginationOptions context;

    public LinkUsersPaginatedResponse() {}

    public LinkUsersPaginatedResponse data(List<LinkUserResponse> data) {

        this.data = data;
        return this;
    }

    public LinkUsersPaginatedResponse addDataItem(LinkUserResponse dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LinkUserResponse> getData() {
        return data;
    }

    public void setData(List<LinkUserResponse> data) {
        this.data = data;
    }

    public LinkUsersPaginatedResponse nextToken(String nextToken) {

        this.nextToken = nextToken;
        return this;
    }

    /**
     * Get nextToken
     *
     * @return nextToken
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public LinkUsersPaginatedResponse context(PaginationOptions context) {

        this.context = context;
        return this;
    }

    /**
     * Get context
     *
     * @return context
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PaginationOptions getContext() {
        return context;
    }

    public void setContext(PaginationOptions context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkUsersPaginatedResponse linkUsersPaginatedResponse = (LinkUsersPaginatedResponse) o;
        return Objects.equals(this.data, linkUsersPaginatedResponse.data)
                && Objects.equals(this.nextToken, linkUsersPaginatedResponse.nextToken)
                && Objects.equals(this.context, linkUsersPaginatedResponse.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, nextToken, context);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkUsersPaginatedResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
