package com.jmhreif.mariacodewars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderProducts")
public class OrderedProduct implements Serializable {
    @Id @NonNull
    private Long orderId, productId;

    private Integer quantity;
    private double unitPrice, discount;

    @ManyToOne
    @JoinColumn(name = "orderId", insertable = false, updatable = false)
    @JsonIgnoreProperties("orderedProducts")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "productId", insertable = false, updatable = false)
    @JsonIgnoreProperties("productOrders")
    private Product product;
}
