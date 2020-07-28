package Arrays;

import java.util.Arrays;

public class Number_of_pairs {
    public  static int count(int x,int[] y,int l2,int[] NoOfy) {
        int ans;
        if (x == 0) return 0;
        if (x == 1) return NoOfy[0];
        int idx = Arrays.binarySearch(y, x);
        if (idx < 0) {
            idx = Math.abs(idx + 1);
            ans = y.length - 1;
        }
        else{
            while (idx < l2 && y[idx] == x) {
                idx++;
            }
            ans = y.length - idx;
        }
        ans=ans+(NoOfy[0]+NoOfy[1]);

        if(x==2) ans=ans-(NoOfy[3]+NoOfy[4]);

        if(x==3) ans=ans+NoOfy[2];

        return ans;
    }
    static public int countPairs(int[] x,int[] y,int l1,int l2){
        int NoOfy[]=new int[5];
        for(int i=0;i<l2;i++){
            if(y[i]<5)
                NoOfy[y[i]]=NoOfy[y[i]]+1;
        }
        Arrays.sort(y);
        System.out.println(Arrays.toString(NoOfy));

        int totalPairs=0;

        for (int i=0;i<l1;i++){
            totalPairs=totalPairs+count(x[i],y,l2,NoOfy);
        }



        return totalPairs;
    }
    public static void main(String[] args) {
        int[] x={2,1,6};
        int[] y={1,5};
        int ans=countPairs(x,y,x.length,y.length);
        System.out.println(ans);
    }
}
