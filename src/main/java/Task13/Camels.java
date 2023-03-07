package Task13;

import java.util.ArrayList;

public class Camels extends PackAnimals{


    String name;
    String date;
    ArrayList<String> commands;

    @Override
    public String getType() {
        return "Camel";
    }

    public Camels() {
    }

    public Camels(String name) {
        this.name = name;
    }

    public Camels(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public Camels(String name, ArrayList<String> commands) {
        this.name = name;
        this.commands = commands;
    }

    public Camels(String name, String date, ArrayList<String> commands) {
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

    @Override
    public String toString() {
        return  "{ type ='" + getType() + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", commands=" + commands +
                " }";
    }
}
