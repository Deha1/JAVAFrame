package com.taotao.mapper;

import com.taotao.pojo.CoAddress;
import com.taotao.pojo.CoAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoAddressMapper {
    int countByExample(CoAddressExample example);

    int deleteByExample(CoAddressExample example);

    int insert(CoAddress record);

    int insertSelective(CoAddress record);

    List<CoAddress> selectByExample(CoAddressExample example);

    int updateByExampleSelective(@Param("record") CoAddress record, @Param("example") CoAddressExample example);

    int updateByExample(@Param("record") CoAddress record, @Param("example") CoAddressExample example);
}