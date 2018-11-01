package dd.interview;

import java.io.UnsupportedEncodingException;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-20 15:21
 **/
@SuppressWarnings("all")
public class UTFDemo {
    static char a;
    public static void main(String[] args) {
        try {
            System.out.println("帅".getBytes("utf-8").length);
            System.out.println("帅".getBytes("GBk").length);

            char b = '\u0000';
            System.out.println(a ==b);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
