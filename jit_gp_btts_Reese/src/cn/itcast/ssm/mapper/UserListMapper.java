package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.UserList;
import cn.itcast.ssm.po.UserListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserListMapper {
    int countByExample(UserListExample example);

    int deleteByExample(UserListExample example);

    int deleteByPrimaryKey(String userName);

    int insert(UserList record);

    int insertSelective(UserList record);

    List<UserList> selectByExample(UserListExample example);

    UserList selectByPrimaryKey(String userName);

    int updateByExampleSelective(@Param("record") UserList record, @Param("example") UserListExample example);

    int updateByExample(@Param("record") UserList record, @Param("example") UserListExample example);

    int updateByPrimaryKeySelective(UserList record);

    int updateByPrimaryKey(UserList record);
}