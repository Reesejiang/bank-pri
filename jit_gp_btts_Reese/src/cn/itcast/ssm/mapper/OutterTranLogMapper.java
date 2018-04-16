package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.OutterTranLog;
import cn.itcast.ssm.po.OutterTranLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutterTranLogMapper {
    int countByExample(OutterTranLogExample example);

    int deleteByExample(OutterTranLogExample example);

    int deleteByPrimaryKey(String outterBank);

    int insert(OutterTranLog record);

    int insertSelective(OutterTranLog record);

    List<OutterTranLog> selectByExample(OutterTranLogExample example);

    OutterTranLog selectByPrimaryKey(String outterBank);

    int updateByExampleSelective(@Param("record") OutterTranLog record, @Param("example") OutterTranLogExample example);

    int updateByExample(@Param("record") OutterTranLog record, @Param("example") OutterTranLogExample example);

    int updateByPrimaryKeySelective(OutterTranLog record);

    int updateByPrimaryKey(OutterTranLog record);
}