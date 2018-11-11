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
public class Test02 {
    public static void main(String[] args) {
        rectangleArea(); //调用求长方形面积的方法
        rectanglePerimeter(); // 调用求长方形周长的方法
        circleArea(); // 调用求圆的面积的方法
        circlePerimeter(); // 调用求圆的周长的方法
    }

    // 定义方法计算该长方形的周长
    public static void rectanglePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长:");
        int a = sc.nextInt();
        System.out.println("请输入长方形的宽:");
        int b = sc.nextInt();

        int perimeter = a * 2 + b * 2;
        System.out.println("长方形的周长是:" + perimeter);

    }

    // 定义方法计算该长方形的面积
    public static void rectangleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长:");
        int a = sc.nextInt();
        System.out.println("请输入长方形的宽:");
        int b = sc.nextInt();

        int Area = a * b;
        System.out.println("长方形的面积是:" + Area);
    }

    //定义方法计算该圆的面积
    public static void circleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        double a = sc.nextDouble();

        double Area = (double)(a * a * 3.14);
        System.out.println("圆的面积是:" + Area);
    }

    // 定义方法计算该圆的周长
    public static void circlePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        double a = sc.nextDouble();

        double perimeter = (double)(2 * a * 3.14);
        System.out.println("圆的周长是:" + perimeter);
    }





}
