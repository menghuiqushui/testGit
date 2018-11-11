package day04TestCode;
/*
第三题
	比较两个数据是否相等。参数类型分别为两个 byte 类型，两个 short 类型，两个 int 类型，两个 long 类型，并
在 main 方法中进行测试。
 */

public class Test03 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 20;
        int e = 10;
        int f = 10;
        long g = 10;
        long h = 20;

        System.out.println(compare(a, b));
        System.out.println(compare(c, d));
        System.out.println(compare(e, f));
        System.out.println(compare(g, h));


    }

    public static boolean compare(byte a, byte b){
        System.out.println("两个byte:");
        return a == b;
    }

    public static boolean compare(short a, short b){
        System.out.println("两个short:");
        return a == b;
    }

    public static boolean compare(int a, int b){
        System.out.println("两个int:");
        return a == b;
    }

    public static boolean compare(long a, long b){
        System.out.println("两个long:");
        return a == b;
    }

}
