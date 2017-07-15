package com.batis.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.po.User;

public class UserDaoImple implements UserDao{
	private SqlSessionFactory sqlSessionFactory;
	
	public UserDaoImple(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public User FindUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public User FindUserByName(String name) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession=sqlSessionFactory.openSession();
		User user= sqlSession.selectOne("test.FindByName",name);
		sqlSession.close();
		return user;
	}

	public List<User> FindUserLikeName(String name) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		SqlSession sqlSession=sqlSessionFactory.openSession();
		List<User> users= sqlSession.selectList("test.FindByLikeName",name);
		sqlSession.close();
		return users;
	}

	public void DeleteUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void DeleteUserByName(String name) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.delete("test.DeleteUserByName",name);
		sqlSession.commit();
		sqlSession.close();
		
	}

	public void InsertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.insert("test.InsertToUser",user);
		sqlSession.commit();
		sqlSession.close();
		
	}

	public void UpdateUser(int id, User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
