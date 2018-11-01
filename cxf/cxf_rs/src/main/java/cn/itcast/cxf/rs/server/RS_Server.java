package cn.itcast.cxf.rs.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import cn.itcast.cxf.domain.Car;
import cn.itcast.cxf.domain.User;
import cn.itcast.cxf.service.IUserService;
import cn.itcast.cxf.service.UserServiceImpl;

public class RS_Server {
	public static void main(String[] args) {
		//创建接口实现类
		IUserService userService = new UserServiceImpl();
		//服务器factoryBean服务
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        //指定资源
        jaxrsServerFactoryBean.setResourceClasses(User.class, Car.class);
        //指定serviceBean
		jaxrsServerFactoryBean.setServiceBean(userService);
		//指定地址
		jaxrsServerFactoryBean.setAddress("http://localhost:9997");
		//发布服务
		jaxrsServerFactoryBean.create();
	}
}
