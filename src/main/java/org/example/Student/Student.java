package org.example.Student;

public class Student implements Printable {
    private String name;
    private String number;
    private double score;

    public void setName (String name) {
        this.name = name;
    }
    public void setNumber (String number) {
        this.number = number;
    }

    public void setScore (double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Студент " + this.name + ", номер зачетной книжки " + this.number + ", средний балл " + this.score);

    }
}
