package com.example.semiproject.controller;

import com.example.semiproject.dto.*;
import com.example.semiproject.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user/*")
public class SchoolController {

    @Autowired
    private StudentService service;

    @Autowired
    private ObjectMapper objectMapper;



    @GetMapping("main")
    public ModelAndView main(ModelAndView mv){
        List<MainDTO> school = service.userSchool();
        List<StudentDTO> student = service.studentName();
        List<StudentDTO> student2 = service.allStudent();

        mv.addObject("student", student);
        mv.addObject("school", school);
        mv.addObject("student2", student2);

        mv.setViewName("/main");
        return mv;
    }
    @GetMapping("rank")
    public ModelAndView rank(ModelAndView mv){
        List<RankDTO> students = service.studentRank();
        List<TopRankDTO> ranking = service.topRank();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("ranking",ranking);
        mv.addObject("students",students);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank");

        return mv;
    }

    @GetMapping("temaRank1")
    public ModelAndView temaRank1(ModelAndView mv){
        List<RankDTO> students = service.temaRank1();
        List<RankDTO> tema = service.findTema1();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank1");

        return mv;
    }
    @GetMapping("temaRank2")
    public ModelAndView temaRank2(ModelAndView mv){
        List<RankDTO> students = service.temaRank2();
        List<RankDTO> tema = service.findTema2();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank2");

        return mv;
    }
    @GetMapping("temaRank3")
    public ModelAndView temaRank3(ModelAndView mv){
        List<RankDTO> students = service.temaRank3();
        List<RankDTO> tema = service.findTema3();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank3");

        return mv;
    }
    @GetMapping("temaRank4")
    public ModelAndView temaRank4(ModelAndView mv){
        List<RankDTO> students = service.temaRank4();
        List<RankDTO> tema = service.findTema4();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank4");

        return mv;
    }
    @GetMapping("temaRank5")
    public ModelAndView temaRank5(ModelAndView mv){
        List<RankDTO> students = service.temaRank5();
        List<RankDTO> tema = service.findTema5();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank5");

        return mv;
    }
    @GetMapping("temaRank6")
    public ModelAndView temaRank6(ModelAndView mv){
        List<RankDTO> students = service.temaRank6();
        List<RankDTO> tema = service.findTema6();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank6");

        return mv;
    }
    @GetMapping("temaRank7")
    public ModelAndView temaRank7(ModelAndView mv){
        List<RankDTO> students = service.temaRank7();
        List<RankDTO> tema = service.findTema7();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank7");

        return mv;
    }
    @GetMapping("temaRank8")
    public ModelAndView temaRank8(ModelAndView mv){
        List<RankDTO> students = service.temaRank8();
        List<RankDTO> tema = service.findTema8();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank8");

        return mv;
    }
    @GetMapping("temaRank9")
    public ModelAndView temaRank9(ModelAndView mv){
        List<RankDTO> students = service.temaRank9();
        List<RankDTO> tema = service.findTema9();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank9");

        return mv;
    }
    @GetMapping("temaRank10")
    public ModelAndView temaRank10(ModelAndView mv){
        List<RankDTO> students = service.temaRank10();
        List<RankDTO> tema = service.findTema10();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/tema/temaRank10");

        return mv;
    }


    @GetMapping("calendar")
    public ModelAndView calendar(){
        List<CalendarDTO> schedule = service.eventToday();
        ModelAndView mv = new ModelAndView();
        mv.addObject("schedule",schedule);
        mv.setViewName("/calendar");
        return mv;
    }
    @GetMapping("management")
    public String management(){
        return "management";
    }

    @PostMapping("/eventData")
    public ResponseEntity<List<CalendarDTO>> getEventData() {

        List<CalendarDTO> eventData = service.eventData();


        // 가져온 이벤트 데이터를 JSON 형태로 응답
        return ResponseEntity.ok(eventData);
    }


    @PostMapping("/calendarSave")
    public ResponseEntity<String> saveCalendarEvent(@RequestBody CalendarDTO calendarEvent) {
        System.out.println(calendarEvent);
        int calendarSave = service.calendarSave(Collections.singletonList(calendarEvent));

        if (calendarSave > 0) {
            System.out.println("등록 성공");
            return ResponseEntity.ok("Success");
        } else {
            // 등록 실패 시 적절한 응답을 반환하거나 예외를 던질 수 있습니다.
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("등록 실패");
        }
    }

    @PostMapping("/handleOption")
    public ModelAndView handleOption(@RequestBody Map<String, String> requestData) {
        String option = requestData.get("option");
        String studentName = requestData.get("studentName");

        System.out.println("Received option: " + option);
        System.out.println("Received student name: " + studentName);

        ModelAndView mv = new ModelAndView();
        // 뷰 내용 추가하기 if 문으로
        if(option.equals("sitDown")){
            SitDTO sitDTO = new SitDTO();
            sitDTO.setStudentName(studentName);
            int sitDown = service.sitDown(sitDTO);
            if(sitDown > 0){
                System.out.println("성공");
            }

            mv.setViewName("/main");
        }else if (option.equals("standUp")){
            // 칭찬에 -10점 주기
            SitDTO sitDTO = new SitDTO();
            sitDTO.setStudentName(studentName);
            int sitDown = service.standUp(sitDTO);
            if(sitDown > 0){
                System.out.println("성공");
            }
            mv.setViewName("/main");
        }
        return mv;
    }

    @PostMapping("/temaRank1")
    public ResponseEntity<List<GradeDTO>> handleStudentName(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");

            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);

            System.out.println("Received student name: " + studentName);
            System.out.println("tema: " + tema);
            System.out.println(gradeDTO);

            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            System.out.println(rankReason);

            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank2")
    public ResponseEntity<List<GradeDTO>> handleStudentName2(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank3")
    public ResponseEntity<List<GradeDTO>> handleStudentName3(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank4")
    public ResponseEntity<List<GradeDTO>> handleStudentName4(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank5")
    public ResponseEntity<List<GradeDTO>> handleStudentName5(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank6")
    public ResponseEntity<List<GradeDTO>> handleStudentName6(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank7")
    public ResponseEntity<List<GradeDTO>> handleStudentName7(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank8")
    public ResponseEntity<List<GradeDTO>> handleStudentName8(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank9")
    public ResponseEntity<List<GradeDTO>> handleStudentName9(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank10")
    public ResponseEntity<List<GradeDTO>> handleStudentName10(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }





    @PostMapping("/processPraise")
    public ModelAndView processPraise(ModelAndView mv, PraiseDTO praiseDTO) {
        int praise = service.processPraise(praiseDTO);
        if(praise > 0){
            System.out.println("성공");
        }
        mv.setViewName("/main");
        return mv;
    }
    @PostMapping("/attendance")
    public ModelAndView attendance(ModelAndView mv, AttendanceDTO attendanceDTO) {
        int attendance = service.attendance(attendanceDTO);
        if(attendance > 0){
            System.out.println("성공");
        }
        mv.setViewName("/main");
        return mv;
    }


}
