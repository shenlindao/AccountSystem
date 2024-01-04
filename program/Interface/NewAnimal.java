package program.Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import program.Classes.Animal;
import program.Classes.AnimalEnum;

public class NewAnimal {
    public static void main(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        addNewAnimal(animalList, scanner);  
    }

    public static void addNewAnimal(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        int id = animalList.get(animalList.size() - 1).getId();
        id += 1;
        String name = null;
        ArrayList<String> commands = new ArrayList<>();
        GregorianCalendar birthDate = null;
        AnimalEnum type = null;

        System.out.println("Добавление нового животного\n");


        System.out.println("Введите кличку животного: ");
        try {
            String temp = scanner.nextLine();
            if (temp == "") {
                System.out.println("\nЗначние не может быть пустым");
                PartOfMenu.showPart(animalList, scanner);
            } else {
                name = temp;
            }
        } catch (Exception e) {
            System.out.println("\nЧто-то пошло не так...");
            PartOfMenu.showPart(animalList, scanner);
        }


        System.out.println("Введите дату рождения животного");
        int year = 1900;
        int month = 01;
        int day = 01;
        try {
            System.out.println("год: ");
            if (year == -1) {
                System.out.println("\nЗначние не может быть пустым");
                PartOfMenu.showPart(animalList, scanner);
            } else {
                year = scanner.nextInt();
            }
            System.out.println("месяц: ");
            if (month == -1) {
                System.out.println("\nЗначние не может быть пустым");
                PartOfMenu.showPart(animalList, scanner);
            } else {
                month = scanner.nextInt();
            }
            System.out.println("день: ");
            if (day == -1) {
                System.out.println("\nЗначние не может быть пустым");
                PartOfMenu.showPart(animalList, scanner);
            } else {
                day = scanner.nextInt();
            }
            birthDate = new GregorianCalendar(year, month, day);
        } catch (Exception e) {
            System.out.println("\nЧто-то пошло не так...");
            PartOfMenu.showPart(animalList, scanner);
        }

        System.out.println("Выберете тип животного: ");
        try {
            type = AnimalEnum.DOG;
        } catch (Exception e) {
            System.out.println("\nЧто-то пошло не так...");
            PartOfMenu.showPart(animalList, scanner);
        }

        Animal newAnimal = new Animal(id, name, commands, birthDate, type);
        animalList.add(newAnimal);
        System.out.println("\nНовое животное было успешно добавлено");
        PartOfMenu.showPart(animalList, scanner);
    }
}
