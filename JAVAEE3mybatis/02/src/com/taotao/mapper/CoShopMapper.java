package com.taotao.mapper;

import com.taotao.pojo.CoShop;
import com.taotao.pojo.CoShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoShopMapper {
    int countByExample(CoShopExample example);

    int deleteByExample(CoShopExample example);

    int insert(CoShop record);

    int insertSelective(CoShop record);

    List<CoShop> selectByExample(CoShopExample example);

    int updateByExampleSelective(@Param("record") CoShop record, @Param("example") CoShopExample example);

    int updateByExample(@Param("record") CoShop record, @Param("example") CoShopExample example);
}