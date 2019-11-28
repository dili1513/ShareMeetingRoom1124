package com.sharemeeting.demo1103.controller;

import com.sharemeeting.demo1103.beans.Meeting;
import com.sharemeeting.demo1103.beans.MeetingRoom;
import com.sharemeeting.demo1103.service.MeetingRoomService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
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
    @RequestMapping(value = "deleteUserMeetingRoom", method = RequestMethod.GET)
    public String deleteU(String Name,String Username) {
        int result = meetingRoomservice.deleteMeetingRoomU(Name,Username);
        System.out.println("Name: "+Name+" Username: "+Username);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    @RequestMapping(value = "deleteAdminMeetingRoom", method = RequestMethod.GET)
    public String deleteA(String Name,String Admname) {
        int result = meetingRoomservice.deleteMeetingRoomA(Name,Admname);
        System.out.println("Name: "+Name+" Admname: "+Admname);
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
//        int result=meetingRoomservice.insertMeetingRoom(meetingRoom);
//        if(result>=1){
//            System.out.println("ID:"+meetingRoom.getID()+"\n");
//            return meetingRoom.getID()+"";
//        }else{
//            return "添加失败";
//        }f
        return meetingRoomservice.insertMeetingRoom(meetingRoom)+"";

    }
//    @RequestMapping(value = "FindMeetingRoomID")
//    public List<MeetingRoom> FindMeetingRoomID(MeetingRoom meetingroom){
//        System.out.print("meetingroom:"+meetingroom.getAddress()+"\n");
//        List<MeetingRoom> MRL=meetingRoomservice.findMeetingRoom(meetingroom);
//        Iterator<MeetingRoom> it=MRL.iterator();
//        while (it.hasNext()) {
//            MeetingRoom temp=it.next();
//            System.out.print("meetingroom ID:"+temp.getID()+"\n");
//        }
//        return meetingRoomservice.findMeetingRoom(meetingroom);
////        return MR.getID();
//    }

    @RequestMapping(value = "ListMeetingRoomFromUser")
    public String ListMeetingRoomFromUser(String username){
        List<MeetingRoom> MRS=meetingRoomservice.ListMeetingRoomFromUser(username);
        String str = "";
        Iterator<MeetingRoom> it = MRS.iterator();
        while(it.hasNext()){
            MeetingRoom meetingroom=it.next();
            str+=meetingroom.getAddress()+';'+meetingroom.getName()+';'+
                    meetingroom.getCapacity()+';' +meetingroom.getProjector()+';'+
                    meetingroom.getMicrophone()+';'+meetingroom.getUsername()+'|';
        }
        if(str.length()>1){
            str=str.substring(0,str.length()-1);
        }else{
            str="null";
        }
        return str;
    }
    @RequestMapping(value = "ListMeetingRoomFromAdmin")
    public String ListMeetingRoomFromAdmin(String Admname){
        List<MeetingRoom> MRS=meetingRoomservice.ListMeetingRoomFromAdmin(Admname);
        String str = "";
        Iterator<MeetingRoom> it = MRS.iterator();
        //返回转化成字符串；
        while(it.hasNext()){
            MeetingRoom meetingroom=it.next();
            str+=meetingroom.getAddress()+';'+meetingroom.getName()+';'+
                    meetingroom.getCapacity()+';' +meetingroom.getProjector()+';'+
                    meetingroom.getMicrophone()+';'+meetingroom.getAdmname()+'|';
        }
        if(str.length()>1){
            str=str.substring(0,str.length()-1);
        }else{
            str="null";
        }
        return str;
    }
}
