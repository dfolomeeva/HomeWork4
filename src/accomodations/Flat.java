package accomodations;

import enums.AccomodationType;

public class Flat extends Accomodation {
    int utilityBills;
    int numberOfNeighbours;

    public Flat (int floorSpace, int numberOfRooms, int utilityBills, int numberOfNeighbours) {
        super(floorSpace, numberOfRooms, AccomodationType.FLAT);
        this.utilityBills = utilityBills;
        this.numberOfNeighbours = numberOfNeighbours;
    }
}