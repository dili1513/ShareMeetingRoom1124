package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.MeetingRoom;
import com.sharemeeting.demo1103.mapper.MeetingRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomService {

    @Autowired
    private MeetingRoomMapper meetingroomMapper;

    public MeetingRoom insertMeetingRoom(MeetingRoom meetingRoom) { meetingroomMapper.insertMeetingRoom(meetingRoom);return meetingRoom;}
    public List<MeetingRoom> ListMeetingRoom(){
        return  meetingroomMapper.ListMeetingRoom();
    }
    public int UpdateMeetingRoom(MeetingRoom meetingRoom){
        return meetingroomMapper.UpdateMeetingRoom(meetingRoom);
    }
    public int deleteMeetingRoom(String Address){
        return meetingroomMapper.deleteMeetingRoom(Address);
    }
}
