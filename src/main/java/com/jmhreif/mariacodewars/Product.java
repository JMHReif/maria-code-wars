package com.jmhreif.mariacodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
//@Entity
//@Table(name = "products")
public class Product {
    @Id @NonNull
    @Column(name = "productId")
    private Long productId;
    @NonNull
    private String productName;
}
