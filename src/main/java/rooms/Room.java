package rooms;

import hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private RoomType roomType;

    public Room(ArrayList<Guest> guests, RoomType roomType) {
        this.guests = guests;
        this.roomType = roomType;
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

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
