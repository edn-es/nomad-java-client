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
 * TaskCSIPluginConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class TaskCSIPluginConfig {
  public static final String SERIALIZED_NAME_HEALTH_TIMEOUT = "HealthTimeout";
  @SerializedName(SERIALIZED_NAME_HEALTH_TIMEOUT)
  private Long healthTimeout;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_MOUNT_DIR = "MountDir";
  @SerializedName(SERIALIZED_NAME_MOUNT_DIR)
  private String mountDir;

  public static final String SERIALIZED_NAME_STAGE_PUBLISH_BASE_DIR = "StagePublishBaseDir";
  @SerializedName(SERIALIZED_NAME_STAGE_PUBLISH_BASE_DIR)
  private String stagePublishBaseDir;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public TaskCSIPluginConfig healthTimeout(Long healthTimeout) {
    
    this.healthTimeout = healthTimeout;
    return this;
  }

   /**
   * Get healthTimeout
   * @return healthTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHealthTimeout() {
    return healthTimeout;
  }


  public void setHealthTimeout(Long healthTimeout) {
    this.healthTimeout = healthTimeout;
  }


  public TaskCSIPluginConfig ID(String ID) {
    
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


  public TaskCSIPluginConfig mountDir(String mountDir) {
    
    this.mountDir = mountDir;
    return this;
  }

   /**
   * Get mountDir
   * @return mountDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMountDir() {
    return mountDir;
  }


  public void setMountDir(String mountDir) {
    this.mountDir = mountDir;
  }


  public TaskCSIPluginConfig stagePublishBaseDir(String stagePublishBaseDir) {
    
    this.stagePublishBaseDir = stagePublishBaseDir;
    return this;
  }

   /**
   * Get stagePublishBaseDir
   * @return stagePublishBaseDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStagePublishBaseDir() {
    return stagePublishBaseDir;
  }


  public void setStagePublishBaseDir(String stagePublishBaseDir) {
    this.stagePublishBaseDir = stagePublishBaseDir;
  }


  public TaskCSIPluginConfig type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCSIPluginConfig taskCSIPluginConfig = (TaskCSIPluginConfig) o;
    return Objects.equals(this.healthTimeout, taskCSIPluginConfig.healthTimeout) &&
        Objects.equals(this.ID, taskCSIPluginConfig.ID) &&
        Objects.equals(this.mountDir, taskCSIPluginConfig.mountDir) &&
        Objects.equals(this.stagePublishBaseDir, taskCSIPluginConfig.stagePublishBaseDir) &&
        Objects.equals(this.type, taskCSIPluginConfig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthTimeout, ID, mountDir, stagePublishBaseDir, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCSIPluginConfig {\n");
    sb.append("    healthTimeout: ").append(toIndentedString(healthTimeout)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    mountDir: ").append(toIndentedString(mountDir)).append("\n");
    sb.append("    stagePublishBaseDir: ").append(toIndentedString(stagePublishBaseDir)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
