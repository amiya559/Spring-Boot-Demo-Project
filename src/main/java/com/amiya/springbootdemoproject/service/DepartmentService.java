package com.amiya.springbootdemoproject.service;

import com.amiya.springbootdemoproject.entity.Department;
import com.amiya.springbootdemoproject.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();
    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;
    void deleteDepartmentById(Long departmentId);
    Department updateDepartment(Department department, Long departmentId);
    Department fetchDepartmentByName(String departmentName);
}
