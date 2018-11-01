package dd.interview;

/**
 * 饿汉模式
 * @author ZhongChaoYuan
 * @create 2018-10-16 19:55
 **/
@SuppressWarnings("all")
public class Singleton {
   //私有化构造器
    private Singleton() {}
    //实例化
    private static final Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }
}
