package com.enoca.challenge.service;

import com.enoca.challenge.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto addEmployee(EmployeeDto employeeDto); // ADD
    List<EmployeeDto> getAllEmployees(); // GET ALL
    EmployeeDto getEmployee(Long id); // GET
    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id); // UPDATE
    void deleteEmployee(Long id);

}
