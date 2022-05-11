package JavaCodes.prafful;
import java.util.Arrays;
import java.util.Scanner;
/* Find the first and the last occurance of the target element
* This can be used by brute force approach or you can use the binary search to solve this.
*/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] nums={-1,-1,0,0,2,3,6,89,99,100};     //Array to be searched
        System.out.println(Arrays.toString(nums));
//        System.out.println("Enter the number of sorted array");
//        int n=in.nextInt();
//        int[] nums=new int[n];
//        System.out.println("Enter elements in the array:- ");
//        for (int i = 0; i < n; i++) {
//            nums[i]=in.nextInt();
//        }
        System.out.print("Enter the target element:- ");
        int target=in.nextInt();
        int[] ans=FindRange(nums, target);       //calling the method to get the result
        System.out.println(Arrays.toString(ans));

    }
    //Method FindPosition will find the occurance by calling the search method again and again.
    static int[] FindRange(int[] nums, int target){
        int[] ans={-1,-1};      //Answer will be stored here
        ans[0]=search(nums, target, true);      /*findFirstPosition will guide the search method to
        to whether we are searching for first portion or the last portion of the array. This is for first portion
        */
        if(nums[0]==-1){
            ans[1]=search(nums, target, false); //This one is for last portion of the array
        }

        return ans;
    }

    //This is the basic binary search function.
    static int search(int[] nums, int target, boolean findFirstPosition ){
        int ans=-1; //
        int mid,start=0, end=nums.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findFirstPosition){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
