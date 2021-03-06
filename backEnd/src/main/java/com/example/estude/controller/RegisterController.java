package com.example.estude.controller;

import com.example.estude.dto.AddressRequest;
import com.example.estude.model.Student;
import com.example.estude.service.StudentService;
import com.example.estude.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Student registra(@RequestBody AddressRequest request){

        return studentService.save(request.getStudent());
    }
    
    @GetMapping("/register")
    public List<Student> findAllRegisters() {
        return studentService.all();
    }

}
