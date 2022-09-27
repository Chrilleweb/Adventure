import java.util.Scanner;

public class Userinterface {
    Scanner scan = new Scanner(System.in);
    Adventure adventure = new Adventure();
    String userInput;

    public void startMenu(){
        System.out.println("Welcome to the adventure program!");
        System.out.println("You can use the following commmands:");
        System.out.println("go north\n" + "go south\n" + "go east\n" + "go west\n");
    }

    public void user(){

            while (userInput != "exit"){
                System.out.println("You are in " + adventure.getCurrentPlace().getRoomName() + " Whats next?");
                userInput = scan.nextLine();

                switch (userInput) {
                    case "go north", "north", "n" -> {
                        System.out.println("Going north");
                        adventure.goNorth();
                    }

                    case "go south", "south", "s" -> {
                        System.out.println("Going south");
                        adventure.goSouth();
                        break;
                    }

                    case "go east", "east", "e" -> {
                        System.out.println("Going east");
                        adventure.goEast();
                        break;
                    }

                    case "go west", "west", "w" -> {
                        System.out.println("Going west");
                        adventure.goWest();
                        break;
                    }

                    case "look", "l" -> {
                        System.out.println("look around");
                        System.out.println("You are in: " + adventure.getCurrentPlace().getRoomName());
                        System.out.println("It looks like " + adventure.getCurrentPlace().getRoomInv());
                        break;
                    }

                    case "help", "h" -> {
                        System.out.println("print info");
                        break;
                    }

                    case "exit", "afslut" -> {
                        System.exit(0);
                        break;
                    }

                }
            }



        }



    public void start(){
        startMenu();
        user();
    }
}

