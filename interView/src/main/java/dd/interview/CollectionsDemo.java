package dd.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 集合排序
 * @author ZhongChaoYuan
 * @create 2018-10-15 19:48
 **/
public class CollectionsDemo {

    public static void main(String[] args) {
        listSort();
        //search();
        Map<Integer, User> map = new HashMap<Integer, User>();
        map.put(1, new User("窑子", 18));
        map.put(2, new User("淫龙", 12));
        map.put(3, new User("鸡儿", 25));
        //LinkedHashMap<Integer, User> hashMap = sortMap(map);
        //System.out.println(hashMap);
    }

    /**
     * map集合排序
     * LinkedHashMap有索引
     * @param map
     * @return
     */
    private static LinkedHashMap<Integer, User> sortMap(Map<Integer, User> map) {
        //获取map的键 值集合
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();

        //将map集合转换为list集合
        List<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entrySet);
        //调用list集合collections.sort方法排序
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        //创建linkedHasMap存入数据,并返回;
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();
        for (Map.Entry<Integer, User> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /**
     * list集合排序
     * 实现collections接口,调用sort方法
     */
    private static void listSort() {
        List<User> userMap = new ArrayList<User>();
        userMap.add(new User("张三", 25));
        userMap.add(new User("李四", 22));
        userMap.add(new User("王五", 28));

        Collections.sort(userMap);
        System.out.println(userMap);
    }

    /**
     * 二分查找
     */
    private static void search(){
        List<Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int i = Collections.binarySearch(list, 1);
        System.out.println(i);
    }
}
