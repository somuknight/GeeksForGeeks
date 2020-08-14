/*
https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0

Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.
The result is going to be very large, hence return the result in the form of a string.

Input:
The first line of input consists number of the test cases. The description of T test cases is as follows:
The first line of each test case contains the size of the array, and the second line has the elements of the array.

Output:
In each separate line print the largest number formed by arranging the elements of the array in the form of a string.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^2
0 ≤ A[i] ≤ 10^3

Example:
Input:
2
5
3 30 34 5 9
4
54 546 548 60

Output:
9534330
6054854654
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Number_formed_from_an_Array {
    private static String compare(String s1,String s2){
        if ((s1+s2).compareTo(s2+s1)>0)
            return s1+s2;
        else
            return s2+s1;
    }
    private static String largestNum(int[] arr,int l){
        String res="";
        for (int i=0;i<l;i++){
            String s1=Integer.toString(arr[i]);

            res=compare(res,s1);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int size=sc.nextInt();
            int[] arr=new int[size];
            for(int j=0;j<size;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));

            String ans=largestNum(arr,arr.length);
            System.out.println(ans);
        }
    }
}