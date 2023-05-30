package org.oop.concepts.Inheritance;

import java.util.Scanner;

public class ShoeFactory {
    //Creating Scanner object
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        //local variables
        String input;
        char again;

        //Creating object of class Boot
        Boot boot = new Boot();

        do {

            System.out.println("Enter your boot brand name:");
            String brand = kb.nextLine();
            boot.setBrand(brand);

            System.out.println("Enter boot color:");
            String color = kb.nextLine();
            boot.setColor(color);

            System.out.println("Enter boot size:");
            long size = kb.nextLong();
            boot.setSize(size);

            System.out.println("Enter boot type:");
            String type = kb.next();
            boot.setType(type);

            System.out.println();

            System.out.println("Customer shoe information:");
            System.out.println("Brand :" + boot.getBrand() );
            System.out.println("Color : " + boot.getColor());
            System.out.println("Size :" + boot.getSize());
            System.out.println("Type : " + boot.getType());

            System.out.println();

            System.out.println("Do you want to order again?");
            System.out.println("Type Y/N?");
            input = kb.next();
            again = input.charAt(0);

        }while (again == 'Y' || again == 'y');


    }
}
