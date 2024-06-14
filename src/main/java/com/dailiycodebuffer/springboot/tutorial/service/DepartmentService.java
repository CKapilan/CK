package com.dailiycodebuffer.springboot.tutorial.service;

import com.dailiycodebuffer.springboot.tutorial.entity.Department;

public interface DepartmentService {
    public Department saveDepartment();


    Department saveDepartment(Department department);
}
