package mapper;

import dd.ssm.mapper.OrdersMapper;
import dd.ssm.po.Orders;
import dd.ssm.po.OrdersExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Date;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-18 14:15
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OrderMapperTest {

    @Autowired
    private OrdersMapper ordersMapper;

    //查询所有order
    @Test
    public void selectByExample() {
        OrdersExample example = new OrdersExample();
        List<Orders> orders = ordersMapper.selectByExample(example);
        for (Orders order : orders) {
            System.out.println(order);
        }
    }

    //条件查询orders
    @Test
    public void selectByExample2() {
        OrdersExample example = new OrdersExample();
        OrdersExample.Criteria criteria = example.createCriteria();
        //criteria.andIdEqualTo(3);
        criteria.andCreatetimeLessThan(new Date());
        List<Orders> orders = ordersMapper.selectByExample(example);
        for (Orders order : orders) {
            System.out.println(order);
        }
    }
}
