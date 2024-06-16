package com.dailiycodebuffer.springboot.tutorial.service;

import com.dailiycodebuffer.springboot.tutorial.entity.Department;
import com.dailiycodebuffer.springboot.tutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
        Department department= Department.builder()
                .departmentName("IT")
                .departmentAddress("Nune")
                .departmentCode("IT-33")
                .departmentID(1L)
                .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("Get data base on valid dept name")
    @Disabled
    public void whenvaliddepartmentname_thenDepartmentShouldFound(){
        String departmentName ="IT";
        Department found =departmentService.findByDepartmentNameIgnoreCase(departmentName);

        assertEquals(departmentName,found.getDepartmentName());
    }
}