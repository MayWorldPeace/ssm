package dd.ssm.service.impl;

import dd.ssm.mapper.CustomerDao;
import dd.ssm.po.Customer;
import dd.ssm.po.QueryVo;
import dd.ssm.service.CustomerService;
import dd.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 客户管理Service
 * <p>Title: CustomerServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public Page<Customer> getCustomerList(QueryVo queryVo) {
		//计算分页起始记录
		if (queryVo.getPage() != null) {
			queryVo.setStart((queryVo.getPage() - 1) * queryVo.getSize());
		}
		List<Customer> customerList = customerDao.getCustomerList(queryVo);
		//创建一个Page对象
		Page<Customer> page = new Page<Customer>();
		page.setRows(customerList);
		//查询总记录数
		Integer count = customerDao.getCustomerListCount(queryVo);
		page.setTotal(count);
		page.setSize(queryVo.getSize());
		page.setPage(queryVo.getPage());
		//返回结果
		return page;
	}
}
