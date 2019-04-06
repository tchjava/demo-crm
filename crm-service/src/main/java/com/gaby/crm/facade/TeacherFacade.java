package com.gaby.crm.facade;

import com.gaby.crm.model.teacher.query.Request;
import com.gaby.crm.model.teacher.query.Response;

public interface TeacherFacade {
    Response query(Request request);

    com.gaby.crm.model.teacher.add.Response add(com.gaby.crm.model.teacher.add.Request request);
}
