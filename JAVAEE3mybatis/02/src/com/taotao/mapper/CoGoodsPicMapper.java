package com.taotao.mapper;

import com.taotao.pojo.CoGoodsPic;
import com.taotao.pojo.CoGoodsPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoGoodsPicMapper {
    int countByExample(CoGoodsPicExample example);

    int deleteByExample(CoGoodsPicExample example);

    int insert(CoGoodsPic record);

    int insertSelective(CoGoodsPic record);

    List<CoGoodsPic> selectByExample(CoGoodsPicExample example);

    int updateByExampleSelective(@Param("record") CoGoodsPic record, @Param("example") CoGoodsPicExample example);

    int updateByExample(@Param("record") CoGoodsPic record, @Param("example") CoGoodsPicExample example);
}