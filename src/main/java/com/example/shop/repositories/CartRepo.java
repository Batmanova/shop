package com.example.shop.repositories;

import com.example.shop.entities.Cart;
import com.example.shop.entities.CartPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart, CartPK> { }