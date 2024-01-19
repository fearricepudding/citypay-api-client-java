/*
 * CityPay Payment API
 *  This CityPay API is an HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokenized payments using cardholder Accounts.  ## Compliance and Security Your application will need to adhere to PCI-DSS standards to operate safely and to meet requirements set out by  Visa and MasterCard and the PCI Security Standards Council. These include  * Data must be collected using TLS version 1.2 using [strong cryptography](https://citypay.github.io/api-docs/payment-api/#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive cardholder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.model;

import java.util.Objects;
import com.citypay.client.model.Merchant;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * ListMerchantsResponse
 */
public class ListMerchantsResponse {
  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CLIENTID = "clientid";
  @SerializedName(SERIALIZED_NAME_CLIENTID)
  private String clientid;

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private List<Merchant> merchants;

  public ListMerchantsResponse() {
  }

  public ListMerchantsResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * The client name that was requested.
   * @return clientName
  **/
  @javax.annotation.Nullable
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public ListMerchantsResponse clientid(String clientid) {
    this.clientid = clientid;
    return this;
  }

   /**
   * The client id requested.
   * @return clientid
  **/
  @javax.annotation.Nullable
  public String getClientid() {
    return clientid;
  }

  public void setClientid(String clientid) {
    this.clientid = clientid;
  }


  public ListMerchantsResponse merchants(List<Merchant> merchants) {
    this.merchants = merchants;
    return this;
  }

  public ListMerchantsResponse addMerchantsItem(Merchant merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new ArrayList<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

   /**
   * Get merchants
   * @return merchants
  **/
  @javax.annotation.Nullable
  public List<Merchant> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<Merchant> merchants) {
    this.merchants = merchants;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMerchantsResponse listMerchantsResponse = (ListMerchantsResponse) o;
    return Objects.equals(this.clientName, listMerchantsResponse.clientName) &&
        Objects.equals(this.clientid, listMerchantsResponse.clientid) &&
        Objects.equals(this.merchants, listMerchantsResponse.merchants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, clientid, merchants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMerchantsResponse {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
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
    openapiFields.add("client_name");
    openapiFields.add("clientid");
    openapiFields.add("merchants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListMerchantsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListMerchantsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListMerchantsResponse is not found in the empty JSON string", ListMerchantsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListMerchantsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListMerchantsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("client_name") != null && !jsonObj.get("client_name").isJsonNull()) && !jsonObj.get("client_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_name").toString()));
      }
      if ((jsonObj.get("clientid") != null && !jsonObj.get("clientid").isJsonNull()) && !jsonObj.get("clientid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientid").toString()));
      }
      if (jsonObj.get("merchants") != null && !jsonObj.get("merchants").isJsonNull()) {
        JsonArray jsonArraymerchants = jsonObj.getAsJsonArray("merchants");
        if (jsonArraymerchants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("merchants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `merchants` to be an array in the JSON string but got `%s`", jsonObj.get("merchants").toString()));
          }

          // validate the optional field `merchants` (array)
          for (int i = 0; i < jsonArraymerchants.size(); i++) {
            Merchant.validateJsonElement(jsonArraymerchants.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListMerchantsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListMerchantsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListMerchantsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListMerchantsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListMerchantsResponse>() {
           @Override
           public void write(JsonWriter out, ListMerchantsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListMerchantsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListMerchantsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListMerchantsResponse
  * @throws IOException if the JSON string is invalid with respect to ListMerchantsResponse
  */
  public static ListMerchantsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListMerchantsResponse.class);
  }

 /**
  * Convert an instance of ListMerchantsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

