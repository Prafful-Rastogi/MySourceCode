package JavaCodes.prafful;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1 ,2 ,3 ,4 ,5 ,6 ,8, 9, 10 ,14 ,16 ,19 ,22 ,23 ,25 ,26 ,27, 29, 31 ,34 ,35 ,36 ,38 ,39 ,40 ,45 ,46 ,48, 50 ,51 ,52 ,57 ,59 ,60 ,61 ,63 ,67 ,68 ,69 ,71 ,75 ,76 ,77 ,79 ,81, 82 ,83 ,86 ,87 ,88 ,90 ,92 ,93 ,94 ,95 ,96 ,98 ,99 ,100};
        int target=93;
        int ans=binarySearching(arr, target);
        System.out.println(ans);
    }


    static int binarySearching(int[] arr, int target){
        int mid=0, start=0, end=arr.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
