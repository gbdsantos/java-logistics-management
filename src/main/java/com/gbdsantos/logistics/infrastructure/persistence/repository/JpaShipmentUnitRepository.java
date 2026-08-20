package com.gbdsantos.logistics.infrastructure.persistence.repository;

import java.util.List;

import com.gbdsantos.logistics.domain.ShipmentUnit;
import com.gbdsantos.logistics.domain.ShipmentUnitRepository;

public class JpaShipmentUnitRepository implements ShipmentUnitRepository {

  @Override
  public ShipmentUnit save(ShipmentUnit shipmentUnit) {
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

  @Override
  public List<ShipmentUnit> findAll() {
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }
  
}
