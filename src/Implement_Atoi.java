import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

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
