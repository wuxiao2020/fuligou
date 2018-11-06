package tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.model.Comment;
import tech.dao.CommentMapper;
import tech.service.CommentService;

import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;


    public void add(Comment arc) {
        arc.setPushTime(new Date());
        commentMapper.insert(arc);
    }


    public List<Comment> queryByArticle(Comment arc) {
        return commentMapper.queryByArticle(Integer.valueOf(arc.getArticleId()));
    }

    public Comment queryById(Comment arc) {
        return commentMapper.selectByPrimaryKey(arc.getId());
    }
}
