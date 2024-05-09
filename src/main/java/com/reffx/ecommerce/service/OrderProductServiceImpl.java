package com.reffx.ecommerce.service;

import com.reffx.ecommerce.model.order.OrderProduct;
import com.reffx.ecommerce.repository.OrderProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}