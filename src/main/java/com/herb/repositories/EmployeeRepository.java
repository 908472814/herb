package com.herb.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.herb.domain.user.Employee;



@RepositoryRestResource(collectionResourceRel = "employees", path = "Employee")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    Page<Employee> findAll(Pageable pageable);
    
    Page<Employee> findByName(@Param("name") String name,Pageable pageable);
}