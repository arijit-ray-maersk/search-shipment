package com.maersk.shipment.searchshipment;

import com.maersk.shipment.searchshipment.model.records.Shipment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ShipmentRepository extends ReactiveCrudRepository<Shipment, Long> {
    Flux<Shipment> findByCustomerId(Long customerId);
}

