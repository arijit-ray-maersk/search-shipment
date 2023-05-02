package com.maersk.shipment.searchshipment.controller;

import com.maersk.shipment.searchshipment.model.records.Shipment;
import com.maersk.shipment.searchshipment.service.ShipmentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
public class SearchShipmentController {

    private final ShipmentService shipmentService;

    public SearchShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @QueryMapping
    Flux<Shipment> shipments() {
        return shipmentService.getShipments();
    }

    @QueryMapping
    Flux<Shipment> shipmentsById(@Argument String shipmentId) {
        return shipmentService.getShipmentsById(Long.valueOf(shipmentId));
    }

    @QueryMapping
    Flux<Shipment> shipmentsByCustomerId(@Argument String customerId) {
        return shipmentService.getShipmentsByAccountNumber(Long.valueOf(customerId));
    }

}