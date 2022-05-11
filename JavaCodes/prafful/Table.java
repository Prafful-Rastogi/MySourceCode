package JavaCodes.prafful;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to get the table:-");
        int num=in.nextInt();
        int mult;
        for (int i = 1; i <=10; i++) {
            mult=num*i;
            System.out.println(num+" X "+ i+" = "+mult);
        }
    }
}
