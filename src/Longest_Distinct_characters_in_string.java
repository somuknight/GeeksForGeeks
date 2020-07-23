import java.util.Arrays;
import java.util.Scanner;

public class Longest_Distinct_characters_in_string {
    static int LDCS(String str){
        int res=0;
        int [] lastIndex=new int[26];
        Arrays.fill(lastIndex,-1);
        int i=0;

        for (int j=0;j<str.length();j++){
            i=Math.max(i,lastIndex[(str.charAt(j)-97)] +1);       //char is type cast to int
            res=Math.max(res,j-i+1);
            lastIndex[str.charAt(j)-97]=j;                     //updating the array
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=LDCS(str);

        if (n>0)
            System.out.println(n);
        else
            System.out.println("invalid string");
    }
}
class Test{
    public static void main(String[] args) {
        String s="zgqqbcybcbjyeJ";

        int i=s.charAt(0);
        System.out.println(i);
    }
}
