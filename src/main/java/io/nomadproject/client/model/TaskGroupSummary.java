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


package io.nomadproject.client.model;

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
 * TaskGroupSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class TaskGroupSummary {
  public static final String SERIALIZED_NAME_COMPLETE = "Complete";
  @SerializedName(SERIALIZED_NAME_COMPLETE)
  private Integer complete;

  public static final String SERIALIZED_NAME_FAILED = "Failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_LOST = "Lost";
  @SerializedName(SERIALIZED_NAME_LOST)
  private Integer lost;

  public static final String SERIALIZED_NAME_QUEUED = "Queued";
  @SerializedName(SERIALIZED_NAME_QUEUED)
  private Integer queued;

  public static final String SERIALIZED_NAME_RUNNING = "Running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Integer running;

  public static final String SERIALIZED_NAME_STARTING = "Starting";
  @SerializedName(SERIALIZED_NAME_STARTING)
  private Integer starting;

  public static final String SERIALIZED_NAME_UNKNOWN = "Unknown";
  @SerializedName(SERIALIZED_NAME_UNKNOWN)
  private Integer unknown;


  public TaskGroupSummary complete(Integer complete) {
    
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getComplete() {
    return complete;
  }


  public void setComplete(Integer complete) {
    this.complete = complete;
  }


  public TaskGroupSummary failed(Integer failed) {
    
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailed() {
    return failed;
  }


  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public TaskGroupSummary lost(Integer lost) {
    
    this.lost = lost;
    return this;
  }

   /**
   * Get lost
   * @return lost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLost() {
    return lost;
  }


  public void setLost(Integer lost) {
    this.lost = lost;
  }


  public TaskGroupSummary queued(Integer queued) {
    
    this.queued = queued;
    return this;
  }

   /**
   * Get queued
   * @return queued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQueued() {
    return queued;
  }


  public void setQueued(Integer queued) {
    this.queued = queued;
  }


  public TaskGroupSummary running(Integer running) {
    
    this.running = running;
    return this;
  }

   /**
   * Get running
   * @return running
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunning() {
    return running;
  }


  public void setRunning(Integer running) {
    this.running = running;
  }


  public TaskGroupSummary starting(Integer starting) {
    
    this.starting = starting;
    return this;
  }

   /**
   * Get starting
   * @return starting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStarting() {
    return starting;
  }


  public void setStarting(Integer starting) {
    this.starting = starting;
  }


  public TaskGroupSummary unknown(Integer unknown) {
    
    this.unknown = unknown;
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnknown() {
    return unknown;
  }


  public void setUnknown(Integer unknown) {
    this.unknown = unknown;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskGroupSummary taskGroupSummary = (TaskGroupSummary) o;
    return Objects.equals(this.complete, taskGroupSummary.complete) &&
        Objects.equals(this.failed, taskGroupSummary.failed) &&
        Objects.equals(this.lost, taskGroupSummary.lost) &&
        Objects.equals(this.queued, taskGroupSummary.queued) &&
        Objects.equals(this.running, taskGroupSummary.running) &&
        Objects.equals(this.starting, taskGroupSummary.starting) &&
        Objects.equals(this.unknown, taskGroupSummary.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complete, failed, lost, queued, running, starting, unknown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskGroupSummary {\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    lost: ").append(toIndentedString(lost)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    starting: ").append(toIndentedString(starting)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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
