//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {


    static Scanner input = new Scanner(System.in);
    static ArrayList<String> taskList = new ArrayList<>();

    public static void main(String[] args) {

        displayMenu();

        int menuSelection = input.nextInt();
        input.nextLine();

        while (menuSelection > -1) {
            if (menuSelection == 1) {
                addATask();
            } else if (menuSelection == 2) {
                removeTask();
            } else if (menuSelection == 3) {
                updateTask();
            } else if (menuSelection == 4) {
                displayAllTasks();
            } else if (menuSelection == 0) {
                exitProgram();
            }
            displayMenu();
            menuSelection = input.nextInt();
            input.nextLine();
        }


    }

    static void addATask() {

        System.out.println("add a task yo");
        taskList.add(input.nextLine());
    }

    static void removeTask() {
        System.out.println("remove a task yo");
        taskList.remove(input.nextLine());
    }

    static void updateTask() {
        System.out.println("update a task yo");
        System.out.println("enter a number");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("what would you like to replace");
        String element = input.nextLine();
        taskList.set(num, element);
    }

    static void displayAllTasks() {
        System.out.println(taskList);
    }

    static void exitProgram() {
        System.out.println("exit yo");
        System.exit(0);
    }


    static void displayMenu() {
        System.out.println("""
                
                 Please choose an option:
                     (1) Add a task.
                     (2) Remove a task.
                     (3) Update a task.
                     (4) List all tasks.
                     (0) Exit.
                """);

    }


}