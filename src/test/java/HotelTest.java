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
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Tower");
        bedroom = new Bedroom(RoomType.DOUBLE, 2);
        conferenceRoom = new ConferenceRoom(RoomType.EVENTROOM2);
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
}
