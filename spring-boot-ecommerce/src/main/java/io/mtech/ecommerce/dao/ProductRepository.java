package io.mtech.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.mtech.ecommerce.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
