package com.dailiycodebuffer.springboot.tutorial.service;

import com.dailiycodebuffer.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment();


    Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId,Department department);

      Department findByDepartmentName(String departmentName);
}
