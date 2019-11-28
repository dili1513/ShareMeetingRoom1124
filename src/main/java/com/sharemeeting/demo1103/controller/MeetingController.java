package com.sharemeeting.demo1103.controller;

import com.sharemeeting.demo1103.beans.Meeting;
import com.sharemeeting.demo1103.beans.MeetingPeople;
import com.sharemeeting.demo1103.service.MeetingPeopleService;
import com.sharemeeting.demo1103.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "/meeting", method = { RequestMethod.GET, RequestMethod.POST })
public class MeetingController {
    @Autowired
    private MeetingService meetingService;
    @Autowired
    private MeetingPeopleService meetingPeopleService;

    @RequestMapping("getMeetings")
    @ResponseBody
    public List<Meeting> getMeetings() {
        return meetingService.getMeetings();
    }

    //1.添加,新增nameList
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(Meeting meeting, String peoples)
    {
        try{
            meeting.setStatus("申请中");
            int result = meetingService.saveMeeting(meeting);
            //分割nameList字符串并插入到NamePeople表中
            String[] split = peoples.split(";");
            for(String people : split){
                int number = Integer.parseInt(people);
                MeetingPeople meetingPeople = new MeetingPeople();
                meetingPeople.setNameID(number);
                meetingPeople.setID(meeting.getID());
                meetingPeopleService.save(meetingPeople);
            }
            return meeting.getID()+"";
        }catch (Exception e){
            return "WTFnull";
        }
    }

    //2.根据ID删除
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(Integer ID) {
        try{
            meetingPeopleService.deleteByID(ID);
            meetingService.deleteMeeting(ID);
            return "删除成功";
        }catch (Exception e){
            return "WTFnull";
        }
    }

    //3.更新
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(Meeting meeting)
    {
        try{
            int result = meetingService.updateMeeting(meeting);
            return "更新成功";
        }catch (Exception e){
            return "WTFnull";
        }
    }
    //在“已分配”状态下才会判断会议是否完成，反成了则返回“已完成”，否则返回原来的状态
    public String isFinished(@NotNull String endTime, String status) {
        Date date = new Date();
        String year = String.format("%tY",date);
        String month = String.format("%tm",date);
        String day = String.format("%td",date);
        String hour = String.format("%tH",date);
        String min = String.format("%tM",date);
        String nowDate = year + month + day + hour + min;
        if(endTime.compareTo(nowDate) > 0) {
            return status;
        }
        else {
            return "已结束";
        }
    }

    //根据会议ID查找
    @RequestMapping("findByID")
    @ResponseBody
    public String findByID(Integer ID) {
        try{
            Meeting meeting = meetingService.findByID(ID);
            //判断是否已结束，若结束则status改为以结束，并且更新meeting
            if(meeting.getStatus().compareTo("已分配") == 0){
                meeting.setStatus(isFinished(meeting.getEndTime(),meeting.getStatus()));
                meetingService.updateMeeting(meeting);
            }
            return meeting.getName()+ ";" + meeting.getSponsor() + ";" + meeting.getStartTime() + ";" + meeting.getEndTime() + ";" + meeting.getHeadcount() + ";" +
                    meeting.getProjector() + ";" + meeting.getMicrophone() + ";" + meeting.getStatus() + ";" + meeting.getUserID() + ";" + meeting.getAdmName() + ";" +
                    meeting.getRoomID();
        }catch (Exception e){
            return "WTFnull";
        }
    }

    //根据UID查找
    @RequestMapping("findByUID")
    @ResponseBody
    public String findByUID(String UID) {
        try{
            List<Meeting> meetings = meetingService.findByUID(UID);
            String str = "";
            Iterator<Meeting> it = meetings.iterator();
            while (it.hasNext()) {
                Meeting meeting = it.next();
                //判断是否已结束，若结束则status改为以结束，并且更新meeting
                if(meeting.getStatus().compareTo("已分配") == 0){
                    meeting.setStatus(isFinished(meeting.getEndTime(),meeting.getStatus()));
                    meetingService.updateMeeting(meeting);
                }
//            str += meeting.getName()+ ";" + meeting.getSponsor() + ";" + meeting.getStartTime() + ";" + meeting.getEndTime() + ";" + meeting.getHeadcount() + ";" +
//                    meeting.getProjector() + ";" + meeting.getMicrophone() + ";" + meeting.getStatus() + ";" + meeting.getUserID() + ";" + meeting.getAdmName() + ";" +
//                    meeting.getRoomID() + "|";
                str += meeting.getName()+ ";" + ";" + meeting.getStartTime() + ";" + meeting.getStatus() + "|";
            }
            str = str.substring(0,str.length()-1);
            return str;
        }catch (Exception e){
            return "WTFnull";
        }
    }
    //根据AID查找
    @RequestMapping("findByAID")
    @ResponseBody
    public String findAyUID(String AID) {
        try{
            List<Meeting> meetings = meetingService.findByAID(AID);
            String str = "";
            Iterator<Meeting> it = meetings.iterator();
            while (it.hasNext()) {
                Meeting meeting = it.next();
                //判断是否已结束，若结束则status改为以结束，并且更新meeting
                if(meeting.getStatus().compareTo("已分配") == 0){
                    meeting.setStatus(isFinished(meeting.getEndTime(),meeting.getStatus()));
                    meetingService.updateMeeting(meeting);
                }
                str += meeting.getName()+ ";" + meeting.getSponsor() + ";" + meeting.getStartTime() + ";" + meeting.getEndTime() + ";" + meeting.getHeadcount() + ";" +
                        meeting.getProjector() + ";" + meeting.getMicrophone() + ";" + meeting.getStatus() + ";" + meeting.getUserID() + ";" + meeting.getAdmName() + ";" +
                        meeting.getRoomID() + "|";
            }
            str = str.substring(0,str.length()-1);
            return str;
        }catch (Exception e){
            return "WTFnull";
        }
    }
}
