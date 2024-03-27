package accomodations;

import enums.AccomodationType;

public class HotelSuite extends Accomodation {
        int rentPrice;
        int floor;

    public HotelSuite(int floorSpace, int numberOfRooms, int rentPrice, int floor) {
        super(floorSpace, numberOfRooms, AccomodationType.HOTELSUITE);
        this.rentPrice = rentPrice;
        this.floor = floor;
    }
}