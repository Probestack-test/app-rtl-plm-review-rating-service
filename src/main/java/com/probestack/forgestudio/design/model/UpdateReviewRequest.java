package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateReviewRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:15:25.763565762Z[GMT]")public class UpdateReviewRequest {

  private Integer rating;

  private String title;

  private String body;

  /**
   * Gets or Sets moderationState
   */
  public enum ModerationStateEnum {
    PENDING("PENDING"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    ModerationStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModerationStateEnum fromValue(String value) {
      for (ModerationStateEnum b : ModerationStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ModerationStateEnum moderationState;

  public UpdateReviewRequest rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * minimum: 1
   * maximum: 5
   * @return rating
  */
  @Min(1) @Max(5)   @Schema(name = "rating", example = "5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public UpdateReviewRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @Size(max = 120)   @Schema(name = "title", example = "Even better after the firmware update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UpdateReviewRequest body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  @Size(max = 2000)   @Schema(name = "body", example = "The scroll wheel issue was fixed in the latest firmware.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public UpdateReviewRequest moderationState(ModerationStateEnum moderationState) {
    this.moderationState = moderationState;
    return this;
  }

  /**
   * Get moderationState
   * @return moderationState
  */
    @Schema(name = "moderationState", example = "APPROVED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moderationState")
  public ModerationStateEnum getModerationState() {
    return moderationState;
  }

  public void setModerationState(ModerationStateEnum moderationState) {
    this.moderationState = moderationState;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateReviewRequest updateReviewRequest = (UpdateReviewRequest) o;
    return Objects.equals(this.rating, updateReviewRequest.rating) &&
        Objects.equals(this.title, updateReviewRequest.title) &&
        Objects.equals(this.body, updateReviewRequest.body) &&
        Objects.equals(this.moderationState, updateReviewRequest.moderationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, title, body, moderationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReviewRequest {\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    moderationState: ").append(toIndentedString(moderationState)).append("\n");
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

