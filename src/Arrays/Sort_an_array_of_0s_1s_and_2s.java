/*
https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

Given an array A of size N containing 0s, 1s, and 2s;
you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases.
Then T testcases follow. Each testcases contains two lines of input.
The first line denotes the size of the array N.
The second lines contains the elements of the array A separated by spaces.

Output:
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.

*/
/***************************the below method uses time complexity as O(n)*******************/
package Arrays;

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    public static int[] sort(int[] arr,int l){
        int count_of_0=0,count_of_1=0,count_of_2=0;     //no need to use count_of_2
        for(int value : arr){
            if(value==0)
                count_of_0++;
            if(value==1)
                count_of_1++;
            if (value==2)
                count_of_2++;

        }
        Arrays.fill(arr,0,count_of_0+1,0);
        Arrays.fill(arr,count_of_0,count_of_0+count_of_1+1,1);
        Arrays.fill(arr,count_of_0+count_of_1,l,2);

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        arr=sort(arr,arr.length).clone();
        System.out.println(Arrays.toString(arr));
    }
}
/*****************the below method also have a time complexity of O(n)88888888888888888888*/
class AnotherApproach_Sort_an_array_of_0s_1s_and_2s{
    public static int[] sort(int[] arr,int l){
        int lo=0;
        int hi=l-1;
        int mid=0,temp=0;
        while(mid<=hi){
            switch (arr[mid]){
                case 0:{
                    temp=arr[lo];
                    arr[lo]=arr[mid];
                    arr[mid]=temp;
                    lo++;
                    mid++;
                    break;

                }
                case 1:{
                    mid++;
                    break;

                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                    break;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2, 1, 0};
        AnotherApproach_Sort_an_array_of_0s_1s_and_2s aa=
                new AnotherApproach_Sort_an_array_of_0s_1s_and_2s();
        arr=aa.sort(arr,arr.length).clone();
        System.out.println(Arrays.toString(arr));
    }
}