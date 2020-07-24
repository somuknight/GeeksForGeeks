/* print all possible permutation of a string

  input:
       cat
  output:
       cat
       cta
       act
       atc
       tca
       tac
 */

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        System.out.println(":"+ str.substring(0,0));
//        System.out.println(":"+ str.substring(1));
        permutation(str);

    }
    static void permutation(String str){
        permutation(str,"");
    }
    static void permutation(String str,String prefix){
        if (str.length()==0) {
            System.out.print(prefix+"\n");
        }else {
            for (int i=0;i<str.length();i++){
                String rem=str.substring(0,i)+str.substring(i+1);
                permutation(rem,prefix+str.charAt(i));
            }
            //System.out.print(str+"\n");
        }
    }

}
