package com.dspcontroles.course5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course5.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
