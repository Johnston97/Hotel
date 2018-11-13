import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private String name;

    public Hotel(){

    }
    private List<Suite> suites = new ArrayList<Suite>();

    private List<Room> rooms = new ArrayList<Room>();
    private List<Employee> employees = new ArrayList<Employee>();
    private List<Guest> guests = new ArrayList<Guest>();

    public void addRoom(Room room) {
        rooms.add(room);
}

    public void getRoom(String roomNumber){
        // search algorithm to get room
    }
    public void addSuite(Suite suite){
        suites.add(suite);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public void removeGuest(Guest guest){
        guest.getRoom().setIsFree(true);
        guests.remove(guest);
    }

    public List<Guest> getGuests(){
        return guests;
    }

    public List<Room> getRooms() {
        return rooms;
    }




    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
