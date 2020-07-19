package com.taotao.mapper;

import com.taotao.pojo.CoOrdersInfo;
import com.taotao.pojo.CoOrdersInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoOrdersInfoMapper {
    int countByExample(CoOrdersInfoExample example);

    int deleteByExample(CoOrdersInfoExample example);

    int insert(CoOrdersInfo record);

    int insertSelective(CoOrdersInfo record);

    List<CoOrdersInfo> selectByExample(CoOrdersInfoExample example);

    int updateByExampleSelective(@Param("record") CoOrdersInfo record, @Param("example") CoOrdersInfoExample example);

    int updateByExample(@Param("record") CoOrdersInfo record, @Param("example") CoOrdersInfoExample example);
}