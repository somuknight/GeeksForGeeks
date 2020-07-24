/**
 * Reverse words in a given String in Java
 * Let’s see an approach to reverse words of a
 * given String in Java without using any of the String library function
 *
 * example:
 * Input : "Welcome to geeksforgeeks"
 * Output : "geeksforgeeks to Welcome"
 *
 * Input : "I love Java Programming"
 * Output :"Programming Java love I"
 */ //gist
public class ReverseWordsOfAString {
    public static void main(String[] args) {
        String s="i want to be a gamer.";           //input
        String ans="";                              //final output
        String[] str=s.split("(\\.)|(\\s)");  //splitting and storing  in to the array
                                                    //'\.' used for fullstop and '\s' for space
        for (int i=0;i<str.length;i++){             //displaying the array content
            System.out.println(str[i]);
        }
        for (int i=str.length-1;i>=0;i--){
            ans=ans+str[i]+" ";
        }
        System.out.println("reversed string is: "+ans);
    }
}

