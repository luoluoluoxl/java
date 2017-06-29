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
import java.util.ArrayList;
import java.util.List;

/**
 * NamespaceSpec describes the attributes on a Namespace.
 */
@ApiModel(description = "NamespaceSpec describes the attributes on a Namespace.")

public class V1NamespaceSpec {
  @SerializedName("finalizers")
  private List<String> finalizers = new ArrayList<String>();

  public V1NamespaceSpec finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public V1NamespaceSpec addFinalizersItem(String finalizersItem) {
    this.finalizers.add(finalizersItem);
    return this;
  }

   /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: http://releases.k8s.io/HEAD/docs/design/namespaces.md#finalizers
   * @return finalizers
  **/
  @ApiModelProperty(example = "null", value = "Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: http://releases.k8s.io/HEAD/docs/design/namespaces.md#finalizers")
  public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NamespaceSpec v1NamespaceSpec = (V1NamespaceSpec) o;
    return Objects.equals(this.finalizers, v1NamespaceSpec.finalizers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalizers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceSpec {\n");
    
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
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

