package com.example.Student_Library_Management_System.Mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.example.Student_Library_Management_System.Models.Card;

@Mapper
public interface CardMapper {

    @Insert("insert into card  ")
    void createCard(Card card);
}
