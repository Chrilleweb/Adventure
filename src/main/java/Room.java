public class Room {
    private String roomName;
    private String roomInfo;
    private Room east;
    private Room north;
    private Room west;
    private Room south;



    public Room(String roomName, String roomInfo){
        this.roomName = roomName;
        this.roomInfo = roomInfo;

    }

    public String getRoomName(){
        return roomName;
    }

    public String getRoomInfo(){
        return roomInfo;
    }

    public String toString(){
        return  getRoomName() + " " + getRoomInfo();
    }

    public Room getEast(){
        return east;
    }
    public void setEast(Room east){
        this.east = east;
    }

    public Room getNorth(){
        return north;
    }
    public void setNorth(Room north){
        this.north = north;
    }

    public Room getSouth(){
        return south;
    }
    public void setSouth(Room south){
        this.south = south;
    }

    public Room getWest(){
        return west;
    }
    public void setWest(Room west){
        this.west = west;
    }


}

