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


package com.citypay.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.citypay.client.model.AirlineAdvice;
import com.citypay.client.model.EventDataModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CaptureRequest
 */
public class CaptureRequest {
  public static final String SERIALIZED_NAME_AIRLINE_DATA = "airline_data";
  @SerializedName(SERIALIZED_NAME_AIRLINE_DATA)
  private AirlineAdvice airlineData;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_EVENT_MANAGEMENT = "event_management";
  @SerializedName(SERIALIZED_NAME_EVENT_MANAGEMENT)
  private EventDataModel eventManagement;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  private Integer merchantid;

  public static final String SERIALIZED_NAME_TRANSNO = "transno";
  @SerializedName(SERIALIZED_NAME_TRANSNO)
  private Integer transno;


  public CaptureRequest airlineData(AirlineAdvice airlineData) {
    
    this.airlineData = airlineData;
    return this;
  }

   /**
   * Get airlineData
   * @return airlineData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AirlineAdvice getAirlineData() {
    return airlineData;
  }


  public void setAirlineData(AirlineAdvice airlineData) {
    this.airlineData = airlineData;
  }


  public CaptureRequest amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The completion amount provided in the lowest unit of currency for the specific currency of the merchant, with a variable length to a maximum of 12 digits. No decimal points to be included. For example with GBP 75.45 use the value 7545. Please check that you do not supply divisional characters such as 1,024 in the request which may be caused by some number formatters.  If no amount is supplied, the original processing amount is used. 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "The completion amount provided in the lowest unit of currency for the specific currency of the merchant, with a variable length to a maximum of 12 digits. No decimal points to be included. For example with GBP 75.45 use the value 7545. Please check that you do not supply divisional characters such as 1,024 in the request which may be caused by some number formatters.  If no amount is supplied, the original processing amount is used. ")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public CaptureRequest eventManagement(EventDataModel eventManagement) {
    
    this.eventManagement = eventManagement;
    return this;
  }

   /**
   * Get eventManagement
   * @return eventManagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventDataModel getEventManagement() {
    return eventManagement;
  }


  public void setEventManagement(EventDataModel eventManagement) {
    this.eventManagement = eventManagement;
  }


  public CaptureRequest identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of the transaction to capture. If an empty value is supplied then a &#x60;trans_no&#x60; value must be supplied.
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95b857a1-5955-4b86-963c-5a6dbfc4fb95", value = "The identifier of the transaction to capture. If an empty value is supplied then a `trans_no` value must be supplied.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public CaptureRequest merchantid(Integer merchantid) {
    
    this.merchantid = merchantid;
    return this;
  }

   /**
   * Identifies the merchant account to perform the capture for.
   * @return merchantid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "11223344", required = true, value = "Identifies the merchant account to perform the capture for.")

  public Integer getMerchantid() {
    return merchantid;
  }


  public void setMerchantid(Integer merchantid) {
    this.merchantid = merchantid;
  }


  public CaptureRequest transno(Integer transno) {
    
    this.transno = transno;
    return this;
  }

   /**
   * The transaction number of the transaction to look up and capture. If an empty value is supplied then an identifier value must be supplied.
   * @return transno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "78416", value = "The transaction number of the transaction to look up and capture. If an empty value is supplied then an identifier value must be supplied.")

  public Integer getTransno() {
    return transno;
  }


  public void setTransno(Integer transno) {
    this.transno = transno;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureRequest captureRequest = (CaptureRequest) o;
    return Objects.equals(this.airlineData, captureRequest.airlineData) &&
        Objects.equals(this.amount, captureRequest.amount) &&
        Objects.equals(this.eventManagement, captureRequest.eventManagement) &&
        Objects.equals(this.identifier, captureRequest.identifier) &&
        Objects.equals(this.merchantid, captureRequest.merchantid) &&
        Objects.equals(this.transno, captureRequest.transno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineData, amount, eventManagement, identifier, merchantid, transno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureRequest {\n");
    sb.append("    airlineData: ").append(toIndentedString(airlineData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    eventManagement: ").append(toIndentedString(eventManagement)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
    sb.append("    transno: ").append(toIndentedString(transno)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

