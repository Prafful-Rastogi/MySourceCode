package JavaCodes.prafful;


import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] arr;
        Scanner in =new Scanner(System.in);
        int col=in.nextInt();
        arr=new int[3][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
