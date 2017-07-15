package com.mybatis.po;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	/**
	 * 准确的查找某一值通过 Name
	 * @throws IOException
	 */
	public void FindByName() throws IOException{
		String resource="SqlMapperConfig.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(input);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		User user=   sqlsession.selectOne("test.FindByName","zs");
		System.out.println(user);
		sqlsession.close();
		
	} 
	/**
	 * 通过Name进行模糊查询
	 * @throws IOException
	 */
	public void FindByLikeName() throws IOException {
		// TODO Auto-generated method stub
		String resource="SqlMapperConfig.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(input);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		List<User> user = sqlsession.selectList("test.FindByLikeName", "zs");
		System.out.println(user);
		sqlsession.close();

	}
	public void InsertToUser() throws IOException{
		// TODO Auto-generated method stub
		String resource="SqlMapperConfig.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(input);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		User user=	new User();
		user.setUsername("美丽");
		user.setSex('1');
		user.setBirthday(new Date()+"");
		sqlsession.insert("test.InsertToUser", user);
		sqlsession.commit();
		System.out.println("主键ID是:"+user.getId());
		sqlsession.close();

	}
	public  void DeleteUserByName() throws IOException{
		String resource="SqlMapperConfig.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(input);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		sqlsession.delete("test.DeleteUserByName", "admin");
		sqlsession.commit();
		sqlsession.close();
	}
	
}
