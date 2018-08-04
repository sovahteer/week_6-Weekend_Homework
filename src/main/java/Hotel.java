import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name, Room[] rooms) {
        this.name = name;
        this.rooms = new ArrayList(Arrays.asList(rooms));
    }

    public String getName() {
        return this.name;
    }

    public void checkIn(String roomNumber, Guest guest) {
        for (Room room : rooms) {
            if (room.roomNumber.equals(roomNumber)) {
                room.addGuest(guest);
            }
        }
    }

    public void checkOut(String roomNumber, Guest guest) {
        for (Room room : rooms) {
            if (room.roomNumber.equals(roomNumber)) {
                room.removeGuest(guest);
            }
        }
    }

    public ArrayList getRoomGuests(String roomNumber) {
        for (Room room : rooms) {
            if (room.roomNumber.equals(roomNumber)) {
                return room.getGuests();
            }
        } return new ArrayList();
    }
}

