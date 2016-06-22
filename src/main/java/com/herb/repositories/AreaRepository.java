package com.herb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.herb.domain.Area;

@RepositoryRestResource(collectionResourceRel = "areas", path = "areas")
public interface AreaRepository extends CrudRepository<Area, Long>{

}