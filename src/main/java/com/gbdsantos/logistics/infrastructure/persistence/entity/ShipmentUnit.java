package com.gbdsantos.logistics.infrastructure.persistence.entity;

import com.gbdsantos.logistics.domain.ShipmentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class ShipmentUnit {
  @Id
  private UUID id; 
  
  private String trackingCode;
  private String sku;
  @Enumerated(EnumType.STRING)
  private ShipmentStatus status;
  private UUID warehouseId;
}
