package Recursion;

public class PrintNum {

    public static void printnumNto1(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnumNto1(n-1);
        System.out.println(n);
    }
    public static void printnum1toN(int n,int m){
        if (n==m+1) {
            return;
        }
        System.out.println(n);
        printnum1toN(n+1,m);
    }
    public static void main(String[] args) {
        int n=5;
        int m=5;
        printnumNto1(n);
        printnum1toN(1,m);
    }
}
