package JavaCodes.prafful;

import java.util.Scanner;

public class VoterEligiblity {
    public static void main(String[] args) {
        System.out.println("enter your age :-");
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
        System.out.println(vote(age));
    }
    static String vote(int age){
        if(age>100){
            return "Invalid Input";
        }
        else if(age>=18){
            return "Eligible";
        }
        else{
            return "Not Eligible";
        }
    }
}
