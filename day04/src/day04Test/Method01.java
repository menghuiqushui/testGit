package day04Test;
/*
三种调用方法
1 单独调用
        方法名称(参数);

2 打印调用
        System.out.println(方法名称(参数));

3 赋值调用
        数据类型 数据名称 = 方法名称(参数);
 */
public class Method01 {
    public static void main(String[] args) {
        //单独调用
        getSum(10,20);
        System.out.println("============");

        //打印调用
        System.out.println(getSum(50,100));
        System.out.println("============");

        //赋值调用
        int sum = getSum(200,300);
        System.out.println(sum);


    }

    // 定义一个方法,用来返回两个整数相加的值
    public static int getSum(int a , int b){
        System.out.println("getSum方法执行了!");
        int result = a + b;
        return result;
    }
}
