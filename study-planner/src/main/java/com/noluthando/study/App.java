package com.noluthando.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nStudy Planner");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {

                System.out.print("Task title: ");
                String title = scanner.nextLine();

                tasks.add(new Task(title));

                System.out.println("Task added.");

            } else if (choice.equals("2")) {

                for (Task task : tasks) {
                    System.out.println(task);
                }

            } else if (choice.equals("3")) {

                break;

            } else {

                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}