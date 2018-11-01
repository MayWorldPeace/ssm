package mybatis.mapper;

import dd.mybatis.mapper.OrderMapper;
import dd.mybatis.po.OrderUser;
import dd.mybatis.po.Orders;
import dd.mybatis.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-17 20:21
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    //resultMap查询orders
    @Test
    public void getOrders() {
        List<Orders> orders = orderMapper.getOrderListResultMap();
        for (Orders order : orders) {
            System.out.println(order);
        }
    }

    //创建po类继承一个目标po然后添加另一个po类所有要的属性
    @Test
    public void getOrderUserList() {
        List<OrderUser> orderUsers = orderMapper.getOrderUserList();
        for (OrderUser orderUser : orderUsers) {
            System.out.println(orderUser);
        }
    }

    //一对一关联映射
    @Test
    public void getOrderUserResultMap() {
        List<Orders> ordersList = orderMapper.getOrderUserResultMap();
        for (Orders orders : ordersList) {
            System.out.println(orders.toString());
        }
    }

    //一对多关联映射 只能采用resultMap

    @Test
    public void getUserWithOrders() {
        List<User> users = orderMapper.getUserWithOrders();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
