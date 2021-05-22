package com.example.shop.repositories;

import com.example.shop.entities.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepo extends JpaRepository<Good, Long> { }