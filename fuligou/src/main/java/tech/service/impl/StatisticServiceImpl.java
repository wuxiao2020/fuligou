package tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.common.CommonUtils;
import tech.dao.pageViewMapper;
import tech.model.pageView;
import tech.service.StatisticService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private pageViewMapper pageViewdao;

    public void pageViewInsert(HttpServletRequest request) {
        String ip = CommonUtils.getIpAddress(request);
        String name = request.getParameter("name");
        pageViewdao.insert(new pageView(name,new Date(),ip));

    }

    public int pageViewNum(pageView pg) {
        return pageViewdao.pageViewNum(pg);
    }
}
