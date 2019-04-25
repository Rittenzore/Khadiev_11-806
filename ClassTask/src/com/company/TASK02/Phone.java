package com.company.TASK02;

public class Phone {
    private String name;
    private int releaseDate;
    private int wHrs;

    public Phone(String name, int releaseDate, int wHrs) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.wHrs = wHrs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int age) {
        this.releaseDate = age;
    }

    public int getWHrs() {
        return wHrs;
    }

    public void setWHrs(int wHrs) {
        this.wHrs = wHrs;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Release Date = " + releaseDate +
                ", Working Hours = " + wHrs +
                ", Name = " + name +
                '}';
    }


}
