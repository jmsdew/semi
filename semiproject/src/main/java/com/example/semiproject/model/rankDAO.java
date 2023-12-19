package com.example.semiproject.model;

import com.example.semiproject.dto.RankDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface rankDAO {
    List<RankDTO> studentRank();
}
