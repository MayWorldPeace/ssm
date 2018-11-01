package dd.mybatis.mapper;

import dd.mybatis.po.QueryVo;
import dd.mybatis.po.User;
import java.util.List;

@SuppressWarnings("all")
public interface UserMapper {

	User getUserById(int id);
	List<User> getUserByName(String username);
	void insertUser(User user);
	User getUserByQueryVo(QueryVo queryVo);
	Integer getUserCount();
	List<User> findUserList(User user);
	List<User> findUserByIds(QueryVo queryVo);
	
}
