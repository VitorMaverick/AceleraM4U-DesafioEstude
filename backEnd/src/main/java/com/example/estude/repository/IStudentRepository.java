package com.example.estude.repository;

import com.example.estude.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByNameContaining(String name);
    
    
}
