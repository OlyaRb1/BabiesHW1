package org.example;

import org.example.Car.Car;
import org.example.Clock.Clock;
import org.example.Point.Point;
import org.example.Student.Student;
import org.example.task1.BankAccount;
import org.example.taskBook.Book;

public class Main {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount();
//        account1.setBalance(9009000);
//        account1.print();

//        Book book1 = new Book();
//        book1.setTitle ("Преступление и наказание");
//        book1.setAuthor ("Ф.М. Достоевский");
//        book1.setYear (1866);
//        book1.display();

//        Student student1 = new Student();
//        student1.setName("А.А. Петров");
//        student1.setNumber("2024-111а");
//        student1.setScore(4.55);
//        student1.print();

//        Point pointA = new Point();
//        pointA.setX(0);
//        pointA.setY(0);
//        pointA.moveUp();
//        pointA.moveRight();
//        pointA.moveDown();
//        pointA.moveLeft();

//        Clock clock1 = new Clock();
//        clock1.setHours(00);
//        clock1.setMinutes(00);
//        clock1.setSeconds(00);
//        clock1.tick();
//        clock1.readTime();

        Car car1 = new Car();
        car1.setBrand("Audi");
        car1.setModel("80");
        car1.setYear(1988);
        car1.start();
        car1.stop();
        car1.distance();


    }

}