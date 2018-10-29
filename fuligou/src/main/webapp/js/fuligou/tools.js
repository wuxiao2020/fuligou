var pageViewUrl = "/fuligou/statistic/pageView";

function pageView(name){

    $.ajax({
        url: pageViewUrl + "?name="+name,
        type: "POST",
        contentType: "application/json",
        data: "",
        success: function (resp) {
            debugger;
            if (resp.respCode == "0000") {
                console.log("访问记录成功！");
            }else{
                console.log("error: " + resp.respMsg);
            }
        },
        error:function(){
            console.log("error: 访问记录失败！");
        }
    });

}