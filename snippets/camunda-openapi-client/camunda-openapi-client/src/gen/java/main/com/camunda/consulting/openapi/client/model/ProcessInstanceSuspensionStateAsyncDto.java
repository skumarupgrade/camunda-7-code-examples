/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.camunda.consulting.openapi.client.model.HistoricProcessInstanceQueryDto;
import com.camunda.consulting.openapi.client.model.ProcessInstanceQueryDto;
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
 * ProcessInstanceSuspensionStateAsyncDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class ProcessInstanceSuspensionStateAsyncDto {
  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_IDS = "processInstanceIds";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_IDS)
  private List<String> processInstanceIds = null;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_QUERY = "processInstanceQuery";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_QUERY)
  private ProcessInstanceQueryDto processInstanceQuery;

  public static final String SERIALIZED_NAME_HISTORIC_PROCESS_INSTANCE_QUERY = "historicProcessInstanceQuery";
  @SerializedName(SERIALIZED_NAME_HISTORIC_PROCESS_INSTANCE_QUERY)
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;


  public ProcessInstanceSuspensionStateAsyncDto suspended(Boolean suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * A Boolean value which indicates whether to activate or suspend a given process instance. When the value is set to true, the given process instance will be suspended and when the value is set to false, the given process instance will be activated.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Boolean value which indicates whether to activate or suspend a given process instance. When the value is set to true, the given process instance will be suspended and when the value is set to false, the given process instance will be activated.")

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public ProcessInstanceSuspensionStateAsyncDto processInstanceIds(List<String> processInstanceIds) {
    
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public ProcessInstanceSuspensionStateAsyncDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<String>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

   /**
   * A list of process instance ids which defines a group of process instances which will be activated or suspended by the operation.
   * @return processInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of process instance ids which defines a group of process instances which will be activated or suspended by the operation.")

  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }


  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }


  public ProcessInstanceSuspensionStateAsyncDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    
    this.processInstanceQuery = processInstanceQuery;
    return this;
  }

   /**
   * Get processInstanceQuery
   * @return processInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessInstanceQueryDto getProcessInstanceQuery() {
    return processInstanceQuery;
  }


  public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
  }


  public ProcessInstanceSuspensionStateAsyncDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
    return this;
  }

   /**
   * Get historicProcessInstanceQuery
   * @return historicProcessInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HistoricProcessInstanceQueryDto getHistoricProcessInstanceQuery() {
    return historicProcessInstanceQuery;
  }


  public void setHistoricProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceSuspensionStateAsyncDto processInstanceSuspensionStateAsyncDto = (ProcessInstanceSuspensionStateAsyncDto) o;
    return Objects.equals(this.suspended, processInstanceSuspensionStateAsyncDto.suspended) &&
        Objects.equals(this.processInstanceIds, processInstanceSuspensionStateAsyncDto.processInstanceIds) &&
        Objects.equals(this.processInstanceQuery, processInstanceSuspensionStateAsyncDto.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, processInstanceSuspensionStateAsyncDto.historicProcessInstanceQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspended, processInstanceIds, processInstanceQuery, historicProcessInstanceQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceSuspensionStateAsyncDto {\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

