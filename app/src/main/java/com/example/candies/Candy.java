package com.example.candies;

public class Candy {
    private String name;
    private String date;
    private String myscore;
    private int candyResourse;
    public Candy(String name, String date, String myscore, int candyResourse) {
        this.name = name;
        this.date = date;
        this.myscore = myscore;
        this.candyResourse=candyResourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMyscore() {
        return myscore;
    }

    public void setMyscore(String myscore) {
        this.myscore = myscore;
    }

    public int getCandyResourse() {
        return candyResourse;
    }

    public void setCandyResourse(int candyResourse) {
        this.candyResourse = candyResourse;
    }
}
