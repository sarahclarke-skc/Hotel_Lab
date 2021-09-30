package rooms;

import hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private RoomType roomType;
    private Boolean booked;

    public Room(ArrayList<Guest> guests, RoomType roomType) {
        this.guests = guests;
        this.roomType = roomType;
        this.booked = false;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean booked) {
        this.booked = booked;
    }
}
