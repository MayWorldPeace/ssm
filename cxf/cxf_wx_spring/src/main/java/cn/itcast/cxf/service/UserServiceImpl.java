package cn.itcast.cxf.service;

import javax.jws.WebService;

@WebService(endpointInterface = "cn.itcast.cxf.service.IUserService", serviceName = "userService")
public class UserServiceImpl implements IUserService {

	// 简单参数传递
	public String sayHello(String name) {
		return "Hello," + name;
	}
}
