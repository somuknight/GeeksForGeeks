/*
https://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0

The cost of stock on each day is given in an array A[] of size N. Find all the days on which you buy and sell
the stock so that in between those days your profit is maximum.

Input:
First line contains number of test cases T. First line of each test case contains an integer value N denoting
the number of days, followed by an array of stock prices of N days.

Output:
For each testcase, output all the days with profit in a single line. And if there is no profit then print "No Profit".

Constraints:
1 <= T <= 100
2 <= N <= 10^3
0 <= Ai <= 10^4

Example
Input:
3
7
100 180 260 310 40 535 695
4
100 50 30 20
10
23 13 25 29 33 19 34 45 65 67

Output:
(0 3) (4 6)
No Profit
(1 4) (5 9)

Explanation:
Testcase 1: We can buy stock on day 0, and sell it on 3rd day, which will give us maximum profit.

Note: Output format is as follows - (buy_day sell_day) (buy_day sell_day)
For each input, output should be in a single line.
 */

package Arrays;


import java.util.ArrayList;
class Interval{
    int buy,sell;
}
public class Stock_buy_and_sell {
    private static void buy_sell(int[] arr, int l){
        if(l==0||l==1)
            System.out.println("No Profit");

        int count=0;
        ArrayList<Interval> sol=new ArrayList<Interval>();
        int i=0;
        while(i<l-1){
            while ((i<l-1)&& (arr[i+1]<=arr[i])){
                i++;
            }
            if (i==l-1)
                break;

            Interval e=new Interval();
            e.buy=i++;

            while ((i<l)&&(arr[i]>=arr[i-1])){
                i++;
            }

            e.sell=i-1;
            sol.add(e);


            count++;
        }
        if (count==0)
            System.out.println("No Profit");
        else
            for (int j=0;j<count;j++)
                System.out.print("("+sol.get(j).buy+" "+sol.get(j).sell+")");

    return;
    }
    public static void main(String[] args) {
        int[] arr={23 ,13 ,25 ,29 ,33 ,19 ,34 ,45, 65 ,67};
        buy_sell(arr,arr.length);
    }
}
