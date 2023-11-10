package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentId(Long departmentId);
}
