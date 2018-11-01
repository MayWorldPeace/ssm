package dd.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-21 10:47
 **/
public class SetDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("窑子",18));
        list.add(new Student("窑子",18));
        list.add(new Student("窑子",18));
        list.add(new Student("窑子",17));
        Set set = new HashSet();
        for (Object s : list) {
            set.add(s);
        }
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
