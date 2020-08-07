/*
https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0

https://www.geeksforgeeks.org/chocolate-distribution-problem/

Given an array A of positive integers of size N, where each value represents number of chocolates in a packet.
Each packet can have variable number of chocolates.
There are M students, the task is to distribute chocolate packets such that :
1. Each student gets one packet.
2. The difference between the number of chocolates given to the students having packet
with maximum chocolates and student having packet with minimum chocolates is minimum.

Input:
The first line of input contains an integer T, denoting the number of test cases.
Then T test cases follow. Each test case consists of three lines.
The first line of each test case contains an integer N denoting the number of packets.
Then next line contains N space separated values of the array A denoting the values of each packet.
The third line of each test case contains an integer m denoting the no of students.

Output:
For each test case in a new line print the minimum difference.

Constraints:
1 <= T <= 100
1 <=N<= 107
1 <= Ai <= 1018
1 <= M <= N

Example:
Input:
2
8
3 4 1 9 56 7 9 12
5
7
7 3 2 4 9 12 56
3

Output:
6
2

Explanation:
Testcase 1: The minimum difference between maximum chocolates and minimum chocolates is 9-3=6.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Chocolate_Distribution_Problem {
    private static int theDifference(int[] arr,int m){
        if (m==0||arr.length==0)
            return 0;
        int res=Integer.MAX_VALUE;

        for (int i=0;i<=arr.length-m;i++){
            if (arr[i+m-1]-arr[i]<res)
                res=arr[i+m-1]-arr[i];
        }


        return res;
    }
    public static void main(String[] args) {
//        int[] arr={12, 4, 7, 9, 2, 23, 25, 41,
//                30, 40, 28, 42, 30, 44, 48,
//                43, 50};
//        int m=7;    //no of students
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();     //for no of test cases
        for (int i=0;i<T;i++) {
            int size=sc.nextInt();  //size of the array
            int[] arr=new int[size];    //array created
            for (int j=0;j<size;j++){
                arr[j]=sc.nextInt();
            }
            int m=sc.nextInt();     //student no
            Arrays.sort(arr);   //2 3 4 7 9 12 56
            System.out.println(theDifference(arr, m));
        }
    }
}
