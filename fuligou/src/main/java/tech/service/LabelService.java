package tech.service;

import tech.model.Label;

import java.util.List;

public interface LabelService {

    void add(Label label);
    List<Label> query();
    void update(Label label);
    void delete(Label label);
    Label queryById(Label label);
}
