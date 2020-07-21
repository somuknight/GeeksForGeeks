/**
 * https://www.geeksforgeeks.org/longest-common-prefix-using-word-by-word-matching/
 *
 * Longest Common Prefix using Word by Word Matching
 * Given a set of strings, find the longest common prefix.
 * Examples:
 *
 * Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
 * Output : "gee"
 *
 * Input  : {"apple", "ape", "april"}
 * Output : "ap"
 *
 * Input  : {"geek", "geek","geek", "geek"}
 * Output : "geek"
 *
 * Input  : {"abcd"}
 * Output : "abcd"
 *
 *
 * We can see that the longest common prefix holds the associative property, i.e-
 *
 * LCP(string1, string2, string3)
 *          = LCP (LCP (string1, string2), string3)
 *
 * Like here
 *
 * LCP (“geeksforgeeks”, “geeks”, “geek”)
 *      =  LCP (LCP (“geeksforgeeks”, “geeks”), “geek”)
 *      =  LCP (“geeks”, “geek”) = “geek”
 */

import java.util.Arrays;

public class Longest_Common_prefix {
    static String commonPrefixUtil(String s1,String s2){
        String res="";
//        int l1=s1.length(),l2=s2.length();
        int n=Math.min(s1.length(),s2.length());    //geek,geeks
        for(int i=1;i<=n;i++){
            if(s1.substring(0,i).equals(s2.substring(0,i)))
                res=s1.substring(0,i);
            else
                break;
        }
        return res;

    }
    static String commonPrefix(String[] arr,int l){
        String prefix=arr[0];
        for (int i=1;i<l;i++){
            prefix=commonPrefixUtil(prefix,arr[i]);
        }

        return prefix;
    }
    public static void main(String[] args) {
        String arr[] =  {"geek", "geek",
                "geek", "geek"};
        Arrays.sort(arr);
        int l=arr.length;

        String ans=commonPrefix(arr,l);
        System.out.println(ans);
    }

}
class test{
    public static void main(String[] args) {
        String s1="asdfgh";
        String s2="asdfgh";
        if (s1.substring(0,3).equals(s2.substring(0,3)))
            System.out.println("hi");
    }

}