package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.MeetingPeople;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MeetingPeopleMapper {
    //插入
    int save(MeetingPeople meetingPeople);
    //根据会议ID查找
    List<MeetingPeople> findByID(Integer ID);

    int deleteOne(MeetingPeople meetingPeople);
    //根据ID删除
    int deleteByID(Integer ID);
}
