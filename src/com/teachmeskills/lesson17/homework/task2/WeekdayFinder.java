package com.teachmeskills.lesson17.homework.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date in format \"dd.mm.yyyy\": ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate date = LocalDate.parse(input, formatter); // Парсим введенную дату в объект LocalDate
            String dayOfWeek = date.getDayOfWeek().toString(); // Получаем день недели из объекта LocalDate
            System.out.println("Day of week: " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid data format");
        }
    }
}
