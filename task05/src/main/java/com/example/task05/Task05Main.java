package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) {
        String pathToFile = args.length > 0 ? args[0] : "test.txt"; // Защита от пустого массива args

        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            // ВАЖНО: FileNotFoundException должен идти ПЕРЕД IOException, так как он его наследник
            System.out.println("файл \"" + pathToFile + "\" не найден");
        } catch (IOException e) {
            System.out.println("произошла ошибка при чтении файла \"" + pathToFile + "\"");
        }
    }

    public static String readFile(String pathToFile) throws IOException {
        // try-with-resources автоматически закроет файл
        try (FileReader fileReader = new FileReader(pathToFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            StringBuilder stringBuilder = new StringBuilder();
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(currentLine).append("\n");
            }
            return stringBuilder.toString();
        }
    }
}
