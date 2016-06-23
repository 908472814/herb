package com.herb.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.herb.domain.elevator.Elevator;

public interface ElevatorRepository extends PagingAndSortingRepository<Elevator, Long> {

    Page<Elevator> findAll(Pageable pageable);
    
}