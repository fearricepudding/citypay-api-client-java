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
import com.citypay.client.model.AirlineSegment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * AirlineAdvice
 */
public class AirlineAdvice {
  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrier_name";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_CONJUNCTION_TICKET_INDICATOR = "conjunction_ticket_indicator";
  @SerializedName(SERIALIZED_NAME_CONJUNCTION_TICKET_INDICATOR)
  private Boolean conjunctionTicketIndicator;

  public static final String SERIALIZED_NAME_ETICKET_INDICATOR = "eticket_indicator";
  @SerializedName(SERIALIZED_NAME_ETICKET_INDICATOR)
  private Boolean eticketIndicator;

  public static final String SERIALIZED_NAME_NO_AIR_SEGMENTS = "no_air_segments";
  @SerializedName(SERIALIZED_NAME_NO_AIR_SEGMENTS)
  private Integer noAirSegments;

  public static final String SERIALIZED_NAME_NUMBER_IN_PARTY = "number_in_party";
  @SerializedName(SERIALIZED_NAME_NUMBER_IN_PARTY)
  private Integer numberInParty;

  public static final String SERIALIZED_NAME_ORIGINAL_TICKET_NO = "original_ticket_no";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TICKET_NO)
  private String originalTicketNo;

  public static final String SERIALIZED_NAME_PASSENGER_NAME = "passenger_name";
  @SerializedName(SERIALIZED_NAME_PASSENGER_NAME)
  private String passengerName;

  public static final String SERIALIZED_NAME_SEGMENT1 = "segment1";
  @SerializedName(SERIALIZED_NAME_SEGMENT1)
  private AirlineSegment segment1;

  public static final String SERIALIZED_NAME_SEGMENT2 = "segment2";
  @SerializedName(SERIALIZED_NAME_SEGMENT2)
  private AirlineSegment segment2;

  public static final String SERIALIZED_NAME_SEGMENT3 = "segment3";
  @SerializedName(SERIALIZED_NAME_SEGMENT3)
  private AirlineSegment segment3;

  public static final String SERIALIZED_NAME_SEGMENT4 = "segment4";
  @SerializedName(SERIALIZED_NAME_SEGMENT4)
  private AirlineSegment segment4;

  public static final String SERIALIZED_NAME_TICKET_ISSUE_CITY = "ticket_issue_city";
  @SerializedName(SERIALIZED_NAME_TICKET_ISSUE_CITY)
  private String ticketIssueCity;

  public static final String SERIALIZED_NAME_TICKET_ISSUE_DATE = "ticket_issue_date";
  @SerializedName(SERIALIZED_NAME_TICKET_ISSUE_DATE)
  private LocalDate ticketIssueDate;

  public static final String SERIALIZED_NAME_TICKET_ISSUE_NAME = "ticket_issue_name";
  @SerializedName(SERIALIZED_NAME_TICKET_ISSUE_NAME)
  private String ticketIssueName;

  public static final String SERIALIZED_NAME_TICKET_NO = "ticket_no";
  @SerializedName(SERIALIZED_NAME_TICKET_NO)
  private String ticketNo;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;


  public AirlineAdvice carrierName(String carrierName) {
    
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The name of the airline carrier that generated the tickets for airline travel.
   * @return carrierName
  **/
  @ApiModelProperty(example = "EG Air", required = true, value = "The name of the airline carrier that generated the tickets for airline travel.")

  public String getCarrierName() {
    return carrierName;
  }


  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public AirlineAdvice conjunctionTicketIndicator(Boolean conjunctionTicketIndicator) {
    
    this.conjunctionTicketIndicator = conjunctionTicketIndicator;
    return this;
  }

   /**
   * true if a conjunction ticket (with additional coupons) was issued for an itinerary with more than four segments. Defaults to false. 
   * @return conjunctionTicketIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "true if a conjunction ticket (with additional coupons) was issued for an itinerary with more than four segments. Defaults to false. ")

  public Boolean isConjunctionTicketIndicator() {
    return conjunctionTicketIndicator;
  }


  public void setConjunctionTicketIndicator(Boolean conjunctionTicketIndicator) {
    this.conjunctionTicketIndicator = conjunctionTicketIndicator;
  }


  public AirlineAdvice eticketIndicator(Boolean eticketIndicator) {
    
    this.eticketIndicator = eticketIndicator;
    return this;
  }

   /**
   * The Electronic Ticket Indicator, a code that indicates if an electronic ticket was issued.  Defaults to true.
   * @return eticketIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "The Electronic Ticket Indicator, a code that indicates if an electronic ticket was issued.  Defaults to true.")

  public Boolean isEticketIndicator() {
    return eticketIndicator;
  }


  public void setEticketIndicator(Boolean eticketIndicator) {
    this.eticketIndicator = eticketIndicator;
  }


  public AirlineAdvice noAirSegments(Integer noAirSegments) {
    
    this.noAirSegments = noAirSegments;
    return this;
  }

   /**
   * A value that indicates the number of air travel segments included on this ticket. Valid entries include the numerals “0” through “4”. Required only if the transaction type is TKT or EXC. 
   * minimum: 0
   * maximum: 4
   * @return noAirSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "A value that indicates the number of air travel segments included on this ticket. Valid entries include the numerals “0” through “4”. Required only if the transaction type is TKT or EXC. ")

  public Integer getNoAirSegments() {
    return noAirSegments;
  }


  public void setNoAirSegments(Integer noAirSegments) {
    this.noAirSegments = noAirSegments;
  }


  public AirlineAdvice numberInParty(Integer numberInParty) {
    
    this.numberInParty = numberInParty;
    return this;
  }

   /**
   * The number of people in the party.
   * @return numberInParty
  **/
  @ApiModelProperty(example = "2", required = true, value = "The number of people in the party.")

  public Integer getNumberInParty() {
    return numberInParty;
  }


  public void setNumberInParty(Integer numberInParty) {
    this.numberInParty = numberInParty;
  }


  public AirlineAdvice originalTicketNo(String originalTicketNo) {
    
    this.originalTicketNo = originalTicketNo;
    return this;
  }

   /**
   * Required if transaction type is EXC.
   * @return originalTicketNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required if transaction type is EXC.")

  public String getOriginalTicketNo() {
    return originalTicketNo;
  }


  public void setOriginalTicketNo(String originalTicketNo) {
    this.originalTicketNo = originalTicketNo;
  }


  public AirlineAdvice passengerName(String passengerName) {
    
    this.passengerName = passengerName;
    return this;
  }

   /**
   * The name of the passenger when the traveller is not the card member that purchased the ticket. Required only if the transaction type is TKT or EXC.
   * @return passengerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NE Person", value = "The name of the passenger when the traveller is not the card member that purchased the ticket. Required only if the transaction type is TKT or EXC.")

  public String getPassengerName() {
    return passengerName;
  }


  public void setPassengerName(String passengerName) {
    this.passengerName = passengerName;
  }


  public AirlineAdvice segment1(AirlineSegment segment1) {
    
    this.segment1 = segment1;
    return this;
  }

   /**
   * Get segment1
   * @return segment1
  **/
  @ApiModelProperty(required = true, value = "")

  public AirlineSegment getSegment1() {
    return segment1;
  }


  public void setSegment1(AirlineSegment segment1) {
    this.segment1 = segment1;
  }


  public AirlineAdvice segment2(AirlineSegment segment2) {
    
    this.segment2 = segment2;
    return this;
  }

   /**
   * Get segment2
   * @return segment2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AirlineSegment getSegment2() {
    return segment2;
  }


  public void setSegment2(AirlineSegment segment2) {
    this.segment2 = segment2;
  }


  public AirlineAdvice segment3(AirlineSegment segment3) {
    
    this.segment3 = segment3;
    return this;
  }

   /**
   * Get segment3
   * @return segment3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AirlineSegment getSegment3() {
    return segment3;
  }


  public void setSegment3(AirlineSegment segment3) {
    this.segment3 = segment3;
  }


  public AirlineAdvice segment4(AirlineSegment segment4) {
    
    this.segment4 = segment4;
    return this;
  }

   /**
   * Get segment4
   * @return segment4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AirlineSegment getSegment4() {
    return segment4;
  }


  public void setSegment4(AirlineSegment segment4) {
    this.segment4 = segment4;
  }


  public AirlineAdvice ticketIssueCity(String ticketIssueCity) {
    
    this.ticketIssueCity = ticketIssueCity;
    return this;
  }

   /**
   * The name of the city town or village where the transaction took place.
   * @return ticketIssueCity
  **/
  @ApiModelProperty(example = "London", required = true, value = "The name of the city town or village where the transaction took place.")

  public String getTicketIssueCity() {
    return ticketIssueCity;
  }


  public void setTicketIssueCity(String ticketIssueCity) {
    this.ticketIssueCity = ticketIssueCity;
  }


  public AirlineAdvice ticketIssueDate(LocalDate ticketIssueDate) {
    
    this.ticketIssueDate = ticketIssueDate;
    return this;
  }

   /**
   * The date the ticket was issued in ISO Date format (yyyy-MM-dd).
   * @return ticketIssueDate
  **/
  @ApiModelProperty(example = "Sat Aug 01 00:00:00 GMT 2020", required = true, value = "The date the ticket was issued in ISO Date format (yyyy-MM-dd).")

  public LocalDate getTicketIssueDate() {
    return ticketIssueDate;
  }


  public void setTicketIssueDate(LocalDate ticketIssueDate) {
    this.ticketIssueDate = ticketIssueDate;
  }


  public AirlineAdvice ticketIssueName(String ticketIssueName) {
    
    this.ticketIssueName = ticketIssueName;
    return this;
  }

   /**
   * The name of the agency generating the ticket.
   * @return ticketIssueName
  **/
  @ApiModelProperty(example = "Issue Name", required = true, value = "The name of the agency generating the ticket.")

  public String getTicketIssueName() {
    return ticketIssueName;
  }


  public void setTicketIssueName(String ticketIssueName) {
    this.ticketIssueName = ticketIssueName;
  }


  public AirlineAdvice ticketNo(String ticketNo) {
    
    this.ticketNo = ticketNo;
    return this;
  }

   /**
   * This must be a valid ticket number, i.e. numeric (the first 3 digits must represent the valid IATA plate carrier code). The final check digit should be validated prior to submission. On credit charges, this field should contain the number of the original ticket, and not of a replacement. 
   * @return ticketNo
  **/
  @ApiModelProperty(example = "A112233", required = true, value = "This must be a valid ticket number, i.e. numeric (the first 3 digits must represent the valid IATA plate carrier code). The final check digit should be validated prior to submission. On credit charges, this field should contain the number of the original ticket, and not of a replacement. ")

  public String getTicketNo() {
    return ticketNo;
  }


  public void setTicketNo(String ticketNo) {
    this.ticketNo = ticketNo;
  }


  public AirlineAdvice transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * This field contains the Transaction Type code assigned to this transaction. Valid codes include:   - &#x60;TKT&#x60; &#x3D; Ticket Purchase  - &#x60;REF&#x60; &#x3D; Refund  - &#x60;EXC&#x60; &#x3D; Exchange Ticket  - &#x60;MSC&#x60; &#x3D; Miscellaneous (non-Ticket Purchase- and non-Exchange Ticket-related transactions only). 
   * @return transactionType
  **/
  @ApiModelProperty(example = "TKT", required = true, value = "This field contains the Transaction Type code assigned to this transaction. Valid codes include:   - `TKT` = Ticket Purchase  - `REF` = Refund  - `EXC` = Exchange Ticket  - `MSC` = Miscellaneous (non-Ticket Purchase- and non-Exchange Ticket-related transactions only). ")

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlineAdvice airlineAdvice = (AirlineAdvice) o;
    return Objects.equals(this.carrierName, airlineAdvice.carrierName) &&
        Objects.equals(this.conjunctionTicketIndicator, airlineAdvice.conjunctionTicketIndicator) &&
        Objects.equals(this.eticketIndicator, airlineAdvice.eticketIndicator) &&
        Objects.equals(this.noAirSegments, airlineAdvice.noAirSegments) &&
        Objects.equals(this.numberInParty, airlineAdvice.numberInParty) &&
        Objects.equals(this.originalTicketNo, airlineAdvice.originalTicketNo) &&
        Objects.equals(this.passengerName, airlineAdvice.passengerName) &&
        Objects.equals(this.segment1, airlineAdvice.segment1) &&
        Objects.equals(this.segment2, airlineAdvice.segment2) &&
        Objects.equals(this.segment3, airlineAdvice.segment3) &&
        Objects.equals(this.segment4, airlineAdvice.segment4) &&
        Objects.equals(this.ticketIssueCity, airlineAdvice.ticketIssueCity) &&
        Objects.equals(this.ticketIssueDate, airlineAdvice.ticketIssueDate) &&
        Objects.equals(this.ticketIssueName, airlineAdvice.ticketIssueName) &&
        Objects.equals(this.ticketNo, airlineAdvice.ticketNo) &&
        Objects.equals(this.transactionType, airlineAdvice.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName, conjunctionTicketIndicator, eticketIndicator, noAirSegments, numberInParty, originalTicketNo, passengerName, segment1, segment2, segment3, segment4, ticketIssueCity, ticketIssueDate, ticketIssueName, ticketNo, transactionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlineAdvice {\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    conjunctionTicketIndicator: ").append(toIndentedString(conjunctionTicketIndicator)).append("\n");
    sb.append("    eticketIndicator: ").append(toIndentedString(eticketIndicator)).append("\n");
    sb.append("    noAirSegments: ").append(toIndentedString(noAirSegments)).append("\n");
    sb.append("    numberInParty: ").append(toIndentedString(numberInParty)).append("\n");
    sb.append("    originalTicketNo: ").append(toIndentedString(originalTicketNo)).append("\n");
    sb.append("    passengerName: ").append(toIndentedString(passengerName)).append("\n");
    sb.append("    segment1: ").append(toIndentedString(segment1)).append("\n");
    sb.append("    segment2: ").append(toIndentedString(segment2)).append("\n");
    sb.append("    segment3: ").append(toIndentedString(segment3)).append("\n");
    sb.append("    segment4: ").append(toIndentedString(segment4)).append("\n");
    sb.append("    ticketIssueCity: ").append(toIndentedString(ticketIssueCity)).append("\n");
    sb.append("    ticketIssueDate: ").append(toIndentedString(ticketIssueDate)).append("\n");
    sb.append("    ticketIssueName: ").append(toIndentedString(ticketIssueName)).append("\n");
    sb.append("    ticketNo: ").append(toIndentedString(ticketNo)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

