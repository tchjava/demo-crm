package com.gaby.crm.model.teacher.add;

import com.gaby.model.BaseRequest;
import lombok.Data;

@Data
public class Request extends BaseRequest {
    private String name;
    private Integer age;
    private Integer type;
}
