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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * RequestChallenged
 */
public class RequestChallenged {
  public static final String SERIALIZED_NAME_ACS_URL = "acs_url";
  @SerializedName(SERIALIZED_NAME_ACS_URL)
  private String acsUrl;

  public static final String SERIALIZED_NAME_CREQ = "creq";
  @SerializedName(SERIALIZED_NAME_CREQ)
  private String creq;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  private Integer merchantid;

  public static final String SERIALIZED_NAME_THREEDSERVER_TRANS_ID = "threedserver_trans_id";
  @SerializedName(SERIALIZED_NAME_THREEDSERVER_TRANS_ID)
  private String threedserverTransId;

  public static final String SERIALIZED_NAME_TRANSNO = "transno";
  @SerializedName(SERIALIZED_NAME_TRANSNO)
  private Integer transno;

  public RequestChallenged() {
  }

  public RequestChallenged acsUrl(String acsUrl) {
    
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


  public RequestChallenged creq(String creq) {
    
    this.creq = creq;
    return this;
  }

   /**
   * The challenge request data which is encoded for usage by the ACS.
   * @return creq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The challenge request data which is encoded for usage by the ACS.")

  public String getCreq() {
    return creq;
  }


  public void setCreq(String creq) {
    this.creq = creq;
  }


  public RequestChallenged merchantid(Integer merchantid) {
    
    this.merchantid = merchantid;
    return this;
  }

   /**
   * The merchant id that processed this transaction.
   * @return merchantid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11223344", value = "The merchant id that processed this transaction.")

  public Integer getMerchantid() {
    return merchantid;
  }


  public void setMerchantid(Integer merchantid) {
    this.merchantid = merchantid;
  }


  public RequestChallenged threedserverTransId(String threedserverTransId) {
    
    this.threedserverTransId = threedserverTransId;
    return this;
  }

   /**
   * The 3DSv2 trans id reference for the challenge process. May be used to create the ThreeDSSessionData value to send to the ACS.
   * @return threedserverTransId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 3DSv2 trans id reference for the challenge process. May be used to create the ThreeDSSessionData value to send to the ACS.")

  public String getThreedserverTransId() {
    return threedserverTransId;
  }


  public void setThreedserverTransId(String threedserverTransId) {
    this.threedserverTransId = threedserverTransId;
  }


  public RequestChallenged transno(Integer transno) {
    
    this.transno = transno;
    return this;
  }

   /**
   * The transaction number for the challenge, ordered incrementally from 1 for every merchant_id. 
   * @return transno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "78416", value = "The transaction number for the challenge, ordered incrementally from 1 for every merchant_id. ")

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
    RequestChallenged requestChallenged = (RequestChallenged) o;
    return Objects.equals(this.acsUrl, requestChallenged.acsUrl) &&
        Objects.equals(this.creq, requestChallenged.creq) &&
        Objects.equals(this.merchantid, requestChallenged.merchantid) &&
        Objects.equals(this.threedserverTransId, requestChallenged.threedserverTransId) &&
        Objects.equals(this.transno, requestChallenged.transno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsUrl, creq, merchantid, threedserverTransId, transno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestChallenged {\n");
    sb.append("    acsUrl: ").append(toIndentedString(acsUrl)).append("\n");
    sb.append("    creq: ").append(toIndentedString(creq)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
    sb.append("    threedserverTransId: ").append(toIndentedString(threedserverTransId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("acs_url");
    openapiFields.add("creq");
    openapiFields.add("merchantid");
    openapiFields.add("threedserver_trans_id");
    openapiFields.add("transno");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestChallenged
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RequestChallenged.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestChallenged is not found in the empty JSON string", RequestChallenged.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RequestChallenged.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestChallenged` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("acs_url") != null && !jsonObj.get("acs_url").isJsonNull()) && !jsonObj.get("acs_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acs_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acs_url").toString()));
      }
      if ((jsonObj.get("creq") != null && !jsonObj.get("creq").isJsonNull()) && !jsonObj.get("creq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creq").toString()));
      }
      if ((jsonObj.get("threedserver_trans_id") != null && !jsonObj.get("threedserver_trans_id").isJsonNull()) && !jsonObj.get("threedserver_trans_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threedserver_trans_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threedserver_trans_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestChallenged.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestChallenged' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestChallenged> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestChallenged.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestChallenged>() {
           @Override
           public void write(JsonWriter out, RequestChallenged value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestChallenged read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestChallenged given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestChallenged
  * @throws IOException if the JSON string is invalid with respect to RequestChallenged
  */
  public static RequestChallenged fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestChallenged.class);
  }

 /**
  * Convert an instance of RequestChallenged to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

