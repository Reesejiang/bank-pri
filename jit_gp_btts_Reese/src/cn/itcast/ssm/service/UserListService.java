/**
 * 
 */
package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.UserList;
import cn.itcast.ssm.po.UserListCustom;
import cn.itcast.ssm.po.UserQueryVo;

/**
 * @author Reese.jiang
 * Description:用户管理的service
 *
 * 2018年2月28日下午1:41:05
 */
public interface UserListService {
	//用户查询列表
	public List<UserListCustom> findUserList(UserQueryVo userQueryVo)throws Exception;
	
	//根据用户名userName(主键)查询用户信息
	public UserListCustom findUserListByuserName(String userName) throws Exception;
	
	//修改用户信息,修改用户的用户名userName，修改用户的信息userListCustom
	public void updateUserList(String userName,UserListCustom userListCustom) throws Exception;
	
	

	/**
	 * @param userListService
	 * 添加用户
	 */
	public void insertuserList(UserList userList);

	/**
	 * @param userName
	 * @param userListCustom
	 * 删除用户
	 */
	public void deleteuserList(String userName);


	//用户登陆
	/*public void login(String userName,String password) throws Exception;
	*/
	/*//用户注册
	public void regist(UserList userList) throws Exception;*/
	
}
