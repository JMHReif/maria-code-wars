package com.jmhreif.mariacodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
//@Entity
//@Table(name = "employees")
public class Employee {
    @Id @NonNull
    @Column(name = "employeeId")
    private Long employeeId;
    @NonNull
    private String lastName, firstName;

    private Date birthDate, hireDate;
    private String title, titleOfCourtesy, address, city, region, postalCode, photo, homePhone, notes, photoPath;
    private Integer extension;
}
