package tech.model;

import java.io.Serializable;

public class ResultBean<T> implements Serializable{
    private static final long serialVersionUID = 1L;
    public static final String SUCCESS = "0000";
    public static final String FAIL = "-1";
    private String respMsg = "success";
    private String respCode = SUCCESS;
    private T data;
    private Object ext;

    public ResultBean() {
        super();
    }
    public ResultBean(T data) {
        super();
        this.data = data;
    }

    public ResultBean(T data, Object ext) {
        super();
        this.data = data;
        this.ext = ext;
    }
    public ResultBean(Throwable e) {
        super();
        this.respMsg = e.toString();
        this.respCode = FAIL ;
    }

    public ResultBean(String resultCode, String resultMsg, T data){
        this.respCode = resultCode;
        this.respMsg = resultMsg;
        this.data = data;
    }

    public ResultBean<T> getFailResult(String resultMsg){
        return new ResultBean<T>(FAIL,resultMsg,null);
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }
}
