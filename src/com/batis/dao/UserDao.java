package com.batis.dao;

import java.util.List;

import com.mybatis.po.User;

/**
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	//根据用户ID查询、
	public User FindUserById(int id) throws Exception;
	//根据用户name查询
	public User FindUserByName(String name) throws Exception;
	//根据用户name模糊查询
	public List<User> FindUserLikeName(String name) throws Exception;
	//根据用户ID进行删除
	public void DeleteUserById(int id) throws Exception;
	//根据用户name进行删除
	public void DeleteUserByName(String name) throws Exception;	
	//向数据表中存入数据
	public void InsertUser(User user) throws Exception;
	//更新数据表
	public void UpdateUser(int id,User user) throws Exception;
}
