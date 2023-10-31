package com.thelddeveloper.ecommerce.repositories;

import com.thelddeveloper.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
