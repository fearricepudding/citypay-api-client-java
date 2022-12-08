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
import com.citypay.client.model.BatchTransaction;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * ProcessBatchRequest
 */
public class ProcessBatchRequest {
  public static final String SERIALIZED_NAME_BATCH_DATE = "batch_date";
  @SerializedName(SERIALIZED_NAME_BATCH_DATE)
  private LocalDate batchDate;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private Integer batchId;

  public static final String SERIALIZED_NAME_CLIENT_ACCOUNT_ID = "client_account_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ACCOUNT_ID)
  private String clientAccountId;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<BatchTransaction> transactions = new ArrayList<>();

  public ProcessBatchRequest() {
  }

  public ProcessBatchRequest batchDate(LocalDate batchDate) {
    
    this.batchDate = batchDate;
    return this;
  }

   /**
   * The date and time that the file was created in ISO-8601 format.
   * @return batchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Thu Jan 02 00:00:00 UTC 2020", required = true, value = "The date and time that the file was created in ISO-8601 format.")

  public LocalDate getBatchDate() {
    return batchDate;
  }


  public void setBatchDate(LocalDate batchDate) {
    this.batchDate = batchDate;
  }


  public ProcessBatchRequest batchId(Integer batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * The id is a referencable id for the batch that should be generated by your integration. Its recommended to use an incremental id to help determine if a batch has been skipped or missed. The id is used by reporting systems to reference the unique batch alongside your client id. 
   * minimum: 1
   * @return batchId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "35", required = true, value = "The id is a referencable id for the batch that should be generated by your integration. Its recommended to use an incremental id to help determine if a batch has been skipped or missed. The id is used by reporting systems to reference the unique batch alongside your client id. ")

  public Integer getBatchId() {
    return batchId;
  }


  public void setBatchId(Integer batchId) {
    this.batchId = batchId;
  }


  public ProcessBatchRequest clientAccountId(String clientAccountId) {
    
    this.clientAccountId = clientAccountId;
    return this;
  }

   /**
   * The batch account id to process the batch for. Defaults to your client id if not provided.
   * @return clientAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AC1", value = "The batch account id to process the batch for. Defaults to your client id if not provided.")

  public String getClientAccountId() {
    return clientAccountId;
  }


  public void setClientAccountId(String clientAccountId) {
    this.clientAccountId = clientAccountId;
  }


  public ProcessBatchRequest transactions(List<BatchTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public ProcessBatchRequest addTransactionsItem(BatchTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BatchTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<BatchTransaction> transactions) {
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
    ProcessBatchRequest processBatchRequest = (ProcessBatchRequest) o;
    return Objects.equals(this.batchDate, processBatchRequest.batchDate) &&
        Objects.equals(this.batchId, processBatchRequest.batchId) &&
        Objects.equals(this.clientAccountId, processBatchRequest.clientAccountId) &&
        Objects.equals(this.transactions, processBatchRequest.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchDate, batchId, clientAccountId, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessBatchRequest {\n");
    sb.append("    batchDate: ").append(toIndentedString(batchDate)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    clientAccountId: ").append(toIndentedString(clientAccountId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("batch_date");
    openapiFields.add("batch_id");
    openapiFields.add("client_account_id");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("batch_date");
    openapiRequiredFields.add("batch_id");
    openapiRequiredFields.add("transactions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessBatchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessBatchRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessBatchRequest is not found in the empty JSON string", ProcessBatchRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProcessBatchRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProcessBatchRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProcessBatchRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("client_account_id") != null && !jsonObj.get("client_account_id").isJsonNull()) && !jsonObj.get("client_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_account_id").toString()));
      }
      JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
      if (jsonArraytransactions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("transactions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
        }

        // validate the optional field `transactions` (array)
        for (int i = 0; i < jsonArraytransactions.size(); i++) {
          BatchTransaction.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessBatchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessBatchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessBatchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessBatchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessBatchRequest>() {
           @Override
           public void write(JsonWriter out, ProcessBatchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProcessBatchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProcessBatchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessBatchRequest
  * @throws IOException if the JSON string is invalid with respect to ProcessBatchRequest
  */
  public static ProcessBatchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessBatchRequest.class);
  }

 /**
  * Convert an instance of ProcessBatchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

