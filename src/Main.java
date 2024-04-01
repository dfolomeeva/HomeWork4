import java.util.Scanner;

import accomodations.Accomodation;
import accomodations.Flat;
import accomodations.HotelSuite;
import accomodations.House;
import java.util.ArrayList;

public class Main {
    static ArrayList<Accomodation> accomodations = new ArrayList<>();
    public static void main(String[] args) {
        accomodations.add(new Flat(90,3,5000,
                2));
        accomodations.add(new HotelSuite(40,1,4500,
                45));
        accomodations.add(new House(200,5,1000,
                2,8000));

    System.out.print("Please choose the type of accomodation");
    String str = new String();
    Scanner scanner = new Scanner(System.in);
        while(str.equals("Flat","HotelSuite, "House")) {
                System.out.print("Thank you for your choice!");
    }
}