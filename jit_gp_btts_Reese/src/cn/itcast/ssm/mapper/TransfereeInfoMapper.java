package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.TransfereeInfo;
import cn.itcast.ssm.po.TransfereeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransfereeInfoMapper {
    int countByExample(TransfereeInfoExample example);

    int deleteByExample(TransfereeInfoExample example);

    int deleteByPrimaryKey(Integer transfereeId);

    int insert(TransfereeInfo record);

    int insertSelective(TransfereeInfo record);

    List<TransfereeInfo> selectByExample(TransfereeInfoExample example);

    TransfereeInfo selectByPrimaryKey(Integer transfereeId);

    int updateByExampleSelective(@Param("record") TransfereeInfo record, @Param("example") TransfereeInfoExample example);

    int updateByExample(@Param("record") TransfereeInfo record, @Param("example") TransfereeInfoExample example);

    int updateByPrimaryKeySelective(TransfereeInfo record);

    int updateByPrimaryKey(TransfereeInfo record);
}