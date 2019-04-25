package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Group firstGr = new Group(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.group - st2.group;
            }
        });

        Student s1 = new Student("Bulat", "Khaziev", 806);
        Student s2 = new Student("Adel", "Khadiev", 806);
        Student s3 = new Student("Dzhalil", "Rakhimov", 806);
        Student s4 = new Student("Nikita", "Chernigov", 806);
        Student s5 = new Student("Danil", "Apsadikov", 806);
        firstGr.add(s2);
        firstGr.add(s5);
        firstGr.add(s4);
        firstGr.add(s3);
        firstGr.add(s1);

        firstGr.printStudents();
        System.out.println();

        Group secondGr = new Group(((st1, st2) -> st1.name.compareTo(st2.name)));
        secondGr.add(s1);
        secondGr.add(s2);
        secondGr.add(s3);
        secondGr.add(s4);
        secondGr.add(s5);

        secondGr.printStudents();
    }
}
