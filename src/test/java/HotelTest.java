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

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Tower");
        bedroom = new Bedroom(RoomType.DOUBLE, 2);
        bedroomTwo = new Bedroom(RoomType.SINGLE, 1);
        conferenceRoom = new ConferenceRoom(RoomType.EVENTROOM2);
        guest = new Guest("Tam Smith", 2);
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
    public void canCheckIn(){
        hotel.checkInBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(true, bedroom.getBooked());
    }

    @Test
    public void canNotCheckInTwice(){
        hotel.checkInBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(true, bedroom.getBooked());
        hotel.checkInBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(true, bedroom.getBooked());
    }

    @Test
    public void canNotBookIfPartySizeTooLarge(){
        hotel.checkInBedroom(bedroomTwo, guest);
        assertEquals(0, bedroom.getGuests().size());
        assertEquals(false, bedroom.getBooked());
    }
}
