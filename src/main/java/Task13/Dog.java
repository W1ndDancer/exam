package Task13;

import java.util.ArrayList;

public class Dog extends Pets{

    String name;
    String date;
    ArrayList<String> commands;

    @Override
    public String getType() {
        return "Dog";
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public Dog(String name, ArrayList<String> commands) {
        this.name = name;
        this.commands = commands;
    }

    public Dog(String name, String date, ArrayList<String> commands) {
        this.name = name;
        this.date = date;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "{ type ='" + getType() + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", commands=" + commands +
                " }";
    }
}
