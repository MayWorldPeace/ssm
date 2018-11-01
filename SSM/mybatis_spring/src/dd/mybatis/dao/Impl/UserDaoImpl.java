package dd.mybatis.dao.Impl;

import dd.mybatis.dao.UserDao;
import dd.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author 钟超远
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserByIdDao(int id) {
		SqlSession sqlSession = getSqlSession();
		// 根据id查询用户信息
		User user = sqlSession.selectOne("getUserById", id);
		return user;
	}
}
