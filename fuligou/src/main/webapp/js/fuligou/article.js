
$("#pay").on("click",function(){
    layer.open({
        type: 1,
        title:'打赏页',
        area: ['600px', '360px'], //宽高
        content: '<div class="rewards-popover">' +
        '<h3>觉得文章有用就打赏一下文章作者</h3>' +
        '<div class="rewards-popover-item">' +
        '<h4>支付宝扫一扫打赏</h4>' +
        '<img src="http://wx4.sinaimg.cn/mw690/9956d663gy1fwdpf4m8nij209109040s.jpg">' +
        '</div>' +
        '<div class="rewards-popover-item">' +
        '<h4>微信扫一扫打赏</h4>' +
        '<img src="//wx2.sinaimg.cn/mw690/9956d663gy1fwdpf6wuf6j20dw0dymzo.jpg">' +
        '</div>' +
        '<span class="rewards-popover-close" data-event="rewards-close"><i class="fa fa-close"></i></span>' +
        '</div>'
    });
});

function getQueryString(name) {
    var result = window.location.search.match(new RegExp("[\?\&]" + name + "=([^\&]+)", "i"));
    if (result == null || result.length < 1) {
        return "";
    }
    return result[1];
};

//点赞
function like(id){
    var param = JSON.stringify({id:id});
    $.ajax({
        url: "/fuligou/article/like",
        type: "POST",
        contentType: "application/json",
        data: param,
        success: function (resp) {
            debugger;
            if (resp.respCode == "0000") {
                layer.msg("感谢您的赞！");
                var likeNumHtml = $("#like").html();
                var likeNum = parseInt(likeNumHtml) + 1;
                $("#like").html(likeNum);
            }else{
                layer.msg(resp.respMsg);
            }
        },
        error:function(){
            layer.msg("系统忙，请稍后重试！");
        }
    });

}


$(function(){

    //首页
    var id= getQueryString("article");
    var param = JSON.stringify({id:id})
    $.ajax({
        url: "/fuligou/article/queryById",
        type: "POST",
        contentType: "application/json",
        data: param,
        success: function (resp) {
            debugger;
            if (resp.respCode == "0000") {
                var param =resp.data;
                $(".title").html(param.title);
                $(".article-time-str").html(param.pushTime);
                $(".article-commit-num").html(param.commentNum);
                $("#editor").append(param.content);
                $("#like").html(param.likeNum);
                $(".likeNews").attr("onclick","like("+ id+")");
                $(".article-label-name").html(param.labelName);
                $(".articleId").val(param.articleId);
            }else{
                layer.msg(resp.respMsg);
            }
        },
        error:function(){
            layer.msg("系统忙，请稍后重试！");
        }
    });

    //标签
    $.ajax({
        url: "/fuligou/label/query",
        type: "POST",
        contentType: "application/json",
        data: param,
        success: function (resp) {
            debugger;
            if (resp.respCode == "0000") {
                $(".hotLabel").empty();
                $(".hotLabel").append("<h3>热门标签</h3>");
                $.each(resp.data,function(index,item){
                    $(".hotLabel").append("<a href='javascript:;'>" + item.labelName + "</a>");
                });
            }else{
                layer.msg(resp.respMsg);
            }
        },
        error:function(){
            layer.msg("系统忙，请稍后重试！");
        }
    });



});
