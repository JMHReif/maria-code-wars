package com.jmhreif.mariacodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @NonNull
    private Long orderId;

    private String customerId;
    private Integer employeeId;
    private Date orderDate, requiredDate, shippedDate;
    private String shipName, shipAddress, shipCity, shipRegion, shipPostalCode, shipCountry;
    private Integer shipVia;
    private double freight;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties({"order", "orderId", "productId"})
    private List<OrderedProduct> orderedProducts;
}
