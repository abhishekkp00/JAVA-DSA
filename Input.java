import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        System.out.println("Hello "+ name+ " your age is " +age+ " years.");

    }
}
