package com.travel.mapper;

import com.travel.pojo.TabFavorite;
import com.travel.pojo.TabFavoriteExample;
import com.travel.pojo.TabFavoriteKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabFavoriteMapper {
    int countByExample(TabFavoriteExample example);

    int deleteByExample(TabFavoriteExample example);

    int deleteByPrimaryKey(TabFavoriteKey key);

    int insert(TabFavorite record);

    int insertSelective(TabFavorite record);

    List<TabFavorite> selectByExample(TabFavoriteExample example);

    TabFavorite selectByPrimaryKey(TabFavoriteKey key);

    int updateByExampleSelective(@Param("record") TabFavorite record, @Param("example") TabFavoriteExample example);

    int updateByExample(@Param("record") TabFavorite record, @Param("example") TabFavoriteExample example);

    int updateByPrimaryKeySelective(TabFavorite record);

    int updateByPrimaryKey(TabFavorite record);
}