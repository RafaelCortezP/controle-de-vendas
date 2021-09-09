package com.rafaelcortez.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcortez.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
