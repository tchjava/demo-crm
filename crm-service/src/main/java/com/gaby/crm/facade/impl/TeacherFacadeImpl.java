package com.gaby.crm.facade.impl;

import com.gaby.crm.facade.TeacherFacade;
import com.gaby.crm.model.teacher.query.Item;
import com.gaby.crm.model.teacher.query.Request;
import com.gaby.crm.model.teacher.query.Response;
import com.gaby.crm.service.TeacherService;
import com.gaby.mybatis.auto.stu.entity.TeacherInfo;
import com.gaby.util.ModelDtoConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherFacadeImpl implements TeacherFacade {

    @Autowired
    private TeacherService teacherService;
    @Override
    public Response query(Request request) {
        Response response = new Response();
        Map map = new HashMap<>();
        map.put("request", request);
        List<Item> items=teacherService.query(map);
        response.setItems(items);
        return response;
    }

    @Override
    public com.gaby.crm.model.teacher.add.Response add(com.gaby.crm.model.teacher.add.Request request) {
        TeacherInfo teacherInfo = ModelDtoConvertUtil.convertDTO2Model(request, TeacherInfo.class);
        teacherInfo.settId("3");
        teacherService.insert(teacherInfo);
        return null;
    }

}
