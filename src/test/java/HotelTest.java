import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void Before(){
        bedroom = new Bedroom("B-201", BedroomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("C-21", 30,
                "Won't Get Fooled Again", 200.00 );
        hotel = new Hotel("Flannery", new Room[]{
                bedroom,
                conferenceRoom,
                new Bedroom("B-202", BedroomType.SINGLE),
                new Bedroom("B-203", BedroomType.DOUBLE),
                new ConferenceRoom("C-22", 50,
                        "My Generation", 200)});
        guest = new Guest("Gary", 28);
    }

    @Test
    public void hasName(){
        assertEquals("Flannery", hotel.getName());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn("B-201", guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCheckOut(){
        hotel.checkOut("B-201", guest);
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void checkRoomGuests(){
        bedroom.addGuest(guest);
        bedroom.addGuest(new Guest("Glen", 32));
        ArrayList<Guest> guestList = hotel.getRoomGuests("B-201");
        assertEquals(2, guestList.size());
        assertEquals(guest,guestList.get(0));
    }
}
