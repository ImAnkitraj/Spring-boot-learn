package com.tekion.service;

import com.tekion.dto.Department;
import com.tekion.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department dept) {
        return departmentRepository.save(dept);
    }
}
