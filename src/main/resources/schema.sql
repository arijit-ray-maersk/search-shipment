CREATE TABLE shipment
(
    id                 bigint                      NOT NULL,
    customer_id        INTEGER                     NOT NULL,
    booking_ref        VARCHAR(1000),
    bill_of_lading_num VARCHAR(1000),
    shipment_mode      VARCHAR(100),
    shipment_type      VARCHAR(100),
    inland_pickup      VARCHAR(1000),
    port_of_loading    VARCHAR(1000),
    port_of_discharge  VARCHAR(1000),
    inland_delivery    VARCHAR(1000),
    cargo              VARCHAR(300),
    latest_event       VARCHAR(1000),
    bl_status          VARCHAR(500),
    db_created         timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    db_modified        timestamp without time zone
)