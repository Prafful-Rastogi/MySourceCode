package JavaCodes.prafful;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the year :-");
        int year=in.nextInt();
        if(year%4==0){
            System.out.println(year+ " is a leap year.");
        }
        else if(year%100==0){
             if (year%400==0){
                System.out.println("This is leap year.");
            }
            else{
                System.out.println("this  is not a leap year.");
            }
        }
        else{

            System.out.println("this is not a leap year.");
        }
    }
}
