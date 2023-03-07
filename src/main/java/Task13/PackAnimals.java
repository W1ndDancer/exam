package Task13;

import java.util.ArrayList;

public abstract class PackAnimals extends Animals{
    String name;
    String date;
    ArrayList<String> commands;
    @Override
    public String getType() {
        return "Pack animal";
    }
    public PackAnimals() {
    }
    public PackAnimals(String name) {
        super(name);
    }
    public PackAnimals(String name, String date) {
        super(name, date);
    }
    public PackAnimals(String name, ArrayList<String> commands) {
        super(name, commands);
    }
    public PackAnimals(String name, String date, ArrayList<String> commands) {
        super(name, date, commands);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public ArrayList<String> getCommands() {
        return commands;
    }

    @Override
    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }
}
