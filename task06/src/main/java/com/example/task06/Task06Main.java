java
package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName(); // Вызов из main
    }

    void printMethodName() {
        // Получаем стек вызовов текущего потока
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        
        // Элемент [0] - это сам метод getStackTrace()
        // Элемент [1] - это метод printMethodName()
        // Элемент [2] - это метод, который ВЫЗВАЛ printMethodName() (то есть main)
        String callerName = stackTrace[2].getMethodName();
        
        System.out.println(callerName); // Выведет "main"
    }
}
