# CityPay API Client for Java

[![Build Status](https://api.travis-ci.com/citypay/citypay-api-client-java.svg?branch=master)](https://app.travis-ci.com/github/citypay/citypay-api-client-java)
CityPay Payment API
- API version: 6.4.18
  - Build date: 2022-12-08T15:57:11.877488Z[Etc/UTC]


This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It
provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing,
3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and
Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.

## Compliance and Security
Your application will need to adhere to PCI-DSS standards to operate safely and to meet requirements set out by 
Visa and MasterCard and the PCI Security Standards Council. These include

* Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at
  lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments
  as part of our compliance program.
* The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or
  primary access number (PAN)
* The application must not display the full card number on receipts, it is recommended to mask the PAN
  and show the last 4 digits. The API will return this for you for ease of receipt creation
* If you are developing a website, you will be required to perform regular scans on the network where you host the
  application to meet your compliance obligations
* You will be required to be PCI Compliant and the application must adhere to the security standard. Further information
  is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/)
* The API verifies that the request is for a valid account and originates from a trusted source using the remote IP
  address. Our application firewalls analyse data that may be an attempt to break a large number of security common
  security vulnerabilities.


  For more information, please visit [https://citypay.com/customer-centre/technical-support.html](https://citypay.com/customer-centre/technical-support.html)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
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
  <groupId>com.citypay</groupId>
  <artifactId>citypay-api-client-java</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```


At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/citypay-api-client-java-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.AuthorisationAndPaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    

    AuthorisationAndPaymentApi apiInstance = new AuthorisationAndPaymentApi(defaultClient);
    AuthRequest authRequest = new AuthRequest(); // AuthRequest | 
    try {
      Decision result = apiInstance.authorisationRequest(authRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorisationAndPaymentApi#authorisationRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.citypay.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorisationAndPaymentApi* | [**authorisationRequest**](docs/AuthorisationAndPaymentApi.md#authorisationRequest) | **POST** /v6/authorise | Authorisation
*AuthorisationAndPaymentApi* | [**binRangeLookupRequest**](docs/AuthorisationAndPaymentApi.md#binRangeLookupRequest) | **POST** /v6/bin | Bin Lookup
*AuthorisationAndPaymentApi* | [**cResRequest**](docs/AuthorisationAndPaymentApi.md#cResRequest) | **POST** /v6/cres | CRes
*AuthorisationAndPaymentApi* | [**captureRequest**](docs/AuthorisationAndPaymentApi.md#captureRequest) | **POST** /v6/capture | Capture
*AuthorisationAndPaymentApi* | [**paResRequest**](docs/AuthorisationAndPaymentApi.md#paResRequest) | **POST** /v6/pares | PaRes
*AuthorisationAndPaymentApi* | [**refundRequest**](docs/AuthorisationAndPaymentApi.md#refundRequest) | **POST** /v6/refund | Refund
*AuthorisationAndPaymentApi* | [**retrievalRequest**](docs/AuthorisationAndPaymentApi.md#retrievalRequest) | **POST** /v6/retrieve | Retrieval
*AuthorisationAndPaymentApi* | [**voidRequest**](docs/AuthorisationAndPaymentApi.md#voidRequest) | **POST** /v6/void | Void
*BatchProcessingApi* | [**batchProcessRequest**](docs/BatchProcessingApi.md#batchProcessRequest) | **POST** /v6/batch/process | Batch Process Request
*BatchProcessingApi* | [**batchReportRequest**](docs/BatchProcessingApi.md#batchReportRequest) | **POST** /v6/batch/retrieve | BatchReportRequest
*BatchProcessingApi* | [**checkBatchStatusRequest**](docs/BatchProcessingApi.md#checkBatchStatusRequest) | **POST** /v6/batch/status | CheckBatchStatus
*CardHolderAccountApi* | [**accountCardDeleteRequest**](docs/CardHolderAccountApi.md#accountCardDeleteRequest) | **DELETE** /v6/account/{accountid}/card/{cardId} | Card Deletion
*CardHolderAccountApi* | [**accountCardRegisterRequest**](docs/CardHolderAccountApi.md#accountCardRegisterRequest) | **POST** /v6/account/{accountid}/register | Card Registration
*CardHolderAccountApi* | [**accountCardStatusRequest**](docs/CardHolderAccountApi.md#accountCardStatusRequest) | **POST** /v6/account/{accountid}/card/{cardId}/status | Card Status
*CardHolderAccountApi* | [**accountChangeContactRequest**](docs/CardHolderAccountApi.md#accountChangeContactRequest) | **POST** /v6/account/{accountid}/contact | Contact Details Update
*CardHolderAccountApi* | [**accountCreate**](docs/CardHolderAccountApi.md#accountCreate) | **POST** /v6/account/create | Account Create
*CardHolderAccountApi* | [**accountDeleteRequest**](docs/CardHolderAccountApi.md#accountDeleteRequest) | **DELETE** /v6/account/{accountid} | Account Deletion
*CardHolderAccountApi* | [**accountExistsRequest**](docs/CardHolderAccountApi.md#accountExistsRequest) | **GET** /v6/account-exists/{accountid} | Account Exists
*CardHolderAccountApi* | [**accountRetrieveRequest**](docs/CardHolderAccountApi.md#accountRetrieveRequest) | **GET** /v6/account/{accountid} | Account Retrieval
*CardHolderAccountApi* | [**accountStatusRequest**](docs/CardHolderAccountApi.md#accountStatusRequest) | **POST** /v6/account/{accountid}/status | Account Status
*CardHolderAccountApi* | [**chargeRequest**](docs/CardHolderAccountApi.md#chargeRequest) | **POST** /v6/charge | Charge
*DirectPostApi* | [**directCResAuthRequest**](docs/DirectPostApi.md#directCResAuthRequest) | **POST** /direct/cres/auth/{uuid} | Handles a CRes response from ACS, returning back the result of authorisation
*DirectPostApi* | [**directCResTokeniseRequest**](docs/DirectPostApi.md#directCResTokeniseRequest) | **POST** /direct/cres/tokenise/{uuid} | Handles a CRes response from ACS, returning back a token for future authorisation
*DirectPostApi* | [**directPostAuthRequest**](docs/DirectPostApi.md#directPostAuthRequest) | **POST** /direct/auth | Direct Post Auth Request
*DirectPostApi* | [**directPostTokeniseRequest**](docs/DirectPostApi.md#directPostTokeniseRequest) | **POST** /direct/tokenise | Direct Post Tokenise Request
*DirectPostApi* | [**tokenRequest**](docs/DirectPostApi.md#tokenRequest) | **POST** /direct/token | Direct Post Token Request
*OperationalFunctionsApi* | [**aclCheckRequest**](docs/OperationalFunctionsApi.md#aclCheckRequest) | **POST** /v6/acl/check | ACL Check Request
*OperationalFunctionsApi* | [**domainKeyCheckRequest**](docs/OperationalFunctionsApi.md#domainKeyCheckRequest) | **POST** /dk/check | Domain Key Check Request
*OperationalFunctionsApi* | [**domainKeyGenRequest**](docs/OperationalFunctionsApi.md#domainKeyGenRequest) | **POST** /dk/gen | Domain Key Generation Request
*OperationalFunctionsApi* | [**listMerchantsRequest**](docs/OperationalFunctionsApi.md#listMerchantsRequest) | **GET** /v6/merchants/{clientid} | List Merchants Request
*OperationalFunctionsApi* | [**pingRequest**](docs/OperationalFunctionsApi.md#pingRequest) | **POST** /v6/ping | Ping Request
*PaylinkApi* | [**tokenAdjustmentRequest**](docs/PaylinkApi.md#tokenAdjustmentRequest) | **POST** /paylink/{token}/adjustment | Paylink Token Adjustment
*PaylinkApi* | [**tokenCloseRequest**](docs/PaylinkApi.md#tokenCloseRequest) | **PUT** /paylink/{token}/close | Close Paylink Token
*PaylinkApi* | [**tokenCreateBillPaymentRequest**](docs/PaylinkApi.md#tokenCreateBillPaymentRequest) | **POST** /paylink/bill-payment | Create Bill Payment Paylink Token
*PaylinkApi* | [**tokenCreateRequest**](docs/PaylinkApi.md#tokenCreateRequest) | **POST** /paylink/create | Create Paylink Token
*PaylinkApi* | [**tokenPurgeAttachmentsRequest**](docs/PaylinkApi.md#tokenPurgeAttachmentsRequest) | **PUT** /paylink/{token}/purge-attachments | Purges any attachments for a Paylink Token
*PaylinkApi* | [**tokenReconciledRequest**](docs/PaylinkApi.md#tokenReconciledRequest) | **PUT** /paylink/{token}/reconciled | Reconcile Paylink Token
*PaylinkApi* | [**tokenReopenRequest**](docs/PaylinkApi.md#tokenReopenRequest) | **PUT** /paylink/{token}/reopen | Reopen Paylink Token
*PaylinkApi* | [**tokenStatusChangesRequest**](docs/PaylinkApi.md#tokenStatusChangesRequest) | **POST** /paylink/token/changes | Paylink Token Audit
*PaylinkApi* | [**tokenStatusRequest**](docs/PaylinkApi.md#tokenStatusRequest) | **GET** /paylink/{token}/status | Paylink Token Status


## Documentation for Models

 - [AccountCreate](docs/AccountCreate.md)
 - [AccountStatus](docs/AccountStatus.md)
 - [Acknowledgement](docs/Acknowledgement.md)
 - [AclCheckRequest](docs/AclCheckRequest.md)
 - [AclCheckResponseModel](docs/AclCheckResponseModel.md)
 - [AirlineAdvice](docs/AirlineAdvice.md)
 - [AirlineSegment](docs/AirlineSegment.md)
 - [AuthReference](docs/AuthReference.md)
 - [AuthReferences](docs/AuthReferences.md)
 - [AuthRequest](docs/AuthRequest.md)
 - [AuthResponse](docs/AuthResponse.md)
 - [AuthenRequired](docs/AuthenRequired.md)
 - [Batch](docs/Batch.md)
 - [BatchReportRequest](docs/BatchReportRequest.md)
 - [BatchReportResponseModel](docs/BatchReportResponseModel.md)
 - [BatchTransaction](docs/BatchTransaction.md)
 - [BatchTransactionResultModel](docs/BatchTransactionResultModel.md)
 - [Bin](docs/Bin.md)
 - [BinLookup](docs/BinLookup.md)
 - [CResAuthRequest](docs/CResAuthRequest.md)
 - [CaptureRequest](docs/CaptureRequest.md)
 - [Card](docs/Card.md)
 - [CardHolderAccount](docs/CardHolderAccount.md)
 - [CardStatus](docs/CardStatus.md)
 - [ChargeRequest](docs/ChargeRequest.md)
 - [CheckBatchStatus](docs/CheckBatchStatus.md)
 - [CheckBatchStatusResponse](docs/CheckBatchStatusResponse.md)
 - [ContactDetails](docs/ContactDetails.md)
 - [Decision](docs/Decision.md)
 - [DirectPostRequest](docs/DirectPostRequest.md)
 - [DirectTokenAuthRequest](docs/DirectTokenAuthRequest.md)
 - [DomainKeyCheckRequest](docs/DomainKeyCheckRequest.md)
 - [DomainKeyRequest](docs/DomainKeyRequest.md)
 - [DomainKeyResponse](docs/DomainKeyResponse.md)
 - [Error](docs/Error.md)
 - [EventDataModel](docs/EventDataModel.md)
 - [Exists](docs/Exists.md)
 - [ExternalMPI](docs/ExternalMPI.md)
 - [ListMerchantsResponse](docs/ListMerchantsResponse.md)
 - [MCC6012](docs/MCC6012.md)
 - [Merchant](docs/Merchant.md)
 - [PaResAuthRequest](docs/PaResAuthRequest.md)
 - [PaylinkAddress](docs/PaylinkAddress.md)
 - [PaylinkAdjustmentRequest](docs/PaylinkAdjustmentRequest.md)
 - [PaylinkAttachmentRequest](docs/PaylinkAttachmentRequest.md)
 - [PaylinkAttachmentResult](docs/PaylinkAttachmentResult.md)
 - [PaylinkBillPaymentTokenRequest](docs/PaylinkBillPaymentTokenRequest.md)
 - [PaylinkCardHolder](docs/PaylinkCardHolder.md)
 - [PaylinkCart](docs/PaylinkCart.md)
 - [PaylinkCartItemModel](docs/PaylinkCartItemModel.md)
 - [PaylinkConfig](docs/PaylinkConfig.md)
 - [PaylinkCustomParam](docs/PaylinkCustomParam.md)
 - [PaylinkEmailNotificationPath](docs/PaylinkEmailNotificationPath.md)
 - [PaylinkErrorCode](docs/PaylinkErrorCode.md)
 - [PaylinkFieldGuardModel](docs/PaylinkFieldGuardModel.md)
 - [PaylinkPartPayments](docs/PaylinkPartPayments.md)
 - [PaylinkSMSNotificationPath](docs/PaylinkSMSNotificationPath.md)
 - [PaylinkStateEvent](docs/PaylinkStateEvent.md)
 - [PaylinkTokenCreated](docs/PaylinkTokenCreated.md)
 - [PaylinkTokenRequestModel](docs/PaylinkTokenRequestModel.md)
 - [PaylinkTokenStatus](docs/PaylinkTokenStatus.md)
 - [PaylinkTokenStatusChangeRequest](docs/PaylinkTokenStatusChangeRequest.md)
 - [PaylinkTokenStatusChangeResponse](docs/PaylinkTokenStatusChangeResponse.md)
 - [PaylinkUI](docs/PaylinkUI.md)
 - [Ping](docs/Ping.md)
 - [ProcessBatchRequest](docs/ProcessBatchRequest.md)
 - [ProcessBatchResponse](docs/ProcessBatchResponse.md)
 - [RefundRequest](docs/RefundRequest.md)
 - [RegisterCard](docs/RegisterCard.md)
 - [RequestChallenged](docs/RequestChallenged.md)
 - [RetrieveRequest](docs/RetrieveRequest.md)
 - [ThreeDSecure](docs/ThreeDSecure.md)
 - [TokenisationResponseModel](docs/TokenisationResponseModel.md)
 - [VoidRequest](docs/VoidRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### cp-api-key

- **Type**: API key
- **API key parameter name**: cp-api-key
- **Location**: HTTP header

### cp-domain-key

- **Type**: API key
- **API key parameter name**: cp-domain-key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@citypay.com

