package com.jmhreif.mariacodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepo customerRepo;

    @GetMapping("/")
    public Iterable<Customer> findAllCustomers() { return customerRepo.findAll(); }

    @GetMapping("/findbycustomerid")
    public Customer findByCustomerId(@RequestParam String customerId) {
        return customerRepo.findByCustomerId(customerId);
    }

//    @GetMapping("/findbynamelike")
//    public Iterable<Customer> findByCompanyNameLike(@RequestParam String companyName) {
//        return customerRepo.findByCompanyNameLike(companyName);
//    }
}
