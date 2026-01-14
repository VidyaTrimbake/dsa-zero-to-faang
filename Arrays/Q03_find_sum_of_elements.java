/*
Problem: Find the sum of all elements in an array
Level: Arrays - Level 1 (Basics)
Approach: Linear traversal
Time Complexity: O(n)
Space Complexity: O(1)

Author: Vidya Trimbake
Data: 13-01-2026
*/
package Array;

public class Q03_find_sum_of_elements {
    public static void main(String[] args) {
        int arr[] = {10, 3, 19, 96, 20, 50};

        Q03_find_sum_of_elements obj = new Q03_find_sum_of_elements();
        int iRet = obj.findSum(arr);
        System.out.println("Sum of all the elements in array is: "+iRet);
    }

    public int findSum(int arr[]){
        int iSum = 0;

        for(int i=0; i<arr.length; i++){
            iSum += arr[i];
        }

        return iSum;
    }
}
