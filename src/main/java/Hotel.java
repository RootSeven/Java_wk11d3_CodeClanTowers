import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private HashMap<BedRoom, Boolean> bedRoomsInHotel;
    private HashMap<ConferenceRoom, Boolean> conferenceRoomsInHotel;
    private HashMap<String, DiningRoom> diningRoomsInHotel;
    private Booking booking;

    public Hotel() {
        this.bedRoomsInHotel = new HashMap<BedRoom, Boolean> ();
        this.conferenceRoomsInHotel = new HashMap<ConferenceRoom, Boolean>();
        this.diningRoomsInHotel = new HashMap<String, DiningRoom>();
    }

    public HashMap<BedRoom, Boolean> getBedRoomsInHotel() {
        return bedRoomsInHotel;
    }

    public HashMap<ConferenceRoom, Boolean> getConferenceRoomsInHotel() {
        return conferenceRoomsInHotel;
    }

    public void addBedRoomToHotel(BedRoom bedRoom ){
        this.bedRoomsInHotel.put( bedRoom, false );
    }

    public void addConferenceRoomToHotel( ConferenceRoom conferenceRoom ){
        this.conferenceRoomsInHotel.put( conferenceRoom, false );
    }

    public void checkInGuestToBedRoom(Guest guest, BedRoom bedRoom) {
        bedRoom.addGuest(guest);
        this.bedRoomsInHotel.put( bedRoom, true );
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
        this.conferenceRoomsInHotel.put( conferenceRoom, true );
    }

    public void checkOutGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
        if (conferenceRoom.getGuestsInRoom().size() == 0) {
            this.conferenceRoomsInHotel.put(conferenceRoom, false);
        }
    }


    public void checkOutGuestFromBedRoom(Guest guest, BedRoom bedRoom) {
        bedRoom.removeGuest(guest);
        if (bedRoom.getGuestsInRoom().size() == 0 ){
            this.bedRoomsInHotel.put(bedRoom, false);
        }
    }


    public Booking bookBedRoom(BedRoom bedRoom, int nightsStaying) {
        booking = new Booking(bedRoom, nightsStaying);
        return booking;
    }

    public int totalBill(Booking booking) {
        return booking.getNightsBooked() * booking.getBedroom().getNightlyRate();
    }
}

