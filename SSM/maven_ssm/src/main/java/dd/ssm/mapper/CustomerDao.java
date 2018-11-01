package dd.ssm.mapper;

import dd.ssm.po.Customer;
import dd.ssm.po.QueryVo;
import java.util.List;


public interface CustomerDao {
	List<Customer> getCustomerList(QueryVo queryVo);
	Integer getCustomerListCount(QueryVo queryVo);
}
