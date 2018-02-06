package com.jeppesen.jcms.crew.leave.api.testAPI;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quota
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T07:23:29.948Z")

public class Quota   {
  @JsonProperty("availableQuota")
  private Integer availableQuota = null;

  @JsonProperty("description")
  private String description = null;

  public Quota availableQuota(Integer availableQuota) {
    this.availableQuota = availableQuota;
    return this;
  }

   /**
   * Get availableQuota
   * @return availableQuota
  **/



  public Integer getAvailableQuota() {
    return availableQuota;
  }

  public void setAvailableQuota(Integer availableQuota) {
    this.availableQuota = availableQuota;
  }

  public Quota description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quota quota = (Quota) o;
    return Objects.equals(this.availableQuota, quota.availableQuota) &&
        Objects.equals(this.description, quota.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableQuota, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quota {\n");
    
    sb.append("    availableQuota: ").append(toIndentedString(availableQuota)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

