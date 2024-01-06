package program.Classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Beast extends Animal {
    public Beast(int id, String name, ArrayList<String> commands, GregorianCalendar birthDate, AnimalEnum type) {
        super(id, name, commands, birthDate, type);
    }

    @Override
    public String toString() {
        return "\nВьючное животное:"
        + "\nid: " + getId()
        + "\nкличка: " + getName()
        + "\nкомманды: " + super.getCommands()
        + "\nдата рожденя: " +  super.getBirthDate() + "\n";
    }
}
