package TO_DO_LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<Task> task = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n -----To Do List -----");
            System.out.println("1. Add Task");
            System.out.println("2. Show All Tasks");
            System.out.println("3. Mark Task as completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            String choice = scan.nextLine();

            switch (choice) {
                case "1" -> addTask();
                case "2" -> showAllTasks();
                case "3" -> markTaskAsCompleted();
                case "4" -> deleteTask();
                case "5" -> {
                    running = false;
                    System.out.println("Exiting...");
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }

    private static void addTask() {
        System.out.println("Enter Description: ");
        String description = scan.nextLine();
        task.add(new Task(description));
        System.out.println("Added Task!");
    }

    private static void showAllTasks() {
        if (task.isEmpty()) {
            System.out.println("There are no tasks in the database");
            return;
        }
        System.out.println("\n All Tasks: ");
        for (Task task : task) {
            System.out.println(task);
        }
    }

    private static void markTaskAsCompleted() {
        showAllTasks();
        if (task.isEmpty()) return;

        System.out.println("Enter task number to mark as completed: ");
        int taskNumber = Integer.parseInt(scan.nextLine());
        if (taskNumber < 1 || taskNumber > task.size()) {
            System.out.println("Invalid task number");
            return;
        }
        task.get(taskNumber - 1).markCompleted();
        System.out.println("Task marked as completed!");
    }

    private static void deleteTask() {
        showAllTasks();
        if (task.isEmpty()) return;

        System.out.println("Enter task number to delete: ");
        int taskNumber = Integer.parseInt(scan.nextLine());
        task.remove(taskNumber - 1);
        System.out.println("Deleted Task!");
    }
}
