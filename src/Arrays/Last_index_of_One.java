package Arrays;

import java.util.Scanner;

public class Last_index_of_One {
    public static int lastInexOf1(String str){
        int index=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
//        String str="010000100";
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String[] s=new String[T];
        for(int i=0;i<T;i++){
            s[i]=sc.nextLine();
        }
        for(int i=0;i<T;i++) {
            int ans = lastInexOf1(s[i]);
            if (ans > -1)
                System.out.println(ans);
            else
                System.out.println(-1);
        }
    }
}
