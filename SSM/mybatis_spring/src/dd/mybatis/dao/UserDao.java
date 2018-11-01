package dd.mybatis.dao;

import dd.mybatis.po.User;

/**
 * @author 钟超远
 */
@SuppressWarnings("all")
public interface UserDao {

	User getUserByIdDao(int id);
}
