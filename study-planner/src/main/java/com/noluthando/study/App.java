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
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {

                System.out.print("Task title: ");
                String title = scanner.nextLine();

                tasks.add(new Task(title));
                System.out.println("Task added.");

            } else if (choice.equals("2")) {

                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(i + ": " + tasks.get(i));
                }

            } else if (choice.equals("3")) {

                System.out.print("Enter task index: ");
                String input = scanner.nextLine();

                try {
                    int index = Integer.parseInt(input);
                    tasks.get(index).markCompleted();
                    System.out.println("Task marked as completed.");
                } catch (Exception e) {
                    System.out.println("Invalid index.");
                }

            } else if (choice.equals("4")) {
                break;

            } else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}