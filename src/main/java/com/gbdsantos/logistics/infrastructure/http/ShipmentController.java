package com.gbdsantos.logistics.infrastructure.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gbdsantos.logistics.infrastructure.http.request.ShipmentCreateRequest;
import com.gbdsantos.logistics.domain.ShipmentUnit;
import com.gbdsantos.logistics.domain.ShipmentUnitRepository;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/shipment")
public class ShipmentController {

  private final ShipmentUnitRepository shipmentUnitRepository;

  public ShipmentController(ShipmentUnitRepository shipmentUnitRepository) {
    this.shipmentUnitRepository = shipmentUnitRepository;
  }

  @PostMapping("/create")
  @ResponseStatus(HttpStatus.CREATED)  
  public void createShipment(
    @RequestBody ShipmentCreateRequest request
  ) {
    ShipmentUnit shipmentUnit = request.toInput();
    shipmentUnitRepository.save(shipmentUnit);
  }

  @GetMapping("/list")
  @ResponseStatus(HttpStatus.OK)
  public List<ShipmentUnit> listShipments() {
    return shipmentUnitRepository.findAll();
  }
}
