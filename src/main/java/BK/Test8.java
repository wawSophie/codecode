package BK;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

import java.util.Map;
import java.util.Scanner;

/**
 * 给出三个正整数a，b 和 c，你可以在它们之间插入加号或者乘号以及括号将其变成一个表达式。比如给出
 * 数字 1，2 和 3，你可以构造出：
 * 1+2*3=7
 * 1*(2+3)=5
 * 1*2*3=6
 * (1+2)*3=9
 * 等表达式。现在你需要构造一个值最大的表达式，输出这个值。
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1=in.nextInt();
        int x2=in.nextInt();
        int x3=in.nextInt();
        System.out.println(getMax(x1,x2,x3));;
    }

    private static int getMax(int x1, int x2, int x3) {
        int max=Integer.MIN_VALUE;
        int[] arr=new int[6];
        arr[0]=addAll(x1,x2,x3);
        arr[1]=addFirst(x1,x2,x3);
        arr[2]=addLast(x1,x2,x3);
        arr[3]=multiFirst(x1,x2,x3);
        arr[4]=mulltiLast(x1,x2,x3);
        arr[5]=multiAll(x1,x2,x3);
        for (int i=0;i<6;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    private static int multiAll(int x1, int x2, int x3) {
        return x1*x2*x3;
    }
    /**
     * x1+x2*x3
     * @param x1
     * @param x2
     * @param x3
     * @return
     */
    private static int mulltiLast(int x1, int x2, int x3) {
        return x1+x2*x3;
    }

    /**
     * x1*x2+x3
     * @param x1
     * @param x2
     * @param x3
     * @return
     */
    private static int multiFirst(int x1, int x2, int x3) {
        return x1*x2+x3;
    }

    /**
     * x1*(x2+x3)
     * @param x1
     * @param x2
     * @param x3
     * @return
     */
    private static int addLast(int x1, int x2, int x3) {
        return x1*(x2+x3);
    }

    /**
     * （x1+x2）*x3
     * @param x1
     * @param x2
     * @param x3
     * @return
     */
    private static int addFirst(int x1, int x2, int x3) {
        return (x1+x2)*x3;
    }

    /**
     * 全部相加
     * @param x1
     * @param x2
     * @param x3
     * @return
     */
    private static int addAll(int x1, int x2, int x3) {
        return x1+x2+x3;
    }

}