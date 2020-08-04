/*
Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.

Input:
The first line of input contains a single integer T denoting the number of test cases.
Then T test cases follow. Each test case consist of two lines of input.
The first line of each test case consists of an integer N(size of array) and an integer K separated by a space.
The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each test case, print the modified array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N, K ≤ 10^7
1 ≤ A[i] ≤ 10^18

Example:
Input
2
5 3
1 2 3 4 5
6 2
10 20 30 40 50 60

Output
3 2 1 5 4
20 10 40 30 60 50

Explanation:
Testcase 1: Reversing groups in size 3, first group consists of elements 1, 2, 3. Reversing this group, we have elements in order as 3, 2, 1.
 */

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array_in_groups {
    private  static int[] groupReverse(int[] arr,int l,int k){
        for (int i=0;i<l;i=i+k){
            int left =i;
            int right=Math.min(i+k-1,l-1);

            int temp;
            while (left<right){
                temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left=left+1;
                right=right-1;
            }
        }
//        System.out.print(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
//        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
//        int k=3;
//
//        groupReverse(arr,arr.length,k);
//        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();     //test cases
        for(int i=0;i<T;i++){
            int size=sc.nextInt();
            int k=sc.nextInt();     //subgroup size
            int[] arr=new int[size];

            for (int j=0;j<size;j++){
                arr[j]=sc.nextInt();
            }

            int[] ans=groupReverse(arr,arr.length,k).clone();

            for(int value:ans)
                System.out.print(value+" ");
        }
    }
}
