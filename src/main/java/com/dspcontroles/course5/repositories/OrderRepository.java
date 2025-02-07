package com.dspcontroles.course5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course5.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
