package dd.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-21 10:54
 **/
public class ListDemo {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("愿");
        arr.add("世");
        arr.add("界");
        arr.add("和");
        arr.add("平");

        Collections.reverse(arr);
        System.out.println(arr);
        ListIterator<String> lt = arr.listIterator();

        while (lt.hasNext()) {
            String s = lt.next();
        }
        while(lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
    }
}
