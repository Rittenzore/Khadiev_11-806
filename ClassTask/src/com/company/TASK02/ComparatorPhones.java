package com.company.TASK02;

import java.util.Comparator;

public class ComparatorPhones implements Comparator<Phone> {
    @Override
    public int compare(Phone p1, Phone p2) {
        if (p1.getWHrs() > p2.getWHrs()) {
            return 1;
        } else if (p1.getWHrs() < p2.getWHrs()) {
            return -1;
        } else {
            return 0;
        }
    }
}
