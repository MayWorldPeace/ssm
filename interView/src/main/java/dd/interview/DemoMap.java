package dd.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-21 11:13
 **/
public class DemoMap {

    public static void main(String[] args) {
        String s = "wsdsrdbhtaa";
        char[] chars = s.toCharArray();
        Map<Object,Integer> map = new HashMap();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                map.put(aChar,map.get(aChar)+1);
            }else{
                map.put(aChar,1);
            }
        }
        Set<Map.Entry<Object, Integer>> entries = map.entrySet();
        for (Map.Entry<Object, Integer> entry : entries) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
    }
}
