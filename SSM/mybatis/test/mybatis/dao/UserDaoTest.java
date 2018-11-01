package mybatis.dao;

import dd.mybatis.dao.UserDao;
import dd.mybatis.dao.impl.UserDaoImpl;
import dd.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


/**
 * @author 钟超远
 */
public class UserDaoTest {

	private SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws Exception {
		// 第一步：创建一个SQLSessionFactoryBuilder对象。
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		// 第二步：加载配置文件。
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		// 第三步：创建SQLSessionFactory对象
		sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
	}

	@Test
	public void testGetUserById() {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = userDao.getUserById(10);
		System.out.println(user);
	}

	@Test
	public void testGetUserByName() {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		List<User> list = userDao.getUserByName("张");
		for (User user : list) {
			System.out.println(user);
		}

	}

	@Test
	public void testInsertUser() {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = new User();
		user.setUsername("赵云");
		user.setAddress("正定");
		user.setBirthday(new Date());
		user.setSex("1");
		userDao.insertUser(user);
		
	}

}
