package dd.interview;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author ZhongChaoYuan
 * @create 2018-10-25 22:16
 **/
@SuppressWarnings("all")
public class BubbleSort {

    public static void main(String[] args) {
        //定义数组长度
        int []arr = new int[10];
        //随机赋值
        for (int i = 0; i < 10; i++) {
            int random =(int)( Math.random()*100);
            arr[i] = random;
        }
        sort(arr);
    }

    //排序
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
               if (arr[j] < arr[j+1]){
                   swap(arr ,j ,j+1);
               }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //交换顺序
    private static void swap(int []arr , int m ,int n) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
}
