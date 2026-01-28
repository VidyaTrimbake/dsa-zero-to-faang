/*
Problem: Check if an Array Contains a Specific Number 
Level: Arrays - Level 1 (Basics)
Approach: Linear traversal

Input:       int arr[] = {10, 3, 19, 96, 20, 50};
Element:     19
Output:      true
Author:      Vidya Trimbake
Data:        26-01-2026
*/

package Arrays;

public class Q08_linear_search {
    public static void main(String[] args) {
        int arr[] = {10, 3, 19, 96, 20, 50};
        int ele = 19;

        Q08_linear_search Q08Obj = new Q08_linear_search();
        boolean bRet = Q08Obj.chkEle(arr, ele);
        if(bRet==true){
            System.out.println(ele+" element is present in array");
        } 
        else{
            System.out.println(ele+" is not present in array");
        }
    }

    public boolean chkEle(int arr[], int ele){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return true; 
            }
        }
        return false;
    }
}
