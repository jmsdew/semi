package com.example.semiproject.model;

import com.example.semiproject.dto.PraiseDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PraiseDAO {
    int processPraise(PraiseDTO praiseDTO);
}
