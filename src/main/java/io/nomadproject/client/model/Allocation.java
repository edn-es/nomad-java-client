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
import io.nomadproject.client.model.AllocDeploymentStatus;
import io.nomadproject.client.model.AllocNetworkStatus;
import io.nomadproject.client.model.AllocatedResources;
import io.nomadproject.client.model.AllocationMetric;
import io.nomadproject.client.model.DesiredTransition;
import io.nomadproject.client.model.Job;
import io.nomadproject.client.model.RescheduleTracker;
import io.nomadproject.client.model.Resources;
import io.nomadproject.client.model.TaskState;

/**
 * Allocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class Allocation {
  public static final String SERIALIZED_NAME_ALLOC_MODIFY_INDEX = "AllocModifyIndex";
  @SerializedName(SERIALIZED_NAME_ALLOC_MODIFY_INDEX)
  private Integer allocModifyIndex;

  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCES = "AllocatedResources";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCES)
  private AllocatedResources allocatedResources;

  public static final String SERIALIZED_NAME_CLIENT_DESCRIPTION = "ClientDescription";
  @SerializedName(SERIALIZED_NAME_CLIENT_DESCRIPTION)
  private String clientDescription;

  public static final String SERIALIZED_NAME_CLIENT_STATUS = "ClientStatus";
  @SerializedName(SERIALIZED_NAME_CLIENT_STATUS)
  private String clientStatus;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_CREATE_TIME = "CreateTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime;

  public static final String SERIALIZED_NAME_DEPLOYMENT_I_D = "DeploymentID";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_I_D)
  private String deploymentID;

  public static final String SERIALIZED_NAME_DEPLOYMENT_STATUS = "DeploymentStatus";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_STATUS)
  private AllocDeploymentStatus deploymentStatus;

  public static final String SERIALIZED_NAME_DESIRED_DESCRIPTION = "DesiredDescription";
  @SerializedName(SERIALIZED_NAME_DESIRED_DESCRIPTION)
  private String desiredDescription;

  public static final String SERIALIZED_NAME_DESIRED_STATUS = "DesiredStatus";
  @SerializedName(SERIALIZED_NAME_DESIRED_STATUS)
  private String desiredStatus;

  public static final String SERIALIZED_NAME_DESIRED_TRANSITION = "DesiredTransition";
  @SerializedName(SERIALIZED_NAME_DESIRED_TRANSITION)
  private DesiredTransition desiredTransition;

  public static final String SERIALIZED_NAME_EVAL_I_D = "EvalID";
  @SerializedName(SERIALIZED_NAME_EVAL_I_D)
  private String evalID;

  public static final String SERIALIZED_NAME_FOLLOWUP_EVAL_I_D = "FollowupEvalID";
  @SerializedName(SERIALIZED_NAME_FOLLOWUP_EVAL_I_D)
  private String followupEvalID;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_JOB = "Job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private Job job;

  public static final String SERIALIZED_NAME_JOB_I_D = "JobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private String jobID;

  public static final String SERIALIZED_NAME_METRICS = "Metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private AllocationMetric metrics;

  public static final String SERIALIZED_NAME_MODIFY_INDEX = "ModifyIndex";
  @SerializedName(SERIALIZED_NAME_MODIFY_INDEX)
  private Integer modifyIndex;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "ModifyTime";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private Long modifyTime;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NETWORK_STATUS = "NetworkStatus";
  @SerializedName(SERIALIZED_NAME_NETWORK_STATUS)
  private AllocNetworkStatus networkStatus;

  public static final String SERIALIZED_NAME_NEXT_ALLOCATION = "NextAllocation";
  @SerializedName(SERIALIZED_NAME_NEXT_ALLOCATION)
  private String nextAllocation;

  public static final String SERIALIZED_NAME_NODE_I_D = "NodeID";
  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private String nodeID;

  public static final String SERIALIZED_NAME_NODE_NAME = "NodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_PREEMPTED_ALLOCATIONS = "PreemptedAllocations";
  @SerializedName(SERIALIZED_NAME_PREEMPTED_ALLOCATIONS)
  private List<String> preemptedAllocations = null;

  public static final String SERIALIZED_NAME_PREEMPTED_BY_ALLOCATION = "PreemptedByAllocation";
  @SerializedName(SERIALIZED_NAME_PREEMPTED_BY_ALLOCATION)
  private String preemptedByAllocation;

  public static final String SERIALIZED_NAME_PREVIOUS_ALLOCATION = "PreviousAllocation";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_ALLOCATION)
  private String previousAllocation;

  public static final String SERIALIZED_NAME_RESCHEDULE_TRACKER = "RescheduleTracker";
  @SerializedName(SERIALIZED_NAME_RESCHEDULE_TRACKER)
  private RescheduleTracker rescheduleTracker;

  public static final String SERIALIZED_NAME_RESOURCES = "Resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Resources resources;

  public static final String SERIALIZED_NAME_SERVICES = "Services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private Map<String, String> services = null;

  public static final String SERIALIZED_NAME_TASK_GROUP = "TaskGroup";
  @SerializedName(SERIALIZED_NAME_TASK_GROUP)
  private String taskGroup;

  public static final String SERIALIZED_NAME_TASK_RESOURCES = "TaskResources";
  @SerializedName(SERIALIZED_NAME_TASK_RESOURCES)
  private Map<String, Resources> taskResources = null;

  public static final String SERIALIZED_NAME_TASK_STATES = "TaskStates";
  @SerializedName(SERIALIZED_NAME_TASK_STATES)
  private Map<String, TaskState> taskStates = null;


  public Allocation allocModifyIndex(Integer allocModifyIndex) {
    
    this.allocModifyIndex = allocModifyIndex;
    return this;
  }

   /**
   * Get allocModifyIndex
   * minimum: 0
   * maximum: 384
   * @return allocModifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocModifyIndex() {
    return allocModifyIndex;
  }


  public void setAllocModifyIndex(Integer allocModifyIndex) {
    this.allocModifyIndex = allocModifyIndex;
  }


  public Allocation allocatedResources(AllocatedResources allocatedResources) {
    
    this.allocatedResources = allocatedResources;
    return this;
  }

   /**
   * Get allocatedResources
   * @return allocatedResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllocatedResources getAllocatedResources() {
    return allocatedResources;
  }


  public void setAllocatedResources(AllocatedResources allocatedResources) {
    this.allocatedResources = allocatedResources;
  }


  public Allocation clientDescription(String clientDescription) {
    
    this.clientDescription = clientDescription;
    return this;
  }

   /**
   * Get clientDescription
   * @return clientDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientDescription() {
    return clientDescription;
  }


  public void setClientDescription(String clientDescription) {
    this.clientDescription = clientDescription;
  }


  public Allocation clientStatus(String clientStatus) {
    
    this.clientStatus = clientStatus;
    return this;
  }

   /**
   * Get clientStatus
   * @return clientStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientStatus() {
    return clientStatus;
  }


  public void setClientStatus(String clientStatus) {
    this.clientStatus = clientStatus;
  }


  public Allocation createIndex(Integer createIndex) {
    
    this.createIndex = createIndex;
    return this;
  }

   /**
   * Get createIndex
   * minimum: 0
   * maximum: 384
   * @return createIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateIndex() {
    return createIndex;
  }


  public void setCreateIndex(Integer createIndex) {
    this.createIndex = createIndex;
  }


  public Allocation createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public Allocation deploymentID(String deploymentID) {
    
    this.deploymentID = deploymentID;
    return this;
  }

   /**
   * Get deploymentID
   * @return deploymentID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentID() {
    return deploymentID;
  }


  public void setDeploymentID(String deploymentID) {
    this.deploymentID = deploymentID;
  }


  public Allocation deploymentStatus(AllocDeploymentStatus deploymentStatus) {
    
    this.deploymentStatus = deploymentStatus;
    return this;
  }

   /**
   * Get deploymentStatus
   * @return deploymentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllocDeploymentStatus getDeploymentStatus() {
    return deploymentStatus;
  }


  public void setDeploymentStatus(AllocDeploymentStatus deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
  }


  public Allocation desiredDescription(String desiredDescription) {
    
    this.desiredDescription = desiredDescription;
    return this;
  }

   /**
   * Get desiredDescription
   * @return desiredDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDesiredDescription() {
    return desiredDescription;
  }


  public void setDesiredDescription(String desiredDescription) {
    this.desiredDescription = desiredDescription;
  }


  public Allocation desiredStatus(String desiredStatus) {
    
    this.desiredStatus = desiredStatus;
    return this;
  }

   /**
   * Get desiredStatus
   * @return desiredStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDesiredStatus() {
    return desiredStatus;
  }


  public void setDesiredStatus(String desiredStatus) {
    this.desiredStatus = desiredStatus;
  }


  public Allocation desiredTransition(DesiredTransition desiredTransition) {
    
    this.desiredTransition = desiredTransition;
    return this;
  }

   /**
   * Get desiredTransition
   * @return desiredTransition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DesiredTransition getDesiredTransition() {
    return desiredTransition;
  }


  public void setDesiredTransition(DesiredTransition desiredTransition) {
    this.desiredTransition = desiredTransition;
  }


  public Allocation evalID(String evalID) {
    
    this.evalID = evalID;
    return this;
  }

   /**
   * Get evalID
   * @return evalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEvalID() {
    return evalID;
  }


  public void setEvalID(String evalID) {
    this.evalID = evalID;
  }


  public Allocation followupEvalID(String followupEvalID) {
    
    this.followupEvalID = followupEvalID;
    return this;
  }

   /**
   * Get followupEvalID
   * @return followupEvalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFollowupEvalID() {
    return followupEvalID;
  }


  public void setFollowupEvalID(String followupEvalID) {
    this.followupEvalID = followupEvalID;
  }


  public Allocation ID(String ID) {
    
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


  public Allocation job(Job job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Job getJob() {
    return job;
  }


  public void setJob(Job job) {
    this.job = job;
  }


  public Allocation jobID(String jobID) {
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobID() {
    return jobID;
  }


  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public Allocation metrics(AllocationMetric metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllocationMetric getMetrics() {
    return metrics;
  }


  public void setMetrics(AllocationMetric metrics) {
    this.metrics = metrics;
  }


  public Allocation modifyIndex(Integer modifyIndex) {
    
    this.modifyIndex = modifyIndex;
    return this;
  }

   /**
   * Get modifyIndex
   * minimum: 0
   * maximum: 384
   * @return modifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModifyIndex() {
    return modifyIndex;
  }


  public void setModifyIndex(Integer modifyIndex) {
    this.modifyIndex = modifyIndex;
  }


  public Allocation modifyTime(Long modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * Get modifyTime
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(Long modifyTime) {
    this.modifyTime = modifyTime;
  }


  public Allocation name(String name) {
    
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


  public Allocation namespace(String namespace) {
    
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


  public Allocation networkStatus(AllocNetworkStatus networkStatus) {
    
    this.networkStatus = networkStatus;
    return this;
  }

   /**
   * Get networkStatus
   * @return networkStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllocNetworkStatus getNetworkStatus() {
    return networkStatus;
  }


  public void setNetworkStatus(AllocNetworkStatus networkStatus) {
    this.networkStatus = networkStatus;
  }


  public Allocation nextAllocation(String nextAllocation) {
    
    this.nextAllocation = nextAllocation;
    return this;
  }

   /**
   * Get nextAllocation
   * @return nextAllocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextAllocation() {
    return nextAllocation;
  }


  public void setNextAllocation(String nextAllocation) {
    this.nextAllocation = nextAllocation;
  }


  public Allocation nodeID(String nodeID) {
    
    this.nodeID = nodeID;
    return this;
  }

   /**
   * Get nodeID
   * @return nodeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeID() {
    return nodeID;
  }


  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }


  public Allocation nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public Allocation preemptedAllocations(List<String> preemptedAllocations) {
    
    this.preemptedAllocations = preemptedAllocations;
    return this;
  }

  public Allocation addPreemptedAllocationsItem(String preemptedAllocationsItem) {
    if (this.preemptedAllocations == null) {
      this.preemptedAllocations = new ArrayList<String>();
    }
    this.preemptedAllocations.add(preemptedAllocationsItem);
    return this;
  }

   /**
   * Get preemptedAllocations
   * @return preemptedAllocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPreemptedAllocations() {
    return preemptedAllocations;
  }


  public void setPreemptedAllocations(List<String> preemptedAllocations) {
    this.preemptedAllocations = preemptedAllocations;
  }


  public Allocation preemptedByAllocation(String preemptedByAllocation) {
    
    this.preemptedByAllocation = preemptedByAllocation;
    return this;
  }

   /**
   * Get preemptedByAllocation
   * @return preemptedByAllocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreemptedByAllocation() {
    return preemptedByAllocation;
  }


  public void setPreemptedByAllocation(String preemptedByAllocation) {
    this.preemptedByAllocation = preemptedByAllocation;
  }


  public Allocation previousAllocation(String previousAllocation) {
    
    this.previousAllocation = previousAllocation;
    return this;
  }

   /**
   * Get previousAllocation
   * @return previousAllocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviousAllocation() {
    return previousAllocation;
  }


  public void setPreviousAllocation(String previousAllocation) {
    this.previousAllocation = previousAllocation;
  }


  public Allocation rescheduleTracker(RescheduleTracker rescheduleTracker) {
    
    this.rescheduleTracker = rescheduleTracker;
    return this;
  }

   /**
   * Get rescheduleTracker
   * @return rescheduleTracker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RescheduleTracker getRescheduleTracker() {
    return rescheduleTracker;
  }


  public void setRescheduleTracker(RescheduleTracker rescheduleTracker) {
    this.rescheduleTracker = rescheduleTracker;
  }


  public Allocation resources(Resources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Resources getResources() {
    return resources;
  }


  public void setResources(Resources resources) {
    this.resources = resources;
  }


  public Allocation services(Map<String, String> services) {
    
    this.services = services;
    return this;
  }

  public Allocation putServicesItem(String key, String servicesItem) {
    if (this.services == null) {
      this.services = new HashMap<String, String>();
    }
    this.services.put(key, servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getServices() {
    return services;
  }


  public void setServices(Map<String, String> services) {
    this.services = services;
  }


  public Allocation taskGroup(String taskGroup) {
    
    this.taskGroup = taskGroup;
    return this;
  }

   /**
   * Get taskGroup
   * @return taskGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskGroup() {
    return taskGroup;
  }


  public void setTaskGroup(String taskGroup) {
    this.taskGroup = taskGroup;
  }


  public Allocation taskResources(Map<String, Resources> taskResources) {
    
    this.taskResources = taskResources;
    return this;
  }

  public Allocation putTaskResourcesItem(String key, Resources taskResourcesItem) {
    if (this.taskResources == null) {
      this.taskResources = new HashMap<String, Resources>();
    }
    this.taskResources.put(key, taskResourcesItem);
    return this;
  }

   /**
   * Get taskResources
   * @return taskResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Resources> getTaskResources() {
    return taskResources;
  }


  public void setTaskResources(Map<String, Resources> taskResources) {
    this.taskResources = taskResources;
  }


  public Allocation taskStates(Map<String, TaskState> taskStates) {
    
    this.taskStates = taskStates;
    return this;
  }

  public Allocation putTaskStatesItem(String key, TaskState taskStatesItem) {
    if (this.taskStates == null) {
      this.taskStates = new HashMap<String, TaskState>();
    }
    this.taskStates.put(key, taskStatesItem);
    return this;
  }

   /**
   * Get taskStates
   * @return taskStates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, TaskState> getTaskStates() {
    return taskStates;
  }


  public void setTaskStates(Map<String, TaskState> taskStates) {
    this.taskStates = taskStates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allocation allocation = (Allocation) o;
    return Objects.equals(this.allocModifyIndex, allocation.allocModifyIndex) &&
        Objects.equals(this.allocatedResources, allocation.allocatedResources) &&
        Objects.equals(this.clientDescription, allocation.clientDescription) &&
        Objects.equals(this.clientStatus, allocation.clientStatus) &&
        Objects.equals(this.createIndex, allocation.createIndex) &&
        Objects.equals(this.createTime, allocation.createTime) &&
        Objects.equals(this.deploymentID, allocation.deploymentID) &&
        Objects.equals(this.deploymentStatus, allocation.deploymentStatus) &&
        Objects.equals(this.desiredDescription, allocation.desiredDescription) &&
        Objects.equals(this.desiredStatus, allocation.desiredStatus) &&
        Objects.equals(this.desiredTransition, allocation.desiredTransition) &&
        Objects.equals(this.evalID, allocation.evalID) &&
        Objects.equals(this.followupEvalID, allocation.followupEvalID) &&
        Objects.equals(this.ID, allocation.ID) &&
        Objects.equals(this.job, allocation.job) &&
        Objects.equals(this.jobID, allocation.jobID) &&
        Objects.equals(this.metrics, allocation.metrics) &&
        Objects.equals(this.modifyIndex, allocation.modifyIndex) &&
        Objects.equals(this.modifyTime, allocation.modifyTime) &&
        Objects.equals(this.name, allocation.name) &&
        Objects.equals(this.namespace, allocation.namespace) &&
        Objects.equals(this.networkStatus, allocation.networkStatus) &&
        Objects.equals(this.nextAllocation, allocation.nextAllocation) &&
        Objects.equals(this.nodeID, allocation.nodeID) &&
        Objects.equals(this.nodeName, allocation.nodeName) &&
        Objects.equals(this.preemptedAllocations, allocation.preemptedAllocations) &&
        Objects.equals(this.preemptedByAllocation, allocation.preemptedByAllocation) &&
        Objects.equals(this.previousAllocation, allocation.previousAllocation) &&
        Objects.equals(this.rescheduleTracker, allocation.rescheduleTracker) &&
        Objects.equals(this.resources, allocation.resources) &&
        Objects.equals(this.services, allocation.services) &&
        Objects.equals(this.taskGroup, allocation.taskGroup) &&
        Objects.equals(this.taskResources, allocation.taskResources) &&
        Objects.equals(this.taskStates, allocation.taskStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocModifyIndex, allocatedResources, clientDescription, clientStatus, createIndex, createTime, deploymentID, deploymentStatus, desiredDescription, desiredStatus, desiredTransition, evalID, followupEvalID, ID, job, jobID, metrics, modifyIndex, modifyTime, name, namespace, networkStatus, nextAllocation, nodeID, nodeName, preemptedAllocations, preemptedByAllocation, previousAllocation, rescheduleTracker, resources, services, taskGroup, taskResources, taskStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allocation {\n");
    sb.append("    allocModifyIndex: ").append(toIndentedString(allocModifyIndex)).append("\n");
    sb.append("    allocatedResources: ").append(toIndentedString(allocatedResources)).append("\n");
    sb.append("    clientDescription: ").append(toIndentedString(clientDescription)).append("\n");
    sb.append("    clientStatus: ").append(toIndentedString(clientStatus)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deploymentID: ").append(toIndentedString(deploymentID)).append("\n");
    sb.append("    deploymentStatus: ").append(toIndentedString(deploymentStatus)).append("\n");
    sb.append("    desiredDescription: ").append(toIndentedString(desiredDescription)).append("\n");
    sb.append("    desiredStatus: ").append(toIndentedString(desiredStatus)).append("\n");
    sb.append("    desiredTransition: ").append(toIndentedString(desiredTransition)).append("\n");
    sb.append("    evalID: ").append(toIndentedString(evalID)).append("\n");
    sb.append("    followupEvalID: ").append(toIndentedString(followupEvalID)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    modifyIndex: ").append(toIndentedString(modifyIndex)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    networkStatus: ").append(toIndentedString(networkStatus)).append("\n");
    sb.append("    nextAllocation: ").append(toIndentedString(nextAllocation)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    preemptedAllocations: ").append(toIndentedString(preemptedAllocations)).append("\n");
    sb.append("    preemptedByAllocation: ").append(toIndentedString(preemptedByAllocation)).append("\n");
    sb.append("    previousAllocation: ").append(toIndentedString(previousAllocation)).append("\n");
    sb.append("    rescheduleTracker: ").append(toIndentedString(rescheduleTracker)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    taskGroup: ").append(toIndentedString(taskGroup)).append("\n");
    sb.append("    taskResources: ").append(toIndentedString(taskResources)).append("\n");
    sb.append("    taskStates: ").append(toIndentedString(taskStates)).append("\n");
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

