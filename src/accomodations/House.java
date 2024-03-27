package accomodations;

import enums.AccomodationType;

public class House extends Accomodation {
    int landArea;
    int numberOfFloors;
    int landTax;
    public House(int floorSpace, int numberOfRooms, int landArea, int numberOfFloors, int landTax) {
        super(floorSpace, numberOfRooms, AccomodationType.HOUSE);
        this.landArea = landArea;
        this.numberOfFloors = numberOfFloors;
        this.landTax = landTax;
    }
}