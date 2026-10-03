package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateReviewRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:15:25.763565762Z[GMT]")public class CreateReviewRequest {

  private String productSku;

  private String authorId;

  private Integer rating;

  private String title;

  private String body;

  public CreateReviewRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateReviewRequest(String productSku, String authorId, Integer rating) {
    this.productSku = productSku;
    this.authorId = authorId;
    this.rating = rating;
  }

  public CreateReviewRequest productSku(String productSku) {
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

  public CreateReviewRequest authorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * @return authorId
  */
  @NotNull   @Schema(name = "authorId", example = "cust-88213", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("authorId")
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public CreateReviewRequest rating(Integer rating) {
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

  public CreateReviewRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @Size(max = 120)   @Schema(name = "title", example = "Great value for the price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreateReviewRequest body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  @Size(max = 2000)   @Schema(name = "body", example = "Battery life is excellent, though the scroll wheel feels cheap.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReviewRequest createReviewRequest = (CreateReviewRequest) o;
    return Objects.equals(this.productSku, createReviewRequest.productSku) &&
        Objects.equals(this.authorId, createReviewRequest.authorId) &&
        Objects.equals(this.rating, createReviewRequest.rating) &&
        Objects.equals(this.title, createReviewRequest.title) &&
        Objects.equals(this.body, createReviewRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productSku, authorId, rating, title, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReviewRequest {\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

