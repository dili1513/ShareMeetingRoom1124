package com.sharemeeting.demo1103.beans;

import java.util.Date;

public class ShareTime {
    private int ID;
    private String StartTime;
    private String EndTime;
    private int MeetingRoomID;//设为外键；

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public int getMeetingRoomID() {
        return MeetingRoomID;
    }

    public void setMeetingRoomID(int meetingRoomID) {
        MeetingRoomID = meetingRoomID;
    }
}
