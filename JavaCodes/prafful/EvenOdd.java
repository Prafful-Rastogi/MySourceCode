package JavaCodes.prafful;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:- ");
        int num=in.nextInt();
        String get=check(num);
        System.out.println("The number is "+get);
    }
    static String check(int a){
        return (a%2==0?"even":"odd");
    }
}
