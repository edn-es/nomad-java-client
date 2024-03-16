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
import org.openapitools.client.model.FieldDiff;
import org.openapitools.client.model.ObjectDiff;
import org.openapitools.client.model.TaskGroupDiff;

/**
 * JobDiff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class JobDiff {
  public static final String SERIALIZED_NAME_FIELDS = "Fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldDiff> fields = null;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_OBJECTS = "Objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<ObjectDiff> objects = null;

  public static final String SERIALIZED_NAME_TASK_GROUPS = "TaskGroups";
  @SerializedName(SERIALIZED_NAME_TASK_GROUPS)
  private List<TaskGroupDiff> taskGroups = null;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public JobDiff fields(List<FieldDiff> fields) {
    
    this.fields = fields;
    return this;
  }

  public JobDiff addFieldsItem(FieldDiff fieldsItem) {
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


  public JobDiff ID(String ID) {
    
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


  public JobDiff objects(List<ObjectDiff> objects) {
    
    this.objects = objects;
    return this;
  }

  public JobDiff addObjectsItem(ObjectDiff objectsItem) {
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


  public JobDiff taskGroups(List<TaskGroupDiff> taskGroups) {
    
    this.taskGroups = taskGroups;
    return this;
  }

  public JobDiff addTaskGroupsItem(TaskGroupDiff taskGroupsItem) {
    if (this.taskGroups == null) {
      this.taskGroups = new ArrayList<TaskGroupDiff>();
    }
    this.taskGroups.add(taskGroupsItem);
    return this;
  }

   /**
   * Get taskGroups
   * @return taskGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskGroupDiff> getTaskGroups() {
    return taskGroups;
  }


  public void setTaskGroups(List<TaskGroupDiff> taskGroups) {
    this.taskGroups = taskGroups;
  }


  public JobDiff type(String type) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDiff jobDiff = (JobDiff) o;
    return Objects.equals(this.fields, jobDiff.fields) &&
        Objects.equals(this.ID, jobDiff.ID) &&
        Objects.equals(this.objects, jobDiff.objects) &&
        Objects.equals(this.taskGroups, jobDiff.taskGroups) &&
        Objects.equals(this.type, jobDiff.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, ID, objects, taskGroups, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDiff {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    taskGroups: ").append(toIndentedString(taskGroups)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

