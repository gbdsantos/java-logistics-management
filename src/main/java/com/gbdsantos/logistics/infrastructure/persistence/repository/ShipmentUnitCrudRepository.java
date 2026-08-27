package com.gbdsantos.logistics.infrastructure.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gbdsantos.logistics.infrastructure.persistence.entity.ShipmentUnit;
import java.util.UUID;

@RepositoryRestResource(exported =false, path = "_shipmentunit")
public interface ShipmentUnitCrudRepository extends CrudRepository<ShipmentUnit, UUID>{

}