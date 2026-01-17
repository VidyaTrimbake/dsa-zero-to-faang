/*
Problem: Count od even and odd elements in an array
Level: Arrays - Level 1 (Basics)
Approach: Linear traversal
Time Complexity: O(n)
Space Complexity: O(1)

Author: Vidya Trimbake
Data: 13-01-2026
*/

package Array;

public class Q05_count_even_odd {
    public static void main(String[] args) {
        int arr[] = {10, 3, 19, 96, 20, 50};

        Q05_count_even_odd obj = new Q05_count_even_odd();
        obj.evenOddCnt(arr);
    }

    public void evenOddCnt(int arr[]){
        int iEvenCnt = 0, iOddCnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                iEvenCnt++;
            }
            else{
                iOddCnt++;
            }
        }

        System.out.println("Count of even elements in an array is: "+iEvenCnt);
        System.out.println("Count of odd elements in an array is: "+iOddCnt);
    }
}
