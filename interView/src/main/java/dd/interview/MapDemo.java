package dd.interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-21 19:49
 **/
public class MapDemo {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,11);
        map.put(2,22);
        map.put(3,33);

        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
