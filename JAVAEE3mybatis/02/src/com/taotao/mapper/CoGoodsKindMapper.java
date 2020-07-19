package com.taotao.mapper;

import com.taotao.pojo.CoGoodsKind;
import com.taotao.pojo.CoGoodsKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoGoodsKindMapper {
    int countByExample(CoGoodsKindExample example);

    int deleteByExample(CoGoodsKindExample example);

    int insert(CoGoodsKind record);

    int insertSelective(CoGoodsKind record);

    List<CoGoodsKind> selectByExample(CoGoodsKindExample example);

    int updateByExampleSelective(@Param("record") CoGoodsKind record, @Param("example") CoGoodsKindExample example);

    int updateByExample(@Param("record") CoGoodsKind record, @Param("example") CoGoodsKindExample example);
}