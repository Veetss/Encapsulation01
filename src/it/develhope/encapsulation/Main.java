package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the address, floor number and the name of the resident divided by a coma (in this specific order)");

        House house = new House();
        house.setAddress(s.nextLine());
        house.setFloorsNumber(Integer.parseInt(s.nextLine()));

        String str = s.nextLine();

        house.setResidentsNames(new String[]{str});

        String a = String.format("Resident: " + Arrays.toString(house.getResidentNames()) + " - Address: " + house.getAddress() + " - Floor number: " + house.getFloorsNumber());
        System.out.println(a);
    }
}
