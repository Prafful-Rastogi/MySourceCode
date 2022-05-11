package JavaCodes.prafful;
import java.util.Scanner;
public class SumOfClasses {
    public static void main(String[] args) {
        System.out.print("Enter the two numbers:- ");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum =num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
