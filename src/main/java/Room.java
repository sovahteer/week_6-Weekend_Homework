import java.util.ArrayList;

public abstract class Room {

    String roomNumber;
    int capacity;
    private ArrayList<Guest> guestList;

    public Room( String roomNumber, int capacity ){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }

    public String getRoomNumber(){ return roomNumber;}

    public int getCapacity(){ return capacity; }

    public int guestCount(){ return guestList.size(); }

    public void addGuest(Guest newGuest){
        guestList.add(newGuest);
    }

    public void removeGuest(Guest guest){
        guestList.remove(guest);
    }

    public ArrayList getGuests(){
        return guestList;

    }

}

