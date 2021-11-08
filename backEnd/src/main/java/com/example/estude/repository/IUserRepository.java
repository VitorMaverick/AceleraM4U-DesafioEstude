package com.example.estude.repository;

import com.example.estude.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Integer> {
    default List<User> findByNameContaining(String username) {
        return null;
    }
}
