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
                        if (adventure.goNorth()){
                            System.out.println("Going north");
                        } else {
                            System.out.println("You can not go that way");
                        }
                    }

                    case "go south", "south", "s" -> {
                        if (adventure.goSouth()){
                            System.out.println("Going south");
                        } else {
                            System.out.println("You can not go that way");
                        }
                    }

                    case "go east", "east", "e" -> {
                        if (adventure.goEast()){
                            System.out.println("Going east");
                        } else {
                            System.out.println("You can not go that way");
                        }
                    }

                    case "go west", "west", "w" -> {
                        if (adventure.goWest()){
                            System.out.println("Going west");
                        } else {
                            System.out.println("You can not go that way");
                        }
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

