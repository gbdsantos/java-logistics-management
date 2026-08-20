package com.gbdsantos.logistics.domain;

import java.util.List;

public interface ShipmentUnitRepository {
  ShipmentUnit save(ShipmentUnit shipmentUnit);
  List<ShipmentUnit> findAll();
}
