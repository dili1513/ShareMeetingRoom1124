package com.sharemeeting.demo1103.controller;

import com.sharemeeting.demo1103.beans.MeetingRoom;
import com.sharemeeting.demo1103.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RestController
@RequestMapping(value = "/MeetingRoom", method = { RequestMethod.GET, RequestMethod.POST })
public class MeetingRoomcontroller {

    @Autowired
    private MeetingRoomService meetingRoomservice;

    @RequestMapping("ListMeetingRoom")
    @ResponseBody
    public List<MeetingRoom> ListMeetingRoom(){
        return meetingRoomservice.ListMeetingRoom();
    }
//    //对数据库进行查找操作
//    @RequestMapping("ListUserByname")
//    @ResponseBody
//    public List<User> ListUserByname(String name) {
//        return meetingRoomservice.findByName(name);
//    }//返回空的情况；
    //对数据库进行的删除操作
    @RequestMapping(value = "deleteMeetingRoom", method = RequestMethod.GET)
    public String delete(String Address) {
        int result = meetingRoomservice.deleteMeetingRoom(Address);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //对数据进行修改的操作
    @RequestMapping(value = "updateMeetingRoom", method = RequestMethod.POST)
    public String updateMeetingRoom(MeetingRoom meetingRoom) {
        int result = meetingRoomservice.UpdateMeetingRoom(meetingRoom);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //对数据库进行增加字段操作
    @RequestMapping(value = "insertMeetingRoom", method = RequestMethod.POST)
    public String insert(MeetingRoom meetingRoom)
    {
        meetingRoomservice.insertMeetingRoom(meetingRoom);
        return "插入成功";
    }
}
