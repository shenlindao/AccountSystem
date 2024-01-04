package program.Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import program.Classes.Animal;

public class PartOfMenu {
    public static void main(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        showPart(animalList, scanner);
    }

    public static void showPart(ArrayList<Animal> animalList, Scanner scanner)
            throws IOException, InterruptedException {
        System.out.println("\nНажмите любую клавишу для возврата");
        System.out.println();
        String entry = scanner.nextLine();
        if (!"".equals(entry) || "".equals(entry)) {
            program.Interface.MainInterface.mainMenu(animalList, scanner);
        }
        scanner.close();
    }
}
