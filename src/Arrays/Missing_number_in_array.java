/*
https://practice.geeksforgeeks.org/problems/missing-number-in-array/0#ExpectOP

Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
 */

package Arrays;

public class Missing_number_in_array {
    private  static int theMissingNum(int[] arr,int num){
        int array_sum=0;
        int sum=(num*(num+1))/2;
        for( int i: arr) {
            array_sum += i;
        }


        return sum-array_sum;
    }
    public static void main(String[] args) {
        int num=10;
        int[] arr={2 ,3 ,4 ,5 ,6 ,7 ,8 ,9,10};   //{1, 2, 3 ,5}

        int res =theMissingNum(arr,num);
        System.out.println(res);
    }
}
/*************************************** testing for XOR operation*******************************/
/************************************************************************************************/
class testXOR{
    public static void main(String[] args) {
        int a=3,b=3;
        int c=1^2^3^4;
        System.out.println(c);
    }
}
