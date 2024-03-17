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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.nomadproject.client.model.FieldDiff;
import io.nomadproject.client.model.ObjectDiff;
import io.nomadproject.client.model.TaskDiff;

/**
 * TaskGroupDiff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class TaskGroupDiff {
  public static final String SERIALIZED_NAME_FIELDS = "Fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldDiff> fields = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECTS = "Objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<ObjectDiff> objects = null;

  public static final String SERIALIZED_NAME_TASKS = "Tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<TaskDiff> tasks = null;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UPDATES = "Updates";
  @SerializedName(SERIALIZED_NAME_UPDATES)
  private Map<String, Integer> updates = null;


  public TaskGroupDiff fields(List<FieldDiff> fields) {
    
    this.fields = fields;
    return this;
  }

  public TaskGroupDiff addFieldsItem(FieldDiff fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldDiff>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FieldDiff> getFields() {
    return fields;
  }


  public void setFields(List<FieldDiff> fields) {
    this.fields = fields;
  }


  public TaskGroupDiff name(String name) {
    
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


  public TaskGroupDiff objects(List<ObjectDiff> objects) {
    
    this.objects = objects;
    return this;
  }

  public TaskGroupDiff addObjectsItem(ObjectDiff objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<ObjectDiff>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ObjectDiff> getObjects() {
    return objects;
  }


  public void setObjects(List<ObjectDiff> objects) {
    this.objects = objects;
  }


  public TaskGroupDiff tasks(List<TaskDiff> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public TaskGroupDiff addTasksItem(TaskDiff tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskDiff>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskDiff> getTasks() {
    return tasks;
  }


  public void setTasks(List<TaskDiff> tasks) {
    this.tasks = tasks;
  }


  public TaskGroupDiff type(String type) {
    
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


  public TaskGroupDiff updates(Map<String, Integer> updates) {
    
    this.updates = updates;
    return this;
  }

  public TaskGroupDiff putUpdatesItem(String key, Integer updatesItem) {
    if (this.updates == null) {
      this.updates = new HashMap<String, Integer>();
    }
    this.updates.put(key, updatesItem);
    return this;
  }

   /**
   * Get updates
   * @return updates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getUpdates() {
    return updates;
  }


  public void setUpdates(Map<String, Integer> updates) {
    this.updates = updates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskGroupDiff taskGroupDiff = (TaskGroupDiff) o;
    return Objects.equals(this.fields, taskGroupDiff.fields) &&
        Objects.equals(this.name, taskGroupDiff.name) &&
        Objects.equals(this.objects, taskGroupDiff.objects) &&
        Objects.equals(this.tasks, taskGroupDiff.tasks) &&
        Objects.equals(this.type, taskGroupDiff.type) &&
        Objects.equals(this.updates, taskGroupDiff.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, name, objects, tasks, type, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskGroupDiff {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

