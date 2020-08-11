/*
https://practice.geeksforgeeks.org/problems/unsorted-array/0

Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller
and all right elements to it are greater than it.

Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow.
Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and
the second line contains N space separated array elements.

Output:
For each test case, in a new line print the required element. If no such element present in array then print -1.

Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^6

Example:
Input:
3
4
4 2 5 7
3
11 9 12
6
4 3 2 7 8 9

Output:
5
-1
7
Explanation:
Testcase 1 : Elements on left of 5 are smaller than 5 and on right of it are greater than 5.
 */

package Arrays;

import java.util.Arrays;

public class Element_with_left_side_smaller_and_right_side_greater {
    private static int neutralElement(int[] arr,int l){

        if(l==0||l==1||l==2)
            return -1;
        int[] left_max=new int[l];
        int[] right_min=new int[l];

        left_max[0]=arr[0];
        right_min[l-1]=arr[l-1];

        for (int i=1;i<l;i++){
            left_max[i]=Math.max(left_max[i-1],arr[i]);
        }
        System.out.println(Arrays.toString(left_max));
        for (int i=l-2;i>=0;i--){
            right_min[i]=Math.min(right_min[i+1],arr[i]);
        }
        System.out.println(Arrays.toString(right_min));

        for (int i=1;i<l-1;i++){
            if(left_max[i-1]<=arr[i] && right_min[i+1]>=arr[i])
                return arr[i];
        }

    return -1;
    }
    public static void main(String[] args) {
        int[] arr={4 ,3 ,2 ,7 ,8 ,9};
        int ans=neutralElement(arr,arr.length);

        System.out.println(ans);
    }
}
