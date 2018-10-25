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
                var likeNumHtml = $("span[data-id ="+id+"]").html();
                var likeNum = parseInt(likeNumHtml) + 1;
                $("span[data-id ="+id+"]").html(likeNum);
            }else{
                layer.msg(resp.respMsg);
            }
        },
        error:function(){
            layer.msg("系统忙，请稍后重试！");
        }
    });
}