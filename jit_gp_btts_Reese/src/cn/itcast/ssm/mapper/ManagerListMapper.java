package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.ManagerList;
import cn.itcast.ssm.po.ManagerListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerListMapper {
    int countByExample(ManagerListExample example);

    int deleteByExample(ManagerListExample example);

    int deleteByPrimaryKey(Integer managerId);

    int insert(ManagerList record);

    int insertSelective(ManagerList record);

    List<ManagerList> selectByExample(ManagerListExample example);

    ManagerList selectByPrimaryKey(Integer managerId);

    int updateByExampleSelective(@Param("record") ManagerList record, @Param("example") ManagerListExample example);

    int updateByExample(@Param("record") ManagerList record, @Param("example") ManagerListExample example);

    int updateByPrimaryKeySelective(ManagerList record);

    int updateByPrimaryKey(ManagerList record);
}