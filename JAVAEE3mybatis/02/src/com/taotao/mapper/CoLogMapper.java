package com.taotao.mapper;

import com.taotao.pojo.CoLog;
import com.taotao.pojo.CoLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoLogMapper {
    int countByExample(CoLogExample example);

    int deleteByExample(CoLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoLog record);

    int insertSelective(CoLog record);

    List<CoLog> selectByExample(CoLogExample example);

    CoLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoLog record, @Param("example") CoLogExample example);

    int updateByExample(@Param("record") CoLog record, @Param("example") CoLogExample example);

    int updateByPrimaryKeySelective(CoLog record);

    int updateByPrimaryKey(CoLog record);
}