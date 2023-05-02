package com.maersk.shipment.searchshipment;

import graphql.language.StringValue;
import graphql.schema.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

@SpringBootApplication
public class SearchShipmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchShipmentApplication.class, args);
    }
}
