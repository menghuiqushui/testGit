package day04TestCode;
/*
第四题
	练习一下方法的重载,下面是案例,同名的方法,不同的参数类型
	模拟输出语句中的 println 方法效果，传递什么类型的数据就输出什么类型的数据，只允许定义一个方法名
println
 */

public class Test04 {
    public static void main(String[] args) {
        println(50.0);
    }

    public static void println(byte a){
        System.out.println(a);
    }

    public static void println(short a){
        System.out.println(a);
    }

    public static void println(int a){
        System.out.println(a);
    }

    public static void println(long a){
        System.out.println(a);
    }

    public static void println(float a){
        System.out.println(a);
    }

    public static void println(double a){
        System.out.println(a);
    }

    public static void println(char a){
        System.out.println(a);
    }

    public static void println(boolean a){
        System.out.println(a);
    }

}
