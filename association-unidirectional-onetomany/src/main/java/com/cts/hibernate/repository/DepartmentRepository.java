package com.cts.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.hibernate.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
