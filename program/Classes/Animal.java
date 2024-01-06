package program.Classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Animal {
    private int id;
    public String name;
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

    public void setCommands(List<String> commands) {
        this.commands.addAll(commands);
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
            case ("кошка"):
                this.type = AnimalEnum.CAT;
                break;
            case ("собака"):
                this.type = AnimalEnum.DOG;
                break;
            case ("хомяк"):
                this.type = AnimalEnum.HAMSTER;
                break;
            case ("лошадь"):
                this.type = AnimalEnum.HORSE;
                break;
            case ("верблюд"):
                this.type = AnimalEnum.CAMEL;
                break;
            case ("осел"):
                this.type = AnimalEnum.DONKEY;
                break;
            default:
                System.out.println("\nТип животного не распознан");
        }
    }

    @Override
    public String toString() {
        return "\nЖивотное:"
        + "\nid: " + getId()
        + "\nтип: " + getType()
        + "\nкличка: " + getName()
        + "\nкомманды: " + commands.toString()
        + "\nдата рожденя: " + getBirthDate().get(GregorianCalendar.DATE) + "/"
        + getBirthDate().get(GregorianCalendar.MONTH) + "/"
        + getBirthDate().get(GregorianCalendar.YEAR) + "\n";
    }
}