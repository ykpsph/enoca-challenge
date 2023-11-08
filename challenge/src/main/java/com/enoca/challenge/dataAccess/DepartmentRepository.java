package com.enoca.challenge.dataAccess;

import com.enoca.challenge.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
