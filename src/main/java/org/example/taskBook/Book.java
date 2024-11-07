package org.example.taskBook;

public class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    public void setTitle (String title) {
        this.title = title;
    }
    public void setAuthor (String author) {
        this.author = author;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void display() {
        System.out.println("Книга '" + this.title + "' автор " + this.author + ", год издания " + this.year);
    }
}
