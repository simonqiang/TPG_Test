package com.tpg.question2;

import java.util.Comparator;

public class IDComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student2.getID().compareTo(student1.getID());
    }
}