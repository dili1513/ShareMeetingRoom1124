package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.Meeting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MeetingMapper {
    List<Meeting> getMeetings();
    //增加
    int saveMeeting(Meeting meeting);
    //删除
    int deleteMeeting(Integer meetingID);
    //改（覆盖不能改单个）
    int updateMeeting(Meeting meeting);
    //根据ID查询
    Meeting findByID(Integer MeetingID);
    //根据uid查询
    List<Meeting> findByUID(String UserID);
    //根据AID查询
    List<Meeting> findByAID(String AdmName);
}
