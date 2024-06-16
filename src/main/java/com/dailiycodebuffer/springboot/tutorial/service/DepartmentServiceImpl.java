package com.dailiycodebuffer.springboot.tutorial.service;

import com.dailiycodebuffer.springboot.tutorial.entity.Department;
import com.dailiycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;
import com.dailiycodebuffer.springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment() {
        return null;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department= departmentRepository.findById(departmentId);
        if (!department.isPresent()){
            throw new DepartmentNotFoundException("Department is not available..");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId,Department department) {
        Department depB = departmentRepository.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentID()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())) {
            depB.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depB.setDepartmentCode(department.getDepartmentCode());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depB.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depB);


    }


    @Override
    public Department findByDepartmentName(String  departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }

    @Override
    public Department findByDepartmentNameIgnoreCase(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }


}