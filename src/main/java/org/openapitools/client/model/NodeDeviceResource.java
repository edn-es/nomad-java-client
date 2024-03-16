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
import org.openapitools.client.model.Attribute;
import org.openapitools.client.model.NodeDevice;

/**
 * NodeDeviceResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class NodeDeviceResource {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "Attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Attribute> attributes = null;

  public static final String SERIALIZED_NAME_INSTANCES = "Instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<NodeDevice> instances = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VENDOR = "Vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;


  public NodeDeviceResource attributes(Map<String, Attribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public NodeDeviceResource putAttributesItem(String key, Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Attribute>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Attribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Attribute> attributes) {
    this.attributes = attributes;
  }


  public NodeDeviceResource instances(List<NodeDevice> instances) {
    
    this.instances = instances;
    return this;
  }

  public NodeDeviceResource addInstancesItem(NodeDevice instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<NodeDevice>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NodeDevice> getInstances() {
    return instances;
  }


  public void setInstances(List<NodeDevice> instances) {
    this.instances = instances;
  }


  public NodeDeviceResource name(String name) {
    
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


  public NodeDeviceResource type(String type) {
    
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


  public NodeDeviceResource vendor(String vendor) {
    
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDeviceResource nodeDeviceResource = (NodeDeviceResource) o;
    return Objects.equals(this.attributes, nodeDeviceResource.attributes) &&
        Objects.equals(this.instances, nodeDeviceResource.instances) &&
        Objects.equals(this.name, nodeDeviceResource.name) &&
        Objects.equals(this.type, nodeDeviceResource.type) &&
        Objects.equals(this.vendor, nodeDeviceResource.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, instances, name, type, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDeviceResource {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

