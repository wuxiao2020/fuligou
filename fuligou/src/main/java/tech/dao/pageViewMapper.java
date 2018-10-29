package tech.dao;

import com.alibaba.fastjson.JSONObject;
import tech.model.pageView;

public interface pageViewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(pageView record);

    int insertSelective(pageView record);

    pageView selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(pageView record);

    int updateByPrimaryKey(pageView record);

    int pageViewNum(pageView pg);
}