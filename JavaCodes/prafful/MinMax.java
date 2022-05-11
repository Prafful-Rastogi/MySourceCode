package JavaCodes.prafful;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the three numbers:- ");
        int num1= in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        minNum(num1,num2,num3);
        maxNum(num1,num2,num3);

    }

    static void maxNum(int num1, int num2,int num3) {
        System.out.println((num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3)));
    }
    static void minNum(int num1, int num2, int num3){
        System.out.println((num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3)));
    }
}
