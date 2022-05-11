package JavaCodes.prafful;

import java.util.Scanner;

/* This is the problem of finding the ceiling of the target in the given array
* FOR EX:- arr={1,5,9,14,16,19,20,25}
* Target= 15
* Ceiling = 16
* This means find the smallest element greater than or equals to the target element
* EX 2: Target = 14
* Result is 14 itself because the smallest element greater than or equals to 14 itself.
*

 */
public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr={10,29,39,44,47,49,49,50,67,69,72,78,79,81,84,86,89,90,95};
        System.out.print("Enter the Target element:- ");
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int result=CeilingFinder(arr, target);
        System.out.println(result);
    }

    static int CeilingFinder(int[] arr, int target) {
        int start=0, end=arr.length-1, mid=(start+end)/2;
        while(start<=end) {
            if(target>arr[end]){
                return -1;
            }
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
