public class Booking {

    private BedRoom bedroom;
    private int nightsBooked;

    public Booking( BedRoom bedroom, int nightsBooked ){
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public BedRoom getBedroom() {
        return bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }
}
