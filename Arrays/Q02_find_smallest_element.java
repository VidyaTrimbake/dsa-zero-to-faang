/*
Problem: Find the smallest element in an array
Level: Arrays - Level 1 (Basics)
Approach: Linear traversal
Time Complexity: O(n)
Space Complexity: O(1)

Author: Vidya Trimbake
Data: 12-01-2026
*/

package Array;

public class Q02_find_smallest_element {
    public static void main(String[] args) {
        int arr[] = {10, 3, 19, 96, 20, 50};

    Q02_find_smallest_element obj = new Q02_find_smallest_element();
    int iRet = obj.findSmallestElement(arr);
    System.out.println("Smallest number is: "+iRet);
   } 

   public int findSmallestElement(int arr[]){
    int temp = arr[0];
    for(int i=1; i<arr.length; i++){
        if(temp>=arr[i]){
            temp = arr[i];
        }
    }
    return temp;
   }
}

