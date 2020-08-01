/*
https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0

Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side.
Also, the rightmost element is always a leader.

Input:
The first line of input contains an integer T denoting the number of test cases.
The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print all the leaders.

Constraints:
1 <= T <= 100
1 <= N <= 10^7
0 <= Ai <= 10^7

Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3

Explanation:
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7.
Also, all the elements of right side of 7 (at index 3) are smaller than 7.
And, the last element 3 is itself a leader since no elements are on its right.
 */

package Arrays;

public class LeadersInAnArray {
    public static void leaders(int[] arr,int l){
        int max=0;
        for (int i=l-1;i>=0;i--){
            if(arr[i]>=max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }

        }
    }
    public static void main(String[] args) {
        int [] arr={16 ,17 ,4 ,3 ,5 ,2};

        leaders(arr,arr.length);

    }
}
/*
the output of the above program is 2 5 17 , which is reversed of the desired output...
 */

class AnotherApproach_LeadersInAnArray{
    public  static void leaders(int[] arr,int l){
        boolean flag=false;
        for(int i=0;i<l;i++){
            if (i==l-1) {
                System.out.print(arr[i]);
                break;
            }
            for (int j=i+1;j<l;j++){
                if (arr[i]>=arr[j])
                    flag=true;
                else{
                    flag=false;
                    break;
                }
            }

            if (flag==true)
                System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int [] arr={7 ,4 ,5 ,7 ,3};
        AnotherApproach_LeadersInAnArray aa=new AnotherApproach_LeadersInAnArray();
        aa.leaders(arr,arr.length);
    }
}
