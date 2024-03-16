/*
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7.6
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * NamespaceVaultConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class NamespaceVaultConfiguration {
  public static final String SERIALIZED_NAME_ALLOWED = "Allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private List<String> allowed = null;

  public static final String SERIALIZED_NAME_DEFAULT = "Default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private String _default;

  public static final String SERIALIZED_NAME_DENIED = "Denied";
  @SerializedName(SERIALIZED_NAME_DENIED)
  private List<String> denied = null;


  public NamespaceVaultConfiguration allowed(List<String> allowed) {
    
    this.allowed = allowed;
    return this;
  }

  public NamespaceVaultConfiguration addAllowedItem(String allowedItem) {
    if (this.allowed == null) {
      this.allowed = new ArrayList<String>();
    }
    this.allowed.add(allowedItem);
    return this;
  }

   /**
   * Get allowed
   * @return allowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowed() {
    return allowed;
  }


  public void setAllowed(List<String> allowed) {
    this.allowed = allowed;
  }


  public NamespaceVaultConfiguration _default(String _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefault() {
    return _default;
  }


  public void setDefault(String _default) {
    this._default = _default;
  }


  public NamespaceVaultConfiguration denied(List<String> denied) {
    
    this.denied = denied;
    return this;
  }

  public NamespaceVaultConfiguration addDeniedItem(String deniedItem) {
    if (this.denied == null) {
      this.denied = new ArrayList<String>();
    }
    this.denied.add(deniedItem);
    return this;
  }

   /**
   * Get denied
   * @return denied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDenied() {
    return denied;
  }


  public void setDenied(List<String> denied) {
    this.denied = denied;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceVaultConfiguration namespaceVaultConfiguration = (NamespaceVaultConfiguration) o;
    return Objects.equals(this.allowed, namespaceVaultConfiguration.allowed) &&
        Objects.equals(this._default, namespaceVaultConfiguration._default) &&
        Objects.equals(this.denied, namespaceVaultConfiguration.denied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, _default, denied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceVaultConfiguration {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    denied: ").append(toIndentedString(denied)).append("\n");
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

