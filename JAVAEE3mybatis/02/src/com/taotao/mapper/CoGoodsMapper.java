package com.taotao.mapper;

import com.taotao.pojo.CoGoods;
import com.taotao.pojo.CoGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoGoodsMapper {
    int countByExample(CoGoodsExample example);

    int deleteByExample(CoGoodsExample example);

    int insert(CoGoods record);

    int insertSelective(CoGoods record);

    List<CoGoods> selectByExample(CoGoodsExample example);

    int updateByExampleSelective(@Param("record") CoGoods record, @Param("example") CoGoodsExample example);

    int updateByExample(@Param("record") CoGoods record, @Param("example") CoGoodsExample example);
}