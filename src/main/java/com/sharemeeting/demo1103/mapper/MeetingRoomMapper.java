package com.sharemeeting.demo1103.mapper;

import com.sharemeeting.demo1103.beans.MeetingRoom;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface MeetingRoomMapper {
//    List<MeetingRoom> findMeetingRoomByAddress(String address);
    List<MeetingRoom> ListMeetingRoom();
    void insertMeetingRoom(@Param("room")MeetingRoom room);
    int deleteMeetingRoom(@Param("Address")String Address);
    int UpdateMeetingRoom(@Param("room") MeetingRoom room);
}
