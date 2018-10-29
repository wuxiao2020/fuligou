package tech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.model.ResultBean;
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



}
