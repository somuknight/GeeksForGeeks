/*
  Your task  is to implement the function atoi.
  The function takes a string(str) as argument and converts it to an integer and returns it.

  Input:
  The first line of input contains an integer T denoting the no of test cases .
  Then T test cases follow. Each test case contains a string str .
  Output:
  For each test case in a new line output will be an integer denoting the converted integer,
  if the input string is not a numerical string then output will be -1.

  Your Task:
  Complete the function atoi() which takes a string as input parameter and returns integer value of it.
  if the input string is not a numerical string then returns 1..

  Expected Time Complexity: O(|S|), |S| = length of string S.
  Expected Auxiliary Space: O(1)

  Constraints:
  1<=T<=100
  1<=length of (s,x)<=10

  Example(To be used only for expected output) :
  Input:
  2

  123
  21a

  Output:
  123
  -1

  Explanation:
  Test Case 1: Integer value of '123' is 123.
  Test Case 2: Output is -1 as all characters are not digit only.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Implement_Atoi {
    public static int toAtoi(String str){
        int res=0;
        int sign=1;
        String patrn="-(\\d*)|(\\d*)";
        Pattern p=Pattern.compile(patrn);

        Matcher m=p.matcher(str);

        int i=0;
        if(m.matches()){
            if(str.charAt(0)=='-') {
                sign = -1;
                i = i + 1;

                for (; i < str.length(); i++) {

                    res = res *10 + Character.getNumericValue( str.charAt(i));
                }
                res=res*sign;
            }
            else{
                for (; i < str.length(); i++) {
                    res = res * 10 + Character.getNumericValue( str.charAt(i));
                }
            }

        }
        else
            res=-1;



        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int num=toAtoi(str);
        System.out.println(num);

        mainCaller();
    }

     static void mainCaller() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)==' '){
            Implement_Atoi.main(null);
        }

    }
}
