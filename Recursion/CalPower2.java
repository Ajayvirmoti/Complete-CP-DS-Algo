package Recursion;

public class CalPower2{
    public static int calPower(int x,int n){
        if(x==0 ){
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n%2==0){
            return calPower(x,n/2)*calPower(x,n/2);
        }else{
            return calPower(x,n/2)*calPower(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2, n=10;
        int ans = calPower(x,n);
        System.out.println(ans);
    }
}
