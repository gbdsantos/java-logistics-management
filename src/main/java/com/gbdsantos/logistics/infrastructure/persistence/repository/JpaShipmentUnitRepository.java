package com.gbdsantos.logistics.infrastructure.persistence.repository;

import java.util.List;
import java.util.stream.StreamSupport;

import com.gbdsantos.logistics.domain.ShipmentUnit;
import com.gbdsantos.logistics.domain.ShipmentUnitId;
import com.gbdsantos.logistics.domain.ShipmentUnitRepository;
import com.gbdsantos.logistics.domain.WarehouseId;
import org.springframework.stereotype.Repository;

@Repository
public class JpaShipmentUnitRepository implements ShipmentUnitRepository {
  private final ShipmentUnitCrudRepository repository;

  public JpaShipmentUnitRepository(ShipmentUnitCrudRepository repository) {
    this.repository = repository;
  }

  @Override
  public ShipmentUnit save(ShipmentUnit shipmentUnit) {
    return toDomain(repository.save(toEntity(shipmentUnit)));
  }

  @Override
  public List<ShipmentUnit> findAll() {
    return StreamSupport.stream(repository.findAll().spliterator(), false)
      .map(this::toDomain)
      .toList();
  }

  private com.gbdsantos.logistics.infrastructure.persistence.entity.ShipmentUnit toEntity(
    ShipmentUnit shipmentUnit
  ) {
    return new com.gbdsantos.logistics.infrastructure.persistence.entity.ShipmentUnit(
      shipmentUnit.getId().id(),
      shipmentUnit.getTrackingCode(),
      shipmentUnit.getSku(),
      shipmentUnit.getStatus(),
      shipmentUnit.getWarehouseId().id()
    );
  }

  private ShipmentUnit toDomain(
    com.gbdsantos.logistics.infrastructure.persistence.entity.ShipmentUnit shipmentUnit
  ) {
    return new ShipmentUnit(
      new ShipmentUnitId(shipmentUnit.getId()),
      shipmentUnit.getTrackingCode(),
      shipmentUnit.getSku(),
      shipmentUnit.getStatus(),
      new WarehouseId(shipmentUnit.getWarehouseId())
    );
  }
}
