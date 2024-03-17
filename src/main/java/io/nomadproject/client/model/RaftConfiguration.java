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
import org.openapitools.client.model.RaftServer;

/**
 * RaftConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class RaftConfiguration {
  public static final String SERIALIZED_NAME_INDEX = "Index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_SERVERS = "Servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private List<RaftServer> servers = null;


  public RaftConfiguration index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * minimum: 0
   * maximum: 384
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public RaftConfiguration servers(List<RaftServer> servers) {
    
    this.servers = servers;
    return this;
  }

  public RaftConfiguration addServersItem(RaftServer serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<RaftServer>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RaftServer> getServers() {
    return servers;
  }


  public void setServers(List<RaftServer> servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaftConfiguration raftConfiguration = (RaftConfiguration) o;
    return Objects.equals(this.index, raftConfiguration.index) &&
        Objects.equals(this.servers, raftConfiguration.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, servers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaftConfiguration {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
