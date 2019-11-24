package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.MeetingPeople;
import com.sharemeeting.demo1103.mapper.MeetingPeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingPeopleService {

    @Autowired
    private MeetingPeopleMapper meetingPeopleMapper;

    public int save(MeetingPeople meetingPeople){
        return meetingPeopleMapper.save(meetingPeople);
    }

    public List<MeetingPeople> findByID(Integer ID){
        return meetingPeopleMapper.findByID(ID);
    }

    public int deleteOne(MeetingPeople meetingPeople){
        return meetingPeopleMapper.deleteOne(meetingPeople);
    }

    public int deleteByID(int ID){
        return meetingPeopleMapper.deleteByID(ID);
    }
}
