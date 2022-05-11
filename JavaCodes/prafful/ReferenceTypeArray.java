package JavaCodes.prafful;

import java.util.Scanner;

class student{
    int rollNo;
    String name;
    student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
}
public class ReferenceTypeArray {
    public static void main(String[] args) {
        student arr[]=new student[5];   //creating an array of reference type
        Scanner get=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {   //taking input
            System.out.print("enter the roll no. for student "+ (i+1) +" = ");
            int roll=get.nextInt();
            System.out.print("enter the roll no. for student "+(i+1)+" = ");
            String name=get.next();
            arr[i]=new student(roll,name);  //storing in array
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].rollNo +" "+ arr[i].name);    //printing the stored value
        }
    }
}
