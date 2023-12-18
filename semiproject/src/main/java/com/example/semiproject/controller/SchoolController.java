package com.example.semiproject.controller;

import com.example.semiproject.dto.StudentDTO;
import com.example.semiproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/*")
public class SchoolController {

    @Autowired
    private StudentService service;

    @GetMapping("main")
    public void main(){

    }
    @GetMapping("rank")
    public ModelAndView rank(ModelAndView mv){
        List<StudentDTO> students = service.studentRank();
        mv.addObject("students",students);
        mv.setViewName("/rank");

        return mv;
    }
}
