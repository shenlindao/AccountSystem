package program.Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import program.Classes.Animal;

public class Commands {
    public static void main(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        showCommandsList(animalList, scanner);
    }

    public static void showCommandsList(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        String searchName = null;
        System.out.println("Введите кличку животного: ");
        try {
            String temp = scanner.nextLine();
            if (temp.isEmpty()) {
                System.out.println("\nЗначение не может быть пустым");
                PartOfMenu.showPart(animalList, scanner);
            } else {
                searchName = temp.trim();
                boolean found = false;
                for (Animal animal : animalList) {
                    if (animal.name.equalsIgnoreCase(searchName)) {
                        System.out.println("\nНайдено животное по кличке " + searchName);
                        System.out.println("\nСписок команд:\n");
                        System.out.println(animal.getCommands() + "\n");
                        PartOfMenu.showPart(animalList, scanner);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("\nЖивотное по кличке " + searchName + " не найдено");
                    PartOfMenu.showPart(animalList, scanner);
                }
            }
        } catch (Exception e) {
            System.out.println("\nЧто-то пошло не так...");
            PartOfMenu.showPart(animalList, scanner);
        }
    }

    public static void addCommands(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        String searchName = null;
        
        System.out.println("Введите кличку животного: ");
        try {
            String temp = scanner.nextLine();
            if (temp.isEmpty()) {
                System.out.println("\nЗначение не может быть пустым");
                PartOfMenu.showPart(animalList, scanner);
            } else {
                searchName = temp.trim();
                boolean found = false;
                for (Animal animal : animalList) {
                    if (animal.name.equalsIgnoreCase(searchName)) {
                        System.out.println("\nВведите команды для " + searchName + " через запятую: ");
                        String tempCommands = scanner.nextLine();
                        try {
                            if (tempCommands.trim().isEmpty()) {
                                System.out.println("\nЗначение не может быть пустым");
                                PartOfMenu.showPart(animalList, scanner);
                            } else {
                                List<String> commandList = Arrays.asList(tempCommands.split(","));
                                animal.setCommands(commandList);
                                System.out.println("\nСписок команд:\n");
                                System.out.println(animal.getCommands() + "\n");
                                PartOfMenu.showPart(animalList, scanner);
                                found = true;
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("\nЧто-то пошло не так...");
                            PartOfMenu.showPart(animalList, scanner);
                        }
                    }
                }
                if (!found) {
                    System.out.println("\nЖивотное по кличке " + searchName + " не найдено");
                    PartOfMenu.showPart(animalList, scanner);
                }
            }
        } catch (Exception e) {
            System.out.println("\nЧто-то пошло не так...");
            PartOfMenu.showPart(animalList, scanner);
        }
    }
}
