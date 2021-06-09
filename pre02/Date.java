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
System.out.print("American format:");
System.out.print(day, month + date, year);
System.out.print("European format:");
System.out.println(day, date + month,year);

	}
}