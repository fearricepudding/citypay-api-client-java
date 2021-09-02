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
import com.citypay.client.model.BatchTransactionResultModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchReportResponseModel
 */
public class BatchReportResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_BATCH_DATE = "batch_date";
  @SerializedName(SERIALIZED_NAME_BATCH_DATE)
  private OffsetDateTime batchDate;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private Integer batchId;

  public static final String SERIALIZED_NAME_BATCH_STATUS = "batch_status";
  @SerializedName(SERIALIZED_NAME_BATCH_STATUS)
  private String batchStatus;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<BatchTransactionResultModel> transactions = new ArrayList<>();


  public BatchReportResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The batch account id that the batch was processed with.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "AC1", required = true, value = "The batch account id that the batch was processed with.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public BatchReportResponseModel amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount that the batch contains.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3600", required = true, value = "The total amount that the batch contains.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public BatchReportResponseModel batchDate(OffsetDateTime batchDate) {
    
    this.batchDate = batchDate;
    return this;
  }

   /**
   * The date and time of the batch in ISO-8601 format.
   * @return batchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-02T18:32:28Z", required = true, value = "The date and time of the batch in ISO-8601 format.")

  public OffsetDateTime getBatchDate() {
    return batchDate;
  }


  public void setBatchDate(OffsetDateTime batchDate) {
    this.batchDate = batchDate;
  }


  public BatchReportResponseModel batchId(Integer batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * The batch id specified in the batch processing request.
   * minimum: 1
   * @return batchId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1975", required = true, value = "The batch id specified in the batch processing request.")

  public Integer getBatchId() {
    return batchId;
  }


  public void setBatchId(Integer batchId) {
    this.batchId = batchId;
  }


  public BatchReportResponseModel batchStatus(String batchStatus) {
    
    this.batchStatus = batchStatus;
    return this;
  }

   /**
   * The status of the batch. Possible values are.
   * @return batchStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COMPLETE", required = true, value = "The status of the batch. Possible values are.")

  public String getBatchStatus() {
    return batchStatus;
  }


  public void setBatchStatus(String batchStatus) {
    this.batchStatus = batchStatus;
  }


  public BatchReportResponseModel transactions(List<BatchTransactionResultModel> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public BatchReportResponseModel addTransactionsItem(BatchTransactionResultModel transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BatchTransactionResultModel> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<BatchTransactionResultModel> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchReportResponseModel batchReportResponseModel = (BatchReportResponseModel) o;
    return Objects.equals(this.accountId, batchReportResponseModel.accountId) &&
        Objects.equals(this.amount, batchReportResponseModel.amount) &&
        Objects.equals(this.batchDate, batchReportResponseModel.batchDate) &&
        Objects.equals(this.batchId, batchReportResponseModel.batchId) &&
        Objects.equals(this.batchStatus, batchReportResponseModel.batchStatus) &&
        Objects.equals(this.transactions, batchReportResponseModel.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, batchDate, batchId, batchStatus, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchReportResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    batchDate: ").append(toIndentedString(batchDate)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchStatus: ").append(toIndentedString(batchStatus)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
