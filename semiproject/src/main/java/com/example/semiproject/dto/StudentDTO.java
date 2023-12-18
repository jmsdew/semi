package com.example.semiproject.dto;

public class StudentDTO {

    private String name;
    private int score;

    public StudentDTO() {
    }

    public StudentDTO(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
