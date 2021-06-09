import java.io.*;
import java.util.*;

public class Time{
	public static void main (String [] args){
	double hour= 3;
	double min= 27;
	double seconds= 45;
	double timeSinceMidnight= (hour * 60)+(min*60)+seconds;
	System.out.println (timeSinceMidnight + "seconds since midnight");
	double timeUntilMidnight= (24*60*60) - timeSinceMidnight;
	System.out.println(timeUntilMidnight+ "seconds until midnight");
	double percentTimePassed= (timeSinceMidnight/timeUntilMidnight);
	System.out.println(percentTimePassed + "percentage of time passed");

	double timeNow= (8*3600)+(47*60)+36;
	System.out.println("About " + (timeNow-timeSinceMidnight) + " seconds has passed since I started this lab") ;

	
	}
}