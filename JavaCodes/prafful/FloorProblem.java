package JavaCodes.prafful;
/* This is the problem of finding the Floor of the target in the given array
 * FOR EX:- arr={1,5,9,14,16,19,20,25}
 * Target= 15
 * Ceiling = 14
 * This means find the greatest element smaller than or equals to the target element
 * EX 2: Target = 14
 * Result is 14 itself because the greatest element smaller than or equals to 14 itself.
 */

public class FloorProblem {
    public static void main(String[] args) {

        int[] arr = {10, 29, 39, 44, 47, 49, 49, 50, 67, 69, 72, 78, 79, 81, 84, 86, 89, 90, 95};
        int target = 69;
        int ans = floorFind(arr, target);
        System.out.println(ans);
    }
    static int floorFind(int[] arr, int target) {
        int start=0, end=arr.length-1, mid;
        while(start<=end){
            mid= start+(end-start)/2;
            if(target<arr[start]){
                return -1;
            }
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }

        }
        return arr[end];
    }
}
