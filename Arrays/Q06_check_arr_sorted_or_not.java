/*
 * File Name   : Q01_find_largest_element.java
 * Topic      : Arrays
 * Problem    : Check wether array is sorted or not
 * Input      : {10, 50, 67, 9, 45, 3}
 * Output     : Not Sorted
 *
 * Time       : O(n)
 * Space      : O(1)
 *
 * Author     : Vidya Trimbake
 * Date       : 17-01-2026
 */

public class Q06_check_arr_sorted_or_not {
    public static void main(String[] args) {
        int[] array = {10, 50, 67, 9, 45, 3};
        //int[] array = {1,2,3,4,5};

        Q06_check_arr_sorted_or_not obj = new Q06_check_arr_sorted_or_not();
        boolean bRet = obj.checkSortedOrNot(array);
        
        if(bRet==true){
            System.out.println("Not Sorted");
        }
        else{
            System.out.println("Sorted");
        }
    }

    public boolean checkSortedOrNot(int arr[]){
        int iCnt=0;
        for(int i=0; i<(arr.length-1); i++){
            if(arr[i] <= arr[i+1]){
                continue;
            }
            else{
                iCnt++;
            }
        }

        if(iCnt>=1){
            return true;
        }
        else{
            return false;
        }
    }
}