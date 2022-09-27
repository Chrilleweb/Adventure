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
        startMenu();
        do {
            System.out.println("You are now in " + adventure.getCurrentPlace().getRoomName() +   ". Where do you wanna go?");
            userInput = scan.nextLine();
            switch (userInput) {
                case "go north", "north", "n" -> {
                    System.out.println("Going north");
                    adventure.goNorth();
                    break;
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
                    System.out.println("You are in: " + adventure.getCurrentPlace().getRoomName() );
                    System.out.println("It looks like " + adventure.getCurrentPlace().getRoomInfo());
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
        } while(userInput != "exit");




    }

    public void start(){
        user();
    }
}
