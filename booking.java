package com.busreservation;
import java.text.ParseException;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class booking {
    String passengerName;
    int busNo;
    Date date;

    booking() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the passenger name : ");
        passengerName = input.next();
        System.out.println("Enter bus number here : ");
        busNo = input.nextInt();
        System.out.println("Enter date like this format dd-mm-yyyy : ");
        String dateInput = input.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        date = dateFormat.parse(dateInput);

    }

    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
        int capacity = 0;
        for (bus buss : buses) {
            if (buss.getBusNo() == busNo)
                capacity = buss.getBusNo();
        }
        int booked = 0;
        for (booking book : bookings) {
            if (book.busNo == busNo && book.date.equals(date)) {
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
