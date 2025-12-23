package FOUNDATIONAL_QUESTIONS;

import java.util.Scanner;

/*1 You are given two numbers n and k You are required to rotate n, k times to the right If k
is positive. rotate to the right i.e. remove rightmost
digit and make it leftmost. Do the reverse for negative value of k. Also k can have an
absolute value larger than number of digits in n.
2 Take as input n and k.
3 Print the rotated number.
4 Note - Assume that the number of rotations will not cause leading 0's in the result eg
such an input will not be given
n = 12340056
k=3
T= 05612340*/
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the K by which have to rotate: ");
        int k = sc.nextInt();


    }
}
