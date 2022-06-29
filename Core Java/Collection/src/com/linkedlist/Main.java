package com.linkedlist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws ParseException {
		String s1="28-01-2000";
        String s2="11-07-1997";
        Date x=new SimpleDateFormat("dd-mm-yyyy").parse(s1);
        Date y=new SimpleDateFormat("dd-mm-yyyy").parse(s2);

        LinkedList<Date> dateList = new LinkedList<Date>();

        // Adding elements to the linked list
        dateList.add(x);
        dateList.add(y);
        int i=dateList.size()-1;
        while(i>=0){
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String strDate= formatter.format(dateList.get(i));
            System.out.print("Your date of Birth is "+strDate + " ");
            int year=1900+dateList.get(i).getYear();
            if(year%4==0)
            {
                System.out.println("it was a leap year");
            }
            else
            {
                System.out.println("It was not a leap year");
            }
            i--;
        }
	}

}
