public class Guest {
    private String name;
    private int noOfGuests;
    private Room room;

    public Guest(String name, int noOfGuests){
        this.name = name;
        this.noOfGuests = noOfGuests;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNoOfGuests(){
        this.noOfGuests = noOfGuests;
    }

    public int getNoOfGuests() {
        return noOfGuests;
    }

    public void setRoom(Room room) {
        this.room = room;
        this.room.setIsFree(false);

    }

    public Room getRoom() {
        return room;
    }

    public String toString(){
        return "Guest Name" + this.getName() + "Room Number" + this.getRoom().getRoomNumber();
    }

}
