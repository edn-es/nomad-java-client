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
 * ConsulGatewayTLSConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class ConsulGatewayTLSConfig {
  public static final String SERIALIZED_NAME_CIPHER_SUITES = "CipherSuites";
  @SerializedName(SERIALIZED_NAME_CIPHER_SUITES)
  private List<String> cipherSuites = null;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_TL_S_MAX_VERSION = "TLSMaxVersion";
  @SerializedName(SERIALIZED_NAME_TL_S_MAX_VERSION)
  private String tlSMaxVersion;

  public static final String SERIALIZED_NAME_TL_S_MIN_VERSION = "TLSMinVersion";
  @SerializedName(SERIALIZED_NAME_TL_S_MIN_VERSION)
  private String tlSMinVersion;


  public ConsulGatewayTLSConfig cipherSuites(List<String> cipherSuites) {
    
    this.cipherSuites = cipherSuites;
    return this;
  }

  public ConsulGatewayTLSConfig addCipherSuitesItem(String cipherSuitesItem) {
    if (this.cipherSuites == null) {
      this.cipherSuites = new ArrayList<String>();
    }
    this.cipherSuites.add(cipherSuitesItem);
    return this;
  }

   /**
   * Get cipherSuites
   * @return cipherSuites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCipherSuites() {
    return cipherSuites;
  }


  public void setCipherSuites(List<String> cipherSuites) {
    this.cipherSuites = cipherSuites;
  }


  public ConsulGatewayTLSConfig enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ConsulGatewayTLSConfig tlSMaxVersion(String tlSMaxVersion) {
    
    this.tlSMaxVersion = tlSMaxVersion;
    return this;
  }

   /**
   * Get tlSMaxVersion
   * @return tlSMaxVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTlSMaxVersion() {
    return tlSMaxVersion;
  }


  public void setTlSMaxVersion(String tlSMaxVersion) {
    this.tlSMaxVersion = tlSMaxVersion;
  }


  public ConsulGatewayTLSConfig tlSMinVersion(String tlSMinVersion) {
    
    this.tlSMinVersion = tlSMinVersion;
    return this;
  }

   /**
   * Get tlSMinVersion
   * @return tlSMinVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTlSMinVersion() {
    return tlSMinVersion;
  }


  public void setTlSMinVersion(String tlSMinVersion) {
    this.tlSMinVersion = tlSMinVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsulGatewayTLSConfig consulGatewayTLSConfig = (ConsulGatewayTLSConfig) o;
    return Objects.equals(this.cipherSuites, consulGatewayTLSConfig.cipherSuites) &&
        Objects.equals(this.enabled, consulGatewayTLSConfig.enabled) &&
        Objects.equals(this.tlSMaxVersion, consulGatewayTLSConfig.tlSMaxVersion) &&
        Objects.equals(this.tlSMinVersion, consulGatewayTLSConfig.tlSMinVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cipherSuites, enabled, tlSMaxVersion, tlSMinVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsulGatewayTLSConfig {\n");
    sb.append("    cipherSuites: ").append(toIndentedString(cipherSuites)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    tlSMaxVersion: ").append(toIndentedString(tlSMaxVersion)).append("\n");
    sb.append("    tlSMinVersion: ").append(toIndentedString(tlSMinVersion)).append("\n");
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

