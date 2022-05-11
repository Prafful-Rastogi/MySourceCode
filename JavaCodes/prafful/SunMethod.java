package JavaCodes.prafful;

import java.util.Scanner;

public class SunMethod {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the two numbers:-");
        int num1=in.nextInt();
        int num2=in.nextInt();
        sum(num1, num2);
    }
    static void sum(int a, int b){
        System.out.println("The sum is :- "+(a+b));
    }
}
