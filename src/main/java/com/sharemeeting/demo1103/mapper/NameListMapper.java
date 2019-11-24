package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.NameList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NameListMapper {
    List<NameList> getNameList();
    //增
    int saveNameList(NameList nameList);
    //删
    int deleteNameList(Integer ID);
    //查根据ID
    NameList findByID(Integer ID);
    //查根据部门
    List<NameList> findByDpt(String department);
}
