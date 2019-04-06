package com.gaby.crm.mapper.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gaby.crm.model.teacher.query.Item;
import com.gaby.mybatis.auto.stu.entity.TeacherInfo;

import java.util.List;
import java.util.Map;

public interface TeacherDao extends BaseMapper<TeacherInfo> {

    List<Item> query(Map map);
}
