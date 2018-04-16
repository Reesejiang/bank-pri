package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.ThirdPay;
import cn.itcast.ssm.po.ThirdPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdPayMapper {
    int countByExample(ThirdPayExample example);

    int deleteByExample(ThirdPayExample example);

    int deleteByPrimaryKey(String doubleCurr);

    int insert(ThirdPay record);

    int insertSelective(ThirdPay record);

    List<ThirdPay> selectByExample(ThirdPayExample example);

    ThirdPay selectByPrimaryKey(String doubleCurr);

    int updateByExampleSelective(@Param("record") ThirdPay record, @Param("example") ThirdPayExample example);

    int updateByExample(@Param("record") ThirdPay record, @Param("example") ThirdPayExample example);

    int updateByPrimaryKeySelective(ThirdPay record);

    int updateByPrimaryKey(ThirdPay record);
}