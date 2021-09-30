import hotel.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroomTwo;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guestTwo;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Tower");
        bedroom = new Bedroom(RoomType.DOUBLE, 2);
        bedroomTwo = new Bedroom(RoomType.SINGLE, 1);
        conferenceRoom = new ConferenceRoom(RoomType.EVENTROOM1);
        guest = new Guest("Tam Smith", 2);
        guestTwo = new Guest("Tommy Towers", 9);
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Tower", hotel.getHotelName());
    }

    @Test
    public void bedroomListStartsAtZero(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void conferenceRoomListStartsAtZero(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddBedrooms(){
        hotel.addBedrooms(bedroom);
        hotel.addBedrooms(bedroom);
        hotel.addBedrooms(bedroom);
        assertEquals(3, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRooms(){
        hotel.addConferenceRooms(conferenceRoom);
        hotel.addConferenceRooms(conferenceRoom);
        hotel.addConferenceRooms(conferenceRoom);
        assertEquals(3, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckInToBedroom(){
        hotel.checkInBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(true, bedroom.getBooked());
    }

    @Test
    public void canNotCheckInToBedroomTwice(){
        hotel.checkInBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(true, bedroom.getBooked());
        hotel.checkInBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(true, bedroom.getBooked());
    }

    @Test
    public void canNotBookIntoBedroomIfPartySizeTooLarge(){
        hotel.checkInBedroom(bedroomTwo, guest);
        assertEquals(0, bedroom.getGuests().size());
        assertEquals(false, bedroom.getBooked());
    }

    @Test
    public void canCheckInToConferenceRoom(){
        hotel.checkInConferenceRoom(conferenceRoom, guestTwo);
        assertEquals(1, conferenceRoom.getGuests().size());
        assertEquals(true, conferenceRoom.getBooked());
    }

    @Test
    public void canNotCheckInToConferenceTwice(){
        hotel.checkInConferenceRoom(conferenceRoom, guestTwo);
        assertEquals(1, conferenceRoom.getGuests().size());
        assertEquals(true, conferenceRoom.getBooked());
        hotel.checkInConferenceRoom(conferenceRoom, guestTwo);
        assertEquals(1, conferenceRoom.getGuests().size());
        assertEquals(true, conferenceRoom.getBooked());
    }

    @Test
    public void canNotBookIntoConferenceIfPartySizeTooLarge(){
        guestTwo.setPartySize(11);
        hotel.checkInConferenceRoom(conferenceRoom, guestTwo);
        assertEquals(0, conferenceRoom.getGuests().size());
        assertEquals(false, conferenceRoom.getBooked());
    }

    @Test
    public void canCheckOutBedroom(){
        hotel.checkInBedroom(bedroom, guest);
        hotel.checkOutBedroom(bedroom, guest);
        assertEquals(0, bedroom.getGuests().size());
        assertEquals(false, bedroom.getBooked());
    }

    @Test
    public void canCheckOutConferenceRoom(){
        hotel.checkInConferenceRoom(conferenceRoom, guestTwo);
        hotel.checkOutConferenceRoom(conferenceRoom, guestTwo);
        assertEquals(0, conferenceRoom.getGuests().size());
        assertEquals(false, conferenceRoom.getBooked());
    }

}
