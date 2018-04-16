package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.InnerTranLog;
import cn.itcast.ssm.po.InnerTranLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnerTranLogMapper {
    int countByExample(InnerTranLogExample example);

    int deleteByExample(InnerTranLogExample example);

    int deleteByPrimaryKey(String innerBank);

    int insert(InnerTranLog record);

    int insertSelective(InnerTranLog record);

    List<InnerTranLog> selectByExample(InnerTranLogExample example);

    InnerTranLog selectByPrimaryKey(String innerBank);

    int updateByExampleSelective(@Param("record") InnerTranLog record, @Param("example") InnerTranLogExample example);

    int updateByExample(@Param("record") InnerTranLog record, @Param("example") InnerTranLogExample example);

    int updateByPrimaryKeySelective(InnerTranLog record);

    int updateByPrimaryKey(InnerTranLog record);
}