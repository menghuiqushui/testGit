package day04Test;

public class MethodOverload02 {
    public static void main(String[] args) {
        System.out.println(isIsSame(2,2.06));
    }
    public static boolean isIsSame(int a, double b){
        return a == b;
    }
}
