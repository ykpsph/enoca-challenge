package com.enoca.challenge.service.impl;

import com.enoca.challenge.dataAccess.DepartmentRepository;
import com.enoca.challenge.dto.DepartmentDto;
import com.enoca.challenge.exception.ResourceNotFound;
import com.enoca.challenge.model.Department;
import com.enoca.challenge.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    private ModelMapper modelMapper;

    // ADD
    @Override
    public DepartmentDto addDepartment(DepartmentDto departmentDto) {
        Department department = modelMapper.map(departmentDto, Department.class);
        Department savedDepartment = departmentRepository.save(department);
        return modelMapper.map(savedDepartment, DepartmentDto.class);
    }

    // GET ALL
    @Override
    public List<DepartmentDto> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();
        return departments.stream().map((department) -> modelMapper.map(department, DepartmentDto.class)).collect(Collectors.toList());
    }

    // GET
    @Override
    public DepartmentDto getDepartment(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Department is not found. id: "+id));
        return modelMapper.map(department, DepartmentDto.class);
    }

    // UPDATE
    @Override
    public DepartmentDto updateDepartment(DepartmentDto departmentDto, Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Department is not found. id: "+id));

        department.setName(departmentDto.getName());

        Department updatedDepartment = departmentRepository.save(department);

        return modelMapper.map(updatedDepartment, DepartmentDto.class);
    }

    // DELETE
    @Override
    public void deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Department is not found. id: "+id));
        departmentRepository.deleteById(id);
    }
}
