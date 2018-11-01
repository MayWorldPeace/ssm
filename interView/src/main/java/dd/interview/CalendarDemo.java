package dd.interview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar测试
 * @author ZhongChaoYuan
 * @create 2018-10-30 21:52
 **/
public class CalendarDemo {

    public static void main(String[] args) {
        //获取日期类
        Calendar instance = Calendar.getInstance();
        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前时间
        Date time = instance.getTime();
        String format = sdf.format(time);
        System.out.println(format);
        //设置时间为当前时间加一日
        instance.set(Calendar.DATE,instance.get(Calendar.DATE)+1);
        String s = instance.getTime().toLocaleString();
        System.out.println(s);
    }
}
