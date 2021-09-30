package hotel;

import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    Booking booking;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void addBedrooms(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addConferenceRooms(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void checkInBedroom(Bedroom bedroom, Guest guest){
        if (!bedroom.getBooked() && guest.getPartySize() <= bedroom.getRoomType().getCapacity()){
            bedroom.getGuests().add(guest);
            bedroom.setBooked(true);
        }
    }

    public void checkInConferenceRoom(ConferenceRoom conferenceRoom, Guest guest){
        if (!conferenceRoom.getBooked() && guest.getPartySize() <= conferenceRoom.getRoomType().getCapacity()){
            conferenceRoom.getGuests().add(guest);
            conferenceRoom.setBooked(true);
        }
    }

    public void checkOutBedroom(Bedroom bedroom, Guest guest) {
        if (bedroom.getBooked()){
            bedroom.getGuests().remove(guest);
            bedroom.setBooked(false);
        }
    }

    public void checkOutConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        if (conferenceRoom.getBooked()){
            conferenceRoom.getGuests().remove(guest);
            conferenceRoom.setBooked(false);
        }
    }

    public Booking makeBooking(Room room, Guest guest, int duration){
        return booking = new Booking(room, guest, duration);
    }
}
