package com.example.semiproject.service;

import com.example.semiproject.dto.StudentDTO;
import com.example.semiproject.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;



    public List<StudentDTO> studentRank() {
        List<StudentDTO> students = studentDAO.studentRank();
        if(Objects.isNull(students)){              // 반환된 결과 없음     쿼리문에서 에러 발생 체크
            System.out.println("exeception 학생이 없네요 ");
        }
        return students;
    }
}
