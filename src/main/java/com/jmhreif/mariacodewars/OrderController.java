package com.jmhreif.mariacodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/")
    public Iterable<Order> findAllOrders() { return orderService.findAllOrders(); }

    @GetMapping("/findorderbyid")
    public Order findOrderByOrderId(@RequestParam Long orderId) {
        return orderService.findOrderByOrderId(orderId);
    }

    @GetMapping("/findordersbyproduct")
    public Iterable<Order> findOrdersByOrderedProductsContaining(@RequestParam String productName) { return orderService.findOrdersByOrderedProductsContaining(productName); }
}
