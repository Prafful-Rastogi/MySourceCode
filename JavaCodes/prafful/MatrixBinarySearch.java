package JavaCodes.prafful;
/*
* In this problem the matrix is sorted linearly, and we have to find the target element using the binary search technique
* In this we first have to check whether the matrix has one or more than one rows, and then we have to eliminate the
* unnecessary rows, and then we will be left with the two rows.
* In those two rows we will be having five parts. first is the mid of both the rows, second first part of first row,
* third is first part of the second row, fourth is second remaining part of the first row and similarly fifth is the
* remaining part of the second row.
 */
public class MatrixBinarySearch {
    public static void main(String[] args) {

    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]>target){
                cEnd=mid-1;
            }
            else{
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
   static int[] matrixSearch(int[][] matrix, int target){
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==1){
            return binarySearch(matrix, 0,0, col-1, target);
        }
        int rStart= 0;
        int rEnd=row-1;
        int cMid= col/2;
        while(rStart<(rEnd-1)){     //this will have more than two rows
            int mid=rStart+(rEnd-rStart)/2;
           // if(matrix[])
        }

       return new int[0];
   }
}
