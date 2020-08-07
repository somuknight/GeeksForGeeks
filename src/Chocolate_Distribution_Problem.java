import java.util.Arrays;

public class Chocolate_Distribution_Problem {
    private static int theDifference(int[] arr,int m){
        if (m==0||arr.length==0)
            return 0;
        int res=Integer.MAX_VALUE;

        for (int i=0;i<=arr.length-m;i++){
            if (arr[i+m-1]-arr[i]<=res)
                res=arr[i+m-1]-arr[i];
        }


        return res;
    }
    public static void main(String[] args) {
        int[] arr={12, 4, 7, 9, 2, 23, 25, 41,
                30, 40, 28, 42, 30, 44, 48,
                43, 50};
        int m=7;    //no of students
        Arrays.sort(arr);   //2 3 4 7 9 12 56
        System.out.println(theDifference(arr,m));
    }
}
