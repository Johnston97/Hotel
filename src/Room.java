public class Room {
    private String roomNumber;
    private int noOfBeds;
    private Suite suiteName;
    private boolean isFree = true;

    public Room(String roomNumber, int noOfBeds, Suite suiteName){
        this.roomNumber = roomNumber;
        this.noOfBeds = noOfBeds;
        this.suiteName = suiteName;
    }

    public void setIsFree(boolean isFree){
        this.isFree = isFree;
    }

    public boolean isFree(){
        return isFree;
    }

    public void setSuiteName(Suite suiteName){
        this.suiteName = suiteName;
    }

    public Suite getSuiteName(){
        return suiteName;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public void setNoOfBeds(int noOfBeds){
        this.noOfBeds = noOfBeds;
    }

    public int getNoOfBeds(){
      return noOfBeds;
    }

    public String toString(){
        return "Room number" + this.roomNumber;
    }


}
