package com.jmhreif.mariacodewars;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

    Customer findByCustomerId(String customerId);

//    Iterable<Customer> findByCompanyNameLike(String companyName);
}
