package com.example.estude.controller;

import com.example.estude.model.Student;
import com.example.estude.repository.IStudentRepository;
import com.example.estude.service.StudentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


   @GetMapping
    public List<Student> list(String name) {
        if(name == null) {
            return studentService.all();
        } else {
            return studentService.findBy(name);
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<Student> findStudentBy(@PathVariable Integer id) {
        Optional<Student> optional = studentService.findById(id);
        if(optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody @Valid Student student, UriComponentsBuilder builder) {
       final Student savedStudent = studentService.save(student);
       final URI uri = builder.path("/students/{id}").buildAndExpand(savedStudent.getIdStudent()).toUri();

       return ResponseEntity.created(uri).body(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody @Valid Student student) {
       Optional<Student> optional = studentService.findById(id);

       if(optional.isPresent() ) {
           student.setIdStudent(id);
           Student updatedStudent = studentService.save(student);
           return ResponseEntity.ok(updatedStudent);
       }else {
           return ResponseEntity.notFound().build();
       }

    }

    @DeleteMapping("{/id}")
    public ResponseEntity<Student> remove(Integer id) {
       Optional<Student> optional = studentService.findById(id);

       if(optional.isPresent()) {
           studentService.remove(id);
           return ResponseEntity.noContent().build();
       }

       return ResponseEntity.notFound().build();
    }

}
