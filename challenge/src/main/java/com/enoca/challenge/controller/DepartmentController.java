package com.enoca.challenge.controller;


import com.enoca.challenge.dto.DepartmentDto;
import com.enoca.challenge.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;

    // ADD
    @PostMapping
    public ResponseEntity<DepartmentDto> addDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto savedDepartmentDto = departmentService.addDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartmentDto, HttpStatus.CREATED);
    }
    // GET ALL
    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAllDepartments(){
        List<DepartmentDto> departments = departmentService.getAllDepartments();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
    // GET
    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("id") Long id){
        DepartmentDto departmentDto = departmentService.getDepartment(id);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
    // UPDATE
    @PutMapping("{id}")
    public ResponseEntity<DepartmentDto> updateDepartment(@RequestBody DepartmentDto departmentDto, @PathVariable("id") Long id){
        DepartmentDto updatedDepartmentDto = departmentService.updateDepartment(departmentDto, id);
        return new ResponseEntity<>(updatedDepartmentDto, HttpStatus.OK);
    }
    // DELETE
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") Long id){
        departmentService.deleteDepartment(id);
        return ResponseEntity.ok("Department deleted successfully. id: "+id);
    }
}
