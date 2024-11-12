package com.consoleorganizer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Пометить задачу как выполненную");
            System.out.println("4. Показать все задачи");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // для обработки новой строки после int

            switch (choice) {
                case 1:
                    System.out.print("Введите наименование задачи: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите описание задачи: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(name, description);
                    break;
                case 2:
                    System.out.print("Введите индекс задачи для удаления: ");
                    int removeIndex = scanner.nextInt();
                    taskManager.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.print("Введите индекс задачи для пометки как выполненной: ");
                    int completeIndex = scanner.nextInt();
                    taskManager.markTaskAsCompleted(completeIndex);
                    break;
                case 4:
                    taskManager.listTasks();
                    break;
                case 5:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}
