/*
Problem: Reverse the elements in an array (withiout using another array)
Level: Arrays - Level 1 (Basics)
Approach: Linear traversal
Time Complexity: O(n)
Space Complexity: O(1)

Author: Vidya Trimbake
Data: 13-01-2026
*/

package Array;

public class Q04_reverse_array {
    public static void main(String[] args) {
        int arr[] = {10, 3, 19, 96, 20, 50};

        System.out.println("Elements in array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        Q04_reverse_array obj = new Q04_reverse_array();
        obj.reverseArr(arr);
    }

    public void reverseArr(int arr[]){
        int arrLen = arr.length;
        for(int i=0; i<(arrLen/2);i++){
            int temp = arr[i];
            arr[i] = arr[arrLen-1-i];
            arr[arrLen-1-i] = temp;
        }

        System.out.println();
        System.out.println("Reverse array: ");
        for(int i=0; i<arrLen; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
