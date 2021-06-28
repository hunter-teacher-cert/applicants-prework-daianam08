import java.io.*;
import java.util.*;

public class Craps{
  public static void main(String[]args){
    // part 1
    Scanner inr = new Scanner(System.in);
    System.out.println("To roll, gimme a number: ");
    int rollNum= inr.nextInt();
    System.out.println("You rolled: "+ roll(rollNum));

    // part 2
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of dice: ");
    int dice= in.nextInt();
    System.out.println("Highest possible roll with entered dice number: " + shoot(dice));

    //part 3
    int [] game= {roll(rollNum), shoot(dice)};


  } //main

  
  public static int roll(int rolled){
    Random roller= new Random();
    int numb= roller.nextInt(rolled)+1;
    return numb;
    } //roll

  public static int shoot(int dice){
    final int MAXDICE= 6;
    int maxDice= dice * MAXDICE;
    return maxDice;
    } //shoot

  public static int round(){
    int [] lose={2, 3, 12};
    int [] win= {7,11};
    for (int i=0; i<lose.length; i++){
    if (lose[i]){
      Sytem.out.println("Craps! You lose!");
    } else if (win[i]){
      System.out.println("Natural! You win!");
    } else{
      System.out.println("Your value is a Point!");
      if (win[i]==7){
        Sytem.out.println("Craps! You lose!");
      }
    }
    }
  } //round


} //end of class