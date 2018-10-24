package tech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.service.ArticleService;
import tech.model.ResultBean;
import tech.model.article;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {



    @Autowired
    private ArticleService articleService;

    /**
     * 新增查询修改模块
     * @param ac
     * @return
     */

    @RequestMapping("/add")
    public ResultBean<Object> add(@RequestBody article ac){

        articleService.add(ac);
        return new ResultBean<Object>();
    }

    @RequestMapping("/query")
    public ResultBean<Object> query(@RequestBody article ac){
        return new ResultBean<Object>(articleService.query(ac));
    }


    @RequestMapping("/queryById")
    public ResultBean<Object> queryById(@RequestBody article ac){
        return new ResultBean<Object>(articleService.queryById(ac));
    }

    /**
     * 评论点赞模块
     *
     *
     */

    @RequestMapping("/like")
    public ResultBean<Object> like(@RequestBody article ac){
        articleService.like(ac);
        return new ResultBean<Object>();
    }

}
