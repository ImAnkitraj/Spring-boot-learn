package com.tekion.controller;

import com.tekion.dto.Department;
import com.tekion.dto.Employee;
import com.tekion.request.EmployeeRequest;
import com.tekion.service.DepartmentService;
import com.tekion.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
// @Controller + @ResponseBody
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees(@RequestParam Integer pageNumber,
                                                       @RequestParam Integer pageSize) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(pageNumber, pageSize), HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
        return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.OK);
    }

    @DeleteMapping("/employees")
    public ResponseEntity<String> deleteEmployee(@RequestParam("id") Long id) {

        return new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody EmployeeRequest eRequest){
        Department dept = new Department();
        dept.setName(eRequest.getDepartment());
        dept = departmentService.saveDepartment(dept);
        Employee employee = new Employee(eRequest);
        employee.setDepartment(dept);
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
        employee.setId(id);
        return new ResponseEntity<>(employeeService.updateEmployee(employee), HttpStatus.OK);
    }


    @GetMapping("/employees/filterByDepartmentName")
    public ResponseEntity<List<Employee>> getEmployeesByDEPARTMENt(@RequestParam String name){
        return new ResponseEntity<>(employeeService.getEmployeesByDepartmentName(name), HttpStatus.OK);
    }

}
