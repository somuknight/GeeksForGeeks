package Arrays;

public class EquilibriumPoint {
    public static int equiPoint(int[] arr,int l){
        int pos=-1;
        int left_sum=0;
        int sum=0;
        for (int value :arr) {
            sum+=value;
        }
//        System.out.println(sum);
        int i=0;
        for (;i<l;i++) {

            if (left_sum == sum){
                break;
            }else {
                sum = sum - arr[i];
                if (i > 0) {
                    left_sum = left_sum + arr[i - 1];
                }
            }

        }
        pos=i;
        return pos;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        int ans=equiPoint(arr, arr.length);

        if (ans>0)
            System.out.println(ans);
        else
            System.out.println("no such point available");
    }
}
