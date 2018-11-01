package dd.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-17 21:52
 **/
public class Main1 {
    public static void main(String[] args) {

        Service service = new ServiceImpl();
        //创建一个InvocationHandler，描述我们希望代理者执行哪些操作
        InvocationHandler invocationHandler = new MyInvocationHandler(service);
        Service serviceProxy = (Service) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),invocationHandler);
        String name = serviceProxy.getName();
        System.out.println(name);
    }
}