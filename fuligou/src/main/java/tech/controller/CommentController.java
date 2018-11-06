package tech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.model.Comment;
import tech.model.Label;
import tech.model.ResultBean;
import tech.service.CommentService;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 新增查询修改模块
     * @param ac
     * @return
     */

    @RequestMapping("/add")
    public ResultBean<Object> add(@RequestBody Comment ac){
        commentService.add(ac);
        return new ResultBean<Object>();
    }

    @RequestMapping("/queryByArticle")
    public ResultBean<Object> queryByArticle(@RequestBody Comment ac){

        return new ResultBean<Object>(commentService.queryByArticle(ac));
    }


    @RequestMapping("/queryById")
    public ResultBean<Object> queryById(@RequestBody Comment ac){
        return new ResultBean<Object>(commentService.queryById(ac));
    }


}
