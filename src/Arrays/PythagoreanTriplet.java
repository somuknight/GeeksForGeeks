/*
Given an array of integers, write a function that returns true if there is a triplet (a, b, c)
that satisfies a^2 + b^2 = c^2.

Input:
The first line contains T, denoting the number of testcases. Then follows description of testcases.
Each case begins with a single positive integer N denoting the size of array.
The second line contains the N space separated positive integers denoting the elements of array A.

Output:
For each testcase, print "Yes" or  "No" whether it is Pythagorean Triplet or not (without quotes).

Constraints:
1 <= T <= 100
1 <= N <= 10^7
1 <= A[i] <= 1000

Example:
Input:
1
5
3 2 4 6 5

Output:
Yes

Explanation:
Testcase 1: a=3, b=4, and c=5 forms a pythagorean triplet, so we print "Yes"
 */

package Arrays;

import java.util.Arrays;

public class PythagoreanTriplet {
    private static String triplets(int[] arr){
        int max_ele=arr[arr.length-1];
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]>max_ele)
                    break;
                else if(arr[i]+arr[j]<max_ele){
                    for(int k=arr.length-1;k>j;k--){
                        if(arr[i]+arr[j]==arr[k])
                            return "Yes";
                    }
                }
                else
                    return "yes";
            }
        }
      return "no";
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,6,9};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)Math.pow(arr[i],2);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(triplets(arr));


    }
}
