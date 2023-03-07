package Task13;

import java.util.ArrayList;

public abstract class Animals {

    String name;
    String date;
    ArrayList<String> commands;
    public String getType() {
        return "Animal";
    }

    public Animals() {
    }
    public Animals(String name) {
        this.name = name;
    }

    public Animals(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public Animals(String name, ArrayList<String> commands) {
        this.name = name;
        this.commands = commands;
    }

    public Animals(String name, String date, ArrayList<String> commands) {
        this.name = name;
        this.date = date;
        this.commands = commands;
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
