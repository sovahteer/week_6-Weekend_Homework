import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){ conferenceRoom = new ConferenceRoom("C-21", 30,
            "Baba O'Riley", 200.00);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals("C-21", conferenceRoom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(30, conferenceRoom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(12, conferenceRoom.guestCount());
    }

    @Test
    public void getName(){
        assertEquals( "Baba O'Riley", conferenceRoom.getName());
    }

    @Test
    public void getRate(){
        assertEquals(200.00, conferenceRoom.getRate(), 0.0);
    }
}
