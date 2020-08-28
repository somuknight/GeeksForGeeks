/*
https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0

Given a matrix mat[][] of size M*N. Traverse and print the matrix in spiral form.

Input:
The first line of the input contains a single integer T, denoting the number of test cases.
Then T test cases follow. Each testcase has 2 lines. First line contains M and N respectively separated by a space.
Second line contains M*N values separated by spaces.

Output:
Elements when travelled in Spiral form, will be displayed in a single line.

Constraints:
1 <= T <= 100
2 <= M,N <= 10
0 <= Ai <= 100

Example:
Input:
2
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
1 2 3 4 5 6 7 8 9 10 11 12

Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
1 2 3 4 8 12 11 10 9 5 6 7
 */
package Arrays;


public class Spirally_traversing_a_matrix {
    private static void spiralTraverse(int m,int n,int[][] arr){
        int i;
        int k=0,l=0;
        /*
        * k =starting row
        * m =ending row
        * l =starting column
        * n =ending column
        * i =iterator
        *
        * */
        while(k<m && l<n){
            for (i=l;i<n;i++){
                System.out.print(arr[k][i]+" ");
            }
            k++;
            for (i=k;i<m;i++){
                System.out.print(arr[i][n-1]+" ");
            }
            n--;
            if (k<m){
                for (i=n-1;i>=l;i--){
                    System.out.print(arr[m-1][i]+" ");
                }
                m--;
            }
            if (l<n){
                for (i=m-1;i>=k;i--){
                    System.out.print(arr[i][l]+" ");
                }
                l++;
            }
        }

    }
    public static void main(String[] args) {
        int r=4,c=4;
        int[][] arr={
                {1, 2, 3, 4} ,
                {5, 6, 7, 8} ,
                {9, 10, 11, 12} ,
                {13, 14, 15, 16}
        };

        spiralTraverse(arr.length,arr[0].length,arr);
    }
}
