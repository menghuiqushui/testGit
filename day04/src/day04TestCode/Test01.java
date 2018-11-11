package day04TestCode;
/*
第01题
	分析以下需求，并用代码实现(每个小需求都需要写一个成方法)
	    1.求两个数据之和(两个整数 )
	    2.判断两个数据是否相等(两个整数)
	    3.找出两个数中较大的值(两个整数)
	    4.找出两个数中较小的值(两个整数)
		思考 :
			1,方法的返回值类型
			2,方法的参数
			3,方法的名字
 */

public class Test01 {
    public static void main(String[] args) {
        System.out.println("两个数的和是:" + getSum(20,30));// 50
        System.out.println(isSame(20,20)); //true
        System.out.println("最大值是:" + compareMax(56,65)); // 65
        System.out.println("最小值是:" + compareMin(88,92)); // 88
    }

    //1.求两个数据之和(两个整数 )
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    //2.判断两个数据是否相等(两个整数)
    public static boolean isSame(int a, int b){
        return a == b;
    }

    //3.找出两个数中较大的值(两个整数)
    public static int compareMax(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    //4.找出两个数中较小的值(两个整数)
    public static int compareMin(int a, int b){
        int min = a < b ? a : b;
        return min;
    }

}
