package tech.dao;

import tech.model.article;

import java.util.List;

public interface articleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(Integer id);

    article queryById(article record);

    List<article> query(article record);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKey(article record);

    void like(article record);
}