package com.gaby.crm.service.impl;

import com.gaby.crm.mapper.dao.TeacherDao;
import com.gaby.crm.model.teacher.query.Item;
import com.gaby.mybatis.auto.stu.entity.TeacherInfo;
import com.gaby.mybatis.base.service.impl.BaseServiceImpl;
import com.gaby.crm.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl extends BaseServiceImpl<TeacherDao, TeacherInfo> implements TeacherService {

    @Override
    public List<Item> query(Map map) {
        return this.baseMapper.query(map);
    }
}
