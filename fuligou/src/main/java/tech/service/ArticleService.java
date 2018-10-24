package tech.service;

import tech.model.article;

import java.util.List;

public interface ArticleService {
    void add(article arc);
    void like(article arc);
    List<article> query(article arc);
    article queryById(article arc);
}
