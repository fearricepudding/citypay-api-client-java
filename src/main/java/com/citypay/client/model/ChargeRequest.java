/*
 * CityPay Payment API
 *  This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.  ## Compliance and Security <aside class=\"notice\">   Before we begin a reminder that your application will need to adhere to PCI-DSS standards to operate safely   and to meet requirements set out by Visa and MasterCard and the PCI Security Standards Council including: </aside>  * Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.citypay.client.model.ThreeDSecure;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChargeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T09:17:31.584Z[GMT]")
public class ChargeRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_AVS_POSTCODE_POLICY = "avs_postcode_policy";
  @SerializedName(SERIALIZED_NAME_AVS_POSTCODE_POLICY)
  private String avsPostcodePolicy;

  public static final String SERIALIZED_NAME_CSC = "csc";
  @SerializedName(SERIALIZED_NAME_CSC)
  private String csc;

  public static final String SERIALIZED_NAME_CSC_POLICY = "csc_policy";
  @SerializedName(SERIALIZED_NAME_CSC_POLICY)
  private String cscPolicy;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DUPLICATE_POLICY = "duplicate_policy";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_POLICY)
  private String duplicatePolicy;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_MATCH_AVSA = "match_avsa";
  @SerializedName(SERIALIZED_NAME_MATCH_AVSA)
  private String matchAvsa;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  private Integer merchantid;

  public static final String SERIALIZED_NAME_THREEDSECURE = "threedsecure";
  @SerializedName(SERIALIZED_NAME_THREEDSECURE)
  private ThreeDSecure threedsecure;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TRANS_INFO = "trans_info";
  @SerializedName(SERIALIZED_NAME_TRANS_INFO)
  private String transInfo;

  public static final String SERIALIZED_NAME_TRANS_TYPE = "trans_type";
  @SerializedName(SERIALIZED_NAME_TRANS_TYPE)
  private String transType;


  public ChargeRequest amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount to authorise in the lowest unit of currency with a variable length to a maximum of 12 digits. No decimal points are to be included and no divisional characters such as 1,024. The amount should be the total amount required for the transaction. For example with GBP £1,021.95 the amount value is 102195. 
   * @return amount
  **/
  @ApiModelProperty(example = "3600", required = true, value = "The amount to authorise in the lowest unit of currency with a variable length to a maximum of 12 digits. No decimal points are to be included and no divisional characters such as 1,024. The amount should be the total amount required for the transaction. For example with GBP £1,021.95 the amount value is 102195. ")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ChargeRequest avsPostcodePolicy(String avsPostcodePolicy) {
    
    this.avsPostcodePolicy = avsPostcodePolicy;
    return this;
  }

   /**
   * A policy value which determines whether an AVS postcode policy is enforced or bypassed.  Values are  &#x60;0&#x60; for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  &#x60;1&#x60; for an enforced policy. Transactions that are enforced will be rejected if the AVS postcode numeric value does not match.  &#x60;2&#x60; to bypass. Transactions that are bypassed will be allowed through even if the postcode did not match.  &#x60;3&#x60; to ignore. Transactions that are ignored will bypass the result and not send postcode details for authorisation. 
   * @return avsPostcodePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A policy value which determines whether an AVS postcode policy is enforced or bypassed.  Values are  `0` for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  `1` for an enforced policy. Transactions that are enforced will be rejected if the AVS postcode numeric value does not match.  `2` to bypass. Transactions that are bypassed will be allowed through even if the postcode did not match.  `3` to ignore. Transactions that are ignored will bypass the result and not send postcode details for authorisation. ")

  public String getAvsPostcodePolicy() {
    return avsPostcodePolicy;
  }


  public void setAvsPostcodePolicy(String avsPostcodePolicy) {
    this.avsPostcodePolicy = avsPostcodePolicy;
  }


  public ChargeRequest csc(String csc) {
    
    this.csc = csc;
    return this;
  }

   /**
   * The Card Security Code (CSC) (also known as CV2/CVV2) is normally found on the back of the card (American Express has it on the front). The value helps to identify posession of the card as it is not available within the chip or magnetic swipe.  When forwarding the CSC, please ensure the value is a string as some values start with 0 and this will be stripped out by any integer parsing.  The CSC number aids fraud prevention in Mail Order and Internet payments.   Business rules are available on your account to identify whether to accept or decline transactions based on mismatched results of the CSC.  The Payment Card Industry (PCI) requires that at no stage of a transaction should the CSC be stored. This applies to all entities handling card data. It should also not be used in any hashing process. CityPay do not store the value and have no method of retrieving the value once the transaction has been processed. For this reason, duplicate checking is unable to determine the CSC in its duplication check algorithm. 
   * @return csc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The Card Security Code (CSC) (also known as CV2/CVV2) is normally found on the back of the card (American Express has it on the front). The value helps to identify posession of the card as it is not available within the chip or magnetic swipe.  When forwarding the CSC, please ensure the value is a string as some values start with 0 and this will be stripped out by any integer parsing.  The CSC number aids fraud prevention in Mail Order and Internet payments.   Business rules are available on your account to identify whether to accept or decline transactions based on mismatched results of the CSC.  The Payment Card Industry (PCI) requires that at no stage of a transaction should the CSC be stored. This applies to all entities handling card data. It should also not be used in any hashing process. CityPay do not store the value and have no method of retrieving the value once the transaction has been processed. For this reason, duplicate checking is unable to determine the CSC in its duplication check algorithm. ")

  public String getCsc() {
    return csc;
  }


  public void setCsc(String csc) {
    this.csc = csc;
  }


  public ChargeRequest cscPolicy(String cscPolicy) {
    
    this.cscPolicy = cscPolicy;
    return this;
  }

   /**
   * A policy value which determines whether a CSC policy is enforced or bypassed.  Values are  &#x60;0&#x60; for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  &#x60;1&#x60; for an enforced policy. Transactions that are enforced will be rejected if the CSC value does not match.  &#x60;2&#x60; to bypass. Transactions that are bypassed will be allowed through even if the CSC did not match.  &#x60;3&#x60; to ignore. Transactions that are ignored will bypass the result and not send the CSC details for authorisation. 
   * @return cscPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A policy value which determines whether a CSC policy is enforced or bypassed.  Values are  `0` for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  `1` for an enforced policy. Transactions that are enforced will be rejected if the CSC value does not match.  `2` to bypass. Transactions that are bypassed will be allowed through even if the CSC did not match.  `3` to ignore. Transactions that are ignored will bypass the result and not send the CSC details for authorisation. ")

  public String getCscPolicy() {
    return cscPolicy;
  }


  public void setCscPolicy(String cscPolicy) {
    this.cscPolicy = cscPolicy;
  }


  public ChargeRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The processing currency for the transaction. Will default to the merchant account currency.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GBP", value = "The processing currency for the transaction. Will default to the merchant account currency.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ChargeRequest duplicatePolicy(String duplicatePolicy) {
    
    this.duplicatePolicy = duplicatePolicy;
    return this;
  }

   /**
   * A policy value which determines whether a duplication policy is enforced or bypassed. A duplication check has a window of time set against your account within which it can action. If a previous transaction with matching values occurred within the window, any subsequent transaction will result in a T001 result.  Values are  &#x60;0&#x60; for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  &#x60;1&#x60; for an enforced policy. Transactions that are enforced will be checked for duplication within the duplication window.  &#x60;2&#x60; to bypass. Transactions that are bypassed will not be checked for duplication within the duplication window.  &#x60;3&#x60; to ignore. Transactions that are ignored will have the same affect as bypass. 
   * @return duplicatePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A policy value which determines whether a duplication policy is enforced or bypassed. A duplication check has a window of time set against your account within which it can action. If a previous transaction with matching values occurred within the window, any subsequent transaction will result in a T001 result.  Values are  `0` for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  `1` for an enforced policy. Transactions that are enforced will be checked for duplication within the duplication window.  `2` to bypass. Transactions that are bypassed will not be checked for duplication within the duplication window.  `3` to ignore. Transactions that are ignored will have the same affect as bypass. ")

  public String getDuplicatePolicy() {
    return duplicatePolicy;
  }


  public void setDuplicatePolicy(String duplicatePolicy) {
    this.duplicatePolicy = duplicatePolicy;
  }


  public ChargeRequest identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of the transaction to process. The value should be a valid reference and may be used to perform  post processing actions and to aid in reconciliation of transactions.  The value should be a valid printable string with ASCII character ranges from 0x32 to 0x127.  The identifier is recommended to be distinct for each transaction such as a [random unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier) this will aid in ensuring each transaction is identifiable.  When transactions are processed they are also checked for duplicate requests. Changing the identifier on a subsequent request will ensure that a transaction is considered as different. 
   * @return identifier
  **/
  @ApiModelProperty(example = "95b857a1-5955-4b86-963c-5a6dbfc4fb95", required = true, value = "The identifier of the transaction to process. The value should be a valid reference and may be used to perform  post processing actions and to aid in reconciliation of transactions.  The value should be a valid printable string with ASCII character ranges from 0x32 to 0x127.  The identifier is recommended to be distinct for each transaction such as a [random unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier) this will aid in ensuring each transaction is identifiable.  When transactions are processed they are also checked for duplicate requests. Changing the identifier on a subsequent request will ensure that a transaction is considered as different. ")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public ChargeRequest matchAvsa(String matchAvsa) {
    
    this.matchAvsa = matchAvsa;
    return this;
  }

   /**
   * A policy value which determines whether an AVS address policy is enforced, bypassed or ignored.   Values are  &#x60;0&#x60; for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  &#x60;1&#x60; for an enforced policy. Transactions that are enforced will be rejected if the AVS address numeric value does not match.  &#x60;2&#x60; to bypass. Transactions that are bypassed will be allowed through even if the address did not match.  &#x60;3&#x60; to ignore. Transactions that are ignored will bypass the result and not send address numeric details for authorisation. 
   * @return matchAvsa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A policy value which determines whether an AVS address policy is enforced, bypassed or ignored.   Values are  `0` for the default policy (default value if not supplied). Your default values are determined by your account manager on setup of the account.  `1` for an enforced policy. Transactions that are enforced will be rejected if the AVS address numeric value does not match.  `2` to bypass. Transactions that are bypassed will be allowed through even if the address did not match.  `3` to ignore. Transactions that are ignored will bypass the result and not send address numeric details for authorisation. ")

  public String getMatchAvsa() {
    return matchAvsa;
  }


  public void setMatchAvsa(String matchAvsa) {
    this.matchAvsa = matchAvsa;
  }


  public ChargeRequest merchantid(Integer merchantid) {
    
    this.merchantid = merchantid;
    return this;
  }

   /**
   * Identifies the merchant account to perform processing for.
   * @return merchantid
  **/
  @ApiModelProperty(example = "11223344", required = true, value = "Identifies the merchant account to perform processing for.")

  public Integer getMerchantid() {
    return merchantid;
  }


  public void setMerchantid(Integer merchantid) {
    this.merchantid = merchantid;
  }


  public ChargeRequest threedsecure(ThreeDSecure threedsecure) {
    
    this.threedsecure = threedsecure;
    return this;
  }

   /**
   * Get threedsecure
   * @return threedsecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDSecure getThreedsecure() {
    return threedsecure;
  }


  public void setThreedsecure(ThreeDSecure threedsecure) {
    this.threedsecure = threedsecure;
  }


  public ChargeRequest token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * A tokenised form of a card that belongs to a card holder&#39;s account and that has been previously registered. The token is time based and will only be active for a short duration. The value is therefore designed not to be stored remotely for future  use.  Tokens will start with ct and are resiliently tamper proof using HMacSHA-256. No sensitive card data is stored internally within the token.  Each card will contain a different token and the value may be different on any retrieval call.  The value can be presented for payment as a selection value to an end user in a web application. 
   * @return token
  **/
  @ApiModelProperty(example = "ctPCAPyNyCkx3Ry8wGyv8khC3ch2hUSB3Db..Qzr", required = true, value = "A tokenised form of a card that belongs to a card holder's account and that has been previously registered. The token is time based and will only be active for a short duration. The value is therefore designed not to be stored remotely for future  use.  Tokens will start with ct and are resiliently tamper proof using HMacSHA-256. No sensitive card data is stored internally within the token.  Each card will contain a different token and the value may be different on any retrieval call.  The value can be presented for payment as a selection value to an end user in a web application. ")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public ChargeRequest transInfo(String transInfo) {
    
    this.transInfo = transInfo;
    return this;
  }

   /**
   * Further information that can be added to the transaction will display in reporting. Can be used for flexible values such as operator id.
   * @return transInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Further information that can be added to the transaction will display in reporting. Can be used for flexible values such as operator id.")

  public String getTransInfo() {
    return transInfo;
  }


  public void setTransInfo(String transInfo) {
    this.transInfo = transInfo;
  }


  public ChargeRequest transType(String transType) {
    
    this.transType = transType;
    return this;
  }

   /**
   * The type of transaction being submitted. Normally this value is not required and your account manager may request that you set this field.
   * @return transType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of transaction being submitted. Normally this value is not required and your account manager may request that you set this field.")

  public String getTransType() {
    return transType;
  }


  public void setTransType(String transType) {
    this.transType = transType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeRequest chargeRequest = (ChargeRequest) o;
    return Objects.equals(this.amount, chargeRequest.amount) &&
        Objects.equals(this.avsPostcodePolicy, chargeRequest.avsPostcodePolicy) &&
        Objects.equals(this.csc, chargeRequest.csc) &&
        Objects.equals(this.cscPolicy, chargeRequest.cscPolicy) &&
        Objects.equals(this.currency, chargeRequest.currency) &&
        Objects.equals(this.duplicatePolicy, chargeRequest.duplicatePolicy) &&
        Objects.equals(this.identifier, chargeRequest.identifier) &&
        Objects.equals(this.matchAvsa, chargeRequest.matchAvsa) &&
        Objects.equals(this.merchantid, chargeRequest.merchantid) &&
        Objects.equals(this.threedsecure, chargeRequest.threedsecure) &&
        Objects.equals(this.token, chargeRequest.token) &&
        Objects.equals(this.transInfo, chargeRequest.transInfo) &&
        Objects.equals(this.transType, chargeRequest.transType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, avsPostcodePolicy, csc, cscPolicy, currency, duplicatePolicy, identifier, matchAvsa, merchantid, threedsecure, token, transInfo, transType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    avsPostcodePolicy: ").append(toIndentedString(avsPostcodePolicy)).append("\n");
    sb.append("    csc: ").append(toIndentedString(csc)).append("\n");
    sb.append("    cscPolicy: ").append(toIndentedString(cscPolicy)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    duplicatePolicy: ").append(toIndentedString(duplicatePolicy)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    matchAvsa: ").append(toIndentedString(matchAvsa)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
    sb.append("    threedsecure: ").append(toIndentedString(threedsecure)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    transInfo: ").append(toIndentedString(transInfo)).append("\n");
    sb.append("    transType: ").append(toIndentedString(transType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

