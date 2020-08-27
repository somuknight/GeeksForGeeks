/*
https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion/0

ref:
https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/#:~:text=Given%20an%20array%20of%20DISTINCT,e%20%3C%20f.

Given an array A (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion.
The converted array should be in form a < b > c < d > e < f. The relative order of elements is same in the output
i.e you have to iterate on the original array only.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow.
Each testcase contains two lines of input. The first line contains a single integer N denoting the size of array.
The second line contains N space-separated integers denoting the elements of the array.

Output:
For each testcase, print the array in Zig-Zag fashion.

Constraints:
1 <= T <= 100
1 <= N <= 100
0 <= Ai <= 10000

Example:
Input:
2
7
4 3 7 8 6 2 1
4
1 4 3 2
Output:
3 7 4 8 2 6 1
1 4 2 3
 */

package Arrays;

import java.util.Arrays;

public class Convert_array_into_Zig_Zag_fashion {
    private static int[] zigzag(int[] arr,int l){
        boolean flag=true;
        int temp=0;
        for(int i=0;i<l-1;i++){
            if (flag==true && arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                flag=false;


            }
            else if (flag==false && arr[i]<arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                flag=true;
            }
            else if (flag==true && arr[i]<arr[i+1]){

                flag=false;
            }
            if (flag ==false && arr[i]>arr[i+1]){
                flag=true;
            }

        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        arr=zigzag(arr,arr.length).clone();
        System.out.println(Arrays.toString(arr));
    }
}
