package com.example.estude.dto;

import com.example.estude.model.Student;

import java.util.Objects;

public class RegisterRequest {

    private Student student;

    public Student getStudent ()
    {
        return student;
    }

    public void setStudent (Student student)
    {
        this.student = student;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [student = "+student+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisterRequest that = (RegisterRequest) o;
        return Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student);
    }
}
