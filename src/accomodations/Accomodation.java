package accomodations;

import enums.AccomodationType;

public class Accomodation {
    protected int floorSpace;
    protected int numberOfRooms;
    protected AccomodationType accomodationType;
    protected Accomodation (int floorSpace, int numberOfRooms, AccomodationType accomodationType) {
        this.floorSpace = floorSpace;
        this.numberOfRooms = numberOfRooms;
        this.accomodationType = accomodationType;
    }
    public String getAccomodationType() {
        return AccomodationType;
    }
}