import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.EVENTROOM2);
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.EVENTROOM2, conferenceRoom.getRoomType());
    }
}
