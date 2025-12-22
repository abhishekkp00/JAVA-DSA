import java.util.Scanner;

/*1 You've to display the digits of a number in reverse.
2 Take as input "n". the number for which digits have to be displaye in reverse.
3 Print the digits of the number line-wise. but in reverse order*/
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Reversed number is: ");
        while(num!=0){
            int dig = num%10;
            num= num/10;
            System.out.println(dig);
        }
    }

}
