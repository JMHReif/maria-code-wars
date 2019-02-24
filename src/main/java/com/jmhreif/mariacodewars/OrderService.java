package com.jmhreif.mariacodewars;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderService {
    private final OrderRepo orderRepo;

    public Iterable<Order> findAllOrders() { return orderRepo.findAll(); }

    public Order findByOrderId(Long orderId) { return orderRepo.findByOrderId(orderId); }

    public Iterable<Order> findOrdersByOrderedProductsContaining(String productName) { return orderRepo.findOrdersByOrderedProductsContaining(productName); }
}
