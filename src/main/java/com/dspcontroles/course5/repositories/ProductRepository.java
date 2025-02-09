package com.dspcontroles.course5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course5.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
