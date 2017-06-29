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

/**
 * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.")

public class V1HostPathVolumeSource {
  @SerializedName("path")
  private String path = null;

  public V1HostPathVolumeSource path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of the directory on the host. More info: http://kubernetes.io/docs/user-guide/volumes#hostpath
   * @return path
  **/
  @ApiModelProperty(example = "null", required = true, value = "Path of the directory on the host. More info: http://kubernetes.io/docs/user-guide/volumes#hostpath")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostPathVolumeSource v1HostPathVolumeSource = (V1HostPathVolumeSource) o;
    return Objects.equals(this.path, v1HostPathVolumeSource.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostPathVolumeSource {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

