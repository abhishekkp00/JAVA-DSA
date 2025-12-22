import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int inv =0;
        int op=1;
        while(num !=0){
            int od = num % 10;
            int id= op;
            int ip = od;

            //make changes to inv using ip and id
            inv = inv + id *(int)Math.pow(10, ip-1);

            num = num/10;
            op++;
        }
        System.out.println(inv);
    }
}
