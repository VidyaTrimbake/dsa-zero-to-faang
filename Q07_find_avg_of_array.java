/*
Problem:     Find the Average of Array Elements
Level:       Arrays - Level 1 (Basics)

Input:       int arr[] = {10, 3, 19, 96, 20, 50};
Output:      33
Author:      Vidya Trimbake
Data:        26-01-2026
*/

package Arrays;

class Q07_find_avg_of_array {
    public static void main(String[] args) {
        int arr[] = {10, 3, 19, 96, 20, 50};

        Q07_find_avg_of_array Q07Obj = new Q07_find_avg_of_array();
        int iRet = Q07Obj.calAvg(arr);

        System.out.println("Average is: "+iRet);
    }

    public int calAvg(int arr[]){
        int iLen = arr.length;
        int iSum = 0;
        for(int i=0; i<iLen;i++){
            iSum += arr[i];
        }

        return (iSum/iLen);
    }
    
}