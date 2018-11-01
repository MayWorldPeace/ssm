package cn.itcast.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IUserService {
	@WebMethod
	public String sayHello(String name);
}
