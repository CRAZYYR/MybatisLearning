package com.batis.dao;

import java.util.List;

import com.mybatis.po.User;

/**
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	//�����û�ID��ѯ��
	public User FindUserById(int id) throws Exception;
	//�����û�name��ѯ
	public User FindUserByName(String name) throws Exception;
	//�����û�nameģ����ѯ
	public List<User> FindUserLikeName(String name) throws Exception;
	//�����û�ID����ɾ��
	public void DeleteUserById(int id) throws Exception;
	//�����û�name����ɾ��
	public void DeleteUserByName(String name) throws Exception;	
	//�����ݱ��д�������
	public void InsertUser(User user) throws Exception;
	//�������ݱ�
	public void UpdateUser(int id,User user) throws Exception;
}
