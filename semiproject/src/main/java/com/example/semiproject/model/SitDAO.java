package com.example.semiproject.model;

import com.example.semiproject.dto.SitDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SitDAO {
    int sitDown(SitDTO sitDTO);

    int standUp(SitDTO sitDTO);
}
