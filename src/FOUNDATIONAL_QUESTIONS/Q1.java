package FOUNDATIONAL_QUESTIONS;

import java.util.Scanner;

//1 You've 10 check whether a given number is prime of not.
//
//2 Take a number "t" as Input representing count of input numbers to be tested.
//
//2 Take a number “n” as input 't’ number of times.
//
//3 For each input value of n. print “prime” if the number is prime and “not prime” otherwise.
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of input to test.");
        int t = sc.nextInt();

        for (int i = 0; i < t ; i++){
            System.out.println("Enter the number to test for the prime.");
            int n = sc.nextInt();

//            int count = 0;
//            for(int div = 1 ; div <= n ; div++)
//            {
//                if(n % div ==0){
//                    count ++;
//
//                }
//            }
//            if (count == 2){
//                System.out.println("Prime Number");
//            }
//            else{
//                System.out.println("NOt Prime");
//            }

        //Optimization 1
            //Approach : if a number is intented to be divisible it can be divided till its sqaure root,
            // if not then the number is not divisible by any number.
//            int count = 0;
//            for (int div = 2 ; div * div <= n ; div++){
//                if (n % div ==0){
//                    count ++;
//
//                }
//            }
//            if (count == 0){
//                System.out.println("prime");
//            }else{
//                System.out.println("Not prime");
//            }

            //Optimisation 2(best): Check for only 1 divisor before the square root if it is then the number is not prime
            int count = 0;
            for(int div = 2 ; div* div <=n ; div++){
                if(n % div ==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime");
            }
        }

    }

}

