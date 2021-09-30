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
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.DOUBLE, 2);
        conferenceRoom = new ConferenceRoom(RoomType.EVENTROOM2);
    }

    @Test
    public void bedroomListStartsAtZero(){
        int result = hotel.getBedrooms().size();
        assertEquals(0, result);
    }

    @Test
    public void conferenceRoomListStartsAtZero(){
        int result = hotel.getConferenceRooms().size();
        assertEquals(0, result);
    }
}
