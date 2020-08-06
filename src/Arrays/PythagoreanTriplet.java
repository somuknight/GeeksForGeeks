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
