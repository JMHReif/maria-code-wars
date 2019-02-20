package com.jmhreif.mariacodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id @NonNull
    private String customerId;

    private String companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax;
}
