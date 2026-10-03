package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.UpdateReviewRequestDomainRepository;
import com.probestack.forgestudio.design.model.UpdateReviewRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.UpdateReviewRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.UpdateReviewRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UpdateReviewRequestMongoPersistenceAdapter implements UpdateReviewRequestDomainRepository {
    private final UpdateReviewRequestMongoRepository repository;

    public UpdateReviewRequestMongoPersistenceAdapter(
            UpdateReviewRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateReviewRequest save(UpdateReviewRequest updateReviewRequest) {
        UpdateReviewRequestDocument document = toDocument(updateReviewRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<UpdateReviewRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<UpdateReviewRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private UpdateReviewRequestDocument toDocument(UpdateReviewRequest updateReviewRequest) {
        UpdateReviewRequestDocument document = new UpdateReviewRequestDocument();
        BeanUtils.copyProperties(updateReviewRequest, document);
        return document;
    }

    private UpdateReviewRequest toDomain(UpdateReviewRequestDocument document) {
        UpdateReviewRequest domain = new UpdateReviewRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
