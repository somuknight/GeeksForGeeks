/*
Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai
where the width of each block is 1. Compute how much water can be trapped in between blocks after raining.
Structure is like below:
| |
|_|
We can trap 2 units of water in the middle gap.



Input:
The first line of input contains an integer T denoting the number of test cases.
The description of T test cases follows. Each test case contains an integer N denoting the size of the array,
followed by N space separated numbers to be stored in array.

Output:
Output the total unit of water trapped in between the blocks.

Constraints:
1 <= T <= 100
3 <= N <= 10^7
0 <= Ai <= 10^8

Example:
Input:
2
4
7 4 0 9
3
6 9 9

Output:
10
0

Explanation:
Testcase 1: Water trapped by block of height 4 is 3 units, block of height 0 is 7 units.
So, total unit of water trapped is 10 units.
 */
/**********************************BELOW👇🏼👇🏼👇🏼  method cost O(n) in time and in space each***********************************/
package Arrays;

public class Trapping_Rain_Water {
    private static int  waterAmount(int[] arr){
        int res=0;
        int [] left=new int[arr.length];
        int [] right=new int[arr.length];

        left[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }

        right[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            res=res+Math.min(left[i],right[i])-arr[i];
        }

        return res;
    }
    public static void main(String[] args) {

        int[] arr={3,0,0,4,0,4,0,3};
        int ans=waterAmount(arr);
        System.out.println(ans);

    }
}
/**********************************BELOW👇🏼👇🏼👇🏼  method cost O(n) in time and O(1)in space***********************************/
class Trapping_Rain_Water_Another_Approach{
    private static int waterAmount(int[] arr){
        int res=0;


        return res;
    }
    public static void main(String[] args) {
        int[] arr={3,0,0,4,0,4,0,3};
        Trapping_Rain_Water_Another_Approach aa=new Trapping_Rain_Water_Another_Approach();
        int ans=aa.waterAmount(arr);
        System.out.println(ans);
    }
}
