package hotel;

import rooms.Room;

public class Booking {

    private Room room;
    private Guest guest;
    private int numOfNights;

    public Booking(Room room, Guest guest, int numOfNights) {
        this.room = room;
        this.guest = guest;
        this.numOfNights = numOfNights;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }
}
