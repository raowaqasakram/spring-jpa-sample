package com.example.spring.repositories;

import com.example.spring.domain.EmployeeDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDomain, Integer> {
}
