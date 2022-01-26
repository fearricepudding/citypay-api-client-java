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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Batch
 */
public class Batch {
  public static final String SERIALIZED_NAME_BATCH_DATE = "batch_date";
  @SerializedName(SERIALIZED_NAME_BATCH_DATE)
  private LocalDate batchDate;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private List<Integer> batchId = null;

  public static final String SERIALIZED_NAME_BATCH_STATUS = "batch_status";
  @SerializedName(SERIALIZED_NAME_BATCH_STATUS)
  private String batchStatus;


  public Batch batchDate(LocalDate batchDate) {
    
    this.batchDate = batchDate;
    return this;
  }

   /**
   * The date that the file was created in ISO-8601 format.
   * @return batchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Thu Jan 02 00:00:00 UTC 2020", required = true, value = "The date that the file was created in ISO-8601 format.")

  public LocalDate getBatchDate() {
    return batchDate;
  }


  public void setBatchDate(LocalDate batchDate) {
    this.batchDate = batchDate;
  }


  public Batch batchId(List<Integer> batchId) {
    
    this.batchId = batchId;
    return this;
  }

  public Batch addBatchIdItem(Integer batchIdItem) {
    if (this.batchId == null) {
      this.batchId = new ArrayList<>();
    }
    this.batchId.add(batchIdItem);
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getBatchId() {
    return batchId;
  }


  public void setBatchId(List<Integer> batchId) {
    this.batchId = batchId;
  }


  public Batch batchStatus(String batchStatus) {
    
    this.batchStatus = batchStatus;
    return this;
  }

   /**
   * The status of the batch. Possible values are - CANCELLED. The file has been cancelled by an administrator or server process.  - COMPLETE. The file has passed through the processing cycle and is determined as being complete further information should be obtained on the results of the processing - ERROR_IN_PROCESSING. Errors have occurred in the processing that has deemed that processing can not continue. - INITIALISED. The file has been initialised and no action has yet been performed - LOCKED. The file has been locked for processing - QUEUED. The file has been queued for processing yet no processing has yet been performed - UNKNOWN. The file is of an unknown status, that is the file can either not be determined by the information requested of the file has not yet been received. 
   * @return batchStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COMPLETE", required = true, value = "The status of the batch. Possible values are - CANCELLED. The file has been cancelled by an administrator or server process.  - COMPLETE. The file has passed through the processing cycle and is determined as being complete further information should be obtained on the results of the processing - ERROR_IN_PROCESSING. Errors have occurred in the processing that has deemed that processing can not continue. - INITIALISED. The file has been initialised and no action has yet been performed - LOCKED. The file has been locked for processing - QUEUED. The file has been queued for processing yet no processing has yet been performed - UNKNOWN. The file is of an unknown status, that is the file can either not be determined by the information requested of the file has not yet been received. ")

  public String getBatchStatus() {
    return batchStatus;
  }


  public void setBatchStatus(String batchStatus) {
    this.batchStatus = batchStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.batchDate, batch.batchDate) &&
        Objects.equals(this.batchId, batch.batchId) &&
        Objects.equals(this.batchStatus, batch.batchStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchDate, batchId, batchStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    sb.append("    batchDate: ").append(toIndentedString(batchDate)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchStatus: ").append(toIndentedString(batchStatus)).append("\n");
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

