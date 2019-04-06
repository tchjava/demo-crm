package com.gaby.crm.service;

import com.gaby.crm.model.teacher.query.Item;
import com.gaby.mybatis.auto.stu.entity.TeacherInfo;
import com.gaby.mybatis.base.service.BaseService;

import java.util.List;
import java.util.Map;

public interface TeacherService extends BaseService<TeacherInfo> {

    List<Item> query(Map map);
}
