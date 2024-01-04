package program.Classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Horse extends Beast {
    public Horse(int id, String name, ArrayList<String> commands, GregorianCalendar birthDate, AnimalEnum type) {
        super(id, name, commands, birthDate, type);
    }

    @Override
    public String toString() {
        return "Лошадь:"
        + "\nid: " + getId()
        + "\nкличка: " + getName()
        + "\nкомманды: " + super.getCommands()
        + "\nдата рожденя: " +  super.getBirthDate();
    }
}
