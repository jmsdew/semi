package com.example.semiproject.service;

import com.example.semiproject.dto.MainDTO;
import com.example.semiproject.dto.RankDTO;
import com.example.semiproject.dto.StudentDTO;
import com.example.semiproject.model.MainDAO;
import com.example.semiproject.model.StudentDAO;
import com.example.semiproject.model.rankDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    @Autowired
    private rankDAO rankDAO;

    @Autowired
    private MainDAO mainDAO;
    @Autowired
    private StudentDAO studentDAO;



    public List<RankDTO> studentRank() {
        List<RankDTO> students = rankDAO.studentRank();
        if(Objects.isNull(students)){              // 반환된 결과 없음     쿼리문에서 에러 발생 체크
            System.out.println("exeception 학생이 없네요 ");
        }
        return students;
    }

    public List<MainDTO> userSchool() {
        List<MainDTO> school = mainDAO.userSchool();
        return school;
    }

    public List<StudentDTO> studentName() {
        List<StudentDTO> student = studentDAO.studentName();
        return student;
    }

    public List<StudentDTO> allStudent() {
        List<StudentDTO> student2 = studentDAO.allStudent();
        return student2;
    }
}
