/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api.model;

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

/**
 * LoginInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LoginInformation {
  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access_key_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_SECRET_ACCESS_KEY = "secret_access_key";
  @SerializedName(SERIALIZED_NAME_SECRET_ACCESS_KEY)
  private String secretAccessKey;


  public LoginInformation accessKeyId(String accessKeyId) {
    
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * Get accessKeyId
   * @return accessKeyId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAccessKeyId() {
    return accessKeyId;
  }


  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public LoginInformation secretAccessKey(String secretAccessKey) {
    
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * Get secretAccessKey
   * @return secretAccessKey
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSecretAccessKey() {
    return secretAccessKey;
  }


  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInformation loginInformation = (LoginInformation) o;
    return Objects.equals(this.accessKeyId, loginInformation.accessKeyId) &&
        Objects.equals(this.secretAccessKey, loginInformation.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInformation {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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

