package com.maersk.shipment.searchshipment.model.records;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Table("shipment")
public record Shipment(
        @Id
        @Column("id")
        BigInteger id,
        @Column("customer_id")
        Integer customerId,
        @Column("booking_ref")
        String booking_ref,
        @Column("bill_of_lading_num")
        String bill_of_lading_num,
        @Column("shipment_mode")
        String shipment_mode,
        @Column("shipment_type")
        String shipment_type,
        @Column("inland_pickup")
        String inland_pickup,
        @Column("port_of_loading")
        String port_of_loading,
        @Column("port_of_discharge")
        String port_of_discharge,
        @Column("inland_delivery")
        String inland_delivery,
        @Column("cargo")
        String cargo,
        @Column("latest_event")
        String latest_event,
        @Column("bl_status")
        String bl_status,
        @Column("db_created")
        LocalDateTime db_created,
        @Column("db_modified")
        LocalDateTime db_modified
) {
}

enum ShipmentMilestoneEvent {
    BKG, BCD, BDE, CRD, LDD, PUC, PUP, REC, REV, CST, CBK, BCF, DOS, ECC, SIR, MBL, DBL, BLR, DOR, ETD, ATD, PRE, FAC, INV, ARP,
    APP, RTC, BLC, CBS, VGM, SIS, PAC, ANS, ECR
}
