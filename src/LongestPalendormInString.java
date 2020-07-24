/*Given a
        string, find the longest substring which is palindrome. For example,
        if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”.

        Time complexity: O ( n^2 ) where n is the length of input string.
        Auxiliary Space: O ( 1 )

        For Example:
        Input: Given string :"forgeeksskeegfor",
        Output: "geeksskeeg".

        Input: Given string :"Geeks",
        Output: "ee"
*/

import java.util.Scanner;

public class LongestPalendormInString {
//    static void printSubStr(String str,int low,int high){
//        System.out.println(str.substring(low,high+1));
//    }

    static int longestPalSubStr(String str){
        int maxlength=1;

        int start=0;
        int len=str.length();

        for(int i=0;i<len-1;++i){
            // Find the longest even length
            // palindrome with center points
            // as i-1 and i.
            int low=i;
            int high=i+1;
            while (low>=0 && high<len &&
                    str.charAt(low)==str.charAt(high)){
                if (high-low+1>maxlength){
                    start=low;
                    maxlength=high-low+1;
                }
                --low;
                ++high;
            }
            // Find the longest odd length
            // palindrome with center point as i
            low=i-1;
            high=i+1;
            while (low>=0 && high<len && str.charAt(low)==str.charAt(high)){
                if (high-low+1>maxlength){
                    start=low;
                    maxlength=high-low+1;
                }
                --low;
                ++high;
            }
        }
        System.out.println("longest palendorm is: "+str.substring(start,start+maxlength));
//         printSubStr(str,start,start+maxlength-1);
        return maxlength;
    }

    public static void main(String[] args) {
//        String str="aba";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("length is: "+longestPalSubStr(str));


    }
}

