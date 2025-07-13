package com.kodilla.kodillacourse;
record BookRecord(String author, String titles, int year){}

public class zadanie47 {
    public static void main(String[] args) {
        BookRecord book = new BookRecord("John Novak", "Algorithms and other nightmares", 2018);
                System.out.println(book);
    }
}