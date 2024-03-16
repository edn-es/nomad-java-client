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
import org.openapitools.client.model.ConsulGateway;
import org.openapitools.client.model.ConsulSidecarService;
import org.openapitools.client.model.SidecarTask;

/**
 * ConsulConnect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class ConsulConnect {
  public static final String SERIALIZED_NAME_GATEWAY = "Gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private ConsulGateway gateway;

  public static final String SERIALIZED_NAME_NATIVE = "Native";
  @SerializedName(SERIALIZED_NAME_NATIVE)
  private Boolean _native;

  public static final String SERIALIZED_NAME_SIDECAR_SERVICE = "SidecarService";
  @SerializedName(SERIALIZED_NAME_SIDECAR_SERVICE)
  private ConsulSidecarService sidecarService;

  public static final String SERIALIZED_NAME_SIDECAR_TASK = "SidecarTask";
  @SerializedName(SERIALIZED_NAME_SIDECAR_TASK)
  private SidecarTask sidecarTask;


  public ConsulConnect gateway(ConsulGateway gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsulGateway getGateway() {
    return gateway;
  }


  public void setGateway(ConsulGateway gateway) {
    this.gateway = gateway;
  }


  public ConsulConnect _native(Boolean _native) {
    
    this._native = _native;
    return this;
  }

   /**
   * Get _native
   * @return _native
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNative() {
    return _native;
  }


  public void setNative(Boolean _native) {
    this._native = _native;
  }


  public ConsulConnect sidecarService(ConsulSidecarService sidecarService) {
    
    this.sidecarService = sidecarService;
    return this;
  }

   /**
   * Get sidecarService
   * @return sidecarService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsulSidecarService getSidecarService() {
    return sidecarService;
  }


  public void setSidecarService(ConsulSidecarService sidecarService) {
    this.sidecarService = sidecarService;
  }


  public ConsulConnect sidecarTask(SidecarTask sidecarTask) {
    
    this.sidecarTask = sidecarTask;
    return this;
  }

   /**
   * Get sidecarTask
   * @return sidecarTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SidecarTask getSidecarTask() {
    return sidecarTask;
  }


  public void setSidecarTask(SidecarTask sidecarTask) {
    this.sidecarTask = sidecarTask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsulConnect consulConnect = (ConsulConnect) o;
    return Objects.equals(this.gateway, consulConnect.gateway) &&
        Objects.equals(this._native, consulConnect._native) &&
        Objects.equals(this.sidecarService, consulConnect.sidecarService) &&
        Objects.equals(this.sidecarTask, consulConnect.sidecarTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gateway, _native, sidecarService, sidecarTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsulConnect {\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    _native: ").append(toIndentedString(_native)).append("\n");
    sb.append("    sidecarService: ").append(toIndentedString(sidecarService)).append("\n");
    sb.append("    sidecarTask: ").append(toIndentedString(sidecarTask)).append("\n");
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

