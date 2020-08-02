/*
Given arrival and departure times of all trains that reach a railway station,
the task is to find the minimum number of platforms required for the railway station so that no train waits.
We are given two arrays which represent arrival and departure times of trains that stop.

Examples:

Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Explanation: There are at-most three trains at a time (time between 11:00 to 11:20)

Input: arr[] = {9:00, 9:40}
dep[] = {9:10, 12:00}
Output: 1
Explanation: Only one platform is needed.


Approach: The idea is to consider all events in sorted order. Once the events are in sorted order,
trace the number of trains at any time keeping track of trains that have arrived, but not departed.
For example consider the above example.

arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

All events are sorted by time.
Total platforms at any time can be obtained by
subtracting total departures from total arrivals
by that time.

 Time      Event Type     Total Platforms Needed
                               at this Time
 9:00       Arrival                  1
 9:10       Departure                0
 9:40       Arrival                  1
 9:50       Arrival                  2
 11:00      Arrival                  3
 11:20      Departure                2
 11:30      Departure                1
 12:00      Departure                0
 15:00      Arrival                  1
 18:00      Arrival                  2
 19:00      Departure                1
 20:00      Departure                0

Minimum Platforms needed on railway station
= Maximum platforms needed at any time
= 3
 */

package Arrays;

import java.util.Arrays;

public class MinimumPlatforms {
    private static int platformCount(int[] ar, int[] de, int l){
        int count=1;    //least no of platform required is 1
        Arrays.sort(ar);
        Arrays.sort(de);
        int platformNeeded=1;
        int i=1,j=0;
        while (i<l && j<l){
            if (ar[i]<=de[j]){
                count++;
                i++;
            }
            else if(ar[i]>de[j]){
                count--;
                j++;
            }
            if(count>platformNeeded)
                platformNeeded=count;
        }



        return platformNeeded;
    }
    public static void main(String[] args) {
        int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };

        int ans=platformCount(arr,dep,dep.length);
        if(ans>1)
            System.out.println(ans);
        else
            System.out.println("single platform is enough");
    }
}
