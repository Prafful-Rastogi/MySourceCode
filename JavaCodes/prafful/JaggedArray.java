package JavaCodes.prafful;
import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr;
        int col;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the  number of rows in array:-");
        int row=in.nextInt();
        arr=new int[row][]; //initializing an jagged array
        System.out.println("Enter the number of Rows:-");
        for (int i = 0; i < row; i++) {
            col=in.nextInt();   //taking input for number of columns in each row
            arr[i]=new int[col];
        }
        for (int i = 0; i < arr.length; i++) {  //taking input for an array
            System.out.println("Enter elements for "+(i+1)+" rows:- "); //important line, writing +i+1+ will concatinate them only
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
