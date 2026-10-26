package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        // throwCheckedException();
    }

    public static void throwCheckedException() {
        // IOException - классическое checked исключение
        // (потому что оно наследуется от Exception, а не от RuntimeException)
        try {
            throw new java.io.IOException("Это checked исключение");
        } catch (java.io.IOException e) {
            // Мы его тут же ловим, чтобы main не требовал обработки
            System.out.println("Поймали: " + e.getMessage());
        }
    }
}
