import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel1;
    private BedRoom bedRoom1;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before(){
        hotel1 = new Hotel();
        bedRoom1 = new BedRoom(1, 2, "double");
        conferenceRoom1 = new ConferenceRoom( "Penicuik", 3 );
        guest1 = new Guest( "John" );
    }

    @Test
    public void checkGuestInBedRoom(){
        hotel1.addBedRoomToHotel( bedRoom1 );
        hotel1.checkInGuestToBedRoom( guest1, bedRoom1 );
        assertEquals( 1, bedRoom1.getGuestsInRoom().size() );
        assertEquals( true, hotel1.getBedRoomsInHotel().get(bedRoom1) );
    }

    @Test
    public void checkGuestInConferenceRoom() {
        hotel1.addConferenceRoomToHotel(conferenceRoom1);
        hotel1.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1,conferenceRoom1.getGuestsInRoom().size());
    }

    @Test
    public void checkoutGuestInConferenceRoom() {
        hotel1.addConferenceRoomToHotel(conferenceRoom1);
        hotel1.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        hotel1.checkOutGuestToConferenceRoom(guest1, conferenceRoom1);

        assertEquals(0,conferenceRoom1.getGuestsInRoom().size());
        assertEquals( false, hotel1.getConferenceRoomsInHotel().get(conferenceRoom1) );

    }

    @Test
    public void checkOutGuestFromBedRoom(){
        hotel1.addBedRoomToHotel(bedRoom1);
        hotel1.checkInGuestToBedRoom(guest1, bedRoom1);
        hotel1.checkOutGuestFromBedRoom(guest1, bedRoom1);

        assertEquals( 0, bedRoom1.getGuestsInRoom().size() );
        assertEquals( false, hotel1.getBedRoomsInHotel().get(bedRoom1) );
    }

}
