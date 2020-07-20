/**
 * Shows a given number is prime number or not
 *
 * example:
 * 33
 * false
 */

import java.util.Scanner;

public class IsPrime {
    static void mainCaller(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s.charAt(0)==' '){
            IsPrime.main(null);
        }
    }
    static boolean isPrime(int n){
        boolean flag=false;
        if(n<=3 && n>0)
            flag=true;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0) {
                flag = false;
                break;
            }
            else
                flag=true;
        }
        return  flag;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(isPrime(a));
        mainCaller();
    }
}
