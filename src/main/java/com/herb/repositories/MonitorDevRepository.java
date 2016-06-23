package com.herb.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.herb.domain.elevator.MonitorDevice;

@RepositoryRestResource(collectionResourceRel = "monitorDevices", path = "monitorDevices")
public interface MonitorDevRepository extends PagingAndSortingRepository<MonitorDevice, Long> {
    Page<MonitorDevice> findAll(Pageable pageable);
}