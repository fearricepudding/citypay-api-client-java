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
 * TokenisationResponseModel
 */
public class TokenisationResponseModel {
  public static final String SERIALIZED_NAME_AUTHEN_RESULT = "authen_result";
  @SerializedName(SERIALIZED_NAME_AUTHEN_RESULT)
  private String authenResult;

  public static final String SERIALIZED_NAME_BIN_COMMERCIAL = "bin_commercial";
  @SerializedName(SERIALIZED_NAME_BIN_COMMERCIAL)
  private Boolean binCommercial;

  public static final String SERIALIZED_NAME_BIN_DEBIT = "bin_debit";
  @SerializedName(SERIALIZED_NAME_BIN_DEBIT)
  private Boolean binDebit;

  public static final String SERIALIZED_NAME_BIN_DESCRIPTION = "bin_description";
  @SerializedName(SERIALIZED_NAME_BIN_DESCRIPTION)
  private String binDescription;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_MASKEDPAN = "maskedpan";
  @SerializedName(SERIALIZED_NAME_MASKEDPAN)
  private String maskedpan;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_SIG_ID = "sig_id";
  @SerializedName(SERIALIZED_NAME_SIG_ID)
  private String sigId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public TokenisationResponseModel() {
  }

  public TokenisationResponseModel authenResult(String authenResult) {
    
    this.authenResult = authenResult;
    return this;
  }

