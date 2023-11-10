package com.ems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ems.entities.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {
}
