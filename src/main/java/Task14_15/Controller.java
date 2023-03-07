package Task14_15;

import java.util.List;

public class Controller {
    public static void Start(){

        List<String> correctChoices = List.of("1","2","3","4","5","6");
        List<String> correctAns = List.of("y", "n", "yes", "no");
        String ans = "y";
        String name;

        while (!(ans.equals("n") || ans.equals("no"))) {
            View.Menu();
            String choice = View.GetChoice();
            if (correctChoices.contains(choice)) {
                switch (choice) {
                    case "1" -> {
                        View.ShowDB();
                    }
                    case "2" -> {
                        AnimalCreator.AddAnimal();
                    }
                    case "3" -> {
                        name = View.SetName();
                        View.ShowCommands(name);
                    }
                    case "4" -> {
                        name = View.SetName();
                        View.AddCommand(name);
                    }
                    case "5" -> {
                        View.CounterMessege();
                    }
                    case "6" -> {
                        View.ExitMessege();
                        ans = "n";
                    }
                }
            }
            else {
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
