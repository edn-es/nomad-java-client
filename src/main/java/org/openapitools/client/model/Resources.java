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
import java.util.List;
import org.openapitools.client.model.NUMAResource;
import org.openapitools.client.model.NetworkResource;
import org.openapitools.client.model.RequestedDevice;

/**
 * Resources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class Resources {
  public static final String SERIALIZED_NAME_C_P_U = "CPU";
  @SerializedName(SERIALIZED_NAME_C_P_U)
  private Integer CPU;

  public static final String SERIALIZED_NAME_CORES = "Cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;

  public static final String SERIALIZED_NAME_DEVICES = "Devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<RequestedDevice> devices = null;

  public static final String SERIALIZED_NAME_DISK_M_B = "DiskMB";
  @SerializedName(SERIALIZED_NAME_DISK_M_B)
  private Integer diskMB;

  public static final String SERIALIZED_NAME_I_O_P_S = "IOPS";
  @SerializedName(SERIALIZED_NAME_I_O_P_S)
  private Integer IOPS;

  public static final String SERIALIZED_NAME_MEMORY_M_B = "MemoryMB";
  @SerializedName(SERIALIZED_NAME_MEMORY_M_B)
  private Integer memoryMB;

  public static final String SERIALIZED_NAME_MEMORY_MAX_M_B = "MemoryMaxMB";
  @SerializedName(SERIALIZED_NAME_MEMORY_MAX_M_B)
  private Integer memoryMaxMB;

  public static final String SERIALIZED_NAME_N_U_M_A = "NUMA";
  @SerializedName(SERIALIZED_NAME_N_U_M_A)
  private NUMAResource NUMA;

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<NetworkResource> networks = null;


  public Resources CPU(Integer CPU) {
    
    this.CPU = CPU;
    return this;
  }

   /**
   * Get CPU
   * @return CPU
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCPU() {
    return CPU;
  }


  public void setCPU(Integer CPU) {
    this.CPU = CPU;
  }


  public Resources cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * Get cores
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public Resources devices(List<RequestedDevice> devices) {
    
    this.devices = devices;
    return this;
  }

  public Resources addDevicesItem(RequestedDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<RequestedDevice>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RequestedDevice> getDevices() {
    return devices;
  }


  public void setDevices(List<RequestedDevice> devices) {
    this.devices = devices;
  }


  public Resources diskMB(Integer diskMB) {
    
    this.diskMB = diskMB;
    return this;
  }

   /**
   * Get diskMB
   * @return diskMB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskMB() {
    return diskMB;
  }


  public void setDiskMB(Integer diskMB) {
    this.diskMB = diskMB;
  }


  public Resources IOPS(Integer IOPS) {
    
    this.IOPS = IOPS;
    return this;
  }

   /**
   * Get IOPS
   * @return IOPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIOPS() {
    return IOPS;
  }


  public void setIOPS(Integer IOPS) {
    this.IOPS = IOPS;
  }


  public Resources memoryMB(Integer memoryMB) {
    
    this.memoryMB = memoryMB;
    return this;
  }

   /**
   * Get memoryMB
   * @return memoryMB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemoryMB() {
    return memoryMB;
  }


  public void setMemoryMB(Integer memoryMB) {
    this.memoryMB = memoryMB;
  }


  public Resources memoryMaxMB(Integer memoryMaxMB) {
    
    this.memoryMaxMB = memoryMaxMB;
    return this;
  }

   /**
   * Get memoryMaxMB
   * @return memoryMaxMB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemoryMaxMB() {
    return memoryMaxMB;
  }


  public void setMemoryMaxMB(Integer memoryMaxMB) {
    this.memoryMaxMB = memoryMaxMB;
  }


  public Resources NUMA(NUMAResource NUMA) {
    
    this.NUMA = NUMA;
    return this;
  }

   /**
   * Get NUMA
   * @return NUMA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NUMAResource getNUMA() {
    return NUMA;
  }


  public void setNUMA(NUMAResource NUMA) {
    this.NUMA = NUMA;
  }


  public Resources networks(List<NetworkResource> networks) {
    
    this.networks = networks;
    return this;
  }

  public Resources addNetworksItem(NetworkResource networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<NetworkResource>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NetworkResource> getNetworks() {
    return networks;
  }


  public void setNetworks(List<NetworkResource> networks) {
    this.networks = networks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resources resources = (Resources) o;
    return Objects.equals(this.CPU, resources.CPU) &&
        Objects.equals(this.cores, resources.cores) &&
        Objects.equals(this.devices, resources.devices) &&
        Objects.equals(this.diskMB, resources.diskMB) &&
        Objects.equals(this.IOPS, resources.IOPS) &&
        Objects.equals(this.memoryMB, resources.memoryMB) &&
        Objects.equals(this.memoryMaxMB, resources.memoryMaxMB) &&
        Objects.equals(this.NUMA, resources.NUMA) &&
        Objects.equals(this.networks, resources.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CPU, cores, devices, diskMB, IOPS, memoryMB, memoryMaxMB, NUMA, networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resources {\n");
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    diskMB: ").append(toIndentedString(diskMB)).append("\n");
    sb.append("    IOPS: ").append(toIndentedString(IOPS)).append("\n");
    sb.append("    memoryMB: ").append(toIndentedString(memoryMB)).append("\n");
    sb.append("    memoryMaxMB: ").append(toIndentedString(memoryMaxMB)).append("\n");
    sb.append("    NUMA: ").append(toIndentedString(NUMA)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

