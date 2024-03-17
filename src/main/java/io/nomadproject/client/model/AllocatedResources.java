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
import io.nomadproject.client.model.AllocatedSharedResources;
import io.nomadproject.client.model.AllocatedTaskResources;

/**
 * AllocatedResources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class AllocatedResources {
  public static final String SERIALIZED_NAME_SHARED = "Shared";
  @SerializedName(SERIALIZED_NAME_SHARED)
  private AllocatedSharedResources shared;

  public static final String SERIALIZED_NAME_TASKS = "Tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private Map<String, AllocatedTaskResources> tasks = null;


  public AllocatedResources shared(AllocatedSharedResources shared) {
    
    this.shared = shared;
    return this;
  }

   /**
   * Get shared
   * @return shared
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllocatedSharedResources getShared() {
    return shared;
  }


  public void setShared(AllocatedSharedResources shared) {
    this.shared = shared;
  }


  public AllocatedResources tasks(Map<String, AllocatedTaskResources> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public AllocatedResources putTasksItem(String key, AllocatedTaskResources tasksItem) {
    if (this.tasks == null) {
      this.tasks = new HashMap<String, AllocatedTaskResources>();
    }
    this.tasks.put(key, tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, AllocatedTaskResources> getTasks() {
    return tasks;
  }


  public void setTasks(Map<String, AllocatedTaskResources> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatedResources allocatedResources = (AllocatedResources) o;
    return Objects.equals(this.shared, allocatedResources.shared) &&
        Objects.equals(this.tasks, allocatedResources.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shared, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatedResources {\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

