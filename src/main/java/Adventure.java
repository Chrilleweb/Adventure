public class Adventure {
    private Room currentPlace = new Room("Testrum", "Et midlertidigt testrum");


    public Adventure() {
        createRooms();
    }



    public Room getCurrentPlace(){
        return currentPlace;
    }

    public void createRooms() {
        Room room1 = new Room("Room1", "Your are now in room 1....");
        Room room2 = new Room("Room2", "Your are now in room 2....");
        Room room3 = new Room("Room3", "Your are now in room 3....");
        Room room4 = new Room("Room4", "Your are now in room 4....");
        Room room5 = new Room("Room5", "Your are now in room 5....");
        Room room6 = new Room("Room6", "Your are now in room 6....");
        Room room7 = new Room("Room7", "Your are now in room 7....");
        Room room8 = new Room("Room8", "Your are now in room 8....");
        Room room9 = new Room("Room9", "Your are now in room 8....");

        //GO EAST
        room1.setEast(room2);
        room2.setEast(room3);
        room7.setEast(room8);
        room8.setEast(room9);

        //GO NORTH
        room7.setNorth(room4);
        room4.setNorth(room1);
        room9.setNorth(room6);
        room6.setNorth(room3);
        room8.setNorth(room5);

        //GO SOUTH
        room1.setSouth(room4);
        room4.setSouth(room7);
        room3.setSouth(room6);
        room6.setSouth(room9);
        room5.setSouth(room8);

        //GO WEST
        room3.setWest(room2);
        room2.setWest(room1);
        room9.setWest(room8);
        room8.setWest(room7);

        currentPlace = room1;
    }

    public void goEast() {
        currentPlace = currentPlace.getEast();
    }

    public void goNorth(){
        currentPlace = currentPlace.getNorth();
    }

    public void goSouth(){
        currentPlace = currentPlace.getSouth();
    }

    public void goWest(){
        currentPlace = currentPlace.getWest();
    }



}

