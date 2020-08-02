package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main(String[] args) throws IOException {
//        String str="010000100";
        Scanner sc=new Scanner(System.in);
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=sc.nextInt();
        String[] s=new String[T];
//        System.out.println(s.length);
        int i=0;
        while(i<T){
            s[i]=sc.next();     //in case of nextLine() the 1st element in the array getting skipped
            i++;
        }
//        System.out.println(Arrays.toString(s));
        for(String value : s) {
            int ans = lastInexOf1(value);
            if (ans > -1)
                System.out.println(ans);
            else
                System.out.println(-1);
        }
    }
}
//actually i'm good with scanner class'
class Test_of_last_index1{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=br.read();
        System.out.println(n1);

        int n2=Integer.parseInt("53");
        System.out.println(n2);


    }
}