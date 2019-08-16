package com.newer.mapper;

import com.newer.domain.TeaOrder;
import org.apache.ibatis.annotations.Insert;

public interface TeaOrderMapper {
    @Insert("insert into tea (detail,num,price) value(#{detail},#{num},#{price})")
    int addOrder(TeaOrder teaOrder);


}
