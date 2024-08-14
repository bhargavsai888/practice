package com.example.Student_Library_Management_System.Mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.Student_Library_Management_System.Models.Student;

@Mapper
public interface StudentMapper {

    @Insert("insert into student (name,email,age,mobile_number,country)values(#{name},#{email},#{age},#{mobNo},#{country})")
   boolean  addStudent(Student student);
}
