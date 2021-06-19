import java.io.*;
import java.util.*;

public class Date { 
    public static void main(String[] args) {
String day;
day= "Tuesday";
int date;
date = 8;
String month;
month = "June";
int year;
year = 2021;
System.out.println("American format:");
System.out.println(day + ", "+ month +" "+ date+" "+ ", "+ year);
System.out.println("European format:");
System.out.println(day+ " " + date +" "+ month+" " + year);
	}
}

// American format:
// Thursday, July 16, 2015
// European format:
// Thursday 16 July 2015