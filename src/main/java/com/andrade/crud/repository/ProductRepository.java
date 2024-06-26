package com.andrade.crud.repository;

import com.andrade.crud.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
  List<Product> findAllByActiveIsTrue();
}
