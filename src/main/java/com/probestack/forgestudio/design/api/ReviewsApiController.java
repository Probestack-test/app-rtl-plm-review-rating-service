package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateReviewRequest;
import com.probestack.forgestudio.design.model.Review;
import com.probestack.forgestudio.design.model.ReviewListResponse;
import com.probestack.forgestudio.design.model.UpdateReviewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ReviewsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:15:25.763565762Z[GMT]")
@Controller
@RequestMapping("${openapi.reviewRatingService.base-path:/v1}")
public class ReviewsApiController implements ReviewsApi {

    private static final Logger log = LoggerFactory.getLogger(ReviewsApiController.class);

    private final ReviewsService reviewsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ReviewsApiController(ReviewsService reviewsService, GeneratedRequestValidator generatedRequestValidator) {
        this.reviewsService = reviewsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Review> createReview(@RequestBody() CreateReviewRequest createReviewRequest) {
        log.info("Processing createReview request");
        try {
            generatedRequestValidator.validate("createReview", createReviewRequest);
            var response = reviewsService.createReview(createReviewRequest);
            log.info("createReview completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createReview: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> deleteReview(@PathVariable() String reviewId) {
        log.info("Processing deleteReview request");
        try {
            var response = reviewsService.deleteReview(reviewId);
            log.info("deleteReview completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process deleteReview: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Review> getReviewById(@PathVariable() String reviewId) {
        log.info("Processing getReviewById request");
        try {
            var response = reviewsService.getReviewById(reviewId);
            log.info("getReviewById completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getReviewById: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ReviewListResponse> listReviews(@RequestParam(value = "productSku", required = false) String productSku, @RequestParam(value = "minRating", required = false) Integer minRating, @RequestParam(value = "moderationState", required = false) String moderationState, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listReviews request");
        try {
            var response = reviewsService.listReviews(productSku, minRating, moderationState, page, size);
            log.info("listReviews completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listReviews: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Review> updateReview(@PathVariable() String reviewId, @RequestBody() UpdateReviewRequest updateReviewRequest) {
        log.info("Processing updateReview request");
        try {
            generatedRequestValidator.validate("updateReview", updateReviewRequest);
            var response = reviewsService.updateReview(reviewId, updateReviewRequest);
            log.info("updateReview completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateReview: {}", e.getMessage(), e);
            throw e;
        }
    }
}
