package Recursion;
//Print sum of first n Natural Numbers
public class PrintSum {
    public static void printsum(int n,int m,int sum){
        if (n == m) {

            System.out.println(sum);
            return;
        }
        System.out.println(sum);
        sum+=m;
        printsum(n,m+1,sum);
    }
    public static void main(String[] args) {
        int sum = 0;
        int n=5;
        int m=0;
        printsum(n,m,sum);
    }
}
