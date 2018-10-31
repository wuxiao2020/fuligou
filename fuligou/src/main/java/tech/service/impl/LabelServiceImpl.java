package tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.dao.LabelMapper;
import tech.model.Label;
import tech.service.LabelService;

import java.util.List;

@Service
public class LabelServiceImpl  implements LabelService{

    @Autowired
    private LabelMapper labelMapper;

    public void add(Label label) {
        labelMapper.insert(label);
    }

    public List<Label> query() {
        return labelMapper.selectAll();
    }

    public void update(Label label) {
        labelMapper.updateByPrimaryKeySelective(label);
    }

    public void delete(Label label) {
        labelMapper.deleteByPrimaryKey(label.getId());
    }

    public Label queryById(Label label) {

        return labelMapper.selectByPrimaryKey(label.getId());
    }
}
