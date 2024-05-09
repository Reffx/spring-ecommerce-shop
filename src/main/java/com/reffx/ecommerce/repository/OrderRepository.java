package com.reffx.ecommerce.repository;

import com.reffx.ecommerce.model.order.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}