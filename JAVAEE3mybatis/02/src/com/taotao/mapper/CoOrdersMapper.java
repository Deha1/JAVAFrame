package com.taotao.mapper;

import com.taotao.pojo.CoOrders;
import com.taotao.pojo.CoOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoOrdersMapper {
    int countByExample(CoOrdersExample example);

    int deleteByExample(CoOrdersExample example);

    int insert(CoOrders record);

    int insertSelective(CoOrders record);

    List<CoOrders> selectByExample(CoOrdersExample example);

    int updateByExampleSelective(@Param("record") CoOrders record, @Param("example") CoOrdersExample example);

    int updateByExample(@Param("record") CoOrders record, @Param("example") CoOrdersExample example);
}