package dd.mybatis.dao;

import dd.mybatis.po.User;
import java.util.List;


/**
 * @author 钟超远
 */
@SuppressWarnings("all")
public interface UserDao {

	User getUserById(int id);
	List<User> getUserByName(String username);
	void insertUser(User user);
}
