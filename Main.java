package com.busreservation;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ParseException {

        ArrayList<bus> buses = new ArrayList<bus>();
        ArrayList<booking> bookings=new ArrayList<booking>();
       buses.add(new bus(1,true,2));
       buses.add(new bus(2,false,50));
       buses.add(new bus(3,true,48));

       for(bus b:buses){
           b.busInfo();
        }

        //1
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        while (userOpt == 1){
        System.out.println("Enter 1 for booking !! " + " 2 for exit....");
        userOpt = scanner.nextInt();
        if (userOpt == 1){
            booking booking = new booking();
            if (booking.isAvailable(bookings,buses)){
                bookings.add(booking);
                System.out.println("Congratulations your Booking is Confirmed. please Check your Mail for more details.. ");
            }
            else
            System.out.println("Sorry bus is full :(  try another bus or date :)");

            //System.out.println("Welcome to bus reservation your booking in Progress please wait...");
            //1
        }
        }
    }
}

