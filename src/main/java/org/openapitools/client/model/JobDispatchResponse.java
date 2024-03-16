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
 * JobDispatchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class JobDispatchResponse {
  public static final String SERIALIZED_NAME_DISPATCHED_JOB_I_D = "DispatchedJobID";
  @SerializedName(SERIALIZED_NAME_DISPATCHED_JOB_I_D)
  private String dispatchedJobID;

  public static final String SERIALIZED_NAME_EVAL_CREATE_INDEX = "EvalCreateIndex";
  @SerializedName(SERIALIZED_NAME_EVAL_CREATE_INDEX)
  private Integer evalCreateIndex;

  public static final String SERIALIZED_NAME_EVAL_I_D = "EvalID";
  @SerializedName(SERIALIZED_NAME_EVAL_I_D)
  private String evalID;

  public static final String SERIALIZED_NAME_JOB_CREATE_INDEX = "JobCreateIndex";
  @SerializedName(SERIALIZED_NAME_JOB_CREATE_INDEX)
  private Integer jobCreateIndex;

  public static final String SERIALIZED_NAME_LAST_INDEX = "LastIndex";
  @SerializedName(SERIALIZED_NAME_LAST_INDEX)
  private Integer lastIndex;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "RequestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private Long requestTime;


  public JobDispatchResponse dispatchedJobID(String dispatchedJobID) {
    
    this.dispatchedJobID = dispatchedJobID;
    return this;
  }

   /**
   * Get dispatchedJobID
   * @return dispatchedJobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDispatchedJobID() {
    return dispatchedJobID;
  }


  public void setDispatchedJobID(String dispatchedJobID) {
    this.dispatchedJobID = dispatchedJobID;
  }


  public JobDispatchResponse evalCreateIndex(Integer evalCreateIndex) {
    
    this.evalCreateIndex = evalCreateIndex;
    return this;
  }

   /**
   * Get evalCreateIndex
   * minimum: 0
   * maximum: 384
   * @return evalCreateIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEvalCreateIndex() {
    return evalCreateIndex;
  }


  public void setEvalCreateIndex(Integer evalCreateIndex) {
    this.evalCreateIndex = evalCreateIndex;
  }


  public JobDispatchResponse evalID(String evalID) {
    
    this.evalID = evalID;
    return this;
  }

   /**
   * Get evalID
   * @return evalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEvalID() {
    return evalID;
  }


  public void setEvalID(String evalID) {
    this.evalID = evalID;
  }


  public JobDispatchResponse jobCreateIndex(Integer jobCreateIndex) {
    
    this.jobCreateIndex = jobCreateIndex;
    return this;
  }

   /**
   * Get jobCreateIndex
   * minimum: 0
   * maximum: 384
   * @return jobCreateIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobCreateIndex() {
    return jobCreateIndex;
  }


  public void setJobCreateIndex(Integer jobCreateIndex) {
    this.jobCreateIndex = jobCreateIndex;
  }


  public JobDispatchResponse lastIndex(Integer lastIndex) {
    
    this.lastIndex = lastIndex;
    return this;
  }

   /**
   * Get lastIndex
   * minimum: 0
   * maximum: 384
   * @return lastIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastIndex() {
    return lastIndex;
  }


  public void setLastIndex(Integer lastIndex) {
    this.lastIndex = lastIndex;
  }


  public JobDispatchResponse requestTime(Long requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Get requestTime
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRequestTime() {
    return requestTime;
  }


  public void setRequestTime(Long requestTime) {
    this.requestTime = requestTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDispatchResponse jobDispatchResponse = (JobDispatchResponse) o;
    return Objects.equals(this.dispatchedJobID, jobDispatchResponse.dispatchedJobID) &&
        Objects.equals(this.evalCreateIndex, jobDispatchResponse.evalCreateIndex) &&
        Objects.equals(this.evalID, jobDispatchResponse.evalID) &&
        Objects.equals(this.jobCreateIndex, jobDispatchResponse.jobCreateIndex) &&
        Objects.equals(this.lastIndex, jobDispatchResponse.lastIndex) &&
        Objects.equals(this.requestTime, jobDispatchResponse.requestTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatchedJobID, evalCreateIndex, evalID, jobCreateIndex, lastIndex, requestTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDispatchResponse {\n");
    sb.append("    dispatchedJobID: ").append(toIndentedString(dispatchedJobID)).append("\n");
    sb.append("    evalCreateIndex: ").append(toIndentedString(evalCreateIndex)).append("\n");
    sb.append("    evalID: ").append(toIndentedString(evalID)).append("\n");
    sb.append("    jobCreateIndex: ").append(toIndentedString(jobCreateIndex)).append("\n");
    sb.append("    lastIndex: ").append(toIndentedString(lastIndex)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
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
