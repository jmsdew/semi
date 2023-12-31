package com.example.semiproject.service;

import com.example.semiproject.dto.*;
import com.example.semiproject.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    @Autowired
    private RankDAO rankDAO;

    @Autowired
    private MainDAO mainDAO;
    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private TopRankDAO topRankDAO;

    @Autowired
    private SitDAO sitDAO;
    @Autowired
    private PraiseDAO praiseDAO;
    @Autowired
    private AttendanceDAO attendanceDAO;
    @Autowired
    private GradeDAO gradeDAO;
    @Autowired
    private CalendarDAO calendarDAO;
    @Autowired
    private UserInfoDAO userInfoDAO;


    public List<RankDTO> studentRank() {
        List<RankDTO> students = rankDAO.studentRank();
        if(Objects.isNull(students)){              // 반환된 결과 없음     쿼리문에서 에러 발생 체크
            System.out.println("exeception 학생이 없네요 ");
        }
        return students;
    }

    public List<MainDTO> userSchool() {
        List<MainDTO> school = mainDAO.userSchool();
        return school;
    }

    public List<StudentDTO> studentName() {
        List<StudentDTO> student = studentDAO.studentName();
        return student;
    }

    public List<StudentDTO> allStudent() {
        List<StudentDTO> student2 = studentDAO.allStudent();
        return student2;
    }

    public List<TopRankDTO> topRank() {
        List<TopRankDTO> ranking = topRankDAO.topRank();
        return ranking;
    }

    public List<RankDTO> firstRank() {
        List<RankDTO> first = rankDAO.firstRank();
        return first;
    }

    public List<RankDTO> secondRank() {
        List<RankDTO> second = rankDAO.secondRank();
        return second;
    }

    public List<RankDTO> thirdRank() {
        List<RankDTO> third = rankDAO.thirdRank();
        return third;
    }

    public List<RankDTO> temaRank1() {
        List<RankDTO> students = rankDAO.temaRank1();
        return students;
    }
    public List<RankDTO> temaRank2() {
        List<RankDTO> students = rankDAO.temaRank2();
        return students;
    }
    public List<RankDTO> temaRank3() {
        List<RankDTO> students = rankDAO.temaRank3();
        return students;
    }
    public List<RankDTO> temaRank4() {
        List<RankDTO> students = rankDAO.temaRank4();
        return students;
    }
    public List<RankDTO> temaRank5() {
        List<RankDTO> students = rankDAO.temaRank5();
        return students;
    }
    public List<RankDTO> temaRank6() {
        List<RankDTO> students = rankDAO.temaRank6();
        return students;
    }
    public List<RankDTO> temaRank7() {
        List<RankDTO> students = rankDAO.temaRank7();
        return students;
    }
    public List<RankDTO> temaRank8() {
        List<RankDTO> students = rankDAO.temaRank8();
        return students;
    }
    public List<RankDTO> temaRank9() {
        List<RankDTO> students = rankDAO.temaRank9();
        return students;
    }
    public List<RankDTO> temaRank10() {
        List<RankDTO> students = rankDAO.temaRank10();
        return students;
    }

    public List<RankDTO> findTema1() {
        List<RankDTO> tema = rankDAO.findTema1();
        return tema;
    }
    public List<RankDTO> findTema2() {
        List<RankDTO> tema = rankDAO.findTema2();
        return tema;
    }
    public List<RankDTO> findTema3() {
        List<RankDTO> tema = rankDAO.findTema3();
        return tema;
    }
    public List<RankDTO> findTema4() {
        List<RankDTO> tema = rankDAO.findTema4();
        return tema;
    }
    public List<RankDTO> findTema5() {
        List<RankDTO> tema = rankDAO.findTema5();
        return tema;
    }
    public List<RankDTO> findTema6() {
        List<RankDTO> tema = rankDAO.findTema6();
        return tema;
    }
    public List<RankDTO> findTema7() {
        List<RankDTO> tema = rankDAO.findTema7();
        return tema;
    }
    public List<RankDTO> findTema8() {
        List<RankDTO> tema = rankDAO.findTema8();
        return tema;
    }
    public List<RankDTO> findTema9() {
        List<RankDTO> tema = rankDAO.findTema9();
        return tema;
    }
    public List<RankDTO> findTema10() {
        List<RankDTO> tema = rankDAO.findTema10();
        return tema;
    }

    public int sitDown(SitDTO sitDTO) {
        int sitDown = sitDAO.sitDown(sitDTO);
        return sitDown;
    }

    public int processPraise(PraiseDTO praiseDTO) {
        int praise = praiseDAO.processPraise(praiseDTO);
        return praise;
    }

    public int attendance(AttendanceDTO attendanceDTO) {
        int attendance = attendanceDAO.attendanceStudent(attendanceDTO);
        return attendance;
    }

    public int standUp(SitDTO sitDTO) {
        int standUp = sitDAO.standUp(sitDTO);
        return standUp;
    }

    public List<GradeDTO> gradeReason(GradeDTO gradeDTO) {
        List<GradeDTO> success = gradeDAO.gradeReason(gradeDTO);
        return success;
    }


    public int calendarSave(List<CalendarDTO> calendarEvents) {
        int calendarsave = calendarDAO.calendarSave(calendarEvents);
        return calendarsave;
    }

    public List<CalendarDTO> eventData() {
        List<CalendarDTO> data = calendarDAO.eventData();
        return data;
    }

    public List<CalendarDTO> eventToday() {
        List<CalendarDTO> today = calendarDAO.eventToday();
        return today;
    }

    public int userInfor(UserInfoDTO userInfoDTO, int userCode) {
        int insert = userInfoDAO.userInfor(userInfoDTO, userCode);
        return insert;
    }

    public int studentInfo(List<String> names, int userCode) {
        int insert = userInfoDAO.studentInfo(names,userCode);
        return insert;
    }
}
