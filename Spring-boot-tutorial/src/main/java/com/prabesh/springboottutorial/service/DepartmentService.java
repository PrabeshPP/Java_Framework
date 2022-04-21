package com.prabesh.springboottutorial.service;

import com.prabesh.springboottutorial.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();


    public Department fetchDepartmentByID(Long departmentId);
}
