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
 * PreemptionConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class PreemptionConfig {
  public static final String SERIALIZED_NAME_BATCH_SCHEDULER_ENABLED = "BatchSchedulerEnabled";
  @SerializedName(SERIALIZED_NAME_BATCH_SCHEDULER_ENABLED)
  private Boolean batchSchedulerEnabled;

  public static final String SERIALIZED_NAME_SERVICE_SCHEDULER_ENABLED = "ServiceSchedulerEnabled";
  @SerializedName(SERIALIZED_NAME_SERVICE_SCHEDULER_ENABLED)
  private Boolean serviceSchedulerEnabled;

  public static final String SERIALIZED_NAME_SYS_BATCH_SCHEDULER_ENABLED = "SysBatchSchedulerEnabled";
  @SerializedName(SERIALIZED_NAME_SYS_BATCH_SCHEDULER_ENABLED)
  private Boolean sysBatchSchedulerEnabled;

  public static final String SERIALIZED_NAME_SYSTEM_SCHEDULER_ENABLED = "SystemSchedulerEnabled";
  @SerializedName(SERIALIZED_NAME_SYSTEM_SCHEDULER_ENABLED)
  private Boolean systemSchedulerEnabled;


  public PreemptionConfig batchSchedulerEnabled(Boolean batchSchedulerEnabled) {
    
    this.batchSchedulerEnabled = batchSchedulerEnabled;
    return this;
  }

   /**
   * Get batchSchedulerEnabled
   * @return batchSchedulerEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBatchSchedulerEnabled() {
    return batchSchedulerEnabled;
  }


  public void setBatchSchedulerEnabled(Boolean batchSchedulerEnabled) {
    this.batchSchedulerEnabled = batchSchedulerEnabled;
  }


  public PreemptionConfig serviceSchedulerEnabled(Boolean serviceSchedulerEnabled) {
    
    this.serviceSchedulerEnabled = serviceSchedulerEnabled;
    return this;
  }

   /**
   * Get serviceSchedulerEnabled
   * @return serviceSchedulerEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getServiceSchedulerEnabled() {
    return serviceSchedulerEnabled;
  }


  public void setServiceSchedulerEnabled(Boolean serviceSchedulerEnabled) {
    this.serviceSchedulerEnabled = serviceSchedulerEnabled;
  }


  public PreemptionConfig sysBatchSchedulerEnabled(Boolean sysBatchSchedulerEnabled) {
    
    this.sysBatchSchedulerEnabled = sysBatchSchedulerEnabled;
    return this;
  }

   /**
   * Get sysBatchSchedulerEnabled
   * @return sysBatchSchedulerEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSysBatchSchedulerEnabled() {
    return sysBatchSchedulerEnabled;
  }


  public void setSysBatchSchedulerEnabled(Boolean sysBatchSchedulerEnabled) {
    this.sysBatchSchedulerEnabled = sysBatchSchedulerEnabled;
  }


  public PreemptionConfig systemSchedulerEnabled(Boolean systemSchedulerEnabled) {
    
    this.systemSchedulerEnabled = systemSchedulerEnabled;
    return this;
  }

   /**
   * Get systemSchedulerEnabled
   * @return systemSchedulerEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSystemSchedulerEnabled() {
    return systemSchedulerEnabled;
  }


  public void setSystemSchedulerEnabled(Boolean systemSchedulerEnabled) {
    this.systemSchedulerEnabled = systemSchedulerEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreemptionConfig preemptionConfig = (PreemptionConfig) o;
    return Objects.equals(this.batchSchedulerEnabled, preemptionConfig.batchSchedulerEnabled) &&
        Objects.equals(this.serviceSchedulerEnabled, preemptionConfig.serviceSchedulerEnabled) &&
        Objects.equals(this.sysBatchSchedulerEnabled, preemptionConfig.sysBatchSchedulerEnabled) &&
        Objects.equals(this.systemSchedulerEnabled, preemptionConfig.systemSchedulerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSchedulerEnabled, serviceSchedulerEnabled, sysBatchSchedulerEnabled, systemSchedulerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreemptionConfig {\n");
    sb.append("    batchSchedulerEnabled: ").append(toIndentedString(batchSchedulerEnabled)).append("\n");
    sb.append("    serviceSchedulerEnabled: ").append(toIndentedString(serviceSchedulerEnabled)).append("\n");
    sb.append("    sysBatchSchedulerEnabled: ").append(toIndentedString(sysBatchSchedulerEnabled)).append("\n");
    sb.append("    systemSchedulerEnabled: ").append(toIndentedString(systemSchedulerEnabled)).append("\n");
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

