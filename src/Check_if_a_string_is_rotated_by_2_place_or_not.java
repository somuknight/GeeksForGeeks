/*
  Given two strings, the task is to find if a string can be obtained by rotating another string two places.

  Examples:
  Input: string1 = “amazon”, string2 = “azonam”
  Output: Yes
  // rotated anti-clockwise

  Input: string1 = “amazon”, string2 = “onamaz”
  Output: Yes
  // rotated clockwise

  1- There can be only two cases:
      a) Clockwise rotated
      b) Anti-clockwise rotated

  2- If clockwise rotated that means elements
     are shifted in right.
     So, check if a substring[2.... len-1] of
     string2 when concatenated with substring[0,1]
     of string2 is equal to string1. Then, return true.

  3- Else, check if it is rotated anti-clockwise
     that means elements are shifted to left.
     So, check if concatenation of substring[len-2, len-1]
     with substring[0....len-3] makes it equals to
     string1. Then return true.

  4- Else, return false.
 */

import java.util.Scanner;

public class Check_if_a_string_is_rotated_by_2_place_or_not {
    static  boolean isRotated(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        String Clock="";
        String antiClock="";

        antiClock=/*antiClock+*/str1.substring(2)+str1.substring(0,2);
//        System.out.println(antiClock);    abcde   deabc
        Clock=str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2)/*+Clock*/;

        if(str2.equals(Clock)||str2.equals(antiClock))
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(isRotated(str1,str2)?"Yes":"No");
    }
}

