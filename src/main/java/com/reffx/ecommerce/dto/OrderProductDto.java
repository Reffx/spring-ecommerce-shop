package com.reffx.ecommerce.dto;

import com.reffx.ecommerce.model.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderProductDto {

    private Product product;
    private Integer quantity;

}