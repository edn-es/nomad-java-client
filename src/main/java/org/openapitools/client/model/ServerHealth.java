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
import org.threeten.bp.OffsetDateTime;

/**
 * ServerHealth
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class ServerHealth {
  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_HEALTHY = "Healthy";
  @SerializedName(SERIALIZED_NAME_HEALTHY)
  private Boolean healthy;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_LAST_CONTACT = "LastContact";
  @SerializedName(SERIALIZED_NAME_LAST_CONTACT)
  private Long lastContact;

  public static final String SERIALIZED_NAME_LAST_INDEX = "LastIndex";
  @SerializedName(SERIALIZED_NAME_LAST_INDEX)
  private Integer lastIndex;

  public static final String SERIALIZED_NAME_LAST_TERM = "LastTerm";
  @SerializedName(SERIALIZED_NAME_LAST_TERM)
  private Integer lastTerm;

  public static final String SERIALIZED_NAME_LEADER = "Leader";
  @SerializedName(SERIALIZED_NAME_LEADER)
  private Boolean leader;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SERF_STATUS = "SerfStatus";
  @SerializedName(SERIALIZED_NAME_SERF_STATUS)
  private String serfStatus;

  public static final String SERIALIZED_NAME_STABLE_SINCE = "StableSince";
  @SerializedName(SERIALIZED_NAME_STABLE_SINCE)
  private OffsetDateTime stableSince;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VOTER = "Voter";
  @SerializedName(SERIALIZED_NAME_VOTER)
  private Boolean voter;


  public ServerHealth address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ServerHealth healthy(Boolean healthy) {
    
    this.healthy = healthy;
    return this;
  }

   /**
   * Get healthy
   * @return healthy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHealthy() {
    return healthy;
  }


  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  public ServerHealth ID(String ID) {
    
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


  public ServerHealth lastContact(Long lastContact) {
    
    this.lastContact = lastContact;
    return this;
  }

   /**
   * Get lastContact
   * @return lastContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLastContact() {
    return lastContact;
  }


  public void setLastContact(Long lastContact) {
    this.lastContact = lastContact;
  }


  public ServerHealth lastIndex(Integer lastIndex) {
    
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


  public ServerHealth lastTerm(Integer lastTerm) {
    
    this.lastTerm = lastTerm;
    return this;
  }

   /**
   * Get lastTerm
   * minimum: 0
   * maximum: 384
   * @return lastTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastTerm() {
    return lastTerm;
  }


  public void setLastTerm(Integer lastTerm) {
    this.lastTerm = lastTerm;
  }


  public ServerHealth leader(Boolean leader) {
    
    this.leader = leader;
    return this;
  }

   /**
   * Get leader
   * @return leader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLeader() {
    return leader;
  }


  public void setLeader(Boolean leader) {
    this.leader = leader;
  }


  public ServerHealth name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServerHealth serfStatus(String serfStatus) {
    
    this.serfStatus = serfStatus;
    return this;
  }

   /**
   * Get serfStatus
   * @return serfStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerfStatus() {
    return serfStatus;
  }


  public void setSerfStatus(String serfStatus) {
    this.serfStatus = serfStatus;
  }


  public ServerHealth stableSince(OffsetDateTime stableSince) {
    
    this.stableSince = stableSince;
    return this;
  }

   /**
   * Get stableSince
   * @return stableSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStableSince() {
    return stableSince;
  }


  public void setStableSince(OffsetDateTime stableSince) {
    this.stableSince = stableSince;
  }


  public ServerHealth version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ServerHealth voter(Boolean voter) {
    
    this.voter = voter;
    return this;
  }

   /**
   * Get voter
   * @return voter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVoter() {
    return voter;
  }


  public void setVoter(Boolean voter) {
    this.voter = voter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerHealth serverHealth = (ServerHealth) o;
    return Objects.equals(this.address, serverHealth.address) &&
        Objects.equals(this.healthy, serverHealth.healthy) &&
        Objects.equals(this.ID, serverHealth.ID) &&
        Objects.equals(this.lastContact, serverHealth.lastContact) &&
        Objects.equals(this.lastIndex, serverHealth.lastIndex) &&
        Objects.equals(this.lastTerm, serverHealth.lastTerm) &&
        Objects.equals(this.leader, serverHealth.leader) &&
        Objects.equals(this.name, serverHealth.name) &&
        Objects.equals(this.serfStatus, serverHealth.serfStatus) &&
        Objects.equals(this.stableSince, serverHealth.stableSince) &&
        Objects.equals(this.version, serverHealth.version) &&
        Objects.equals(this.voter, serverHealth.voter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, healthy, ID, lastContact, lastIndex, lastTerm, leader, name, serfStatus, stableSince, version, voter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerHealth {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    lastContact: ").append(toIndentedString(lastContact)).append("\n");
    sb.append("    lastIndex: ").append(toIndentedString(lastIndex)).append("\n");
    sb.append("    lastTerm: ").append(toIndentedString(lastTerm)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serfStatus: ").append(toIndentedString(serfStatus)).append("\n");
    sb.append("    stableSince: ").append(toIndentedString(stableSince)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    voter: ").append(toIndentedString(voter)).append("\n");
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

