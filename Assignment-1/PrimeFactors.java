import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Q2(2);
    }
    public static void Q2(int x) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        primes.add(1);
        for(int i=1;i<x;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<i;j++)
            {
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes.add(i);
            }
        }
//To create an array containing prime number between 1 to given number
        int num1 = Collections.max(primes); //
        ans.add(num1);
//So highest number becomes one of the resultant number
        int num2=1;;
        for(int r=1;r<= (x-num1);r++)
        {
            //For even number the result will be two number : one is maximum value from prime array and
            //Another number will be between 1 to (Given Number - Max value prime)
            //For Odd it will be above two numbers plus 1
            if(x%2==0){
                if(num1+r==x){
                    num2 = r;
                    ans.add(num2);
                }
            }
            else
            {
                if(num1+r+1==x){
                    num2=r;
                    ans.add(num2);
                    ans.add(1);
                }
            }
        }
        System.out.print(ans);
        return;
    }
}