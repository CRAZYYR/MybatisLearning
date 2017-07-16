package com.batis.mapper;

import java.util.List;

import com.mybatis.po.User;
import com.mybatis.po.UserCustom;
import com.mybatis.po.UserQueryVo;

/**
 * 
 * @author Administrator
 *com.batis.mapper.UserMapper
 */
public interface UserMapper {
	//根据用户name模糊查询
	public List<User> FindByLikeName(String name) throws Exception;
	//根据用户name进行删除
	public void DeleteUserByName(String name) throws Exception;	
	//向数据表中存入数据
	public void InsertToUser(User user) throws Exception;
	//根据用户name查询、
	public User FindByName(String name) throws Exception;
	//进行高级查询
	public List<UserCustom> FindUserList(UserQueryVo uqv) throws Exception;
	//	进行数据总数的查询
	public int FindUserCount(UserQueryVo uqv) throws Exception;
	//进行高级查询Map
	public List<User> FindUserMap(String name) throws Exception;
}
