/*
 * File Name   : Q01_find_largest_element.java
 * Topic      : Arrays
 * Problem    : Find the largest element in an array
 * Input      : {10, 50, 67, 9, 45, 3}
 * Output     : 67
 *
 * Approach   :
 * - Assume first element as maximum
 * - Traverse array and update maximum
 *
 * Time       : O(n)
 * Space      : O(1)
 *
 * Author     : Vidya Trimbake
 * Date       : 13-01-2026
 */


class Q01_find_largest_element {
    public static void main(String[] args) {
        int arr[] = {10,50,67,9,45,3};

        Q01_find_largest_element objQ01 = new Q01_find_largest_element();

        int iRet = objQ01.findLargestElement(arr);

        System.out.println("Largest element from given array is: "+ iRet);
    }

    public int findLargestElement(int arr[]){
        int temp = arr[0];

        for(int i=1; i<arr.length; i++){
            if(temp <= arr[i]){
                temp = arr[i];
            }
        }

        return temp;
    }
}
