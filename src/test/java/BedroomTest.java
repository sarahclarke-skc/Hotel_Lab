import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

}
