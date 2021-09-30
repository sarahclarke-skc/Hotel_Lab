import hotel.Booking;
import hotel.Guest;
import org.junit.Before;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

public class BookingTest {

    Booking booking;
    Booking bookingTwo;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
        conferenceRoom = new ConferenceRoom(RoomType.EVENTROOM2);
        guest = new Guest("Tam Smith", 2);
        booking = new Booking(bedroom, guest, 3);
        bookingTwo = new Booking(conferenceRoom, guest, 3);
    }
}
