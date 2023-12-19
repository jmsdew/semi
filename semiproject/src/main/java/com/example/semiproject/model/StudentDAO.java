package com.example.semiproject.model;

import com.example.semiproject.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDAO {
    List<StudentDTO> studentName();

    List<StudentDTO> allStudent();
}
