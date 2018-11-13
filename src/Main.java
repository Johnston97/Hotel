import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Hotel trivago = new Hotel();
        System.out.println("Enter hotel name");
        trivago.setName(in.next());           
        System.out.flush();                   
        System.out.println(trivago.getName());

        Suite standardSuite = new Suite("Standard",  40);
        Suite DeluxeSuite = new Suite("Deluxe",  120);

        trivago.addSuite(standardSuite);
        trivago.addSuite(DeluxeSuite);


        Room room1 = new Room("1", 2, standardSuite);
        trivago.addRoom(room1);
        Room room21 = new Room("21", 1, DeluxeSuite);
        trivago.addRoom(room21);

        trivago.addEmployee(new Employee("John Smith", 55, "Owner", 0, 20));
        trivago.addEmployee(new Employee("Will Smith", 55, "Manager", 16, 40));
        trivago.addEmployee(new Employee("Jake Smith", 16, "Front of house", 7.38, 30));




        //Booking List...
        List<Room> vacantRooms = new ArrayList<Room>();



        int noOfVacantRooms = vacantRooms.size();
        //System.out.println("No of vacant rooms pre opening " + trivago.getRooms().toString());


        Guest one = new Guest("Adidam Arjun", 2);
        trivago.addGuest(one);
        if(room1.isFree()) {
            one.setRoom(room1);
        }




        Guest two = new Guest("Eddy Hasan", 1);
        trivago.addGuest(two);
        if(room21.isFree() ) {
            two.setRoom(room21);
        }



        for(int i = 0; i < trivago.getRooms().size();  i++){
            if(trivago.getRooms().get(i).isFree() == true){
                vacantRooms.add(trivago.getRooms().get(i));
            }
        }

        //System.out.println("No of vacant rooms post opening " + vacantRooms);

        //System.out.println("Guest one details " + one.toString());
        //System.out.println("Guest two details " + two.toString());

        HotelDetails report = new HotelDetails(trivago);
        System.out.println(report.header());
        for(int i = 0; i < trivago.getGuests().size(); i++){
            System.out.println(report.body(i));
        }


    }

}
