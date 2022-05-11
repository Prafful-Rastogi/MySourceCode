package JavaCodes.prafful;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.print("enter what you want to perform:- \n 1. Enter elements in array \n2. Print elements of array:");
        int opt=get.nextInt();
        switch(opt){
            case 1:
                System.out.println("insert into array:-");
                getarray(arr);
                break;
            case 2:
                System.out.println("The elements in array are:- ");
                printarray(arr);
                break;
            default:
                System.out.println("wrong input");
        }

    }

    static void getarray(int[] arr) {
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
    }
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
}
