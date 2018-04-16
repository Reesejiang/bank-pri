/**
 * 
 */
package cn.itcast.ssm.po;

/**
 * @author Reese.jiang
 * Description:用户的包装对象
 *
 * 2018年2月28日上午11:37:13
 */
public class UserQueryVo {
	//用户信息
	private UserList userList;
	
	//用户信息
	//private UserCustom userCustom;
	
	//为了系统 可扩展性，对原始生成的po进行扩展
	private UserListCustom userListCustom;

	/**
	 * @return the userList
	 */
	public UserList getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(UserList userList) {
		this.userList = userList;
	}

	/**
	 * @return the userListCustom
	 */
	public UserListCustom getUserListCustom() {
		return userListCustom;
	}

	/**
	 * @param userListCustom the userListCustom to set
	 */
	public void setUserListCustom(UserListCustom userListCustom) {
		this.userListCustom = userListCustom;
	}
	

}
