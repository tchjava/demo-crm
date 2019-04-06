package com.gaby.crm.controller;

import com.gaby.web.plugin.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gaby.crm.model.teacher.query.Request;
import com.gaby.crm.model.teacher.query.Response;
import com.gaby.crm.facade.TeacherFacade;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends BaseController {

    @Autowired
    private TeacherFacade teacherFacade;

    @RequestMapping("query")
    public Response query(@RequestBody Request request){
        return teacherFacade.query(request);
    }

    @RequestMapping("add")
    public com.gaby.crm.model.teacher.add.Response add(@RequestBody com.gaby.crm.model.teacher.add.Request request){
        return teacherFacade.add(request);
    }
}