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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CSIVolumeExternalStub
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class CSIVolumeExternalStub {
  public static final String SERIALIZED_NAME_CAPACITY_BYTES = "CapacityBytes";
  @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES)
  private Long capacityBytes;

  public static final String SERIALIZED_NAME_CLONE_I_D = "CloneID";
  @SerializedName(SERIALIZED_NAME_CLONE_I_D)
  private String cloneID;

  public static final String SERIALIZED_NAME_EXTERNAL_I_D = "ExternalID";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_I_D)
  private String externalID;

  public static final String SERIALIZED_NAME_IS_ABNORMAL = "IsAbnormal";
  @SerializedName(SERIALIZED_NAME_IS_ABNORMAL)
  private Boolean isAbnormal;

  public static final String SERIALIZED_NAME_PUBLISHED_EXTERNAL_NODE_I_DS = "PublishedExternalNodeIDs";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_EXTERNAL_NODE_I_DS)
  private List<String> publishedExternalNodeIDs = null;

  public static final String SERIALIZED_NAME_SNAPSHOT_I_D = "SnapshotID";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_I_D)
  private String snapshotID;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VOLUME_CONTEXT = "VolumeContext";
  @SerializedName(SERIALIZED_NAME_VOLUME_CONTEXT)
  private Map<String, String> volumeContext = null;


  public CSIVolumeExternalStub capacityBytes(Long capacityBytes) {
    
    this.capacityBytes = capacityBytes;
    return this;
  }

   /**
   * Get capacityBytes
   * @return capacityBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCapacityBytes() {
    return capacityBytes;
  }


  public void setCapacityBytes(Long capacityBytes) {
    this.capacityBytes = capacityBytes;
  }


  public CSIVolumeExternalStub cloneID(String cloneID) {
    
    this.cloneID = cloneID;
    return this;
  }

   /**
   * Get cloneID
   * @return cloneID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCloneID() {
    return cloneID;
  }


  public void setCloneID(String cloneID) {
    this.cloneID = cloneID;
  }


  public CSIVolumeExternalStub externalID(String externalID) {
    
    this.externalID = externalID;
    return this;
  }

   /**
   * Get externalID
   * @return externalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalID() {
    return externalID;
  }


  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }


  public CSIVolumeExternalStub isAbnormal(Boolean isAbnormal) {
    
    this.isAbnormal = isAbnormal;
    return this;
  }

   /**
   * Get isAbnormal
   * @return isAbnormal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAbnormal() {
    return isAbnormal;
  }


  public void setIsAbnormal(Boolean isAbnormal) {
    this.isAbnormal = isAbnormal;
  }


  public CSIVolumeExternalStub publishedExternalNodeIDs(List<String> publishedExternalNodeIDs) {
    
    this.publishedExternalNodeIDs = publishedExternalNodeIDs;
    return this;
  }

  public CSIVolumeExternalStub addPublishedExternalNodeIDsItem(String publishedExternalNodeIDsItem) {
    if (this.publishedExternalNodeIDs == null) {
      this.publishedExternalNodeIDs = new ArrayList<String>();
    }
    this.publishedExternalNodeIDs.add(publishedExternalNodeIDsItem);
    return this;
  }

   /**
   * Get publishedExternalNodeIDs
   * @return publishedExternalNodeIDs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPublishedExternalNodeIDs() {
    return publishedExternalNodeIDs;
  }


  public void setPublishedExternalNodeIDs(List<String> publishedExternalNodeIDs) {
    this.publishedExternalNodeIDs = publishedExternalNodeIDs;
  }


  public CSIVolumeExternalStub snapshotID(String snapshotID) {
    
    this.snapshotID = snapshotID;
    return this;
  }

   /**
   * Get snapshotID
   * @return snapshotID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapshotID() {
    return snapshotID;
  }


  public void setSnapshotID(String snapshotID) {
    this.snapshotID = snapshotID;
  }


  public CSIVolumeExternalStub status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CSIVolumeExternalStub volumeContext(Map<String, String> volumeContext) {
    
    this.volumeContext = volumeContext;
    return this;
  }

  public CSIVolumeExternalStub putVolumeContextItem(String key, String volumeContextItem) {
    if (this.volumeContext == null) {
      this.volumeContext = new HashMap<String, String>();
    }
    this.volumeContext.put(key, volumeContextItem);
    return this;
  }

   /**
   * Get volumeContext
   * @return volumeContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getVolumeContext() {
    return volumeContext;
  }


  public void setVolumeContext(Map<String, String> volumeContext) {
    this.volumeContext = volumeContext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSIVolumeExternalStub csIVolumeExternalStub = (CSIVolumeExternalStub) o;
    return Objects.equals(this.capacityBytes, csIVolumeExternalStub.capacityBytes) &&
        Objects.equals(this.cloneID, csIVolumeExternalStub.cloneID) &&
        Objects.equals(this.externalID, csIVolumeExternalStub.externalID) &&
        Objects.equals(this.isAbnormal, csIVolumeExternalStub.isAbnormal) &&
        Objects.equals(this.publishedExternalNodeIDs, csIVolumeExternalStub.publishedExternalNodeIDs) &&
        Objects.equals(this.snapshotID, csIVolumeExternalStub.snapshotID) &&
        Objects.equals(this.status, csIVolumeExternalStub.status) &&
        Objects.equals(this.volumeContext, csIVolumeExternalStub.volumeContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityBytes, cloneID, externalID, isAbnormal, publishedExternalNodeIDs, snapshotID, status, volumeContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSIVolumeExternalStub {\n");
    sb.append("    capacityBytes: ").append(toIndentedString(capacityBytes)).append("\n");
    sb.append("    cloneID: ").append(toIndentedString(cloneID)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    isAbnormal: ").append(toIndentedString(isAbnormal)).append("\n");
    sb.append("    publishedExternalNodeIDs: ").append(toIndentedString(publishedExternalNodeIDs)).append("\n");
    sb.append("    snapshotID: ").append(toIndentedString(snapshotID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    volumeContext: ").append(toIndentedString(volumeContext)).append("\n");
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
