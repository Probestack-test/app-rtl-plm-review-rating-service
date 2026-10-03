package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.UpdateReviewRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for UpdateReviewRequest documents.
 */
public interface UpdateReviewRequestMongoRepository extends MongoRepository<UpdateReviewRequestDocument, String> {
}
