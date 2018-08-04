import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void Before(){ guest = new Guest("Jacob Finlay", 38);}

    @Test
    public void hasName(){
        assertEquals("Jacob Finlay", guest.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(38, guest.getAge());
    }
}
