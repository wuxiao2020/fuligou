package tech.service;

import tech.model.pageView;

import javax.servlet.http.HttpServletRequest;

public interface StatisticService {

    void pageViewInsert(HttpServletRequest request);
    int pageViewNum(pageView pg);
}
