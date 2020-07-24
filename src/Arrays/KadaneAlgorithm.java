/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases.
The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ...,
AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107

Example:
Input
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
Output
9
-1

Explanation:
Testcase 1: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
 */

package Arrays;

public class KadaneAlgorithm {
    static int kadensAlgo(int[] arr){
        int max=Integer.MIN_VALUE;
        int temp_max=0;
        for (int value : arr) {

            temp_max = temp_max + value;

            if (max <= temp_max)
                max = temp_max;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, -2, 5};     //{-1 ,-2 ,-3 ,-4} another test case
        int res=kadensAlgo(arr);

        System.out.println(res);
    }
}
