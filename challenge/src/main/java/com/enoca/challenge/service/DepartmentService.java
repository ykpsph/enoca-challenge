package com.enoca.challenge.service;

import com.enoca.challenge.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto addDepartment(DepartmentDto departmentDto); // ADD
    List<DepartmentDto> getAllDepartments(); // GET ALL
    DepartmentDto getDepartment(Long id); // GET
    DepartmentDto updateDepartment(DepartmentDto departmentDto, Long id); // UPDATE
    void deleteDepartment(Long id);
}
