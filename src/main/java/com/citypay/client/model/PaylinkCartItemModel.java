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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * PaylinkCartItemModel
 */
public class PaylinkCartItemModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public PaylinkCartItemModel() {
  }

  public PaylinkCartItemModel amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The net amount of the item. The Paylink Payment Form does not multiply this figure by the value provided by the count value for the cart item, this is principally to avoid rounding errors to introduce discrepancies between the value of the goods charged for and the total amount represented by the collection of cart items.
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public PaylinkCartItemModel brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the item such as Nike.
   * @return brand
  **/
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PaylinkCartItemModel category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the item such as shoes.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public PaylinkCartItemModel count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The count of how many of this item is being purchased, should the cart be editable, this value should be the default count required. The Paylink Payment Form assumes a count of 1 in the event that no value for the count field is provided for a cart item.
   * @return count
  **/
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public PaylinkCartItemModel label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label which describes the item.
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public PaylinkCartItemModel max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * For an editable cart, the maximum number of items that can be purchased, defaults to 5.
   * @return max
  **/
  @javax.annotation.Nullable
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }


  public PaylinkCartItemModel sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The stock control unit value.
   * @return sku
  **/
  @javax.annotation.Nullable
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  public PaylinkCartItemModel variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * The variant field refers to the variant of the cart item to enable similar items to be distinguished according to certain criteria. For example, similar items may be distinguished in terms of size, weight and power. The Paylink Payment Form does not constrain the value of the variant field to a particular set of metrics.
   * @return variant
  **/
  @javax.annotation.Nullable
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkCartItemModel paylinkCartItemModel = (PaylinkCartItemModel) o;
    return Objects.equals(this.amount, paylinkCartItemModel.amount) &&
        Objects.equals(this.brand, paylinkCartItemModel.brand) &&
        Objects.equals(this.category, paylinkCartItemModel.category) &&
        Objects.equals(this.count, paylinkCartItemModel.count) &&
        Objects.equals(this.label, paylinkCartItemModel.label) &&
        Objects.equals(this.max, paylinkCartItemModel.max) &&
        Objects.equals(this.sku, paylinkCartItemModel.sku) &&
        Objects.equals(this.variant, paylinkCartItemModel.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, brand, category, count, label, max, sku, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkCartItemModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("brand");
    openapiFields.add("category");
    openapiFields.add("count");
    openapiFields.add("label");
    openapiFields.add("max");
    openapiFields.add("sku");
    openapiFields.add("variant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaylinkCartItemModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaylinkCartItemModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkCartItemModel is not found in the empty JSON string", PaylinkCartItemModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaylinkCartItemModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaylinkCartItemModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull()) && !jsonObj.get("variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylinkCartItemModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylinkCartItemModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylinkCartItemModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylinkCartItemModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylinkCartItemModel>() {
           @Override
           public void write(JsonWriter out, PaylinkCartItemModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylinkCartItemModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaylinkCartItemModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaylinkCartItemModel
  * @throws IOException if the JSON string is invalid with respect to PaylinkCartItemModel
  */
  public static PaylinkCartItemModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylinkCartItemModel.class);
  }

 /**
  * Convert an instance of PaylinkCartItemModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
