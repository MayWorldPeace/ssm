package dd.interview;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * thread测试
 * @author ZhongChaoYuan
 * @create 2018-10-30 22:30
 **/
public class ThreadTest {
    /**
     * 线程池的基本大小
     */
    static int corePoolSize = 10;
    /**
     * 线程池最大数量
     */
    static int maximumPoolSizeSize = 100;
    /**
     * 线程活动保持时间
     */
    static long keepAliveTime = 1;
    /**
     * 任务队列
     */
    static ArrayBlockingQueue workQueue = new ArrayBlockingQueue(10);


    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSizeSize, keepAliveTime, TimeUnit.SECONDS, workQueue);
    };

}


