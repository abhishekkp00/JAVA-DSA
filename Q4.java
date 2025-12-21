import java.util.Scanner;

//1 You've to count the number of digits in a number
//2 Take as input "the number for which the Digits has to be counted.
//3 Print the digits in that number
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number");
        int n = sc.nextInt();

        int dig = 0;
        while(n!=0){
            n = n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
