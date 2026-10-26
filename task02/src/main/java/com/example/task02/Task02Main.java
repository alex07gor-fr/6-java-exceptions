package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        // System.out.println(getSeason(-5)); // Для ручной проверки
    }

    static String getSeason(int monthNumber) {
        // Проверяем на некорректный ввод
        if (monthNumber < 1 || monthNumber > 12) {
            // Бросаем исключение с динамическим сообщением
            throw new IllegalArgumentException(
                "monthNumber " + monthNumber + " is invalid, month number should be between 1..12"
            );
        }

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) return "зима";
        if (monthNumber >= 3 && monthNumber <= 5) return "весна";
        if (monthNumber >= 6 && monthNumber <= 8) return "лето";
        return "осень";
    }
}
