

# LinkUserRequest

Payload to link a user to another user of same/different organization

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**passcodeConfig** | [**PasscodeConfig**](PasscodeConfig.md) |  |  [optional] |
|**usernamePasswordConfig** | [**UsernamePasswordConfig**](UsernamePasswordConfig.md) |  |  [optional] |
|**tokenCredentialConfig** | [**TokenCredentialConfig**](TokenCredentialConfig.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PASSCODE | &quot;PASSCODE&quot; |
| USERNAME_PASSWORD | &quot;USERNAME_PASSWORD&quot; |
| TOKEN_CREDENTIAL | &quot;TOKEN_CREDENTIAL&quot; |



