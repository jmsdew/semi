package com.example.semiproject.model;

import com.example.semiproject.dto.GradeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeDAO {

    List<GradeDTO> gradeReason(GradeDTO gradeDTO);
}
