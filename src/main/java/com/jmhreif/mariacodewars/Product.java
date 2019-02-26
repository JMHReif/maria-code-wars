package com.jmhreif.mariacodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id @NonNull
    private Long productId;

    private String productName, quantityPerUnit;
    private double unitPrice;
    private Integer unitsInStock, unitsOnOrder, reorderLevel, discontinued;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties({"product","orderId","productId"})
    private List<OrderedProduct> productOrders = new ArrayList<>();
}
