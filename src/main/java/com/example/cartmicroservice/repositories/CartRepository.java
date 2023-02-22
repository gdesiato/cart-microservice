package com.example.cartmicroservice.repositories;

import com.example.cartmicroservice.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository <Cart, Long> {
    Cart findByUserId(Long userId);
}
