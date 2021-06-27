import java.io.*;
import java.util.*;

public class Craps{
  public static void main(String[]args){
    shoot(3);

  } //main

  
    // public static int roll(a){
    //   Random rollNum= new Random();
    //   int numb= random.nextInt(a)+1;
    // }

  public static int shoot(int dice){
    final int MAXDICE= 6;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of dice: ");
    dice= in.nextInt();
    int maxDice= dice * MAXDICE;
    System.out.printf("Max number from roll= %1f", maxDice);
  }




} //end of class