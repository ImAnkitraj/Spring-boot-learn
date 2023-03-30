package com.tekion.service;

;

import com.tekion.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees(Integer pageNumber, Integer pageSize);
    Employee saveEmployee(Employee employee);

    Employee getEmployee(Long id);
    String deleteEmployee(Long id);
    Employee updateEmployee(Employee e);

    List<Employee> getEmployeesByDepartmentName(String name);
}
