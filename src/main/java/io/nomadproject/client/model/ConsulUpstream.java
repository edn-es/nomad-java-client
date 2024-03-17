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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ConsulMeshGateway;

/**
 * ConsulUpstream
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class ConsulUpstream {
  public static final String SERIALIZED_NAME_CONFIG = "Config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Map<String, Object> config = null;

  public static final String SERIALIZED_NAME_DATACENTER = "Datacenter";
  @SerializedName(SERIALIZED_NAME_DATACENTER)
  private String datacenter;

  public static final String SERIALIZED_NAME_DESTINATION_NAME = "DestinationName";
  @SerializedName(SERIALIZED_NAME_DESTINATION_NAME)
  private String destinationName;

  public static final String SERIALIZED_NAME_DESTINATION_NAMESPACE = "DestinationNamespace";
  @SerializedName(SERIALIZED_NAME_DESTINATION_NAMESPACE)
  private String destinationNamespace;

  public static final String SERIALIZED_NAME_DESTINATION_PEER = "DestinationPeer";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PEER)
  private String destinationPeer;

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "DestinationType";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private String destinationType;

  public static final String SERIALIZED_NAME_LOCAL_BIND_ADDRESS = "LocalBindAddress";
  @SerializedName(SERIALIZED_NAME_LOCAL_BIND_ADDRESS)
  private String localBindAddress;

  public static final String SERIALIZED_NAME_LOCAL_BIND_PORT = "LocalBindPort";
  @SerializedName(SERIALIZED_NAME_LOCAL_BIND_PORT)
  private Integer localBindPort;

  public static final String SERIALIZED_NAME_LOCAL_BIND_SOCKET_MODE = "LocalBindSocketMode";
  @SerializedName(SERIALIZED_NAME_LOCAL_BIND_SOCKET_MODE)
  private String localBindSocketMode;

  public static final String SERIALIZED_NAME_LOCAL_BIND_SOCKET_PATH = "LocalBindSocketPath";
  @SerializedName(SERIALIZED_NAME_LOCAL_BIND_SOCKET_PATH)
  private String localBindSocketPath;

  public static final String SERIALIZED_NAME_MESH_GATEWAY = "MeshGateway";
  @SerializedName(SERIALIZED_NAME_MESH_GATEWAY)
  private ConsulMeshGateway meshGateway;


  public ConsulUpstream config(Map<String, Object> config) {
    
    this.config = config;
    return this;
  }

  public ConsulUpstream putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<String, Object>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getConfig() {
    return config;
  }


  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }


  public ConsulUpstream datacenter(String datacenter) {
    
    this.datacenter = datacenter;
    return this;
  }

   /**
   * Get datacenter
   * @return datacenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenter() {
    return datacenter;
  }


  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }


  public ConsulUpstream destinationName(String destinationName) {
    
    this.destinationName = destinationName;
    return this;
  }

   /**
   * Get destinationName
   * @return destinationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationName() {
    return destinationName;
  }


  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }


  public ConsulUpstream destinationNamespace(String destinationNamespace) {
    
    this.destinationNamespace = destinationNamespace;
    return this;
  }

   /**
   * Get destinationNamespace
   * @return destinationNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationNamespace() {
    return destinationNamespace;
  }


  public void setDestinationNamespace(String destinationNamespace) {
    this.destinationNamespace = destinationNamespace;
  }


  public ConsulUpstream destinationPeer(String destinationPeer) {
    
    this.destinationPeer = destinationPeer;
    return this;
  }

   /**
   * Get destinationPeer
   * @return destinationPeer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationPeer() {
    return destinationPeer;
  }


  public void setDestinationPeer(String destinationPeer) {
    this.destinationPeer = destinationPeer;
  }


  public ConsulUpstream destinationType(String destinationType) {
    
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationType() {
    return destinationType;
  }


  public void setDestinationType(String destinationType) {
    this.destinationType = destinationType;
  }


  public ConsulUpstream localBindAddress(String localBindAddress) {
    
    this.localBindAddress = localBindAddress;
    return this;
  }

   /**
   * Get localBindAddress
   * @return localBindAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalBindAddress() {
    return localBindAddress;
  }


  public void setLocalBindAddress(String localBindAddress) {
    this.localBindAddress = localBindAddress;
  }


  public ConsulUpstream localBindPort(Integer localBindPort) {
    
    this.localBindPort = localBindPort;
    return this;
  }

   /**
   * Get localBindPort
   * @return localBindPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLocalBindPort() {
    return localBindPort;
  }


  public void setLocalBindPort(Integer localBindPort) {
    this.localBindPort = localBindPort;
  }


  public ConsulUpstream localBindSocketMode(String localBindSocketMode) {
    
    this.localBindSocketMode = localBindSocketMode;
    return this;
  }

   /**
   * Get localBindSocketMode
   * @return localBindSocketMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalBindSocketMode() {
    return localBindSocketMode;
  }


  public void setLocalBindSocketMode(String localBindSocketMode) {
    this.localBindSocketMode = localBindSocketMode;
  }


  public ConsulUpstream localBindSocketPath(String localBindSocketPath) {
    
    this.localBindSocketPath = localBindSocketPath;
    return this;
  }

   /**
   * Get localBindSocketPath
   * @return localBindSocketPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalBindSocketPath() {
    return localBindSocketPath;
  }


  public void setLocalBindSocketPath(String localBindSocketPath) {
    this.localBindSocketPath = localBindSocketPath;
  }


  public ConsulUpstream meshGateway(ConsulMeshGateway meshGateway) {
    
    this.meshGateway = meshGateway;
    return this;
  }

   /**
   * Get meshGateway
   * @return meshGateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsulMeshGateway getMeshGateway() {
    return meshGateway;
  }


  public void setMeshGateway(ConsulMeshGateway meshGateway) {
    this.meshGateway = meshGateway;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsulUpstream consulUpstream = (ConsulUpstream) o;
    return Objects.equals(this.config, consulUpstream.config) &&
        Objects.equals(this.datacenter, consulUpstream.datacenter) &&
        Objects.equals(this.destinationName, consulUpstream.destinationName) &&
        Objects.equals(this.destinationNamespace, consulUpstream.destinationNamespace) &&
        Objects.equals(this.destinationPeer, consulUpstream.destinationPeer) &&
        Objects.equals(this.destinationType, consulUpstream.destinationType) &&
        Objects.equals(this.localBindAddress, consulUpstream.localBindAddress) &&
        Objects.equals(this.localBindPort, consulUpstream.localBindPort) &&
        Objects.equals(this.localBindSocketMode, consulUpstream.localBindSocketMode) &&
        Objects.equals(this.localBindSocketPath, consulUpstream.localBindSocketPath) &&
        Objects.equals(this.meshGateway, consulUpstream.meshGateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, datacenter, destinationName, destinationNamespace, destinationPeer, destinationType, localBindAddress, localBindPort, localBindSocketMode, localBindSocketPath, meshGateway);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsulUpstream {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    destinationNamespace: ").append(toIndentedString(destinationNamespace)).append("\n");
    sb.append("    destinationPeer: ").append(toIndentedString(destinationPeer)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    localBindAddress: ").append(toIndentedString(localBindAddress)).append("\n");
    sb.append("    localBindPort: ").append(toIndentedString(localBindPort)).append("\n");
    sb.append("    localBindSocketMode: ").append(toIndentedString(localBindSocketMode)).append("\n");
    sb.append("    localBindSocketPath: ").append(toIndentedString(localBindSocketPath)).append("\n");
    sb.append("    meshGateway: ").append(toIndentedString(meshGateway)).append("\n");
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
