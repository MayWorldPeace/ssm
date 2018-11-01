package dd.ssm.service;

import dd.ssm.po.Customer;
import dd.ssm.po.QueryVo;
import dd.ssm.util.Page;

public interface CustomerService {

	Page<Customer> getCustomerList(QueryVo queryVo);
}
