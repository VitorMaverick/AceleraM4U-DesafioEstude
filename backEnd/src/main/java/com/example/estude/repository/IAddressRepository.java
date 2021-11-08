package com.example.estude.repository;

import com.example.estude.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAddressRepository extends JpaRepository<Address, Integer> {
    Optional<Address> findById (Integer id);
}
