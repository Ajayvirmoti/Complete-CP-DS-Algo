package Recursion;

import java.util.Scanner;

public class PrintFact {
    public static void printFact(int n,int fact){
        // if n = 0 or we want to print factorial of 0
        if (fact==1 && n==0){
            System.out.println(1);
            return;
        }
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
        printFact(n-1,fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        printFact(n,fact);

    }

}
