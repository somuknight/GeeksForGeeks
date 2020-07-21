/**
 * https://www.geeksforgeeks.org/minimum-insertions-to-form-a-palindrome-dp-28/
 *
 * Given a string str, the task is to find the minimum number of characters to be inserted to convert it to palindrome.
 * Before we go further,
 *
 * let us understand with few examples:
 * ab: Number of insertions required is 1 i.e. bab
 * aa: Number of insertions required is 0 i.e. aa
 * abcd: Number of insertions required is 3 i.e. dcbabcd
 * abcda: Number of insertions required is 2 i.e. adcbcda
 *      which is same as number of insertions in the substring bcd(Why?).
 * abcde: Number of insertions required is 4 i.e. edcbabcde
 */

public class Min_Insertion_to_Form_Palindrome {
    static int findMinInsertion(char[] s,int l, int h){
        if(l>h)return Integer.MAX_VALUE;
        if(l==h)return 0;
        if (l==h-1)return (s[l]==s[h])?0:1;

        return (s[l]==s[h])?findMinInsertion(s,l+1,h-1):
                Integer.min(findMinInsertion(s,l,h-1),findMinInsertion(s,l+1,h)+1);
    }
    public static void main(String[] args) {

        String str1="geeks";
        String str2="ab";
        String str3="aa";
        String str4="abcda";
        String str5="madam";

        findMinInsertion(str3.toCharArray(),0,str3.length()-1);
    }
}
