package com.gbdsantos.logistics.domain;

import java.util.UUID;

public record WarehouseId(UUID id) {
  public WarehouseId() {
    this(UUID.randomUUID());
  }
}
