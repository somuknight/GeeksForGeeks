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
