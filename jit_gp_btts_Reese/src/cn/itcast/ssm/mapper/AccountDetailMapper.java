package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.AccountDetail;
import cn.itcast.ssm.po.AccountDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountDetailMapper {
    int countByExample(AccountDetailExample example);

    int deleteByExample(AccountDetailExample example);

    int deleteByPrimaryKey(String outland);

    int insert(AccountDetail record);

    int insertSelective(AccountDetail record);

    List<AccountDetail> selectByExample(AccountDetailExample example);

    AccountDetail selectByPrimaryKey(String outland);

    int updateByExampleSelective(@Param("record") AccountDetail record, @Param("example") AccountDetailExample example);

    int updateByExample(@Param("record") AccountDetail record, @Param("example") AccountDetailExample example);

    int updateByPrimaryKeySelective(AccountDetail record);

    int updateByPrimaryKey(AccountDetail record);
}