package com.example.estude.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotNull @NotEmpty @Length(min = 3, max = 200)
    private String name;
    @NotEmpty @Length(min = 6, message = "Deve possuir no minimo 6 digitos")
    private String email;

    private Integer age;

    @OneToMany( targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name="student_fk", referencedColumnName = "id")
    private List<Address> addresses;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "user_fk")
    private User user;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> adresses) {
        this.addresses = adresses;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idStudent) {
        this.id = idStudent;
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
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
