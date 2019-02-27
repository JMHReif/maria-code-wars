package com.jmhreif.mariacodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id @NonNull
    private Long productId;
    @NonNull
    private String productName;

    private String quantityPerUnit;
    private Integer unitsInStock, unitsOnOrder, reorderLevel, discontinued;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties({"product", "orderId", "productId"})
    private List<OrderedProduct> productOrders;
}
