package Task14_15;

import Task13.Animals;

import static Task14_15.AnimalCreator.PackAnimalsDB;
import static Task14_15.AnimalCreator.PetsDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    static Scanner scn = new Scanner(System.in);
    private static String GetAnimalClass(String name) {
        System.out.println("""
                Ur animal is a pet or pack animal?\s
                1. Pet\s
                2. Pack Animal""");
        String choice = GetChoice();
        if (!(choice.equals("1") || choice.equals("2"))) {
            System.out.println("Try again");
            GetAnimalClass(name);
        }
        return choice;
    }
    public static void Menu(){
        System.out.println("""
                Set number to choose:\s
                1. Show all animals\s
                2. Add animal\s
                3. Show commands\s
                4. Learn new command\s
                5. Animals counter\s
                6. Exit
                """);
    }
    public static String GetChoice() {
        return scn.nextLine();
    }
    public static String GetAns() {
        return scn.nextLine().toLowerCase();
    }
    public static String SetName() {
        System.out.println("Enter animal name?");
        return scn.nextLine();
    }
    public static String SetBirth() {
        System.out.println("Enter animal birthdate?");
        return scn.nextLine();
    }
    public static ArrayList<String>SetCommands() {
        List<String> correctAns = List.of("y", "n", "yes", "no");
        System.out.println("What animal can do?");
        ArrayList<String> commands = new ArrayList<>();
        String ans;

        do {
            commands.add(scn.nextLine());
            System.out.println("1 more? (to continue answer must be -> y)");
            ans = GetAns();
        } while (ans.equals("y"));
        return commands;
    }
    public static void Add1MoreAnimal() {
        System.out.println("Add 1 more animal? (y,yes,n,no)");
    }
    public static void AnimalAddedMessege() {
        System.out.println("Animal is added");
    }
    public static void AnimalISNTAddedMessege(){
        System.out.println("Animal ISN'T added");
    }

    public static void CounterMessege() {
        if (Counter.getSum() != 1) {
            System.out.println(Counter.getSum() + " animals at ur farm");
        } else {
            System.out.println(Counter.getSum() + " animal at ur farm");
        }
    }
    public static void WrongChoice() {
        System.out.println("Wrong choice. Try again? (y, yes , n, no)");
    }
    public static void WrongAns() {
        System.out.println("Answer must be in: y, yes, n, no. Try again.");
    }
    public static void ExitMessege(){
        System.out.println("You quit. ");
    }
    public static void AnimalsList() {
        System.out.println("""
                Set number to add animal:\s
                1. Dog\s
                2. Cat\s
                3. Hamster\s
                4. Horse\s
                5. Donkey\s
                6. Camel\s
                7. Exit
                """);
    }
    public static void ShowDB(){
        for (Animals a: PetsDB) {
            System.out.println(a);
        }
        for (Animals a: PackAnimalsDB) {
            System.out.println(a);
        }
    }
    public static void ShowCommands(String name) {
        for (Animals a: PetsDB) {
            if (a.getName().equals(name)){
                System.out.println(a.getName() + " (" + a.getClass() + ") " + "can: " + a.getCommands());
            }
        }
    }
    public static void AddCommand(String name) {
        if (GetAnimalClass(name).equals("1")) {
            if (PetsDB.isEmpty()) {
                System.out.println("There is no pets");
            }
            for (Animals a: PetsDB) {
                if (a.getName().equals(name)){
                    System.out.println("Enter new command");
                    a.getCommands().add(scn.nextLine());
                } else {
                    System.out.println("Animal not found");
                }
            }
        } else {
            if (PackAnimalsDB.isEmpty()) {
                System.out.println("There is no pack animals");
            }
            for (Animals a: PackAnimalsDB) {
                if (a.getName().equals(name)){
                    System.out.println("Enter new command");
                    a.getCommands().add(scn.nextLine());
                } else {
                    System.out.println("Animal not found");
                }
            }
        }
    }
}
