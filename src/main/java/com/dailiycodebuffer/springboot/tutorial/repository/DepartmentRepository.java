package com.dailiycodebuffer.springboot.tutorial.repository;

import com.dailiycodebuffer.springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    @Query("select d from Department d where d.departmentName=?1")
    Department findByDepartmentName(String departmentName);
}
