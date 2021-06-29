package com.henu.admin.mappper;

import com.henu.admin.bean.Purse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurseMapper {
    public Purse getPurse(long id);
}
