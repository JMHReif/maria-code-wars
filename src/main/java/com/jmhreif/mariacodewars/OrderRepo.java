package com.jmhreif.mariacodewars;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {

    Order findByOrderId(Long orderId);

    Iterable<Order> findByOrOrderIdLike(Long orderId);
}
