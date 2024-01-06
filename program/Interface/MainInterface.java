package program.Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import program.Classes.Animal;

public class MainInterface {
    public static void mainMenu(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Меню");
        System.out.println();
        System.out.println("1 - Завести новое животное");
        System.out.println("2 - Список команд, которое выполняет животное");
        System.out.println("3 - Обучить животное новым командам");
        System.out.println("другие кнопки - выход из программы");
        System.out.println();
        System.out.println("Выберете номер: ");
        try {
            int menuChoise = Integer.parseInt(scanner.nextLine());
            switch (menuChoise) {
                case 1:
                    NewAnimal.addNewAnimal(animalList, scanner);
                    break;
                case 2:
                    Commands.showCommandsList(animalList, scanner);
                    break;
                case 3:
                    Commands.addCommands(animalList, scanner);
                    break;
                default:
                    System.out.println("\nХорошего дня!\n");
                    System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("\nХорошего дня!\n");
            System.exit(0);
        }
        scanner.close();
    }    
}
