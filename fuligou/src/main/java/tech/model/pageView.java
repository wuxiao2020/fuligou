package tech.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class pageView {

    public pageView(String name, Date time, String ip) {
        this.name = name;
        this.time = time;
        this.ip = ip;
    }

    private Integer id;

    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    private String ip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}