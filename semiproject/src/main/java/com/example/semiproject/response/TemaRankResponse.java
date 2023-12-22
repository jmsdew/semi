package com.example.semiproject.response;

import com.example.semiproject.dto.RankDTO;

import java.util.List;

public class TemaRankResponse {
    private List<RankDTO> students;
    private List<RankDTO> tema;
    private List<RankDTO> first;
    private List<RankDTO> second;
    private List<RankDTO> third;

    public TemaRankResponse() {
    }

    public TemaRankResponse(List<RankDTO> students, List<RankDTO> tema, List<RankDTO> first, List<RankDTO> second, List<RankDTO> third) {
        this.students = students;
        this.tema = tema;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "TemaRankResponse{" +
                "students=" + students +
                ", tema=" + tema +
                ", first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public List<RankDTO> getStudents() {
        return students;
    }

    public void setStudents(List<RankDTO> students) {
        this.students = students;
    }

    public List<RankDTO> getTema() {
        return tema;
    }

    public void setTema(List<RankDTO> tema) {
        this.tema = tema;
    }

    public List<RankDTO> getFirst() {
        return first;
    }

    public void setFirst(List<RankDTO> first) {
        this.first = first;
    }

    public List<RankDTO> getSecond() {
        return second;
    }

    public void setSecond(List<RankDTO> second) {
        this.second = second;
    }

    public List<RankDTO> getThird() {
        return third;
    }

    public void setThird(List<RankDTO> third) {
        this.third = third;
    }
}
