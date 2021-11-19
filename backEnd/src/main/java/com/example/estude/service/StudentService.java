package com.example.estude.service;

import com.example.estude.model.Student;
import com.example.estude.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository studentRepository;

    public List<Student> all() {
        return studentRepository.findAll();
    }

    public List<Student> findBy(String name) {
        return
                studentRepository.findByNameContaining(name);
    }

    public Optional<Student> findById(Integer id) {

        return studentRepository.findById(id);
    }

    public Page<Student> findBy(String name, Pageable paginacao) {

        return studentRepository.findByNameContaining(name, paginacao);
    }

    public Page<Student> findByPage(Pageable paginacao) {

        return studentRepository.findAll(paginacao);
    }

    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }


    @Transactional
    public void remove(Integer id) {
        studentRepository.deleteById(id);
    }

}
