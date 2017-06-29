/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * JobCondition describes current state of a job.
 */
@ApiModel(description = "JobCondition describes current state of a job.")

public class V1JobCondition {
  @SerializedName("lastProbeTime")
  private DateTime lastProbeTime = null;

  @SerializedName("lastTransitionTime")
  private DateTime lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public V1JobCondition lastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Last time the condition was checked.
   * @return lastProbeTime
  **/
  @ApiModelProperty(example = "null", value = "Last time the condition was checked.")
  public DateTime getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  public V1JobCondition lastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @ApiModelProperty(example = "null", value = "Last time the condition transit from one status to another.")
  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1JobCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "Human readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1JobCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason for the condition's last transition.
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "(brief) reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1JobCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "Status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1JobCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of job condition, Complete or Failed.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type of job condition, Complete or Failed.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JobCondition v1JobCondition = (V1JobCondition) o;
    return Objects.equals(this.lastProbeTime, v1JobCondition.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, v1JobCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1JobCondition.message) &&
        Objects.equals(this.reason, v1JobCondition.reason) &&
        Objects.equals(this.status, v1JobCondition.status) &&
        Objects.equals(this.type, v1JobCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobCondition {\n");
    
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

