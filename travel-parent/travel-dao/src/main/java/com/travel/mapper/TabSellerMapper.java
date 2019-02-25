package com.travel.mapper;

import com.travel.pojo.TabSeller;
import com.travel.pojo.TabSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabSellerMapper {
    int countByExample(TabSellerExample example);

    int deleteByExample(TabSellerExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(TabSeller record);

    int insertSelective(TabSeller record);

    List<TabSeller> selectByExample(TabSellerExample example);

    TabSeller selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") TabSeller record, @Param("example") TabSellerExample example);

    int updateByExample(@Param("record") TabSeller record, @Param("example") TabSellerExample example);

    int updateByPrimaryKeySelective(TabSeller record);

    int updateByPrimaryKey(TabSeller record);
}