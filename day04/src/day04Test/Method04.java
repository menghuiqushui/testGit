package day04Test;
/*
求出 n - m 的累加和
n到m的累加和
 */

public class Method04 {
    public static void main(String[] args) {
        int result = getSum(1,5);
        System.out.println(result);
    }

    public static int getSum(int n, int m){
        int sum = 0;
        for (int i = n; i <= m ; i++) {
            sum += i;
        }
        return sum;
    }

}
