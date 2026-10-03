package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.UpdateReviewRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for UpdateReviewRequest domain operations.
 */
public interface UpdateReviewRequestDomainRepository {
    UpdateReviewRequest save(UpdateReviewRequest updateReviewRequest);

    Optional<UpdateReviewRequest> findById(String id);

    List<UpdateReviewRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
