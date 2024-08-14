package com.example.Student_Library_Management_System.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student_Library_Management_System.Dao.StudentDao;
import com.example.Student_Library_Management_System.Mappers.StudentMapper;
import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.Services.StudentService;

@Repository
public class StudentDaoImpl implements StudentDao {

@Autowired
    private StudentMapper studentMapper;

@Override
public boolean createStudent(Student student) {
   boolean added= studentMapper.addStudent(student);
    if(added==true){
        return true;
    }
    return false;
}
}
