package mybatis.mapper;

import dd.mybatis.mapper.UserMapper;
import dd.mybatis.po.QueryVo;
import dd.mybatis.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-17 20:05
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserMapperTest{

    @Autowired
    private UserMapper userMapper;

    //根据id查询用户
    @Test
    public void findByUserId(){
        User user = userMapper.getUserById(10);
        System.out.println(user);
    }

    //姓名模糊查询

    @Test
    public void findByLikeName() {
        List<User> users = userMapper.getUserByName("%张%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    //包装po类查询
    @Test
    public void findByQueryVo() {
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setId(10);
        queryVo.setUser(user);
        User userVo = userMapper.getUserByQueryVo(queryVo);
        System.out.println(userVo);
    }
    //测试where  if  查询
    @Test
    public void findBySomeCondition() {
        User user = new User();
        user.setAddress("河南郑州");
        user.setUsername("%张%");
        userMapper.findUserList(user);
    }

    //根据多个id查询用户

    @Test
    public void findByIds() {
        QueryVo queryVo = new QueryVo();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(10);
        ids.add(24);
        ids.add(25);
        ids.add(55);
        queryVo.setIds(ids);

        List<User> users = userMapper.findUserByIds(queryVo);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
