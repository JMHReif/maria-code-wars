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

    @GetMapping("/findbyorderid")
    public Order findByOrderId(@RequestParam Long orderId) {
        return orderService.findByOrderId(orderId);
    }

//    @GetMapping("/findbyorderidlike")
//    public Iterable<Order> findByOrderIdLike(@RequestParam Long orderId) {
//        return orderService.findByOrderIdLike(orderId);
//    }
}
