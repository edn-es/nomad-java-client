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
 * Affinity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class Affinity {
  public static final String SERIALIZED_NAME_LTARGET = "LTarget";
  @SerializedName(SERIALIZED_NAME_LTARGET)
  private String ltarget;

  public static final String SERIALIZED_NAME_OPERAND = "Operand";
  @SerializedName(SERIALIZED_NAME_OPERAND)
  private String operand;

  public static final String SERIALIZED_NAME_RTARGET = "RTarget";
  @SerializedName(SERIALIZED_NAME_RTARGET)
  private String rtarget;

  public static final String SERIALIZED_NAME_WEIGHT = "Weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public Affinity ltarget(String ltarget) {
    
    this.ltarget = ltarget;
    return this;
  }

   /**
   * Get ltarget
   * @return ltarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLtarget() {
    return ltarget;
  }


  public void setLtarget(String ltarget) {
    this.ltarget = ltarget;
  }


  public Affinity operand(String operand) {
    
    this.operand = operand;
    return this;
  }

   /**
   * Get operand
   * @return operand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperand() {
    return operand;
  }


  public void setOperand(String operand) {
    this.operand = operand;
  }


  public Affinity rtarget(String rtarget) {
    
    this.rtarget = rtarget;
    return this;
  }

   /**
   * Get rtarget
   * @return rtarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRtarget() {
    return rtarget;
  }


  public void setRtarget(String rtarget) {
    this.rtarget = rtarget;
  }


  public Affinity weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * minimum: -128
   * maximum: 127
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Affinity affinity = (Affinity) o;
    return Objects.equals(this.ltarget, affinity.ltarget) &&
        Objects.equals(this.operand, affinity.operand) &&
        Objects.equals(this.rtarget, affinity.rtarget) &&
        Objects.equals(this.weight, affinity.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ltarget, operand, rtarget, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Affinity {\n");
    sb.append("    ltarget: ").append(toIndentedString(ltarget)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    rtarget: ").append(toIndentedString(rtarget)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

