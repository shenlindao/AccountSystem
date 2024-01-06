package program.Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import program.Classes.Animal;
import program.Classes.AnimalEnum;
import program.Classes.Counter;

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
        String type = null;
        AnimalEnum tempEnum = null;

        try (Counter counter = new Counter()) {
            System.out.println("Добавление нового животного\n");
            System.out.println("Введите кличку животного: ");
            try {
                String temp = scanner.nextLine();
                if (temp.isEmpty()) {
                    System.out.println("\nЗначение не может быть пустым");
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
            int month = 1;
            int day = 1;
            try {
                System.out.println("год: ");
                if (year == -1) {
                    System.out.println("\nЗначение не может быть пустым");
                    PartOfMenu.showPart(animalList, scanner);
                } else {
                    year = scanner.nextInt();
                }
                System.out.println("месяц: ");
                if (month == -1) {
                    System.out.println("\nЗначение не может быть пустым");
                    PartOfMenu.showPart(animalList, scanner);
                } else {
                    month = scanner.nextInt();
                }
                System.out.println("день: ");
                if (day == -1) {
                    System.out.println("\nЗначение не может быть пустым");
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
            System.out.println("1 - Собака");
            System.out.println("2 - Кошка");
            System.out.println("3 - Хомяк");
            System.out.println("4 - Лошадь");
            System.out.println("5 - Верблюд");
            System.out.println("6 - Осел");
            System.out.println("другие кнопки - выход из программы");
            System.out.println();
            System.out.println("Выберете номер: ");
            try {
                if (scanner.hasNextInt()) {
                    int menuChoice = scanner.nextInt();
                    switch (menuChoice) {
                        case 1:
                            type = "Собака";
                            break;
                        case 2:
                            type = "Кошка";
                            break;
                        case 3:
                            type = "Хомяк";
                            break;
                        case 4:
                            type = "Лошадь";
                            break;
                        case 5:
                            type = "Верблюд";
                            break;
                        case 6:
                            type = "Осел";
                            break;
                        default:
                            System.out.println("\nХорошего дня!\n");
                            System.exit(0);
                    }
                } else {
                    System.out.println("Некорректный ввод. Введите числовое значение.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nЧто-то пошло не так...");
                System.out.println(e);
                PartOfMenu.showPart(animalList, scanner);
            }

            Animal newAnimal = new Animal(id, name, commands, birthDate, tempEnum);
            newAnimal.setType(type);

            animalList.add(newAnimal);
            counter.add();
            System.out.println("\nНовое животное было успешно добавлено");
            PartOfMenu.showPart(animalList, scanner);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
