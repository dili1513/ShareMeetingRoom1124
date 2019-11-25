package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.Meeting;
import com.sharemeeting.demo1103.beans.MeetingRoom;
import com.sharemeeting.demo1103.mapper.MeetingRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomService {

    @Autowired
    private MeetingRoomMapper meetingroomMapper;

    public List<MeetingRoom> ListMeetingRoomFromUser(String username){
        return meetingroomMapper.ListMeetingRoomFromUser(username);
    }
    public List<MeetingRoom> ListMeetingRoomFromAdmin(String AdminName){
        return meetingroomMapper.ListMeetingRoomFromAdmin(AdminName);
    }
    //插入会议室返回ID号，先返回该会议室数据；
    public int insertMeetingRoom(MeetingRoom meetingRoom) {
        meetingroomMapper.insertMeetingRoom(meetingRoom);
        return meetingRoom.getID();
    }
//    public List<MeetingRoom> findMeetingRoom(MeetingRoom meetingRoom){
//        return meetingroomMapper.findMeetingRoom(meetingRoom);
//    }
    public List<MeetingRoom> ListMeetingRoom(){
        return  meetingroomMapper.ListMeetingRoom();
    }
    public int UpdateMeetingRoom(MeetingRoom meetingRoom){
        return meetingroomMapper.UpdateMeetingRoom(meetingRoom);
    }
    public int deleteMeetingRoomU(String Name,String Username){
        return meetingroomMapper.deleteMeetingRoomU(Name,Username);
    }
    public int deleteMeetingRoomA(String Name,String Admname){
        return meetingroomMapper.deleteMeetingRoomA(Name,Admname);
    }
}
