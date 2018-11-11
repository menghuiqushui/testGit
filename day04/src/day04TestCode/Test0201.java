package day04TestCode;
/*
第02题
	分析以下需求，并用代码实现(每个小需求都需要写一个方法)
	    1.键盘录入长方形的长和宽   定义方法计算该长方形的周长,并在main方法中打印周长
	    2.键盘录入长方形的长和宽   定义方法计算该长方形的面积,并在main方法中打印面积
	    3.键盘录入圆的半径   定义方法计算该圆的周长,并在main方法中打印周长
	    4.键盘录入圆的半径   定义方法计算该圆的面积,并在main方法中打印面积
		思考 :
			1,方法的返回值类型
			2,方法的参数
			3,方法的名字
 */
import java.util.Scanner;
public class Test0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长:");
        int a = sc.nextInt();
        System.out.println("请输入长方形的宽:");
        int b = sc.nextInt();

        System.out.println("长方形的面积是:" + rectangleArea(a,b)); // 打印长方形的面积
        System.out.println("长方形的周长是:" + rectanglePerimeter(a,b)); // 打印长方形的周长

        System.out.println("请输入圆的半径:");
        double r = sc.nextDouble();

        System.out.println("圆的面积是:" + circleArea(r)); // 打印圆的面积
        System.out.println("圆的周长是:" + circlePerimeter(r)); // 打印圆的周长

    }
    // 定义方法计算该长方形的周长
    public static int rectanglePerimeter(int a, int b){
        return 2 * (a + b);
    }
    // 定义方法计算该长方形的面积
    public static int rectangleArea(int a, int b){
        return a * b;
    }
    //定义方法计算该圆的面积
    public static double circleArea(double r){
        return r * r * 3.14;
    }
    // 定义方法计算该圆的周长
    public static double circlePerimeter(double r){
        return 2 * 3.14 * r;
    }


}
