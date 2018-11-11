package day04Test;
/*
定义一个方法,用来求出1-100之间所有数字的和值
 */

public class Method03 {
    public static void main(String[] args) {
        int result = getSum();
        System.out.println(result);
    }

    /*
    三要素:
        返回值:
        方法名称:
        参数列表:
     */
    public static int getSum(){
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }
}
