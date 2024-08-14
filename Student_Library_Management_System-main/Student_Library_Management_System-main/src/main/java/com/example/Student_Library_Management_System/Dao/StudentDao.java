package com.example.Student_Library_Management_System.Dao;

import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.Services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao {

    boolean createStudent(Student student);
   
    // Student findByEmail(String email) ;

    // //select * from student where country=india ; //Return of Entities
    // List<Student> findByCountry(String country) ;

}
