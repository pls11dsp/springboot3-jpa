package com.dspcontroles.course5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course5.entities.OrderItem;
import com.dspcontroles.course5.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
