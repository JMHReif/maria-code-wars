package com.jmhreif.mariacodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id @NonNull
    private Long orderId;

    private String customerId;
    private int employeeId;
    private Date orderDate, requiredDate, shippedDate;
    private int shipVia;
    private double freight;
    private String shipName, shipAddress, shipCity, shipRegion, shipPostalCode, shipCountry;
}
