/*
 * CityPay Payment API
 *  This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.  ## Compliance and Security Your application will need to adhere to PCI-DSS standards to operate safely and to meet requirements set out by  Visa and MasterCard and the PCI Security Standards Council. These include  * Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.api;

import com.citypay.client.ApiException;
import com.citypay.client.model.Acknowledgement;
import com.citypay.client.model.AuthReferences;
import com.citypay.client.model.AuthRequest;
import com.citypay.client.model.AuthResponse;
import com.citypay.client.model.Bin;
import com.citypay.client.model.BinLookup;
import com.citypay.client.model.CResAuthRequest;
import com.citypay.client.model.CaptureRequest;
import com.citypay.client.model.Decision;
import com.citypay.client.model.Error;
import com.citypay.client.model.PaResAuthRequest;
import com.citypay.client.model.RefundRequest;
import com.citypay.client.model.RetrieveRequest;
import com.citypay.client.model.VoidRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorisationAndPaymentApiApi
 */
@Ignore
public class AuthorisationAndPaymentApiApiTest {

    private final AuthorisationAndPaymentApiApi api = new AuthorisationAndPaymentApiApi();

    
    /**
     * Authorisation
     *
     * An authorisation process performs a standard transaction authorisation based on the provided parameters of its request. The CityPay gateway will route your transaction via an Acquiring bank for subsequent authorisation to the appropriate card  schemes such as Visa or MasterCard.  The authorisation API should be used for server environments to process transactions on demand and in realtime.   The authorisation API can be used for multiple types of transactions including E-commerce, mail order, telephone order, customer present (keyed), continuous authority, pre-authorisation and others. CityPay will configure your account for  the appropriate coding and this will perform transparently by the gateway.   Data properties that are required, may depend on the environment you are conducting payment for. Our API aims to be  flexible enough to cater for these structures. Our integration team will aid you in providing the necessary data to   transact.      ## E-commerce workflows   For E-commerce transactions requiring 3DS, the API contains a fully accredited in built mechanism to handle authentication.  The Api and gateway has been accredited extensively with both Acquirers and Card Schemes to simplify the nature of these calls into a simple structure for authentication, preventing integrators from performing lengthy and a costly accreditations with Visa and MasterCard.  3D-secure has been around for a number of years and aims to shift the liability of a transaction away from a merchant back to the card holder. A *liability shift* determines whether a card holder can charge back a transaction as unknown. Effectively the process asks for a card holder to authenticate the transaction prior to authorisation producing a Cardholder  verification value (CAVV) and ecommerce indicator (ECI) as evidence of authorisation.  3DS version 1 has now been replaced by 3DS version 2 to provide secure customer authentication (SCA) in line with EU regulation. 3DSv2 is being phased out and any accounts using version 1 of the protocol is expected to be migrated by March 2022.   Any new integrations should only consider 3DSv2 flows.   ### 3DSv2  &#x60;&#x60;&#x60;json {    \&quot;RequestChallenged\&quot;: {     \&quot;acsurl\&quot;: \&quot;https://bank.com/3DS/ACS\&quot;,     \&quot;creq\&quot;: \&quot;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...\&quot;,     \&quot;merchantid\&quot;: 12345,     \&quot;transno\&quot;: 1,     \&quot;threedserver_trans_id\&quot;: \&quot;d652d8d2-d74a-4264-a051-a7862b10d5d6\&quot;   }                } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60;xml &lt;RequestChallenged&gt;   &lt;acsurl&gt;https://bank.com/3DS/ACS&lt;/acsurl&gt;   &lt;creq&gt;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...&lt;/creq&gt;   &lt;merchantid&gt;12345&lt;/merchantid&gt;   &lt;transno&gt;1&lt;/transno&gt;   &lt;threedserver_trans_id&gt;d652d8d2-d74a-4264-a051-a7862b10d5d6&lt;/threedserver_trans_id&gt; &lt;/RequestChallenged&gt; &#x60;&#x60;&#x60;  CityPay support 3DS version 2.1 for Verified by Visa, MasterCard Identity Check and American Express SafeKey 2.1. Version 2.2 is currently in development however this will be a seamless upgrade for all integrations.  #### 3-D Secure - None  ![3DSv2 Frctionless Flow](/images/3dsv2-no3d.png)  A basic flow may involve no 3-D secure processing. This could happen if there is no ability to perform authentication. An enrollment check may apply an \&quot;attempted\&quot; resolution to processing. In this instance a transaction may not meet any liability shift. A transaction may result in a decline due to this. We are also able to prevent from transactions being presented for authorisation if this occurs.   #### 3-D Secure - Frictionless  ![3DSv2 Frctionless Flow](/images/3dsv2-frictionless.png)  E-commerce transactions supporting 3DSv2 can benefit from seamlessly authenticated transactions which may perform a  \&quot;frictionless\&quot; flow. This method will authenticate low risk transactions with minimal impact to a  standard authorisation flow. Our API simply performs this on behalf of you the developer, the merchant and cardholder.  No redirection occurs and hence the flow is called frictionless and will appear as though a simple transaction  authorisation has occurred.  #### 3-D Secure - Challenge  ![3DSv2 Frctionless Flow](/images/3dsv2-challenge.png)  A transaction that is deemed as higher risk my be \&quot;challenged\&quot;. In this instance, the API will return a [request challenge](#requestchallenged) which will require your integration to forward the cardholder&#39;s browser to the  given [ACS url](#acsurl). This should be performed by posting the [creq](#creq) value (the challenge request value).   Once complete, the ACS will have already been in touch with our servers by sending us a result of the authentication known as &#x60;RReq&#x60;.  To maintain session state, a parameter &#x60;threeDSSessionData&#x60; can be posted to the ACS url and will be returned alongside  the &#x60;CRes&#x60; value. This will ensure that any controller code will be able to isolate state between calls. This field is to be used by your own systems rather than ours and may be any value which can uniquely identify your cardholder&#39;s session. As an option, we do provide a &#x60;threedserver_trans_id&#x60; value in the &#x60;RequestChallenged&#x60; packet which can be used for the &#x60;threeDSSessionData&#x60; value as it is used to uniquely identify the 3D-Secure session.   A common method of maintaining state is to provide a session related query string value in the &#x60;merchant_termurl&#x60; value (also known as the &#x60;notificationUrl&#x60;). For example providing a url of &#x60;https://mystore.com/checkout?token&#x3D;asny2348w4561..&#x60; could return the user directly back to their session with your environment.  Once you have received a &#x60;cres&#x60; post from the ACS authentication service, this should be POSTed to the [cres](#cres)  endpoint to perform full authorisation processing.   Please note that the CRes returned to us is purely a mechanism of acknowledging that transactions should be committed for authorisation. The ACS by this point will have sent us the verification value (CAVV) to perform a liability shift. The CRes value will be validated for receipt of the CAVV and subsequently may return response codes illustrating this.   To forward the user to the ACS, we recommend a simple auto submit HTML form.  &gt; Simple auto submit HTML form  &#x60;&#x60;&#x60;html &lt;html lang&#x3D;\&quot;en\&quot;&gt; &lt;head&gt;         &lt;title&gt;Forward to ACS&lt;/title&gt; &lt;script type&#x3D;\&quot;text/javascript\&quot;&gt;         function onLoadEvent() {              document.acs.submit();          }         &lt;/script&gt;         &lt;noscript&gt;You will require JavaScript to be enabled to complete this transaction&lt;/noscript&gt;     &lt;/head&gt;     &lt;body onload&#x3D;\&quot;onLoadEvent();\&quot;&gt;         &lt;form name&#x3D;\&quot;acs\&quot; action&#x3D;\&quot;{{ACSURL from Response}}\&quot; method&#x3D;\&quot;POST\&quot;&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;creq\&quot; value&#x3D;\&quot;{{CReq Packet from Response}}\&quot; /&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;threeDSSessionData\&quot; value&#x3D;\&quot;{{session-identifier}}\&quot; /&gt;         &lt;/form&gt;     &lt;/body&gt; &lt;/html&gt; &#x60;&#x60;&#x60;  A full ACS test suite is available for 3DSv2 testing.          ### Testing 3DSv2 Integrations  The API provides a mock 3dsV2 handler which performs a number of scenarios based on the value of the CSC in the request.  | CSC Value | Behaviour | |-----------|-----------| | 731       | Frictionless processing - Not authenticated | | 732       | Frictionless processing - Account verification count not be performed |         | 733       | Frictionless processing - Verification Rejected |         | 741       | Frictionless processing - Attempts Processing |         | 750       | Frictionless processing - Authenticated  |         | 761       | Triggers an error message |   | Any       | Challenge Request |          #### 3DSv1  **Please note that 3DSv1 should now be considered as deprecated.**  &#x60;&#x60;&#x60;json {    \&quot;AuthenticationRequired\&quot;: {     \&quot;acsurl\&quot;: \&quot;https://bank.com/3DS/ACS\&quot;,     \&quot;pareq\&quot;: \&quot;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...\&quot;,     \&quot;md\&quot;: \&quot;WQgZXZlcnl0aGluZyBiZW\&quot;   }                } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60;xml &lt;AuthenticationRequired&gt;  &lt;acsurl&gt;https://bank.com/3DS/ACS&lt;/acsurl&gt;  &lt;pareq&gt;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...&lt;/pareq&gt;  &lt;md&gt;WQgZXZlcnl0aGluZyBiZW&lt;/md&gt; &lt;/AuthenticationRequired&gt; &#x60;&#x60;&#x60;  For E-commerce transactions requiring 3DSv1, the API contains a built in MPI which will be called to check whether the card is participating in 3DSv1 with Verified by Visa or MasterCard SecureCode. We only support Amex SafeKey with 3DSv2. Should the card be enrolled, a payer request (PAReq) value will be created and returned back as an [authentication required](#authenticationrequired) response object.  Your system will need to process this authentication packet and forward the user&#39;s browser to an authentication server (ACS) to gain the user&#39;s authentication. Once complete, the ACS will produce a HTTP &#x60;POST&#x60; call back to the URL supplied in the authentication request as &#x60;merchant_termurl&#x60;. This URL should behave as a controller and handle the post data from the ACS and on a forked server to server HTTP request, forward this data to the [pares authentication url](#pares) for subsequent authorisation processing. You may prefer to provide a processing page whilst this is being processed. Processing with our systems should be relatively quick and be between 500ms - 3000ms however it is desirable to let the user see that something is happening rather than a pending browser.  The main reason for ensuring that this controller is two fold:  1. We are never in control of the user&#39;s browser in a server API call 2. The controller is actioned on your site to ensure that any post actions from authorisation can be executed in real time  To forward the user to the ACS, we recommend a simple auto submit HTML form.  &gt; Simple auto submit HTML form  &#x60;&#x60;&#x60;html &lt;html lang&#x3D;\&quot;en\&quot;&gt; &lt;head&gt;         &lt;title&gt;Forward to ACS&lt;/title&gt; &lt;script type&#x3D;\&quot;text/javascript\&quot;&gt;         function onLoadEvent() {              document.acs.submit();          }         &lt;/script&gt;         &lt;noscript&gt;You will require JavaScript to be enabled to complete this transaction&lt;/noscript&gt;     &lt;/head&gt;     &lt;body onload&#x3D;\&quot;onLoadEvent();\&quot;&gt;         &lt;form name&#x3D;\&quot;acs\&quot; action&#x3D;\&quot;{{ACSURL from Response}}\&quot; method&#x3D;\&quot;POST\&quot;&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;PaReq\&quot; value&#x3D;\&quot;{{PaReq Packet from Response}}\&quot; /&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;TermUrl\&quot; value&#x3D;\&quot;{{Your Controller}}\&quot; /&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;MD\&quot; value&#x3D;\&quot;{{MD From Response}}\&quot; /&gt;         &lt;/form&gt;     &lt;/body&gt; &lt;/html&gt; &#x60;&#x60;&#x60;  Please note that 3DSv1 is being phased out due to changes to strong customer authentication mechanisms. 3DSv2 addresses this and will solidify the authorisation and confirmation process.  We provide a Test ACS for full 3DSv1 integration testing that simulates an ACS. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorisationRequestTest() throws ApiException {
        AuthRequest authRequest = null;
        Decision response = api.authorisationRequest(authRequest);

        // TODO: test validations
    }
    
    /**
     * Bin Lookup
     *
     * A bin range lookup service can be used to check what a card is, as seen by the gateway. Each card number&#39;s  leading digits help to identify who  0. the card scheme is such as Visa, MasterCard or American Express  1. the issuer of the card, such as the bank 2. it&#39;s country of origin 3. it&#39;s currency of origin  Our gateway has 450 thousand possible bin ranges and uses a number of algorithms to determine the likelihood of the bin data. The request requires a bin value of between 6 and 12 digits. The more digits provided may ensure a more accurate result. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void binRangeLookupRequestTest() throws ApiException {
        BinLookup binLookup = null;
        Bin response = api.binRangeLookupRequest(binLookup);

        // TODO: test validations
    }
    
    /**
     * CRes
     *
     * The CRes request performs authorisation processing once a challenge request has been completed with an Authentication Server (ACS). This challenge response contains confirmation that will allow the API systems to return an authorisation response based on the result. Our systems will  know out of band via an &#x60;RReq&#x60; call by the ACS to notify us if the liability shift has been issued.  Any call to the CRes operation will require a previous authorisation request and cannot be called  on its own without a previous [request challenge](#requestchallenged) being obtained. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cResRequestTest() throws ApiException {
        CResAuthRequest cresAuthRequest = null;
        AuthResponse response = api.cResRequest(cresAuthRequest);

        // TODO: test validations
    }
    
    /**
     * Capture
     *
     * _The capture process only applies to transactions which have been pre-authorised only._   The capture process will ensure that a transaction will now settle. It is expected that a capture call will be provided within 3 days or a maximum of 7 days.  A capture request is provided to confirm that you wish the transaction to be settled. This request can contain a final amount for the transaction which is different to the original authorisation amount. This may be useful in a delayed system process such as waiting for stock to be ordered, confirmed, or services provided before the final cost is known.  When a transaction is completed, a new authorisation code may be created and a new confirmation can be sent online to the acquiring bank.  Once the transaction has been processed. A standard [&#x60;Acknowledgement&#x60;](#acknowledgement) will be returned, outlining the result of the transaction. On a successful completion process, the transaction will be available for the settlement and completed at the end of the day. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void captureRequestTest() throws ApiException {
        CaptureRequest captureRequest = null;
        Acknowledgement response = api.captureRequest(captureRequest);

        // TODO: test validations
    }
    
    /**
     * PaRes
     *
     * The Payer Authentication Response (PaRes) is an operation after the result of authentication   being performed. The request uses an encoded packet of authentication data to  notify us of the completion of the liability shift. Once this value has been unpacked and its signature is checked, our systems will proceed to authorisation processing.    Any call to the PaRes operation will require a previous authorisation request and cannot be called  on its own without a previous [authentication required](#authenticationrequired)  being obtained. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paResRequestTest() throws ApiException {
        PaResAuthRequest paResAuthRequest = null;
        AuthResponse response = api.paResRequest(paResAuthRequest);

        // TODO: test validations
    }
    
    /**
     * Refund
     *
     * A refund request which allows for the refunding of a previous transaction up  and to the amount of the original sale. A refund will be performed against the  original card used to process the transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refundRequestTest() throws ApiException {
        RefundRequest refundRequest = null;
        AuthResponse response = api.refundRequest(refundRequest);

        // TODO: test validations
    }
    
    /**
     * Retrieval
     *
     * A retrieval request which allows an integration to obtain the result of a transaction processed in the last 90 days. The request allows for retrieval based on the identifier or transaction  number.   The process may return multiple results in particular where a transaction was processed multiple times against the same identifier. This can happen if errors were first received. The API therefore returns up to the first 5 transactions in the latest date time order.  It is not intended for this operation to be a replacement for reporting and only allows for base transaction information to be returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievalRequestTest() throws ApiException {
        RetrieveRequest retrieveRequest = null;
        AuthReferences response = api.retrievalRequest(retrieveRequest);

        // TODO: test validations
    }
    
    /**
     * Void
     *
     * _The void process generally applies to transactions which have been pre-authorised only however voids can occur  on the same day if performed before batching and settlement._   The void process will ensure that a transaction will now settle. It is expected that a void call will be  provided on the same day before batching and settlement or within 3 days or within a maximum of 7 days.  Once the transaction has been processed as a void, an [&#x60;Acknowledgement&#x60;](#acknowledgement) will be returned, outlining the result of the transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voidRequestTest() throws ApiException {
        VoidRequest voidRequest = null;
        Acknowledgement response = api.voidRequest(voidRequest);

        // TODO: test validations
    }
    
}
