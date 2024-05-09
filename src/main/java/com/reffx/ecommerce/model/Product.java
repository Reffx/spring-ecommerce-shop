package com.reffx.ecommerce.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    private String name;

    private Double price;

    private String pictureUrl;

}