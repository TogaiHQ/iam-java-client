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


package com.hypto.iam.client.api;

import com.hypto.iam.client.ApiCallback;
import com.hypto.iam.client.ApiClient;
import com.hypto.iam.client.ApiException;
import com.hypto.iam.client.ApiResponse;
import com.hypto.iam.client.Configuration;
import com.hypto.iam.client.Pair;
import com.hypto.iam.client.ProgressRequestBody;
import com.hypto.iam.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.hypto.iam.client.model.BaseSuccessResponse;
import com.hypto.iam.client.model.ErrorResponse;
import com.hypto.iam.client.model.VerifyEmailRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserVerificationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserVerificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserVerificationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for verifyEmail
     * @param verifyEmailRequest Payload to send verification link to email (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
     </table>
     */
    public okhttp3.Call verifyEmailCall(VerifyEmailRequest verifyEmailRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = verifyEmailRequest;

        // create path and map variables
        String localVarPath = "/verifyEmail";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call verifyEmailValidateBeforeCall(VerifyEmailRequest verifyEmailRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'verifyEmailRequest' is set
        if (verifyEmailRequest == null) {
            throw new ApiException("Missing the required parameter 'verifyEmailRequest' when calling verifyEmail(Async)");
        }
        

        okhttp3.Call localVarCall = verifyEmailCall(verifyEmailRequest, _callback);
        return localVarCall;

    }

    /**
     * Verify email
     * Verify email during account opening and resetting password
     * @param verifyEmailRequest Payload to send verification link to email (required)
     * @return BaseSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
     </table>
     */
    public BaseSuccessResponse verifyEmail(VerifyEmailRequest verifyEmailRequest) throws ApiException {
        ApiResponse<BaseSuccessResponse> localVarResp = verifyEmailWithHttpInfo(verifyEmailRequest);
        return localVarResp.getData();
    }

    /**
     * Verify email
     * Verify email during account opening and resetting password
     * @param verifyEmailRequest Payload to send verification link to email (required)
     * @return ApiResponse&lt;BaseSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
     </table>
     */
    public ApiResponse<BaseSuccessResponse> verifyEmailWithHttpInfo(VerifyEmailRequest verifyEmailRequest) throws ApiException {
        okhttp3.Call localVarCall = verifyEmailValidateBeforeCall(verifyEmailRequest, null);
        Type localVarReturnType = new TypeToken<BaseSuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Verify email (asynchronously)
     * Verify email during account opening and resetting password
     * @param verifyEmailRequest Payload to send verification link to email (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  * X-Iam-User-Organization - Organization Id of the authenticated user <br>  </td></tr>
     </table>
     */
    public okhttp3.Call verifyEmailAsync(VerifyEmailRequest verifyEmailRequest, final ApiCallback<BaseSuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyEmailValidateBeforeCall(verifyEmailRequest, _callback);
        Type localVarReturnType = new TypeToken<BaseSuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
