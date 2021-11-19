package com.example.estude.repository;

import com.example.estude.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IAddressRepository extends JpaRepository<Address, Integer> {
    default Optional<Address> findById(Integer id) { return null; }

    List<Address> findByStreetContaining(String street);
}
