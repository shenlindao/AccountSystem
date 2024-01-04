package program.Classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Animal {
    private int id;
    private String name;
    private ArrayList<String> commands = new ArrayList<>();
    private GregorianCalendar birthDate;
    private AnimalEnum type;

    public Animal(int id, String name, ArrayList<String> commands, GregorianCalendar birthDate, AnimalEnum type) {
        this.id = id;
        this.name = name;
        this.commands = commands;
        this.birthDate = birthDate;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommands() {
        return commands.toString();
    }

    public void setCommands(String commands) {
        this.commands.add(commands);
    }

    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(GregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }

    public AnimalEnum getType() {
        return type;
    }

    public void setType(String type) {
        switch (type.toLowerCase()) {
            case ("Кошка"):
                this.type = AnimalEnum.CAT;
                break;
            case ("Собака"):
                this.type = AnimalEnum.DOG;
                break;
            case ("Хомяк"):
                this.type = AnimalEnum.HAMSTER;
                break;
            case ("Лошадь"):
                this.type = AnimalEnum.HORSE;
                break;
            case ("Верблюд"):
                this.type = AnimalEnum.CAMEL;
                break;
            case ("Осел"):
                this.type = AnimalEnum.DONKEY;
                break;
            default:
                System.out.println("\nТип животного не распознан");
        }
    }

    @Override
    public String toString() {
        return "Животное:"
        + "\nid: " + getId()
        + "\nкличка: " + getName()
        + "\nкомманды: " + commands.toString()
        + "\nдата рожденя: " +  birthDate;
    }
}