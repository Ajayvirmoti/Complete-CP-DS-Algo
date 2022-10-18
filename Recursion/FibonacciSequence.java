package Recursion;

public class FibonacciSequence {
    public static void printFibonacci(int a,int b,int n){
        if (n==0) {
            return;
        }
        int c= a+b;
        System.out.println(c);
        printFibonacci(b,c,n-1);

    }
    public static void main(String[] args) {
        System.out.println(0+"\n" +1);
        int a=0;
        int b=1;
        printFibonacci(a,b,10);
    }
}
