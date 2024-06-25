package com.hypto.iam.client.api;

import com.hypto.iam.client.CollectionFormats.*;
import com.hypto.iam.client.model.BaseSuccessResponse;
import com.hypto.iam.client.model.ChangeUserPasswordRequest;
import com.hypto.iam.client.model.CreateUserPasswordRequest;
import com.hypto.iam.client.model.CreateUserRequest;
import com.hypto.iam.client.model.CreateUserResponse;
import com.hypto.iam.client.model.LinkUserRequest;
import com.hypto.iam.client.model.LinkUsersPaginatedResponse;
import com.hypto.iam.client.model.ResetPasswordRequest;
import com.hypto.iam.client.model.TokenResponse;
import com.hypto.iam.client.model.UpdateUserRequest;
import com.hypto.iam.client.model.User;
import com.hypto.iam.client.model.UserPaginatedResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserManagementApi {
    /**
     * Change password for a user Change password for a user
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param changeUserPasswordRequest Payload to change user password (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users/{user_name}/change_password")
    Call<BaseSuccessResponse> changePassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body ChangeUserPasswordRequest changeUserPasswordRequest);

    /**
     * Change password for a user Change password for a user
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @param changeUserPasswordRequest Payload to change user password (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}/change_password")
    Call<BaseSuccessResponse> changeSubOrganizationPassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body ChangeUserPasswordRequest changeUserPasswordRequest);

    /**
     * Create password for a user Create password for a user
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param createUserPasswordRequest Payload to set user password (required)
     * @return Call&lt;TokenResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users/{user_name}/create_password")
    Call<TokenResponse> createPassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body CreateUserPasswordRequest createUserPasswordRequest);

    /**
     * Create password for a user Create password for a user
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @param createUserPasswordRequest Payload to set user password (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}/create_password")
    Call<BaseSuccessResponse> createSubOrganizationPassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body CreateUserPasswordRequest createUserPasswordRequest);

    /**
     * Create a user User is an entity which represent a person who is part of the organization or
     * account. This user entity can be created either through user name, password or the user can
     * be federated through an identity provider like Google, Facebook or any SAML 2.0, OIDC
     * identity provider. This is a sign-up api to create a new user in an organization.
     *
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @param createUserRequest Payload to create user (required)
     * @return Call&lt;CreateUserResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/sub_organizations/{sub_organization_name}/users")
    Call<CreateUserResponse> createSubOrganizationUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body CreateUserRequest createUserRequest);

    /**
     * Create a user User is an entity which represent a person who is part of the organization or
     * account. This user entity can be created either through user name, password or the user can
     * be federated through an identity provider like Google, Facebook or any SAML 2.0, OIDC
     * identity provider. This is a sign-up api to create a new user in an organization.
     *
     * @param organizationId (required)
     * @param createUserRequest Payload to create user (required)
     * @return Call&lt;CreateUserResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users")
    Call<CreateUserResponse> createUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body CreateUserRequest createUserRequest);

    /**
     * Delete a User Delete a User
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @DELETE(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}")
    Call<BaseSuccessResponse> deleteSubOrganizationUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName);

    /**
     * Delete a User Delete a User
     *
     * @param userName (required)
     * @param organizationId (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @DELETE("organizations/{organization_id}/users/{user_name}")
    Call<BaseSuccessResponse> deleteUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId);

    /**
     * Delete an user link Delete an user link
     *
     * @param organizationId (required)
     * @param userLinkId (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @DELETE("user_links/{user_link_id}")
    Call<BaseSuccessResponse> deleteUserLink(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("user_link_id") String userLinkId);

    /**
     * Gets a user entity associated with the organization Get a User
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @return Call&lt;User&gt;
     */
    @GET(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}")
    Call<User> getSubOrganizationUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName);

    /**
     * Gets a user entity associated with the organization Get a User
     *
     * @param userName (required)
     * @param organizationId (required)
     * @return Call&lt;User&gt;
     */
    @GET("organizations/{organization_id}/users/{user_name}")
    Call<User> getUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId);

    /**
     * Link one user with another user of same/different organization Link one user with another
     * user of same/different organization
     *
     * @param organizationId (required)
     * @param linkUserRequest Payload to link a user to another user of same/different organization
     *     (required)
     * @return Call&lt;TokenResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST("user_links")
    Call<TokenResponse> linkUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body LinkUserRequest linkUserRequest);

    /**
     * List users List users associated with the organization. This is a pagniated api which returns
     * the list of users with a next page token.
     *
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @param nextToken (optional)
     * @param pageSize (optional)
     * @return Call&lt;UserPaginatedResponse&gt;
     */
    @GET("organizations/{organization_id}/sub_organizations/{sub_organization_name}/users")
    Call<UserPaginatedResponse> listSubOrganizationUsers(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Query("nextToken") String nextToken,
            @retrofit2.http.Query("pageSize") String pageSize);

    /**
     * List user links based on the role. Each user link is associated with a leader user and a
     * subordinate user. This API allows to list all users of a certain role[LEADER/SUBORDINATE]
     * linked with the current user.
     *
     * @param organizationId (required)
     * @param role (required)
     * @param nextToken (optional)
     * @param pageSize (optional)
     * @param sortOrder (optional)
     * @return Call&lt;LinkUsersPaginatedResponse&gt;
     */
    @GET("user_links")
    Call<LinkUsersPaginatedResponse> listUserLinks(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Query("role") String role,
            @retrofit2.http.Query("nextToken") String nextToken,
            @retrofit2.http.Query("pageSize") String pageSize,
            @retrofit2.http.Query("sortOrder") String sortOrder);

    /**
     * List users List users associated with the organization. This is a pagniated api which returns
     * the list of users with a next page token.
     *
     * @param organizationId (required)
     * @param nextToken (optional)
     * @param pageSize (optional)
     * @return Call&lt;UserPaginatedResponse&gt;
     */
    @GET("organizations/{organization_id}/users")
    Call<UserPaginatedResponse> listUsers(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Query("nextToken") String nextToken,
            @retrofit2.http.Query("pageSize") String pageSize);

    /**
     * Reset Password Reset Password
     *
     * @param organizationId (required)
     * @param resetPasswordRequest Payload to reset password (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users/resetPassword")
    Call<BaseSuccessResponse> resetPassword(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body ResetPasswordRequest resetPasswordRequest);

    /**
     * Reset Password Reset Password
     *
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @param resetPasswordRequest Payload to reset password (required)
     * @return Call&lt;BaseSuccessResponse&gt;
     */
    @Headers({"Content-Type:application/json"})
    @POST(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/resetPassword")
    Call<BaseSuccessResponse> resetSubOrganizationPassword(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body ResetPasswordRequest resetPasswordRequest);

    /**
     * Get authentication details for switching user Get authentication details for switching user
     *
     * @param organizationId (required)
     * @param userLinkId (required)
     * @return Call&lt;TokenResponse&gt;
     */
    @POST("user_links/{user_link_id}")
    Call<TokenResponse> switchUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("user_link_id") String userLinkId);

    /**
     * Update a User Update a User
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param subOrganizationName (required)
     * @param updateUserRequest Payload to update user (required)
     * @return Call&lt;User&gt;
     */
    @Headers({"Content-Type:application/json"})
    @PATCH(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}")
    Call<User> updateSubOrganizationUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body UpdateUserRequest updateUserRequest);

    /**
     * Update a User Update a User
     *
     * @param userName (required)
     * @param organizationId (required)
     * @param updateUserRequest Payload to update user (required)
     * @return Call&lt;User&gt;
     */
    @Headers({"Content-Type:application/json"})
    @PATCH("organizations/{organization_id}/users/{user_name}")
    Call<User> updateUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body UpdateUserRequest updateUserRequest);

    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users/{user_name}/change_password")
    Call<BaseSuccessResponse> changePassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body ChangeUserPasswordRequest changeUserPasswordRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}/change_password")
    Call<BaseSuccessResponse> changeSubOrganizationPassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body ChangeUserPasswordRequest changeUserPasswordRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users/{user_name}/create_password")
    Call<TokenResponse> createPassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body CreateUserPasswordRequest createUserPasswordRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}/create_password")
    Call<BaseSuccessResponse> createSubOrganizationPassword(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body CreateUserPasswordRequest createUserPasswordRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/sub_organizations/{sub_organization_name}/users")
    Call<CreateUserResponse> createSubOrganizationUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body CreateUserRequest createUserRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users")
    Call<CreateUserResponse> createUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body CreateUserRequest createUserRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @DELETE(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}")
    Call<BaseSuccessResponse> deleteSubOrganizationUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @DELETE("organizations/{organization_id}/users/{user_name}")
    Call<BaseSuccessResponse> deleteUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @DELETE("user_links/{user_link_id}")
    Call<BaseSuccessResponse> deleteUserLink(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("user_link_id") String userLinkId,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @GET(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}")
    Call<User> getSubOrganizationUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @GET("organizations/{organization_id}/users/{user_name}")
    Call<User> getUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST("user_links")
    Call<TokenResponse> linkUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body LinkUserRequest linkUserRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @GET("organizations/{organization_id}/sub_organizations/{sub_organization_name}/users")
    Call<UserPaginatedResponse> listSubOrganizationUsers(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Query("nextToken") String nextToken,
            @retrofit2.http.Query("pageSize") String pageSize,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @GET("user_links")
    Call<LinkUsersPaginatedResponse> listUserLinks(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Query("role") String role,
            @retrofit2.http.Query("nextToken") String nextToken,
            @retrofit2.http.Query("pageSize") String pageSize,
            @retrofit2.http.Query("sortOrder") String sortOrder,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @GET("organizations/{organization_id}/users")
    Call<UserPaginatedResponse> listUsers(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Query("nextToken") String nextToken,
            @retrofit2.http.Query("pageSize") String pageSize,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST("organizations/{organization_id}/users/resetPassword")
    Call<BaseSuccessResponse> resetPassword(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body ResetPasswordRequest resetPasswordRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @POST(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/resetPassword")
    Call<BaseSuccessResponse> resetSubOrganizationPassword(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body ResetPasswordRequest resetPasswordRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @POST("user_links/{user_link_id}")
    Call<TokenResponse> switchUser(
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("user_link_id") String userLinkId,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @PATCH(
            "organizations/{organization_id}/sub_organizations/{sub_organization_name}/users/{user_name}")
    Call<User> updateSubOrganizationUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Path("sub_organization_name") String subOrganizationName,
            @retrofit2.http.Body UpdateUserRequest updateUserRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);

    @Headers({"Content-Type:application/json"})
    @PATCH("organizations/{organization_id}/users/{user_name}")
    Call<User> updateUser(
            @retrofit2.http.Path("user_name") String userName,
            @retrofit2.http.Path("organization_id") String organizationId,
            @retrofit2.http.Body UpdateUserRequest updateUserRequest,
            @retrofit2.http.HeaderMap Map<String, String> headers);
}