   /**
   * The result of any authentication using 3d_secure authorisation against ecommerce transactions. Values are:  &lt;table&gt; &lt;tr&gt; &lt;th&gt;Value&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;Y&lt;/td&gt; &lt;td&gt;Authentication Successful. The Cardholder&#39;s password was successfully validated.&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;N&lt;/td&gt; &lt;td&gt;Authentication Failed. Customer failed or cancelled authentication, transaction denied.&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;A&lt;/td&gt; &lt;td&gt;Attempts Processing Performed Authentication could not be completed but a proof of authentication attempt (CAVV) was generated.&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;U&lt;/td&gt; &lt;td&gt;Authentication Could Not Be Performed Authentication could not be completed, due to technical or other problem.&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt; 
   * @return authenResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The result of any authentication using 3d_secure authorisation against ecommerce transactions. Values are:  <table> <tr> <th>Value</th> <th>Description</th> </tr> <tr> <td>Y</td> <td>Authentication Successful. The Cardholder's password was successfully validated.</td> </tr> <tr> <td>N</td> <td>Authentication Failed. Customer failed or cancelled authentication, transaction denied.</td> </tr> <tr> <td>A</td> <td>Attempts Processing Performed Authentication could not be completed but a proof of authentication attempt (CAVV) was generated.</td> </tr> <tr> <td>U</td> <td>Authentication Could Not Be Performed Authentication could not be completed, due to technical or other problem.</td> </tr> </table> ")

  public String getAuthenResult() {
    return authenResult;
  }


  public void setAuthenResult(String authenResult) {
    this.authenResult = authenResult;
  }


  public TokenisationResponseModel binCommercial(Boolean binCommercial) {
    
    this.binCommercial = binCommercial;
    return this;
  }

   /**
   * Determines whether the bin range was found to be a commercial or business card.
   * @return binCommercial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the bin range was found to be a commercial or business card.")

  public Boolean isBinCommercial() {
    return binCommercial;
  }


  public void setBinCommercial(Boolean binCommercial) {
    this.binCommercial = binCommercial;
  }


  public TokenisationResponseModel binDebit(Boolean binDebit) {
    
    this.binDebit = binDebit;
    return this;
  }

   /**
   * Determines whether the bin range was found to be a debit card. If false the card was considered as a credit card.
   * @return binDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the bin range was found to be a debit card. If false the card was considered as a credit card.")

  public Boolean isBinDebit() {
    return binDebit;
  }


  public void setBinDebit(Boolean binDebit) {
    this.binDebit = binDebit;
  }


  public TokenisationResponseModel binDescription(String binDescription) {
    
    this.binDescription = binDescription;
    return this;
  }

   /**
   * A description of the bin range found for the card.
   * @return binDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Platinum Card", value = "A description of the bin range found for the card.")

  public String getBinDescription() {
    return binDescription;
  }


  public void setBinDescription(String binDescription) {
    this.binDescription = binDescription;
  }


  public TokenisationResponseModel eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * An Electronic Commerce Indicator (ECI) used to identify the result of authentication using 3DSecure. 
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An Electronic Commerce Indicator (ECI) used to identify the result of authentication using 3DSecure. ")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public TokenisationResponseModel identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier provided within the request.
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95b857a1-5955-4b86-963c-5a6dbfc4fb95", value = "The identifier provided within the request.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public TokenisationResponseModel maskedpan(String maskedpan) {
    
    this.maskedpan = maskedpan;
    return this;
  }

   /**
   * A masked value of the card number used for processing displaying limited values that can be used on a receipt. 
   * @return maskedpan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4***********0002", value = "A masked value of the card number used for processing displaying limited values that can be used on a receipt. ")

  public String getMaskedpan() {
    return maskedpan;
  }


  public void setMaskedpan(String maskedpan) {
    this.maskedpan = maskedpan;
  }


  public TokenisationResponseModel scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * A name of the card scheme of the transaction that processed the transaction such as Visa or MasterCard. 
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Visa", value = "A name of the card scheme of the transaction that processed the transaction such as Visa or MasterCard. ")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public TokenisationResponseModel sigId(String sigId) {
    
    this.sigId = sigId;
    return this;
  }

   /**
   * A Base58 encoded SHA-256 digest generated from the token value Base58 decoded and appended with the nonce value UTF-8 decoded.
   * @return sigId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "YWV3ZmF3ZWZhd2VmYXdmMmZhZWYzYWVn", value = "A Base58 encoded SHA-256 digest generated from the token value Base58 decoded and appended with the nonce value UTF-8 decoded.")

  public String getSigId() {
    return sigId;
  }


  public void setSigId(String sigId) {
    this.sigId = sigId;
  }


  public TokenisationResponseModel token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The token used for presentment to authorisation later in the procsesing flow.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ctPCAPyNyCkx3Ry8wGyv8khC3ch2hUSB3Db..Qzr", value = "The token used for presentment to authorisation later in the procsesing flow.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenisationResponseModel tokenisationResponseModel = (TokenisationResponseModel) o;
    return Objects.equals(this.authenResult, tokenisationResponseModel.authenResult) &&
        Objects.equals(this.binCommercial, tokenisationResponseModel.binCommercial) &&
        Objects.equals(this.binDebit, tokenisationResponseModel.binDebit) &&
        Objects.equals(this.binDescription, tokenisationResponseModel.binDescription) &&
        Objects.equals(this.eci, tokenisationResponseModel.eci) &&
        Objects.equals(this.identifier, tokenisationResponseModel.identifier) &&
        Objects.equals(this.maskedpan, tokenisationResponseModel.maskedpan) &&
        Objects.equals(this.scheme, tokenisationResponseModel.scheme) &&
        Objects.equals(this.sigId, tokenisationResponseModel.sigId) &&
        Objects.equals(this.token, tokenisationResponseModel.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenResult, binCommercial, binDebit, binDescription, eci, identifier, maskedpan, scheme, sigId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenisationResponseModel {\n");
    sb.append("    authenResult: ").append(toIndentedString(authenResult)).append("\n");
    sb.append("    binCommercial: ").append(toIndentedString(binCommercial)).append("\n");
    sb.append("    binDebit: ").append(toIndentedString(binDebit)).append("\n");
    sb.append("    binDescription: ").append(toIndentedString(binDescription)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    maskedpan: ").append(toIndentedString(maskedpan)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    sigId: ").append(toIndentedString(sigId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("authen_result");
    openapiFields.add("bin_commercial");
    openapiFields.add("bin_debit");
    openapiFields.add("bin_description");
    openapiFields.add("eci");
    openapiFields.add("identifier");
    openapiFields.add("maskedpan");
    openapiFields.add("scheme");
    openapiFields.add("sig_id");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenisationResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TokenisationResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenisationResponseModel is not found in the empty JSON string", TokenisationResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokenisationResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenisationResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("authen_result") != null && !jsonObj.get("authen_result").isJsonNull()) && !jsonObj.get("authen_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authen_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authen_result").toString()));
      }
      if ((jsonObj.get("bin_description") != null && !jsonObj.get("bin_description").isJsonNull()) && !jsonObj.get("bin_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin_description").toString()));
      }
      if ((jsonObj.get("eci") != null && !jsonObj.get("eci").isJsonNull()) && !jsonObj.get("eci").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eci` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eci").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("maskedpan") != null && !jsonObj.get("maskedpan").isJsonNull()) && !jsonObj.get("maskedpan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedpan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedpan").toString()));
      }
      if ((jsonObj.get("scheme") != null && !jsonObj.get("scheme").isJsonNull()) && !jsonObj.get("scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }
      if ((jsonObj.get("sig_id") != null && !jsonObj.get("sig_id").isJsonNull()) && !jsonObj.get("sig_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sig_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sig_id").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenisationResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenisationResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenisationResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenisationResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenisationResponseModel>() {
           @Override
           public void write(JsonWriter out, TokenisationResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenisationResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenisationResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenisationResponseModel
  * @throws IOException if the JSON string is invalid with respect to TokenisationResponseModel
  */
  public static TokenisationResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenisationResponseModel.class);
  }

 /**
  * Convert an instance of TokenisationResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

