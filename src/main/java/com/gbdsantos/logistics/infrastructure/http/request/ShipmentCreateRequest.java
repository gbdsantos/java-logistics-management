package com.gbdsantos.logistics.infrastructure.http.request;

import com.gbdsantos.logistics.domain.ShipmentStatus;
import com.gbdsantos.logistics.domain.ShipmentUnit;
import com.gbdsantos.logistics.domain.ShipmentUnitId;
import com.gbdsantos.logistics.domain.WarehouseId;
import java.util.UUID;

public record ShipmentCreateRequest(
  String id,
  String trackingCode,
  String sku,
  ShipmentStatus status,
  UUID warehouseId
) {
  public ShipmentUnit toInput() {
    return new ShipmentUnit(
      id == null || id.isBlank()
        ? new ShipmentUnitId()
        : new ShipmentUnitId(UUID.fromString(id)),
      trackingCode,
      sku,
      status,
      warehouseId == null ? new WarehouseId() : new WarehouseId(warehouseId)
    );
  }
}