import java.util.ArrayList;

public class BedRoom {

    private Integer roomNumber;
    private Integer capacity;
    private String type;
    private ArrayList<Guest> guestsInRoom;
    private int nightlyRate;

    public BedRoom(Integer roomNumber, Integer capacity, String type, int nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestsInRoom = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }

    public void addGuest(Guest guest) {
        if (this.guestsInRoom.size() < this.capacity) {
            this.guestsInRoom.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guestsInRoom.remove(guest);
    }
}
