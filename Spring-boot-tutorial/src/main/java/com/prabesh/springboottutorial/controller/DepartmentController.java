package com.prabesh.springboottutorial.controller;

import com.prabesh.springboottutorial.entity.Department;
import com.prabesh.springboottutorial.service.DepartmentService;
import com.prabesh.springboottutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//Controller is all about business logic
@RestController
public class DepartmentController {
        @Autowired
        private  DepartmentService departmentService;
        @PostMapping("/departments")
        public Department saveDepartment(@Valid @RequestBody Department department){
                return departmentService.saveDepartment(department);

        }

        @GetMapping("/departments")
        public List<Department> getDepartment(){
                return departmentService.fetchDepartmentList();


        }

        @GetMapping("/departments/{id}")
        public Department fetchById(@PathVariable("id") Long departmentId){
                return departmentService.fetchDepartmentByID(departmentId);
        }

        @DeleteMapping("/departments/{id}")
        public String deleteDepartmentById(@PathVariable("id") Long departmentId){
                departmentService.deleteDepartmentById(departmentId);
                return "Department of id "+departmentId+" was successfully deleted";

        }

        @PutMapping("/departments/{id}")
        public Department updateDepartment(@PathVariable("id") Long departmentId,
                                           @RequestBody Department department){
                return departmentService.updateDepartment(departmentId,department);

        }

        @GetMapping("/departments/name/{name}")
        public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
                return departmentService.getDepartmentByName(departmentName);

        }


}
