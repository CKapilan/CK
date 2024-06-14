package com.dailiycodebuffer.springboot.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long DepartmentID;
    private String DepartmentName;
    private String DepartmentAddress;
    private String DepartmentCode;

    public Long getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(Long departmentID) {
        DepartmentID = departmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public Department(Long departmentID, String departmentName, String departmentAddress, String departmentCode) {
        DepartmentID = departmentID;
        DepartmentName = departmentName;
        DepartmentAddress = departmentAddress;
        DepartmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentID=" + DepartmentID +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", DepartmentAddress='" + DepartmentAddress + '\'' +
                ", DepartmentCode='" + DepartmentCode + '\'' +
                '}';
    }

    public Department() {


    }
}
