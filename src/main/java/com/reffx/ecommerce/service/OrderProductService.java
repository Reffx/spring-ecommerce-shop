package com.reffx.ecommerce.service;

import com.reffx.ecommerce.model.order.OrderProduct;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface OrderProductService {

    OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}