package com.example.estude.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idStudent;
    @NotNull @NotEmpty @Length(min = 3, max = 200)
    private String name;
    @NotEmpty @Length(min = 6, message = "Deve possuir no minimo 9 digitos")
    private String email;

    private Integer age;
    @OneToMany( fetch = FetchType.EAGER, mappedBy = "student")
    private List<Address> address;


    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(idStudent, student.idStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent);
    }
}
