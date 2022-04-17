package com.lad.springwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lad.springwebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
