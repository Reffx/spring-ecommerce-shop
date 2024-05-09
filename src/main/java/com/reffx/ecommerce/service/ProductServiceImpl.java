package com.reffx.ecommerce.service;

import com.reffx.ecommerce.exception.ResourceNotFoundException;
import com.reffx.ecommerce.model.Product;
import com.reffx.ecommerce.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductRepository productRepository;


    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}