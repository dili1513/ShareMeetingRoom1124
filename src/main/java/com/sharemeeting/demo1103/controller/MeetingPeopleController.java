package com.sharemeeting.demo1103.controller;

import com.sharemeeting.demo1103.beans.MeetingPeople;
import com.sharemeeting.demo1103.beans.NameList;
import com.sharemeeting.demo1103.service.MeetingPeopleService;
import com.sharemeeting.demo1103.service.NameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "/meetingPeople", method = { RequestMethod.GET, RequestMethod.POST })
public class MeetingPeopleController {
    @Autowired
    MeetingPeopleService meetingPeopleService;
    @Autowired
    NameListService nameListService;

    //添加
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(MeetingPeople meetingPeople)
    {
        int result = meetingPeopleService.save(meetingPeople);
        if (result >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    //根据会议ID查找
    @RequestMapping("findByID")
    @ResponseBody
    public String findByID(Integer ID) {
        List<MeetingPeople> meetingPeoples = meetingPeopleService.findByID(ID);
        String str = "";
        Iterator<MeetingPeople> it = meetingPeoples.iterator();
        while (it.hasNext()) {
            MeetingPeople meetingPeople = it.next();
            NameList people = nameListService.findByID(meetingPeople.getNameID());
            str += people.getID() +";" +people.getName() + "|";
        }
        str = str.substring(0,str.length()-1);
        return str;
    }

    //根据NameID和ID删除一个人删除
    @RequestMapping(value = "deleteOne", method = RequestMethod.GET)
    public String deleteOne(MeetingPeople meetingPeople) {
        int result = meetingPeopleService.deleteOne(meetingPeople);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //根据ID删除多个人删除
    @RequestMapping(value = "deleteByID", method = RequestMethod.GET)
    public String deleteByID(Integer ID) {
        int result = meetingPeopleService.deleteByID(ID);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
}
