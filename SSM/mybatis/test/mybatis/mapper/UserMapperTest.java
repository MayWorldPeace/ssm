package mybatis.mapper;

import dd.mybatis.mapper.UserMapper;
import dd.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

@SuppressWarnings("all")
public class UserMapperTest {
	
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
		//和spring整合后省略
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//获得代理对象
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.getUserById(10);
		System.out.println(user);
		
		//和spring整合后省略
		sqlSession.close();
	}

	@Test
	public void testGetUserByName() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> list = userMapper.getUserByName("张");
		for (User user : list) {
			System.out.println(user);
		}
		sqlSession.close();
	}

	@Test
	public void testInsertUser() {
		//获取sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//获取代理对象
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setUsername("贱人窑子");
		user.setAddress("乾县");
		user.setSex("1");
		userMapper.insertUser(user);
		sqlSession.commit();
		System.out.println(user.getId());
		sqlSession.close();
	}

}
