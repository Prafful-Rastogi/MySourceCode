package JavaCodes.prafful;

public class LinearDSA {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {1, 4, 7, 3, 5,23,44,211,1223,10};
        int ans=LinearSearch(arr, target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        for(int i= 0;i<arr.length;i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
