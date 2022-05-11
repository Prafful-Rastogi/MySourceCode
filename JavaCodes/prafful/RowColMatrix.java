package JavaCodes.prafful;
import java.util.Arrays;
import java.util.Scanner;
/*
* This problem involves a matrix which is row wise and column wise sorted
* So if a[i][j]==target retrun i,j
* else if a[i][j]< target then that particular row will definitely have smaller element then the target so increase the
* row.
* else if a[i][j]>target then that particular column will definitely have greater element then the target so decrease
* the column.
*/

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {19,29,39,49},
                {33,43,53,63}
        };
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the target element :- ");
        int target=in.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target){
        int r=0, c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
