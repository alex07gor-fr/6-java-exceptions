package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        // Создаем строку и явно присваиваем ей null
        String text = null;
        // Пытаемся вызвать метод у null. Это вызовет NullPointerException
        text.length(); 
    }
}
