package com.taotao.mapper;

import com.taotao.pojo.CoUser;
import com.taotao.pojo.CoUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoUserMapper {
    int countByExample(CoUserExample example);

    int deleteByExample(CoUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoUser record);

    int insertSelective(CoUser record);

    List<CoUser> selectByExample(CoUserExample example);

    CoUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoUser record, @Param("example") CoUserExample example);

    int updateByExample(@Param("record") CoUser record, @Param("example") CoUserExample example);

    int updateByPrimaryKeySelective(CoUser record);

    int updateByPrimaryKey(CoUser record);
}