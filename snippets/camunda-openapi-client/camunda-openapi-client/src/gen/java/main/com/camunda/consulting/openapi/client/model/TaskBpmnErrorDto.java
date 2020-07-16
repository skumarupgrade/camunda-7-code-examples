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
import com.camunda.consulting.openapi.client.model.VariableValueDto;
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

/**
 * TaskBpmnErrorDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class TaskBpmnErrorDto {
  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, VariableValueDto> variables = null;


  public TaskBpmnErrorDto errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * An error code that indicates the predefined error. It is used to identify the BPMN error handler.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An error code that indicates the predefined error. It is used to identify the BPMN error handler.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public TaskBpmnErrorDto errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * An error message that describes the error.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An error message that describes the error.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public TaskBpmnErrorDto variables(Map<String, VariableValueDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public TaskBpmnErrorDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, VariableValueDto>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * A JSON object containing variable key-value pairs.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing variable key-value pairs.")

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskBpmnErrorDto taskBpmnErrorDto = (TaskBpmnErrorDto) o;
    return Objects.equals(this.errorCode, taskBpmnErrorDto.errorCode) &&
        Objects.equals(this.errorMessage, taskBpmnErrorDto.errorMessage) &&
        Objects.equals(this.variables, taskBpmnErrorDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskBpmnErrorDto {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

