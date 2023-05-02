package com.maersk.shipment.searchshipment.service;

import com.maersk.shipment.searchshipment.ShipmentRepository;
import com.maersk.shipment.searchshipment.model.records.Shipment;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }


    public Flux<Shipment> getShipments() {
        // get from postgresql  db
        return this.shipmentRepository.findAll();

    }

    public Flux<Shipment> getShipmentsById(Long shipmentId) {
        return Flux.from(this.shipmentRepository.findById(shipmentId));
    }

    public Flux<Shipment> getShipmentsByAccountNumber(Long customerId) {
        return this.shipmentRepository.findByCustomerId(customerId);
    }
}
