package com.reffx.ecommerce.repository;

import com.reffx.ecommerce.model.order.OrderProduct;
import com.reffx.ecommerce.model.order.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}