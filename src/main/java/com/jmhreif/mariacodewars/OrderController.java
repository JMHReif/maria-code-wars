package com.jmhreif.mariacodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepo orderRepo;

    @GetMapping
    public Iterable<Order> findAllOrders() { return orderRepo.findAll(); }

    @GetMapping("/findbyid")
    public Order findByOrderId(Long orderId) { return orderRepo.findByOrderId(orderId); }

    @GetMapping("/findbyproduct")
    public Iterable<Order> findByProductName(String productName) { return orderRepo.findByProductName(productName); }
}
