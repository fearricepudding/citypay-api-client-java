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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AuthenRequired
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T09:17:31.584Z[GMT]")
public class AuthenRequired {
  public static final String SERIALIZED_NAME_ACS_URL = "acs_url";
  @SerializedName(SERIALIZED_NAME_ACS_URL)
  private String acsUrl;

  public static final String SERIALIZED_NAME_MD = "md";
  @SerializedName(SERIALIZED_NAME_MD)
  private String md;

  public static final String SERIALIZED_NAME_PAREQ = "pareq";
  @SerializedName(SERIALIZED_NAME_PAREQ)
  private String pareq;


  public AuthenRequired acsUrl(String acsUrl) {
    
    this.acsUrl = acsUrl;
    return this;
  }

   /**
   * The url of the Access Control Server (ACS) to forward the user to. 
   * @return acsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://acs.cardissuer.com/3dsv1", value = "The url of the Access Control Server (ACS) to forward the user to. ")

  public String getAcsUrl() {
    return acsUrl;
  }


  public void setAcsUrl(String acsUrl) {
    this.acsUrl = acsUrl;
  }


  public AuthenRequired md(String md) {
    
    this.md = md;
    return this;
  }

   /**
   * Merchant Data (MD) which should be sent to the ACS to establish and reference the authentication session. 
   * @return md
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant Data (MD) which should be sent to the ACS to establish and reference the authentication session. ")

  public String getMd() {
    return md;
  }


  public void setMd(String md) {
    this.md = md;
  }


  public AuthenRequired pareq(String pareq) {
    
    this.pareq = pareq;
    return this;
  }

   /**
   * The Payer Authentication Request packet which should be &#x60;POSTed&#x60; to the Url of the ACS to establish the authentication session. Data should be sent untouched. 
   * @return pareq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eNrNWdnOo0qSfpXSmUuf0+w2tFy/lOyYxYDZ79h3sAEbm6cfbFfV+bu6pqe7R2qNJeQkiIwlMyK+...", value = "The Payer Authentication Request packet which should be `POSTed` to the Url of the ACS to establish the authentication session. Data should be sent untouched. ")

  public String getPareq() {
    return pareq;
  }


  public void setPareq(String pareq) {
    this.pareq = pareq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenRequired authenRequired = (AuthenRequired) o;
    return Objects.equals(this.acsUrl, authenRequired.acsUrl) &&
        Objects.equals(this.md, authenRequired.md) &&
        Objects.equals(this.pareq, authenRequired.pareq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsUrl, md, pareq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenRequired {\n");
    sb.append("    acsUrl: ").append(toIndentedString(acsUrl)).append("\n");
    sb.append("    md: ").append(toIndentedString(md)).append("\n");
    sb.append("    pareq: ").append(toIndentedString(pareq)).append("\n");
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

