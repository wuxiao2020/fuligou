package tech.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.service.ArticleService;
import tech.dao.articleMapper;
import tech.model.article;

import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private articleMapper acMapper;

    public void add(article arc) {
        arc.setPushTime(new Date());
        acMapper.insert(arc);
    }

    /**
     * 点赞
     * @param arc
     */
    public void like(article arc) {
        synchronized (this){
            acMapper.like(arc);
        }
    }

    public List<article> query(article arc) {
       return  acMapper.query(arc);

    }

    public article queryById(article arc) {
        return acMapper.queryById(arc);
    }
}
