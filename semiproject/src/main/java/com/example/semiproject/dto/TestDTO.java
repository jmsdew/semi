package com.example.semiproject.dto;

import java.util.Arrays;

public class TestDTO {
    private String name;
    private Integer score;

    public TestDTO() {
    }

    public TestDTO(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
