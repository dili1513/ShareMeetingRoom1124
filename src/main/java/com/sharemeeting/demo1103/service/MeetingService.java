package com.sharemeeting.demo1103.service;

import com.sharemeeting.demo1103.beans.Meeting;
import com.sharemeeting.demo1103.mapper.MeetingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {
    @Autowired
    private MeetingMapper meetingMapper;

    public List<Meeting> getMeetings() {
        return meetingMapper.getMeetings();
    }
    public int saveMeeting(Meeting meeting) {
        return meetingMapper.saveMeeting(meeting);
    }

    public int deleteMeeting(Integer meetingID) {
        return meetingMapper.deleteMeeting(meetingID);
    }

    public int updateMeeting(Meeting meeting) {
        return meetingMapper.updateMeeting(meeting);
    }

    public Meeting findByID(Integer meetingID) {
        return meetingMapper.findByID(meetingID);
    }

    public List<Meeting> findByUID(String UID) {
        return meetingMapper.findByUID(UID);
    }

    public List<Meeting> findByAID(String AID) {
        return meetingMapper.findByAID(AID);
    }
}
