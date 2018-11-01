package mybatis.dao;

import dd.mybatis.dao.UserDao;
import dd.mybatis.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-18 9:52
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getUserByIdDao() {
        User user = userDao.getUserByIdDao(10);
        System.out.println(user);
    }
}
