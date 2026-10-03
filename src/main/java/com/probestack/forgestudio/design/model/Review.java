package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Review
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:15:25.763565762Z[GMT]")public class Review {

  private String id;

  private String productSku;

  private String authorId;

  private String authorDisplayName;

  private Integer rating;

  private String title;

  private String body;

  private Boolean verifiedPurchase;

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

  private Integer helpfulVotes;

  private Integer unhelpfulVotes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime submittedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime moderatedAt;

  public Review() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Review(String id, String productSku, Integer rating, ModerationStateEnum moderationState) {
    this.id = id;
    this.productSku = productSku;
    this.rating = rating;
    this.moderationState = moderationState;
  }

  public Review id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique review ID (UUID)
   * @return id
  */
  @NotNull   @Schema(name = "id", example = "r1e2v3w4", description = "Unique review ID (UUID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Review productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

  /**
   * Get productSku
   * @return productSku
  */
  @NotNull   @Schema(name = "productSku", example = "SKU-12345", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productSku")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public Review authorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * @return authorId
  */
    @Schema(name = "authorId", example = "cust-88213", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorId")
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public Review authorDisplayName(String authorDisplayName) {
    this.authorDisplayName = authorDisplayName;
    return this;
  }

  /**
   * Get authorDisplayName
   * @return authorDisplayName
  */
    @Schema(name = "authorDisplayName", example = "J. Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorDisplayName")
  public String getAuthorDisplayName() {
    return authorDisplayName;
  }

  public void setAuthorDisplayName(String authorDisplayName) {
    this.authorDisplayName = authorDisplayName;
  }

  public Review rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * minimum: 1
   * maximum: 5
   * @return rating
  */
  @NotNull @Min(1) @Max(5)   @Schema(name = "rating", example = "4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Review title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
    @Schema(name = "title", example = "Great value for the price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Review body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
    @Schema(name = "body", example = "Battery life is excellent, though the scroll wheel feels cheap.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Review verifiedPurchase(Boolean verifiedPurchase) {
    this.verifiedPurchase = verifiedPurchase;
    return this;
  }

  /**
   * Get verifiedPurchase
   * @return verifiedPurchase
  */
    @Schema(name = "verifiedPurchase", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verifiedPurchase")
  public Boolean getVerifiedPurchase() {
    return verifiedPurchase;
  }

  public void setVerifiedPurchase(Boolean verifiedPurchase) {
    this.verifiedPurchase = verifiedPurchase;
  }

  public Review moderationState(ModerationStateEnum moderationState) {
    this.moderationState = moderationState;
    return this;
  }

  /**
   * Get moderationState
   * @return moderationState
  */
  @NotNull   @Schema(name = "moderationState", example = "APPROVED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moderationState")
  public ModerationStateEnum getModerationState() {
    return moderationState;
  }

  public void setModerationState(ModerationStateEnum moderationState) {
    this.moderationState = moderationState;
  }

  public Review helpfulVotes(Integer helpfulVotes) {
    this.helpfulVotes = helpfulVotes;
    return this;
  }

  /**
   * Get helpfulVotes
   * @return helpfulVotes
  */
    @Schema(name = "helpfulVotes", example = "27", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("helpfulVotes")
  public Integer getHelpfulVotes() {
    return helpfulVotes;
  }

  public void setHelpfulVotes(Integer helpfulVotes) {
    this.helpfulVotes = helpfulVotes;
  }

  public Review unhelpfulVotes(Integer unhelpfulVotes) {
    this.unhelpfulVotes = unhelpfulVotes;
    return this;
  }

  /**
   * Get unhelpfulVotes
   * @return unhelpfulVotes
  */
    @Schema(name = "unhelpfulVotes", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unhelpfulVotes")
  public Integer getUnhelpfulVotes() {
    return unhelpfulVotes;
  }

  public void setUnhelpfulVotes(Integer unhelpfulVotes) {
    this.unhelpfulVotes = unhelpfulVotes;
  }

  public Review submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

  /**
   * Get submittedAt
   * @return submittedAt
  */
  @Valid   @Schema(name = "submittedAt", example = "2026-08-12T10:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("submittedAt")
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }

  public Review moderatedAt(OffsetDateTime moderatedAt) {
    this.moderatedAt = moderatedAt;
    return this;
  }

  /**
   * Get moderatedAt
   * @return moderatedAt
  */
  @Valid   @Schema(name = "moderatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moderatedAt")
  public OffsetDateTime getModeratedAt() {
    return moderatedAt;
  }

  public void setModeratedAt(OffsetDateTime moderatedAt) {
    this.moderatedAt = moderatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Review review = (Review) o;
    return Objects.equals(this.id, review.id) &&
        Objects.equals(this.productSku, review.productSku) &&
        Objects.equals(this.authorId, review.authorId) &&
        Objects.equals(this.authorDisplayName, review.authorDisplayName) &&
        Objects.equals(this.rating, review.rating) &&
        Objects.equals(this.title, review.title) &&
        Objects.equals(this.body, review.body) &&
        Objects.equals(this.verifiedPurchase, review.verifiedPurchase) &&
        Objects.equals(this.moderationState, review.moderationState) &&
        Objects.equals(this.helpfulVotes, review.helpfulVotes) &&
        Objects.equals(this.unhelpfulVotes, review.unhelpfulVotes) &&
        Objects.equals(this.submittedAt, review.submittedAt) &&
        Objects.equals(this.moderatedAt, review.moderatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productSku, authorId, authorDisplayName, rating, title, body, verifiedPurchase, moderationState, helpfulVotes, unhelpfulVotes, submittedAt, moderatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Review {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorDisplayName: ").append(toIndentedString(authorDisplayName)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    verifiedPurchase: ").append(toIndentedString(verifiedPurchase)).append("\n");
    sb.append("    moderationState: ").append(toIndentedString(moderationState)).append("\n");
    sb.append("    helpfulVotes: ").append(toIndentedString(helpfulVotes)).append("\n");
    sb.append("    unhelpfulVotes: ").append(toIndentedString(unhelpfulVotes)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    moderatedAt: ").append(toIndentedString(moderatedAt)).append("\n");
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

