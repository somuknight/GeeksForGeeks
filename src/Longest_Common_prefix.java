import java.util.Arrays;

public class Longest_Common_prefix {
    static String commonPrefix(String[] arr,int l){
        String ans="";
        int initial_num=1;
        int index=0;
        if(l==1)
            return arr[0];
        for (int i=0;i<arr.length & initial_num<arr.length;i++,initial_num++){
            String temp=arr[0].substring(0,initial_num);
            for (int j=i+1;j<arr.length;j++){
                if(temp==arr[j].substring(0,initial_num)) {
//                    ans = temp;
                    continue;

                }
                else {
                 index = initial_num;
                    break;
                }
            }
        }
      ans=arr[0].substring(0,index);
        return ans;
    }
    public static void main(String[] args) {
        String arr[] =  {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        Arrays.sort(arr);
        int l=arr.length;

        String ans=commonPrefix(arr,l);
        System.out.println(ans);
    }
}
