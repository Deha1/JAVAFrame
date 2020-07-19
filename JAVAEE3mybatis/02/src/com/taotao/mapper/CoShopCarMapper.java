package com.taotao.mapper;

import com.taotao.pojo.CoShopCar;
import com.taotao.pojo.CoShopCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoShopCarMapper {
    int countByExample(CoShopCarExample example);

    int deleteByExample(CoShopCarExample example);

    int insert(CoShopCar record);

    int insertSelective(CoShopCar record);

    List<CoShopCar> selectByExample(CoShopCarExample example);

    int updateByExampleSelective(@Param("record") CoShopCar record, @Param("example") CoShopCarExample example);

    int updateByExample(@Param("record") CoShopCar record, @Param("example") CoShopCarExample example);
}