package day04Test;
/*
类型不同
题目要求:
比较两个数字是否相等
参数类型分别为两个byte类型,两个short类型,两个int类型,两个long类型
并在main方法中进行测试
 */

public class MethodOverloadTest01 {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(1220L,56));
        System.out.println(isSame(23,23L));
        System.out.println(isSame(2.5f,2.5f));
        System.out.println(isSame(2.5,5));

    }

    public static boolean isSame(short a, short b){
        return a == b;
    }

    public static boolean isSame(int a, int b){
        return a == b;
    }

    public static boolean isSame(byte a, byte b){
        return a == b;
    }

    public static boolean isSame(long a, long b){
        return a == b;
    }

    public static boolean isSame(double a, double b){
        return a == b;
    }

}
