package com.company;

import java.util.Objects;

public class student implements  Comparable{

    String name;
    double grade;
    int personalCode;
    public student(String name,double grade, int personalCode){
        this.name=name;
        this.grade=grade;
        this.personalCode=personalCode;

    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Double.compare(student.grade, grade) == 0 && personalCode == student.personalCode && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, personalCode);
    }
    @Override
    public int compareTo(Object o){
        student s = (student) o;
        if (personalCode > ((student) o).getPersonalCode())
            return 1;
        else if (personalCode < ((student) o).getPersonalCode())
            return -1;
        else
            return 0;
    }
}
