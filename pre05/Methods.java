import java.io.*;
import java.util.*;

public class Methods{
  public static void main(String[] args){
    System.out.println(isDivisible());
    System.out.println(isTriangle());
    System.out.println(ack());
  }
  public static boolean isDivisible () {
    Scanner in= new Scanner(System.in);
    System.out.print("Is this divisible? Enter one number: ");
    int n = in.nextInt();
    System.out.print("Enter another number: ");
    int m = in.nextInt();
    if (n%m == 0){
    return true;
    } else {
      return false;
    }
  }

  public static boolean isTriangle(){
    Scanner tri= new Scanner(System.in);
    System.out.print("Is this a triangle? Enter one side: ");
    int a= tri.nextInt();
    System.out.print("Enter the second side: ");
    int b= tri.nextInt();
    System.out.print("Enter the last side: ");
    int c= tri.nextInt();
    if (a+b<c){
      return false;
    } else if (a+c<b){
      return false;
    } else if(b+c<a){
      return false;
    } else{
      return true;
    }
  }

// for the problem below, reread recurse section!
  public static boolean ack(){
    Scanner ackCheck= new Scaner(System.in);
    System.out.print("Enter first integer: ");
    int n= ackCheck.nextInt();
    System.out.print("Enter second integer: ");
    int m= ackCheck.nextInt();
    int A;
  if (m==0){
    A(m,n)=n+1
  }else if(m>0 && n=0){
    A(m,n)=
  }

  }



}
