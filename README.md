# iam-java-client

Hypto IAM
- API version: 1.0.0
  - Build date: 2022-05-18T20:32:12.909641+05:30[Asia/Kolkata]

APIs for Hypto IAM Service.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.hypto</groupId>
  <artifactId>iam-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'iam-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'iam-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.hypto:iam-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/iam-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.hypto.iam.client.ApiClient;
import com.hypto.iam.client.ApiException;
import com.hypto.iam.client.Configuration;
import com.hypto.iam.client.models.*;
import com.hypto.iam.client.api.KeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-iam.us.hypto.com/v1");

    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
    String kid = "kid_example"; // String | 
    String format = "der"; // String | 
    String type = "public"; // String | 
    try {
      KeyResponse result = apiInstance.getKey(kid, format, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#getKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox-iam.us.hypto.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*KeyManagementApi* | [**getKey**](docs/KeyManagementApi.md#getKey) | **GET** /keys/{kid} | Get keys
*OrganizationManagementApi* | [**createOrganization**](docs/OrganizationManagementApi.md#createOrganization) | **POST** /organizations | Creates an organization.
*OrganizationManagementApi* | [**deleteOrganization**](docs/OrganizationManagementApi.md#deleteOrganization) | **DELETE** /organizations/{organization_id} | Delete an organization
*OrganizationManagementApi* | [**getOrganization**](docs/OrganizationManagementApi.md#getOrganization) | **GET** /organizations/{organization_id} | Get an organization
*OrganizationManagementApi* | [**updateOrganization**](docs/OrganizationManagementApi.md#updateOrganization) | **PATCH** /organizations/{organization_id} | Update an organization
*PolicyManagementApi* | [**createPolicy**](docs/PolicyManagementApi.md#createPolicy) | **POST** /organizations/{organization_id}/policies | Create a policy
*PolicyManagementApi* | [**deletePolicy**](docs/PolicyManagementApi.md#deletePolicy) | **DELETE** /organizations/{organization_id}/policies/{policy_name} | Delete a policy
*PolicyManagementApi* | [**getPolicy**](docs/PolicyManagementApi.md#getPolicy) | **GET** /organizations/{organization_id}/policies/{policy_name} | Get a policy
*PolicyManagementApi* | [**listPolicies**](docs/PolicyManagementApi.md#listPolicies) | **GET** /organizations/{organization_id}/policies | List policies
*PolicyManagementApi* | [**updatePolicy**](docs/PolicyManagementApi.md#updatePolicy) | **PATCH** /organizations/{organization_id}/policies/{policy_name} | Update a policy
*ResourceActionManagementApi* | [**createAction**](docs/ResourceActionManagementApi.md#createAction) | **POST** /organizations/{organization_id}/resources/{resource_name}/actions | Create an action
*ResourceActionManagementApi* | [**deleteAction**](docs/ResourceActionManagementApi.md#deleteAction) | **DELETE** /organizations/{organization_id}/resources/{resource_name}/actions/{action_name} | Delete an action
*ResourceActionManagementApi* | [**getAction**](docs/ResourceActionManagementApi.md#getAction) | **GET** /organizations/{organization_id}/resources/{resource_name}/actions/{action_name} | Get an action
*ResourceActionManagementApi* | [**listActions**](docs/ResourceActionManagementApi.md#listActions) | **GET** /organizations/{organization_id}/resources/{resource_name}/actions | List actions
*ResourceActionManagementApi* | [**updateAction**](docs/ResourceActionManagementApi.md#updateAction) | **PATCH** /organizations/{organization_id}/resources/{resource_name}/actions/{action_name} | Update an action
*ResourceManagementApi* | [**createResource**](docs/ResourceManagementApi.md#createResource) | **POST** /organizations/{organization_id}/resources | Create a resource name in an organization.
*ResourceManagementApi* | [**deleteResource**](docs/ResourceManagementApi.md#deleteResource) | **DELETE** /organizations/{organization_id}/resources/{resource_name} | Delete a resource
*ResourceManagementApi* | [**getResource**](docs/ResourceManagementApi.md#getResource) | **GET** /organizations/{organization_id}/resources/{resource_name} | Get the resource details
*ResourceManagementApi* | [**listResources**](docs/ResourceManagementApi.md#listResources) | **GET** /organizations/{organization_id}/resources | List Resources
*ResourceManagementApi* | [**updateResource**](docs/ResourceManagementApi.md#updateResource) | **PATCH** /organizations/{organization_id}/resources/{resource_name} | Update a resource
*UserAuthorizationApi* | [**getToken**](docs/UserAuthorizationApi.md#getToken) | **POST** /token | Generate a token
*UserAuthorizationApi* | [**getTokenForOrg**](docs/UserAuthorizationApi.md#getTokenForOrg) | **POST** /organizations/{organization_id}/token | Generate a organization_id scoped token
*UserAuthorizationApi* | [**validate**](docs/UserAuthorizationApi.md#validate) | **POST** /validate | Validate an auth request
*UserCredentialManagementApi* | [**createCredential**](docs/UserCredentialManagementApi.md#createCredential) | **POST** /organizations/{organization_id}/users/{user_name}/credentials | Create a new credential for a user
*UserCredentialManagementApi* | [**deleteCredential**](docs/UserCredentialManagementApi.md#deleteCredential) | **DELETE** /organizations/{organization_id}/users/{user_name}/credentials/{credential_id} | Delete a credential
*UserCredentialManagementApi* | [**getCredential**](docs/UserCredentialManagementApi.md#getCredential) | **GET** /organizations/{organization_id}/users/{user_name}/credentials/{credential_id} | Gets credential for the user
*UserCredentialManagementApi* | [**updateCredential**](docs/UserCredentialManagementApi.md#updateCredential) | **PATCH** /organizations/{organization_id}/users/{user_name}/credentials/{credential_id} | Update the status of credential
*UserManagementApi* | [**createUser**](docs/UserManagementApi.md#createUser) | **POST** /organizations/{organization_id}/users | Create a user
*UserManagementApi* | [**deleteUser**](docs/UserManagementApi.md#deleteUser) | **DELETE** /organizations/{organization_id}/users/{user_name} | Delete a User
*UserManagementApi* | [**getUser**](docs/UserManagementApi.md#getUser) | **GET** /organizations/{organization_id}/users/{user_name} | Gets a user entity associated with the organization
*UserManagementApi* | [**listUsers**](docs/UserManagementApi.md#listUsers) | **GET** /organizations/{organization_id}/users | List users
*UserManagementApi* | [**updateUser**](docs/UserManagementApi.md#updateUser) | **PATCH** /organizations/{organization_id}/users/{user_name} | Update a User
*UserPolicyManagementApi* | [**attachPolicies**](docs/UserPolicyManagementApi.md#attachPolicies) | **PATCH** /organizations/{organization_id}/users/{user_name}/attach_policies | Attach policies to user
*UserPolicyManagementApi* | [**detachPolicies**](docs/UserPolicyManagementApi.md#detachPolicies) | **PATCH** /organizations/{organization_id}/users/{user_name}/detach_policies | Detach policies from user
*UserPolicyManagementApi* | [**getUserPolicies**](docs/UserPolicyManagementApi.md#getUserPolicies) | **GET** /organizations/{organization_id}/users/{user_name}/policies | List all policies associated with user
*UserVerificationApi* | [**verifyEmail**](docs/UserVerificationApi.md#verifyEmail) | **POST** /verifyEmail | Verify email


## Documentation for Models

 - [Action](docs/Action.md)
 - [ActionPaginatedResponse](docs/ActionPaginatedResponse.md)
 - [BaseSuccessResponse](docs/BaseSuccessResponse.md)
 - [CreateActionRequest](docs/CreateActionRequest.md)
 - [CreateCredentialRequest](docs/CreateCredentialRequest.md)
 - [CreateOrganizationRequest](docs/CreateOrganizationRequest.md)
 - [CreateOrganizationResponse](docs/CreateOrganizationResponse.md)
 - [CreatePolicyRequest](docs/CreatePolicyRequest.md)
 - [CreateResourceRequest](docs/CreateResourceRequest.md)
 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [Credential](docs/Credential.md)
 - [CredentialWithoutSecret](docs/CredentialWithoutSecret.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GetUserPoliciesResponse](docs/GetUserPoliciesResponse.md)
 - [KeyResponse](docs/KeyResponse.md)
 - [Organization](docs/Organization.md)
 - [PaginationOptions](docs/PaginationOptions.md)
 - [Policy](docs/Policy.md)
 - [PolicyAssociationRequest](docs/PolicyAssociationRequest.md)
 - [PolicyPaginatedResponse](docs/PolicyPaginatedResponse.md)
 - [PolicyStatement](docs/PolicyStatement.md)
 - [Resource](docs/Resource.md)
 - [ResourceAction](docs/ResourceAction.md)
 - [ResourceActionEffect](docs/ResourceActionEffect.md)
 - [ResourcePaginatedResponse](docs/ResourcePaginatedResponse.md)
 - [RootUser](docs/RootUser.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [UpdateActionRequest](docs/UpdateActionRequest.md)
 - [UpdateCredentialRequest](docs/UpdateCredentialRequest.md)
 - [UpdateOrganizationRequest](docs/UpdateOrganizationRequest.md)
 - [UpdatePolicyRequest](docs/UpdatePolicyRequest.md)
 - [UpdateResourceRequest](docs/UpdateResourceRequest.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [User](docs/User.md)
 - [UserPaginatedResponse](docs/UserPaginatedResponse.md)
 - [UserPolicy](docs/UserPolicy.md)
 - [ValidationRequest](docs/ValidationRequest.md)
 - [ValidationResponse](docs/ValidationResponse.md)
 - [VerifyEmailRequest](docs/VerifyEmailRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

engineering@hypto.in

