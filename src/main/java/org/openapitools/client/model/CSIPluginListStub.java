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

/**
 * CSIPluginListStub
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class CSIPluginListStub {
  public static final String SERIALIZED_NAME_CONTROLLER_REQUIRED = "ControllerRequired";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_REQUIRED)
  private Boolean controllerRequired;

  public static final String SERIALIZED_NAME_CONTROLLERS_EXPECTED = "ControllersExpected";
  @SerializedName(SERIALIZED_NAME_CONTROLLERS_EXPECTED)
  private Integer controllersExpected;

  public static final String SERIALIZED_NAME_CONTROLLERS_HEALTHY = "ControllersHealthy";
  @SerializedName(SERIALIZED_NAME_CONTROLLERS_HEALTHY)
  private Integer controllersHealthy;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_MODIFY_INDEX = "ModifyIndex";
  @SerializedName(SERIALIZED_NAME_MODIFY_INDEX)
  private Integer modifyIndex;

  public static final String SERIALIZED_NAME_NODES_EXPECTED = "NodesExpected";
  @SerializedName(SERIALIZED_NAME_NODES_EXPECTED)
  private Integer nodesExpected;

  public static final String SERIALIZED_NAME_NODES_HEALTHY = "NodesHealthy";
  @SerializedName(SERIALIZED_NAME_NODES_HEALTHY)
  private Integer nodesHealthy;

  public static final String SERIALIZED_NAME_PROVIDER = "Provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;


  public CSIPluginListStub controllerRequired(Boolean controllerRequired) {
    
    this.controllerRequired = controllerRequired;
    return this;
  }

   /**
   * Get controllerRequired
   * @return controllerRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getControllerRequired() {
    return controllerRequired;
  }


  public void setControllerRequired(Boolean controllerRequired) {
    this.controllerRequired = controllerRequired;
  }


  public CSIPluginListStub controllersExpected(Integer controllersExpected) {
    
    this.controllersExpected = controllersExpected;
    return this;
  }

   /**
   * Get controllersExpected
   * @return controllersExpected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getControllersExpected() {
    return controllersExpected;
  }


  public void setControllersExpected(Integer controllersExpected) {
    this.controllersExpected = controllersExpected;
  }


  public CSIPluginListStub controllersHealthy(Integer controllersHealthy) {
    
    this.controllersHealthy = controllersHealthy;
    return this;
  }

   /**
   * Get controllersHealthy
   * @return controllersHealthy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getControllersHealthy() {
    return controllersHealthy;
  }


  public void setControllersHealthy(Integer controllersHealthy) {
    this.controllersHealthy = controllersHealthy;
  }


  public CSIPluginListStub createIndex(Integer createIndex) {
    
    this.createIndex = createIndex;
    return this;
  }

   /**
   * Get createIndex
   * minimum: 0
   * maximum: 384
   * @return createIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateIndex() {
    return createIndex;
  }


  public void setCreateIndex(Integer createIndex) {
    this.createIndex = createIndex;
  }


  public CSIPluginListStub ID(String ID) {
    
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public CSIPluginListStub modifyIndex(Integer modifyIndex) {
    
    this.modifyIndex = modifyIndex;
    return this;
  }

   /**
   * Get modifyIndex
   * minimum: 0
   * maximum: 384
   * @return modifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModifyIndex() {
    return modifyIndex;
  }


  public void setModifyIndex(Integer modifyIndex) {
    this.modifyIndex = modifyIndex;
  }


  public CSIPluginListStub nodesExpected(Integer nodesExpected) {
    
    this.nodesExpected = nodesExpected;
    return this;
  }

   /**
   * Get nodesExpected
   * @return nodesExpected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesExpected() {
    return nodesExpected;
  }


  public void setNodesExpected(Integer nodesExpected) {
    this.nodesExpected = nodesExpected;
  }


  public CSIPluginListStub nodesHealthy(Integer nodesHealthy) {
    
    this.nodesHealthy = nodesHealthy;
    return this;
  }

   /**
   * Get nodesHealthy
   * @return nodesHealthy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesHealthy() {
    return nodesHealthy;
  }


  public void setNodesHealthy(Integer nodesHealthy) {
    this.nodesHealthy = nodesHealthy;
  }


  public CSIPluginListStub provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSIPluginListStub csIPluginListStub = (CSIPluginListStub) o;
    return Objects.equals(this.controllerRequired, csIPluginListStub.controllerRequired) &&
        Objects.equals(this.controllersExpected, csIPluginListStub.controllersExpected) &&
        Objects.equals(this.controllersHealthy, csIPluginListStub.controllersHealthy) &&
        Objects.equals(this.createIndex, csIPluginListStub.createIndex) &&
        Objects.equals(this.ID, csIPluginListStub.ID) &&
        Objects.equals(this.modifyIndex, csIPluginListStub.modifyIndex) &&
        Objects.equals(this.nodesExpected, csIPluginListStub.nodesExpected) &&
        Objects.equals(this.nodesHealthy, csIPluginListStub.nodesHealthy) &&
        Objects.equals(this.provider, csIPluginListStub.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRequired, controllersExpected, controllersHealthy, createIndex, ID, modifyIndex, nodesExpected, nodesHealthy, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSIPluginListStub {\n");
    sb.append("    controllerRequired: ").append(toIndentedString(controllerRequired)).append("\n");
    sb.append("    controllersExpected: ").append(toIndentedString(controllersExpected)).append("\n");
    sb.append("    controllersHealthy: ").append(toIndentedString(controllersHealthy)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    modifyIndex: ").append(toIndentedString(modifyIndex)).append("\n");
    sb.append("    nodesExpected: ").append(toIndentedString(nodesExpected)).append("\n");
    sb.append("    nodesHealthy: ").append(toIndentedString(nodesHealthy)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

