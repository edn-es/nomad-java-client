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
import org.openapitools.client.model.CheckRestart;

/**
 * ServiceCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T11:56:02.367141Z[Etc/UTC]")
public class ServiceCheck {
  public static final String SERIALIZED_NAME_ADDRESS_MODE = "AddressMode";
  @SerializedName(SERIALIZED_NAME_ADDRESS_MODE)
  private String addressMode;

  public static final String SERIALIZED_NAME_ADVERTISE = "Advertise";
  @SerializedName(SERIALIZED_NAME_ADVERTISE)
  private String advertise;

  public static final String SERIALIZED_NAME_ARGS = "Args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CHECK_RESTART = "CheckRestart";
  @SerializedName(SERIALIZED_NAME_CHECK_RESTART)
  private CheckRestart checkRestart;

  public static final String SERIALIZED_NAME_COMMAND = "Command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_EXPOSE = "Expose";
  @SerializedName(SERIALIZED_NAME_EXPOSE)
  private Boolean expose;

  public static final String SERIALIZED_NAME_FAILURES_BEFORE_CRITICAL = "FailuresBeforeCritical";
  @SerializedName(SERIALIZED_NAME_FAILURES_BEFORE_CRITICAL)
  private Integer failuresBeforeCritical;

  public static final String SERIALIZED_NAME_FAILURES_BEFORE_WARNING = "FailuresBeforeWarning";
  @SerializedName(SERIALIZED_NAME_FAILURES_BEFORE_WARNING)
  private Integer failuresBeforeWarning;

  public static final String SERIALIZED_NAME_GR_P_C_SERVICE = "GRPCService";
  @SerializedName(SERIALIZED_NAME_GR_P_C_SERVICE)
  private String grPCService;

  public static final String SERIALIZED_NAME_GR_P_C_USE_T_L_S = "GRPCUseTLS";
  @SerializedName(SERIALIZED_NAME_GR_P_C_USE_T_L_S)
  private Boolean grPCUseTLS;

  public static final String SERIALIZED_NAME_HEADER = "Header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Map<String, List<String>> header = null;

  public static final String SERIALIZED_NAME_INITIAL_STATUS = "InitialStatus";
  @SerializedName(SERIALIZED_NAME_INITIAL_STATUS)
  private String initialStatus;

  public static final String SERIALIZED_NAME_INTERVAL = "Interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Long interval;

  public static final String SERIALIZED_NAME_METHOD = "Method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ON_UPDATE = "OnUpdate";
  @SerializedName(SERIALIZED_NAME_ON_UPDATE)
  private String onUpdate;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT_LABEL = "PortLabel";
  @SerializedName(SERIALIZED_NAME_PORT_LABEL)
  private String portLabel;

  public static final String SERIALIZED_NAME_PROTOCOL = "Protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_SUCCESS_BEFORE_PASSING = "SuccessBeforePassing";
  @SerializedName(SERIALIZED_NAME_SUCCESS_BEFORE_PASSING)
  private Integer successBeforePassing;

  public static final String SERIALIZED_NAME_TL_S_SERVER_NAME = "TLSServerName";
  @SerializedName(SERIALIZED_NAME_TL_S_SERVER_NAME)
  private String tlSServerName;

  public static final String SERIALIZED_NAME_TL_S_SKIP_VERIFY = "TLSSkipVerify";
  @SerializedName(SERIALIZED_NAME_TL_S_SKIP_VERIFY)
  private Boolean tlSSkipVerify;

  public static final String SERIALIZED_NAME_TASK_NAME = "TaskName";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName;

  public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Long timeout;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ServiceCheck addressMode(String addressMode) {
    
    this.addressMode = addressMode;
    return this;
  }

   /**
   * Get addressMode
   * @return addressMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressMode() {
    return addressMode;
  }


  public void setAddressMode(String addressMode) {
    this.addressMode = addressMode;
  }


  public ServiceCheck advertise(String advertise) {
    
    this.advertise = advertise;
    return this;
  }

   /**
   * Get advertise
   * @return advertise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdvertise() {
    return advertise;
  }


  public void setAdvertise(String advertise) {
    this.advertise = advertise;
  }


  public ServiceCheck args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public ServiceCheck addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public ServiceCheck body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public ServiceCheck checkRestart(CheckRestart checkRestart) {
    
    this.checkRestart = checkRestart;
    return this;
  }

   /**
   * Get checkRestart
   * @return checkRestart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CheckRestart getCheckRestart() {
    return checkRestart;
  }


  public void setCheckRestart(CheckRestart checkRestart) {
    this.checkRestart = checkRestart;
  }


  public ServiceCheck command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }


  public ServiceCheck expose(Boolean expose) {
    
    this.expose = expose;
    return this;
  }

   /**
   * Get expose
   * @return expose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExpose() {
    return expose;
  }


  public void setExpose(Boolean expose) {
    this.expose = expose;
  }


  public ServiceCheck failuresBeforeCritical(Integer failuresBeforeCritical) {
    
    this.failuresBeforeCritical = failuresBeforeCritical;
    return this;
  }

   /**
   * Get failuresBeforeCritical
   * @return failuresBeforeCritical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailuresBeforeCritical() {
    return failuresBeforeCritical;
  }


  public void setFailuresBeforeCritical(Integer failuresBeforeCritical) {
    this.failuresBeforeCritical = failuresBeforeCritical;
  }


  public ServiceCheck failuresBeforeWarning(Integer failuresBeforeWarning) {
    
    this.failuresBeforeWarning = failuresBeforeWarning;
    return this;
  }

   /**
   * Get failuresBeforeWarning
   * @return failuresBeforeWarning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailuresBeforeWarning() {
    return failuresBeforeWarning;
  }


  public void setFailuresBeforeWarning(Integer failuresBeforeWarning) {
    this.failuresBeforeWarning = failuresBeforeWarning;
  }


  public ServiceCheck grPCService(String grPCService) {
    
    this.grPCService = grPCService;
    return this;
  }

   /**
   * Get grPCService
   * @return grPCService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrPCService() {
    return grPCService;
  }


  public void setGrPCService(String grPCService) {
    this.grPCService = grPCService;
  }


  public ServiceCheck grPCUseTLS(Boolean grPCUseTLS) {
    
    this.grPCUseTLS = grPCUseTLS;
    return this;
  }

   /**
   * Get grPCUseTLS
   * @return grPCUseTLS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGrPCUseTLS() {
    return grPCUseTLS;
  }


  public void setGrPCUseTLS(Boolean grPCUseTLS) {
    this.grPCUseTLS = grPCUseTLS;
  }


  public ServiceCheck header(Map<String, List<String>> header) {
    
    this.header = header;
    return this;
  }

  public ServiceCheck putHeaderItem(String key, List<String> headerItem) {
    if (this.header == null) {
      this.header = new HashMap<String, List<String>>();
    }
    this.header.put(key, headerItem);
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getHeader() {
    return header;
  }


  public void setHeader(Map<String, List<String>> header) {
    this.header = header;
  }


  public ServiceCheck initialStatus(String initialStatus) {
    
    this.initialStatus = initialStatus;
    return this;
  }

   /**
   * Get initialStatus
   * @return initialStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialStatus() {
    return initialStatus;
  }


  public void setInitialStatus(String initialStatus) {
    this.initialStatus = initialStatus;
  }


  public ServiceCheck interval(Long interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getInterval() {
    return interval;
  }


  public void setInterval(Long interval) {
    this.interval = interval;
  }


  public ServiceCheck method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public ServiceCheck name(String name) {
    
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


  public ServiceCheck onUpdate(String onUpdate) {
    
    this.onUpdate = onUpdate;
    return this;
  }

   /**
   * Get onUpdate
   * @return onUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOnUpdate() {
    return onUpdate;
  }


  public void setOnUpdate(String onUpdate) {
    this.onUpdate = onUpdate;
  }


  public ServiceCheck path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ServiceCheck portLabel(String portLabel) {
    
    this.portLabel = portLabel;
    return this;
  }

   /**
   * Get portLabel
   * @return portLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPortLabel() {
    return portLabel;
  }


  public void setPortLabel(String portLabel) {
    this.portLabel = portLabel;
  }


  public ServiceCheck protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public ServiceCheck successBeforePassing(Integer successBeforePassing) {
    
    this.successBeforePassing = successBeforePassing;
    return this;
  }

   /**
   * Get successBeforePassing
   * @return successBeforePassing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessBeforePassing() {
    return successBeforePassing;
  }


  public void setSuccessBeforePassing(Integer successBeforePassing) {
    this.successBeforePassing = successBeforePassing;
  }


  public ServiceCheck tlSServerName(String tlSServerName) {
    
    this.tlSServerName = tlSServerName;
    return this;
  }

   /**
   * Get tlSServerName
   * @return tlSServerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTlSServerName() {
    return tlSServerName;
  }


  public void setTlSServerName(String tlSServerName) {
    this.tlSServerName = tlSServerName;
  }


  public ServiceCheck tlSSkipVerify(Boolean tlSSkipVerify) {
    
    this.tlSSkipVerify = tlSSkipVerify;
    return this;
  }

   /**
   * Get tlSSkipVerify
   * @return tlSSkipVerify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTlSSkipVerify() {
    return tlSSkipVerify;
  }


  public void setTlSSkipVerify(Boolean tlSSkipVerify) {
    this.tlSSkipVerify = tlSSkipVerify;
  }


  public ServiceCheck taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public ServiceCheck timeout(Long timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTimeout() {
    return timeout;
  }


  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public ServiceCheck type(String type) {
    
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
    ServiceCheck serviceCheck = (ServiceCheck) o;
    return Objects.equals(this.addressMode, serviceCheck.addressMode) &&
        Objects.equals(this.advertise, serviceCheck.advertise) &&
        Objects.equals(this.args, serviceCheck.args) &&
        Objects.equals(this.body, serviceCheck.body) &&
        Objects.equals(this.checkRestart, serviceCheck.checkRestart) &&
        Objects.equals(this.command, serviceCheck.command) &&
        Objects.equals(this.expose, serviceCheck.expose) &&
        Objects.equals(this.failuresBeforeCritical, serviceCheck.failuresBeforeCritical) &&
        Objects.equals(this.failuresBeforeWarning, serviceCheck.failuresBeforeWarning) &&
        Objects.equals(this.grPCService, serviceCheck.grPCService) &&
        Objects.equals(this.grPCUseTLS, serviceCheck.grPCUseTLS) &&
        Objects.equals(this.header, serviceCheck.header) &&
        Objects.equals(this.initialStatus, serviceCheck.initialStatus) &&
        Objects.equals(this.interval, serviceCheck.interval) &&
        Objects.equals(this.method, serviceCheck.method) &&
        Objects.equals(this.name, serviceCheck.name) &&
        Objects.equals(this.onUpdate, serviceCheck.onUpdate) &&
        Objects.equals(this.path, serviceCheck.path) &&
        Objects.equals(this.portLabel, serviceCheck.portLabel) &&
        Objects.equals(this.protocol, serviceCheck.protocol) &&
        Objects.equals(this.successBeforePassing, serviceCheck.successBeforePassing) &&
        Objects.equals(this.tlSServerName, serviceCheck.tlSServerName) &&
        Objects.equals(this.tlSSkipVerify, serviceCheck.tlSSkipVerify) &&
        Objects.equals(this.taskName, serviceCheck.taskName) &&
        Objects.equals(this.timeout, serviceCheck.timeout) &&
        Objects.equals(this.type, serviceCheck.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressMode, advertise, args, body, checkRestart, command, expose, failuresBeforeCritical, failuresBeforeWarning, grPCService, grPCUseTLS, header, initialStatus, interval, method, name, onUpdate, path, portLabel, protocol, successBeforePassing, tlSServerName, tlSSkipVerify, taskName, timeout, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCheck {\n");
    sb.append("    addressMode: ").append(toIndentedString(addressMode)).append("\n");
    sb.append("    advertise: ").append(toIndentedString(advertise)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    checkRestart: ").append(toIndentedString(checkRestart)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
    sb.append("    failuresBeforeCritical: ").append(toIndentedString(failuresBeforeCritical)).append("\n");
    sb.append("    failuresBeforeWarning: ").append(toIndentedString(failuresBeforeWarning)).append("\n");
    sb.append("    grPCService: ").append(toIndentedString(grPCService)).append("\n");
    sb.append("    grPCUseTLS: ").append(toIndentedString(grPCUseTLS)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    initialStatus: ").append(toIndentedString(initialStatus)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onUpdate: ").append(toIndentedString(onUpdate)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    portLabel: ").append(toIndentedString(portLabel)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    successBeforePassing: ").append(toIndentedString(successBeforePassing)).append("\n");
    sb.append("    tlSServerName: ").append(toIndentedString(tlSServerName)).append("\n");
    sb.append("    tlSSkipVerify: ").append(toIndentedString(tlSSkipVerify)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
