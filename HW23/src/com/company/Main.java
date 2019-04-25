package com.company;

public class Main {

    public static void main(String[] args) {
        Student Bulat = new Student("Bulat", "Kzhaziev",806);
        Student Adel = new Student(new String("Adel"), new String("Khadiev"),806);
        if(Bulat.equals(Adel) && Bulat.hashCode() == Adel.hashCode())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
