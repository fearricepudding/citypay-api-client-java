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
 * AuthenRequired
 */
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

  public AuthenRequired() {
  }

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
  public boolean equals(Object o) {
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
    openapiFields.add("md");
    openapiFields.add("pareq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenRequired
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthenRequired.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenRequired is not found in the empty JSON string", AuthenRequired.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthenRequired.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenRequired` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("acs_url") != null && !jsonObj.get("acs_url").isJsonNull()) && !jsonObj.get("acs_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acs_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acs_url").toString()));
      }
      if ((jsonObj.get("md") != null && !jsonObj.get("md").isJsonNull()) && !jsonObj.get("md").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md").toString()));
      }
      if ((jsonObj.get("pareq") != null && !jsonObj.get("pareq").isJsonNull()) && !jsonObj.get("pareq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pareq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pareq").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenRequired.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenRequired' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenRequired> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenRequired.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenRequired>() {
           @Override
           public void write(JsonWriter out, AuthenRequired value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenRequired read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthenRequired given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthenRequired
  * @throws IOException if the JSON string is invalid with respect to AuthenRequired
  */
  public static AuthenRequired fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenRequired.class);
  }

 /**
  * Convert an instance of AuthenRequired to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

