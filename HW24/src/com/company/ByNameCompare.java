package com.company;

import java.util.Comparator;

public class ByNameCompare implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        return st1.name.compareTo(st2.name);
    }
}