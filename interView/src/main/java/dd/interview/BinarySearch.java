package dd.interview;

import java.util.Arrays;

/**
 * BinarySearch
 * @author ZhongChaoYuan
 * @create 2018-10-27 21:39
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {1,3,2,6,5,4};
        Arrays.sort(arr);
        int search = binSearch(arr, 0, arr.length - 1,1);
        System.out.println(search);
    }


    public static int binSearch(int[] srcArray, int start, int end, int key) {
        int mid = (end + start) / 2;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }
}
