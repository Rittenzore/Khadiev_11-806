package com.company;

import com.company.TASK02.ComparatorPhones;
import com.company.TASK02.Phone;
import com.company.TASK03.ThreadReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    Predicate<String> pr = (str) -> {
        String str2;
        return Boolean.parseBoolean(str.equals(str2));
    };


    public static void task1(Predicate<String> pr) {
        String[] arr = new String[Integer.MAX_VALUE];
        Scanner sc = new Scanner("Files/in.txt");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] s = line.trim().split(" ");
            for (int i = 0; i < s.length; i++) {
                for (String str :
                        arr) {
                    if (pr.equals(s[0]))

                }
            }
        }
    }

    public static void task2() {
        Comparator<Phone> releaseDatePhone = new Comparator<Phone>() {
            @Override
            public int compare(Phone p1, Phone p2) {
                return Integer.compare(p1.getReleaseDate(), p2.getReleaseDate());
            }
        };
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Samsung", 2000, 5500 ));
        phones.add(new Phone("Xiaomi", 2015, 4500));
        phones.add(new Phone("Honor", 2016, 5000));
        Collections.sort(phones, releaseDatePhone);
        for (Phone l1 :
                phones) {
            System.out.println(l1.toString());
        }
        ComparatorPhones cp = new ComparatorPhones();
        for (Phone l1 :
                phones) {
            for (Phone l2 :
                    phones) {
                cp.compare(l1, l2);
            }
        }
        for (Phone l1 :
                phones) {
            System.out.println(l1.toString());
        }
    }

    public static void task3() {
        ThreadReader tr = new ThreadReader();
        tr.start();
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

}
