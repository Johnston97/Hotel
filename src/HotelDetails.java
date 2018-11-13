public class HotelDetails {
    Hotel hotel;

    public HotelDetails(Hotel hotel){
        this.hotel = hotel;
    }

    public String header(){
        String header = new String();

        header = String.format(
                "Name: %s\nTotal Rooms: %s\n", hotel.getName(), hotel.getRooms().size());
        return header;
    }

    public String body(int x){
        String body = new String();

        body = String.format("Guest name: %s\nNoOfGuests: %s\n RoomNumber: %s\n", hotel.getGuests().get(x).getName(),hotel.getGuests().get(x).getNoOfGuests(),hotel.getGuests().get(x).getRoom().getRoomNumber());
        return body;
    }
}
