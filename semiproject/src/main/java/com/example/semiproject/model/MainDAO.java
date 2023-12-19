package com.example.semiproject.model;

import com.example.semiproject.dto.MainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainDAO {
    List<MainDTO> userSchool();
}
