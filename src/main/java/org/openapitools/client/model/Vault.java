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

/**
 * Vault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class Vault {
  public static final String SERIALIZED_NAME_ALLOW_TOKEN_EXPIRATION = "AllowTokenExpiration";
  @SerializedName(SERIALIZED_NAME_ALLOW_TOKEN_EXPIRATION)
  private Boolean allowTokenExpiration;

  public static final String SERIALIZED_NAME_CHANGE_MODE = "ChangeMode";
  @SerializedName(SERIALIZED_NAME_CHANGE_MODE)
  private String changeMode;

  public static final String SERIALIZED_NAME_CHANGE_SIGNAL = "ChangeSignal";
  @SerializedName(SERIALIZED_NAME_CHANGE_SIGNAL)
  private String changeSignal;

  public static final String SERIALIZED_NAME_CLUSTER = "Cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster;

  public static final String SERIALIZED_NAME_DISABLE_FILE = "DisableFile";
  @SerializedName(SERIALIZED_NAME_DISABLE_FILE)
  private Boolean disableFile;

  public static final String SERIALIZED_NAME_ENV = "Env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private Boolean env;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_POLICIES = "Policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<String> policies = null;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;


  public Vault allowTokenExpiration(Boolean allowTokenExpiration) {
    
    this.allowTokenExpiration = allowTokenExpiration;
    return this;
  }

   /**
   * Get allowTokenExpiration
   * @return allowTokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowTokenExpiration() {
    return allowTokenExpiration;
  }


  public void setAllowTokenExpiration(Boolean allowTokenExpiration) {
    this.allowTokenExpiration = allowTokenExpiration;
  }


  public Vault changeMode(String changeMode) {
    
    this.changeMode = changeMode;
    return this;
  }

   /**
   * Get changeMode
   * @return changeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChangeMode() {
    return changeMode;
  }


  public void setChangeMode(String changeMode) {
    this.changeMode = changeMode;
  }


  public Vault changeSignal(String changeSignal) {
    
    this.changeSignal = changeSignal;
    return this;
  }

   /**
   * Get changeSignal
   * @return changeSignal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChangeSignal() {
    return changeSignal;
  }


  public void setChangeSignal(String changeSignal) {
    this.changeSignal = changeSignal;
  }


  public Vault cluster(String cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCluster() {
    return cluster;
  }


  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public Vault disableFile(Boolean disableFile) {
    
    this.disableFile = disableFile;
    return this;
  }

   /**
   * Get disableFile
   * @return disableFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisableFile() {
    return disableFile;
  }


  public void setDisableFile(Boolean disableFile) {
    this.disableFile = disableFile;
  }


  public Vault env(Boolean env) {
    
    this.env = env;
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnv() {
    return env;
  }


  public void setEnv(Boolean env) {
    this.env = env;
  }


  public Vault namespace(String namespace) {
    
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


  public Vault policies(List<String> policies) {
    
    this.policies = policies;
    return this;
  }

  public Vault addPoliciesItem(String policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<String>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPolicies() {
    return policies;
  }


  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }


  public Vault role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vault vault = (Vault) o;
    return Objects.equals(this.allowTokenExpiration, vault.allowTokenExpiration) &&
        Objects.equals(this.changeMode, vault.changeMode) &&
        Objects.equals(this.changeSignal, vault.changeSignal) &&
        Objects.equals(this.cluster, vault.cluster) &&
        Objects.equals(this.disableFile, vault.disableFile) &&
        Objects.equals(this.env, vault.env) &&
        Objects.equals(this.namespace, vault.namespace) &&
        Objects.equals(this.policies, vault.policies) &&
        Objects.equals(this.role, vault.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowTokenExpiration, changeMode, changeSignal, cluster, disableFile, env, namespace, policies, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vault {\n");
    sb.append("    allowTokenExpiration: ").append(toIndentedString(allowTokenExpiration)).append("\n");
    sb.append("    changeMode: ").append(toIndentedString(changeMode)).append("\n");
    sb.append("    changeSignal: ").append(toIndentedString(changeSignal)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    disableFile: ").append(toIndentedString(disableFile)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

