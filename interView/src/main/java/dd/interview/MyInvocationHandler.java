package dd.interview;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-17 22:12
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Service service;

    public MyInvocationHandler(Service service) {
        this.service = service;
    }

    String name = "getName";
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {  //把我们想要通过代理者给被代理者追加的操作都写在invoke方法里面
        if(name.equals(method.getName())){
            System.out.println("++++++before " + method.getName() + "++++++");
            Object result = method.invoke(service,args);
            System.out.println("++++++after " + method.getName() + "++++++");
            return result;
        }else{
            Object result = method.invoke(service,args);
            return result;
        }

    }
}

