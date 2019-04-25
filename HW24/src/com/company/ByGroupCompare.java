package com.company;

import java.util.Comparator;

public class ByGroupCompare implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        return st1.group - st2.group;
    }
}