package com.universumshop.universumshop.repository;

import com.universumshop.universumshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
