package com.dailiycodebuffer.springboot.tutorial.repository;

import com.dailiycodebuffer.springboot.tutorial.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class DepartmentRepositoryTest {



    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private TestEntityManager entityManager;
    @BeforeEach
    void setUp() {

        Department department=Department
                .builder()
                .departmentName("Mech")
                .departmentAddress("Cehnai")
                .departmentCode("IT-0001")
                .build();

        entityManager.persist(department);
    }
    @Test
    @Disabled
    public void whenfindbyID_tehhReturnDepattment(){
        Department department=departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(),"Mech");
    }
}