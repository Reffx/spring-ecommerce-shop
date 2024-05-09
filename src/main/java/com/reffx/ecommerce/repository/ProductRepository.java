package com.reffx.ecommerce.repository;

import com.reffx.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
