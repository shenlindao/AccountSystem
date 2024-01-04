package program.Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import program.Classes.Animal;

public class CommandsList {
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
            if (temp == "") {
                System.out.println("\nЗначние не может быть пустым");
                PartOfMenu.showPart(animalList, scanner);
            } else {
                searchName = temp;
                for (Animal animal : animalList) {
                    if (animal.name.equals(searchName)) {
                        System.out.println("\nНайдено животное по кличке " + searchName);
                        System.out.println("\nСписок команд:\n");
                        System.out.println(animal.getCommands() + "\n");
                        PartOfMenu.showPart(animalList, scanner);
                    } else {
                        System.out.println("\nЖивотное по кличке " + searchName + " не найдено");
                        PartOfMenu.showPart(animalList, scanner);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("\nЧто-то пошло не так...");
            PartOfMenu.showPart(animalList, scanner);
        }
    }
}
