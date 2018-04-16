package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Visa;
import cn.itcast.ssm.po.VisaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisaMapper {
    int countByExample(VisaExample example);

    int deleteByExample(VisaExample example);

    int deleteByPrimaryKey(Integer visaId);

    int insert(Visa record);

    int insertSelective(Visa record);

    List<Visa> selectByExample(VisaExample example);

    Visa selectByPrimaryKey(Integer visaId);

    int updateByExampleSelective(@Param("record") Visa record, @Param("example") VisaExample example);

    int updateByExample(@Param("record") Visa record, @Param("example") VisaExample example);

    int updateByPrimaryKeySelective(Visa record);

    int updateByPrimaryKey(Visa record);
}