package com.tpg.question2;

public class Student {
    private Integer ID;
    private String firstName;
    private Float GPA;

    public Student(Integer id, String name, Float gpa)
    {
        this.ID = id;
        this.firstName = name;
        this.GPA = gpa;
    }

    public Integer getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public Float getGPA() {
        return GPA;
    }

    public String toString(){
        return getFirstName();
    }

    public String toFullDetail(){
        return getID() + " " + getFirstName() + " " + getGPA();
    }
}
