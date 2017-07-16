package com.batis.mapper;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.po.User;
import com.mybatis.po.UserCustom;
import com.mybatis.po.UserQueryVo;

public class UserMapperTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource="SqlMapperConfig.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		 sqlSessionFactory= new SqlSessionFactoryBuilder().build(input);
	}

	@Test
	public void testFindByName() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
		User user= userMapper.FindByName("zs");
		System.out.println(user);
	}
	@Test
	public void testFindByLikeName() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
		List<User> user= userMapper.FindByLikeName("zs");
		System.out.println(user);
	}
	@Test
	public void FindUserList() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
		UserQueryVo queryVo=new UserQueryVo();
		UserCustom userCustom=new UserCustom();
		//userCustom.setSex('1');
	//	userCustom.setUsername("zs");
		queryVo.setUserCustom(userCustom);
		List<UserCustom> uc= userMapper.FindUserList(queryVo);
		System.out.println(uc);
	}
	@Test
	public void FindUserCount() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
		UserQueryVo queryVo=new UserQueryVo();
		UserCustom userCustom=new UserCustom();
		userCustom.setSex('1');
		userCustom.setUsername("zs");
		queryVo.setUserCustom(userCustom);
		int uc= userMapper.FindUserCount(queryVo);
		System.out.println(uc);

	}
	@Test
	public void FindUserMap() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
		List<User> uc= userMapper.FindUserMap("zs");
		System.out.println(uc);

	}

}
