package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.ShareTime;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareTimeMapper {
//    List<ShareTime> findShareTime(String start_time, String end_time);
    public List<ShareTime> ListShareTime();
    public void insertST(@Param("shareTime")ShareTime shareTime);
    public int deleteST(int ID);
    public int UpdateST(@Param("shareTime") ShareTime shareTime);
}
