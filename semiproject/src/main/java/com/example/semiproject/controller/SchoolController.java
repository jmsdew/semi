package com.example.semiproject.controller;

import com.example.semiproject.dto.MainDTO;
import com.example.semiproject.dto.RankDTO;
import com.example.semiproject.dto.StudentDTO;
import com.example.semiproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/*")
public class SchoolController {

    @Autowired
    private StudentService service;

    @GetMapping("main")
    public ModelAndView main(ModelAndView mv){
        List<MainDTO> school = service.userSchool();
        List<StudentDTO> student = service.studentName();
        List<StudentDTO> student2 = service.allStudent();

        mv.addObject("student", student);
        mv.addObject("school", school);
        mv.addObject("student2", student2);

        mv.setViewName("/main");
        return mv;
    }
    @GetMapping("rank")
    public ModelAndView rank(ModelAndView mv){
        List<RankDTO> students = service.studentRank();
        mv.addObject("students",students);
        mv.setViewName("/rank");

        return mv;
    }
}
