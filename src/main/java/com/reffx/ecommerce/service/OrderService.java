package com.reffx.ecommerce.service;

import com.reffx.ecommerce.model.order.Order;
import org.springframework.validation.annotation.Validated;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}