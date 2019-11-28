package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.Meeting;
import com.sharemeeting.demo1103.beans.MeetingRoom;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface MeetingRoomMapper {
    List<MeetingRoom> findMeetingRoom(@Param("room") MeetingRoom room);
    List<MeetingRoom> ListMeetingRoomFromUser(@Param("Username") String Username);
    List<MeetingRoom> ListMeetingRoomFromAdmin(@Param("AdminName") String AdminName);
    List<MeetingRoom> ListMeetingRoom();

    void insertMeetingRoom(MeetingRoom room);
    int deleteMeetingRoomU(String Name,String Username);
    int deleteMeetingRoomA(String Name,String Admname);
    int UpdateMeetingRoom(@Param("room") MeetingRoom room);
}
