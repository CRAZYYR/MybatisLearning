package com.batis.dao;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.po.User;

public class UserDaoImpleTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource="SqlMapperConfig.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		 sqlSessionFactory= new SqlSessionFactoryBuilder().build(input);
	}

	@Test
	public void testFindUserByName() throws Exception {
		UserDao userDao=new UserDaoImple(sqlSessionFactory);
		 User user= userDao.FindUserByName("zs");
		 System.out.println(user);
	}

}
