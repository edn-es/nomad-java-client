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
 * JobStabilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class JobStabilityRequest {
  public static final String SERIALIZED_NAME_JOB_I_D = "JobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private String jobID;

  public static final String SERIALIZED_NAME_JOB_VERSION = "JobVersion";
  @SerializedName(SERIALIZED_NAME_JOB_VERSION)
  private Integer jobVersion;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SECRET_I_D = "SecretID";
  @SerializedName(SERIALIZED_NAME_SECRET_I_D)
  private String secretID;

  public static final String SERIALIZED_NAME_STABLE = "Stable";
  @SerializedName(SERIALIZED_NAME_STABLE)
  private Boolean stable;


  public JobStabilityRequest jobID(String jobID) {
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobID() {
    return jobID;
  }


  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public JobStabilityRequest jobVersion(Integer jobVersion) {
    
    this.jobVersion = jobVersion;
    return this;
  }

   /**
   * Get jobVersion
   * minimum: 0
   * maximum: 384
   * @return jobVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobVersion() {
    return jobVersion;
  }


  public void setJobVersion(Integer jobVersion) {
    this.jobVersion = jobVersion;
  }


  public JobStabilityRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public JobStabilityRequest region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public JobStabilityRequest secretID(String secretID) {
    
    this.secretID = secretID;
    return this;
  }

   /**
   * Get secretID
   * @return secretID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecretID() {
    return secretID;
  }


  public void setSecretID(String secretID) {
    this.secretID = secretID;
  }


  public JobStabilityRequest stable(Boolean stable) {
    
    this.stable = stable;
    return this;
  }

   /**
   * Get stable
   * @return stable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStable() {
    return stable;
  }


  public void setStable(Boolean stable) {
    this.stable = stable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStabilityRequest jobStabilityRequest = (JobStabilityRequest) o;
    return Objects.equals(this.jobID, jobStabilityRequest.jobID) &&
        Objects.equals(this.jobVersion, jobStabilityRequest.jobVersion) &&
        Objects.equals(this.namespace, jobStabilityRequest.namespace) &&
        Objects.equals(this.region, jobStabilityRequest.region) &&
        Objects.equals(this.secretID, jobStabilityRequest.secretID) &&
        Objects.equals(this.stable, jobStabilityRequest.stable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobID, jobVersion, namespace, region, secretID, stable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStabilityRequest {\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    jobVersion: ").append(toIndentedString(jobVersion)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretID: ").append(toIndentedString(secretID)).append("\n");
    sb.append("    stable: ").append(toIndentedString(stable)).append("\n");
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

