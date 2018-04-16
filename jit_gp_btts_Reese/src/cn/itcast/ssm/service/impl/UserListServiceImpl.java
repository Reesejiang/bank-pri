/**
 * 
 */
package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.UserListMapper;
import cn.itcast.ssm.mapper.UserListMapperCustom;
import cn.itcast.ssm.po.UserList;
import cn.itcast.ssm.po.UserListCustom;
import cn.itcast.ssm.po.UserQueryVo;
import cn.itcast.ssm.service.UserListService;

/**
 * @author Reese.jiang
 * Description:商品管理
 *
 * 2018年2月28日下午1:45:12
 */
public class UserListServiceImpl implements UserListService{

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#findUserList(cn.itcast.ssm.po.UserQueryVo)
	 */
	@Autowired
	private UserListMapperCustom userListMapperCustom;
	
	@Autowired
	private UserListMapper userListMapper;
	
	@Override
	public List<UserListCustom> findUserList(UserQueryVo userQueryVo) throws Exception {
		// 通过UserListMapperCustom查询数据库
		return userListMapperCustom.findUserList(userQueryVo);
	}

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#findUserListByuserName(java.lang.String)
	 */
	@Override
	public UserListCustom findUserListByuserName(String userName) throws Exception {
		UserList userList = userListMapper.selectByPrimaryKey(userName);
		
		//中间进行业务处理
		UserListCustom userListCustom = new UserListCustom();
		//将userList的属性值拷贝到userListCustom
		BeanUtils.copyProperties(userList, userListCustom);
		
		return userListCustom;
	}

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#updateUserList(java.lang.String, cn.itcast.ssm.po.UserListCustom)
	 */
	@Override
	public void updateUserList(String userName, UserListCustom userListCustom) throws Exception {
		//添加业务校验，通常在service接口中对关键参数进行校验
		
		//校验userName 是否为空，如果为空抛出异常
		
		//更新商品信息
		//updateByPrimaryKeySelective要求必须传入userName
		userListCustom.setUserName(userName);
		userListMapper.updateByPrimaryKey(userListCustom);
		
		
	}

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#add(cn.itcast.ssm.service.UserListService)
	 */
	//添加用户
	@Override
	public void insertuserList(UserList userList) {
		// TODO Auto-generated method stub
		userListMapper.insert(userList);
		
	}

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#deleteByuserName(java.lang.String)
	 */
	//删除用户
	@Override
	public void deleteuserList(String userName) {
		// TODO Auto-generated method stub
		userListMapper.deleteByPrimaryKey(userName);
	}

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#login(java.lang.String, java.lang.String)
	 */
/*	@Override
	public void login(String userName, String password) throws Exception {
		// TODO Auto-generated method stub
		userListMapper.selectByPrimaryKey(userName);
		
	}*/

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#regist(cn.itcast.ssm.po.UserList)
	 */
/*	@Override
	public void regist(UserList userList) throws Exception {
		// TODO Auto-generated method stub
		userListMapper.insert(userList);
		
	}*/

	/* (non-Javadoc)
	 * @see cn.itcast.ssm.service.UserListService#deleteuserList(java.lang.String[], cn.itcast.ssm.po.UserListCustom)
	 */

	
	

}
