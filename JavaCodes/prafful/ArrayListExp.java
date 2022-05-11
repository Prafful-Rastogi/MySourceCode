package JavaCodes.prafful;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(15);
        System.out.println("enter the elements in ArrayList:- ");
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);       //print entire list

        System.out.println(list.get(5));    //getting individual item
        list.set(4,100);    //set the 4th index as 100
        list.remove(3);
        System.out.println(list);

    }
}
