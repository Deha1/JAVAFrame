package com.taotao.mapper;

import com.taotao.pojo.CoUserInfo;
import com.taotao.pojo.CoUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoUserInfoMapper {
    int countByExample(CoUserInfoExample example);

    int deleteByExample(CoUserInfoExample example);

    int insert(CoUserInfo record);

    int insertSelective(CoUserInfo record);

    List<CoUserInfo> selectByExample(CoUserInfoExample example);

    int updateByExampleSelective(@Param("record") CoUserInfo record, @Param("example") CoUserInfoExample example);

    int updateByExample(@Param("record") CoUserInfo record, @Param("example") CoUserInfoExample example);
}