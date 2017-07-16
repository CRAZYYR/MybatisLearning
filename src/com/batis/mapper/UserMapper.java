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
	//�����û�nameģ����ѯ
	public List<User> FindByLikeName(String name) throws Exception;
	//�����û�name����ɾ��
	public void DeleteUserByName(String name) throws Exception;	
	//�����ݱ��д�������
	public void InsertToUser(User user) throws Exception;
	//�����û�name��ѯ��
	public User FindByName(String name) throws Exception;
	//���и߼���ѯ
	public List<UserCustom> FindUserList(UserQueryVo uqv) throws Exception;
	//	�������������Ĳ�ѯ
	public int FindUserCount(UserQueryVo uqv) throws Exception;
	//���и߼���ѯMap
	public List<User> FindUserMap(String name) throws Exception;
}
