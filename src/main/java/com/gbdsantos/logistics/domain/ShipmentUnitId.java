package com.gbdsantos.logistics.domain;

import java.util.UUID;

public record ShipmentUnitId(UUID id) {
  public ShipmentUnitId() {
    this(UUID.randomUUID());
  }
}
