import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private Integer capacity;
    private ArrayList<Guest> guestsInRoom;

    public ConferenceRoom(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guestsInRoom = new ArrayList<Guest>();
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }

    public void addGuest(Guest guest) {
        if(this.guestsInRoom.size()< capacity) {
            this.guestsInRoom.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guestsInRoom.remove(guest);
    }
}
