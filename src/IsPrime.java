/**
 * Shows a given number is prime number or not
 *
 * example:
 * 33
 * false
 */
// TODO: 20-Jul-20 add a mainCall method
import java.util.Scanner;

public class IsPrime {
    static boolean isPrime(int n){
        boolean flag=false;
        if(n<=2 && n>0)
            flag=true;
        for(int i=2;i<(int)Math.sqrt(n);i++){
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

    }
}
