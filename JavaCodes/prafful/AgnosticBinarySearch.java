package JavaCodes.prafful;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9,19,23,56,88,99,100};
        int[] arr={100,89,67,66,54,34,22,21,17,10,8,4,3,1};
        int target=66;
        int ans=orderAgnosticbn(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticbn(int[] arr, int target){
        int mid=0, start=0, end=arr.length-1;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                 if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            else{

                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
