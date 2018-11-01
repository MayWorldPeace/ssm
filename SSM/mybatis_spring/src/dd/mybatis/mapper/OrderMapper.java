package dd.mybatis.mapper;

import dd.mybatis.po.OrderUser;
import dd.mybatis.po.Orders;
import dd.mybatis.po.User;
import java.util.List;

@SuppressWarnings("all")
public interface OrderMapper {
	List<Orders> getOrderList();
	List<Orders> getOrderListResultMap();
	List<OrderUser> getOrderUserList();
	List<Orders> getOrderUserResultMap();
	List<User> getUserWithOrders();
}
