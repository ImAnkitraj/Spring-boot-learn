package com.tekion.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeRequest {

    private String name;
    private String department;

    public EmployeeRequest(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
