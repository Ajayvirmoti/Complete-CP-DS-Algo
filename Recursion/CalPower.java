package Recursion;

public class CalPower {
    public static int calPower(int x,int n){
        if(x==0 ){
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xpower1=calPower(x,n-1);
        int xPown = x*xpower1;
        return xPown;
    }
    public static void main(String[] args) {
        int x=2, n=9;
        int ans = calPower(x,n);
        System.out.println(ans);
    }
}
