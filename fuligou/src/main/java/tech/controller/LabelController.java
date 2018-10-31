package tech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.model.Label;
import tech.model.ResultBean;
import tech.model.article;
import tech.service.ArticleService;
import tech.service.LabelService;

@RestController
@RequestMapping(value = "/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 新增查询修改模块
     * @param ac
     * @return
     */

    @RequestMapping("/add")
    public ResultBean<Object> add(@RequestBody Label ac){
        labelService.add(ac);
        return new ResultBean<Object>();
    }

    @RequestMapping("/query")
    public ResultBean<Object> query(){
        return new ResultBean<Object>(labelService.query());
    }


    @RequestMapping("/queryById")
    public ResultBean<Object> queryById(@RequestBody Label ac){
        return new ResultBean<Object>(labelService.queryById(ac));
    }

    @RequestMapping("/update")
    public ResultBean<Object> update(@RequestBody Label ac){
        labelService.update(ac);
        return new ResultBean<Object>();
    }


}
