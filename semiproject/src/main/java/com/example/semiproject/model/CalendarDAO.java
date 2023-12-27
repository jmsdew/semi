package com.example.semiproject.model;

import com.example.semiproject.dto.CalendarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Calendar;
import java.util.List;

@Mapper
public interface CalendarDAO {
    int calendarSave(List<CalendarDTO> calendarEvents);


    List<CalendarDTO> eventData();

    List<CalendarDTO> eventToday();
}
