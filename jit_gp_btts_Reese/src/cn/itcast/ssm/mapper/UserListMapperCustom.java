package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.UserListCustom;
import cn.itcast.ssm.po.UserQueryVo;

import java.util.List;

public interface UserListMapperCustom {
   //用户查询列表
	public List<UserListCustom> findUserList(UserQueryVo userQueryVo)throws Exception;
}