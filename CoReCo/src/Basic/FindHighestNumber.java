package Basic;
/*
Create a function that finds the highest integer in given array using recursion.

Examples
[-1, 3, 5, 6, 99, 12, 2] ➞ 99
[6,7,8] ➞ 8

Notes
Please use the recursion to solve this, not the max() method.
 */

public class FindHighestNumber {
    public static  int findMax(int arr[], int n){
        if (n==0){
            return arr[0];
        }
        return  Math.max(arr[n], findMax(arr, n-1));
    }

    public static void main(String[] args) {
        int[] arr1= {-1, 3, 5, 6, 99, 12, 2};
        int[] arr2 = {6,7,8};

        System.out.println(findMax(arr1, arr1.length-1));
        System.out.println(findMax(arr2, arr2.length-1));

    }
}
