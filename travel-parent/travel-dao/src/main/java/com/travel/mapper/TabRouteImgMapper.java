package com.travel.mapper;

import com.travel.pojo.TabRouteImg;
import com.travel.pojo.TabRouteImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabRouteImgMapper {
    int countByExample(TabRouteImgExample example);

    int deleteByExample(TabRouteImgExample example);

    int deleteByPrimaryKey(Integer rgid);

    int insert(TabRouteImg record);

    int insertSelective(TabRouteImg record);

    List<TabRouteImg> selectByExample(TabRouteImgExample example);

    TabRouteImg selectByPrimaryKey(Integer rgid);

    int updateByExampleSelective(@Param("record") TabRouteImg record, @Param("example") TabRouteImgExample example);

    int updateByExample(@Param("record") TabRouteImg record, @Param("example") TabRouteImgExample example);

    int updateByPrimaryKeySelective(TabRouteImg record);

    int updateByPrimaryKey(TabRouteImg record);
}