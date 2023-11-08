package com.enoca.challenge.dataAccess;

import com.enoca.challenge.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
