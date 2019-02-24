package com.jmhreif.mariacodewars;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {

    Order findByOrderId(Long orderId);

    @Query("SELECT o FROM Order o INNER JOIN o.orderedProducts op WHERE op.product.productName LIKE %:productName%")
    Iterable<Order> findOrdersByOrderedProductsContaining(String productName);
}
