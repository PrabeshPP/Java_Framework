package com.prabesh.springboottutorial.controller;

import com.prabesh.springboottutorial.entity.Department;
import com.prabesh.springboottutorial.service.DepartmentService;
import com.prabesh.springboottutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
        @Autowired
        private  DepartmentService departmentService;
        @PostMapping("/departments")
        public Department saveDepartment(@RequestBody Department department){
                return departmentService.saveDepartment(department);

        }

}
