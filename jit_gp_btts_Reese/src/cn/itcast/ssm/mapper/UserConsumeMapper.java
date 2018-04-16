package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.UserConsume;
import cn.itcast.ssm.po.UserConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserConsumeMapper {
    int countByExample(UserConsumeExample example);

    int deleteByExample(UserConsumeExample example);

    int deleteByPrimaryKey(Integer userConsumeId);

    int insert(UserConsume record);

    int insertSelective(UserConsume record);

    List<UserConsume> selectByExample(UserConsumeExample example);

    UserConsume selectByPrimaryKey(Integer userConsumeId);

    int updateByExampleSelective(@Param("record") UserConsume record, @Param("example") UserConsumeExample example);

    int updateByExample(@Param("record") UserConsume record, @Param("example") UserConsumeExample example);

    int updateByPrimaryKeySelective(UserConsume record);

    int updateByPrimaryKey(UserConsume record);
}