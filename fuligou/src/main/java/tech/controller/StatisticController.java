package tech.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.model.ResultBean;
import tech.model.article;
import tech.model.pageView;
import tech.service.StatisticService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/statistic")
public class StatisticController {



    @Autowired
    private StatisticService statisticService;

    /**
     * 页面访问记录
     * @param request
     * @return
     */

    @RequestMapping("/pageView")
    public ResultBean<Object> add(HttpServletRequest request){
        statisticService.pageViewInsert(request);
        return new ResultBean<Object>();
    }

    @RequestMapping("/pageViewNum")
    public ResultBean<Object> pageViewNum(@RequestBody pageView pg){
        return new ResultBean<Object>(statisticService.pageViewNum(pg));
    }



}
