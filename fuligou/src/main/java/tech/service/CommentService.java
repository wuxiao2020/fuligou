package tech.service;

import tech.model.Comment;

import java.util.List;

public interface CommentService {
    void add(Comment arc);
    List<Comment> queryByArticle(Comment arc);
    Comment queryById(Comment arc);
}
