/**
 * https://practice.geeksforgeeks.org/problems/implement-strstr/1
 * https://www.techiedelight.com/implement-strstr-function-java/
 *
 * Your task is to implement the function strstr.
 * The function takes two strings as arguments (s,x) and
 * locates the occurrence of the string x in the string s.
 * The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
 *
 * Input:
 * The first line of input contains an integer T denoting the no of test cases .
 * Then T test cases follow. The first line of each test case contains two strings s and x.
 *
 * Output:
 * For each test case, in a new line,
 * output will be an integer denoting the first occurrence of the x in the string s.
 * Return -1 if no match found.
 *
 * Your Task:
 * Since this is a function problem, you don't have to take any input.
 * Just complete the strstr() function which takes two strings str, target as an input parameter.
 * The function returns -1 if no match  found
 * else it returns an integer denoting the first occurrence of the x in the string s.
 *
 * Example:
 * Input
 * 2
 * GeeksForGeeks Fr
 * GeeksForGeeks For
 * Output
 * -1
 * 5
 *
 * Explanation:
 * Testcase 1: Fr is not present in the string GeeksForGeeks as substring.
 * Testcase 2: For is present as substring in GeeksForGeeks from index 5 (0 based indexing).
 */
public class Implement_strStr {
    static  int strStr(String s1,String s2){
        int p=-1;
        if(s1==null||s2==null)
            return -1;
        if(s1.length()<s2.length())
            return -1;
        for(int i=0;i<=s1.length()-s2.length();i++){
            int j;
            for (j=0;j<s2.length();j++){
                if(s2.charAt(j)!=s1.charAt(i+j))
                    break;
            }
            if (j==s2.length())
                p=i;
        }

        return p;
    }
    public static void main(String[] args) {
        String str1="umaballav";
        String str2="av";
//        str1.contains(str2);

        int position=strStr(str1,str2);
        if(position>=0)
            System.out.println(position);
        else
            System.out.println("not contained");

    }
}
class AnotherApproach{/*this approach uses String.substring() method*/

    static  int strStr2(String s1,String s2){
        int p=-1;
        for (int i=0;i<=s1.length()-s2.length();i++){
            if(s2.equals(s1.substring(i,i+s2.length()))) {
                p=i;
                break;
            }

        }
        return p;
    }
    public static void main(String[] args) {
        String str1="umaballlav";
        String str2="ll";

        int position=strStr2(str1,str2);
        if(position>=0)
            System.out.println(position);
        else
            System.out.println("not contained");
    }
}
