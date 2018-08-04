import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){ bedroom = new Bedroom("B-201", BedroomType.SINGLE);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals("B-201", bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void hasType(){ assertEquals("Single", bedroom.getType());}

    @Test
    public void hasRate(){ assertEquals(25.00, bedroom.getRate(), 0.0);}
}
