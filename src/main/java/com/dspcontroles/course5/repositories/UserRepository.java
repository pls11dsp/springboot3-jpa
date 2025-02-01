package com.dspcontroles.course5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dspcontroles.course5.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
