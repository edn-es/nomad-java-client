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
import java.util.ArrayList;
import java.util.List;
import io.nomadproject.client.model.CSISnapshot;

/**
 * CSISnapshotCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class CSISnapshotCreateRequest {
  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SECRET_I_D = "SecretID";
  @SerializedName(SERIALIZED_NAME_SECRET_I_D)
  private String secretID;

  public static final String SERIALIZED_NAME_SNAPSHOTS = "Snapshots";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS)
  private List<CSISnapshot> snapshots = null;


  public CSISnapshotCreateRequest namespace(String namespace) {
    
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


  public CSISnapshotCreateRequest region(String region) {
    
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


  public CSISnapshotCreateRequest secretID(String secretID) {
    
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


  public CSISnapshotCreateRequest snapshots(List<CSISnapshot> snapshots) {
    
    this.snapshots = snapshots;
    return this;
  }

  public CSISnapshotCreateRequest addSnapshotsItem(CSISnapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<CSISnapshot>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CSISnapshot> getSnapshots() {
    return snapshots;
  }


  public void setSnapshots(List<CSISnapshot> snapshots) {
    this.snapshots = snapshots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSISnapshotCreateRequest csISnapshotCreateRequest = (CSISnapshotCreateRequest) o;
    return Objects.equals(this.namespace, csISnapshotCreateRequest.namespace) &&
        Objects.equals(this.region, csISnapshotCreateRequest.region) &&
        Objects.equals(this.secretID, csISnapshotCreateRequest.secretID) &&
        Objects.equals(this.snapshots, csISnapshotCreateRequest.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, region, secretID, snapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSISnapshotCreateRequest {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretID: ").append(toIndentedString(secretID)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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

