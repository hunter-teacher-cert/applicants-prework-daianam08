import java.io.*;
import java.util.*;

public class Time{
	public static void main (String [] args){
	int hour= 3;
	int min= 27;
	int seconds= 45;
	int timeSinceMidnight= (hour * 60)+(min*60)+seconds;
	System.out.println (timeSinceMidnight + "seconds since midnight");
	int timeUntilMidnight= (24*60*60) - timeSinceMidnight;
	System.out.println(timeUntilMidnight+ "seconds until midnight");
	double percentTimePassed= (timeSinceMidnight/timeUntilMidnight);
	System.out.println(percentTimePassed + "percentage of time passed?");
	//review double and percentage stuff
	
	}
}