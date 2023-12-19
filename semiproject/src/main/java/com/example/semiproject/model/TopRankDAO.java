package com.example.semiproject.model;

import com.example.semiproject.dto.TopRankDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TopRankDAO {

    List<TopRankDTO> topRank();
}
