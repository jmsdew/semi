package com.example.semiproject.model;

import com.example.semiproject.dto.AttendanceDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttendanceDAO {
    int attendanceStudent(AttendanceDTO attendanceDTO);
}
