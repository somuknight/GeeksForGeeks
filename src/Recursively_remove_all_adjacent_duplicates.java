import java.util.Scanner;

/**
 * Given a string, recursively remove adjacent duplicate characters from the string.
 * The output string should not have any adjacent duplicates. See following examples.
 *
 * Examples:
 *
 * Input: azxxzy
 * Output: ay
 * First “azxxzy” is reduced to “azzy”.
 * The string “azzy” contains duplicates,
 * so it is further reduced to “ay”.
 *
 * Input: caaabbbaacdddd
 * Output: Empty String
 *
 * Input: acaaabbbacdddd
 * Output: acac
 */

public class Recursively_remove_all_adjacent_duplicates {
    static String removeUntil(String str,char last_removed){
        if(str.length()==0||str.length()==1){
            return str;
        }
        // Remove leftmost same characters and recur for remaining
        // string
        if (str.charAt(0) == str.charAt(1))
        {
            last_removed = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1))
                str = str.substring(1);
            str = str.substring(1);
            return removeUntil(str, last_removed);
        }
        // At this point, the first character is definiotely different
        // from its adjacent. Ignore first character and recursively
        // remove characters from remaining string
        String rem_str = removeUntil(str.substring(1,str.length()), last_removed);

        // Check if the first character of the rem_string matches with
        // the first character of the original string
        if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0))
        {
            last_removed = str.charAt(0);
            return rem_str.substring(1); // Remove first character
        }
        // If remaining string becomes empty and last removed character
        // is same as first character of original string. This is needed
        // for a string like "acbbcddc"
        if (rem_str.length() == 0 && last_removed == str.charAt(0)){
            return rem_str;
        }
        // If the two first characters of str and rem_str don't match,
        // append first character of str before the first character of
        // rem_str
        return (str.charAt(0) + rem_str);

    }
    static String remove(String s1){
        char last_removed='\0';
        return removeUntil(s1,last_removed);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(remove(str));
    }
}

