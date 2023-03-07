package Task14_15;

import Task13.*;

import java.util.ArrayList;
import java.util.List;

public class AnimalCreator {
    public static ArrayList<Animals> PetsDB = new ArrayList<>();
    public static ArrayList<Animals> PackAnimalsDB = new ArrayList<>();

    static List<String> correctChoices = List.of("1","2","3","4","5","6","7");
    static List<String> correctAns = List.of("n", "no", "y", "yes");

    static String name;
    static String birth;
    static ArrayList<String> commands;

    public static boolean TryToAdd() {
        try {
            //name = null;
            if (!(name.isEmpty() && birth.isEmpty() && commands.isEmpty())) {
                Counter.add();
                return true;
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void AddAnimal(){
        String ans = "y";

        while (!(ans.equals("no") || ans.equals("n"))) {
            View.AnimalsList();
            String choice = View.GetChoice();
            if (correctChoices.contains(choice)) {
                switch (choice) {
                    case "1" -> {
                        name = View.SetName();
                        birth = View.SetBirth();
                        commands = View.SetCommands();
                        if(TryToAdd()) {
                            PetsDB.add(new Dog(name, birth, commands));
                            View.AnimalAddedMessege();
                        } else {
                            View.AnimalISNTAddedMessege();
                        }
                    }
                    case "2" -> {
                        name = View.SetName();
                        birth = View.SetBirth();
                        commands = View.SetCommands();
                        if(TryToAdd()) {
                            PetsDB.add(new Cats(name, birth, commands));
                            View.AnimalAddedMessege();
                        } else {
                            View.AnimalISNTAddedMessege();
                        }
                    }
                    case "3" -> {
                        name = View.SetName();
                        birth = View.SetBirth();
                        commands = View.SetCommands();
                        if(TryToAdd()) {
                            PetsDB.add(new Hamsters(name, birth, commands));
                            View.AnimalAddedMessege();
                        } else {
                            View.AnimalISNTAddedMessege();
                        }
                    }
                    case "4" -> {
                        name = View.SetName();
                        birth = View.SetBirth();
                        commands = View.SetCommands();
                        if(TryToAdd()) {
                            PackAnimalsDB.add(new Horses(name, birth, commands));
                            View.AnimalAddedMessege();
                        } else {
                            View.AnimalISNTAddedMessege();
                        }
                    }
                    case "5" -> {
                        name = View.SetName();
                        birth = View.SetBirth();
                        commands = View.SetCommands();
                        if(TryToAdd()) {
                            PackAnimalsDB.add(new Donkeys(name, birth, commands));
                            View.AnimalAddedMessege();
                        } else {
                            View.AnimalISNTAddedMessege();
                        }
                    }
                    case "6" -> {
                        name = View.SetName();
                        birth = View.SetBirth();
                        commands = View.SetCommands();
                        if(TryToAdd()) {
                            PackAnimalsDB.add(new Camels(name, birth, commands));
                            View.AnimalAddedMessege();
                        } else {
                            View.AnimalISNTAddedMessege();
                        }
                    }
                    case "7" -> {
                        View.ExitMessege();
                        ans = "n";
                    }
                }
            } else {
                View.WrongChoice();
                ans = View.GetAns();
                if (!correctAns.contains(ans)) {
                    while (!correctAns.contains(ans)) {
                        View.WrongAns();
                        ans = View.GetAns();
                    }
                }
            }
        }
    }

}
