package com.gbdsantos.logistics.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipmentUnit {
  private ShipmentUnitId id; 
  private String trackingCode;
  private String sku;
  private ShipmentStatus status;
  private WarehouseId warehouseId;

  public ShipmentUnit(
    ShipmentUnitId id, 
    String trackingCode,
    String sku,
    ShipmentStatus status,
    WarehouseId warehouseId
  ) {
    this.id = id == null ? new ShipmentUnitId() : id;
    this.trackingCode = trackingCode;
    this.sku = sku;
    this.status = status;
    this.warehouseId = warehouseId == null ? new WarehouseId() : warehouseId;
  }
}
