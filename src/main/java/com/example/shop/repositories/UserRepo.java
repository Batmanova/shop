package com.example.shop.repositories;

import com.example.shop.entities.Byer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Byer, Long> { }