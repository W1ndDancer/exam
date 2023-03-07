package Task13;

import java.util.ArrayList;

public abstract class Pets extends Animals{

    @Override
    public String getType() {
        return "Pet";
    }
    public Pets() {
    }

    public Pets(String name) {
        super(name);
    }

    public Pets(String name, String date) {
        super(name, date);
    }

    public Pets(String name, ArrayList<String> commands) {
        super(name, commands);
    }

    public Pets(String name, String date, ArrayList<String> commands) {
        super(name, date, commands);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }
}
