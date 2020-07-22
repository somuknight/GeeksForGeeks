import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Implement_Atoi {
    public static int toAtoi(String str){
        int res=0;
        String patrn="-(\\d*)|(\\d*)";
        Pattern p=Pattern.compile(patrn);

        Matcher m=p.matcher(str);
        if(m.matches()){
            System.out.println("found");

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
        // TODO: 22-Jul-20 add mainCaller
    }
}
