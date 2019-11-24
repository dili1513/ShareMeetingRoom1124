package com.sharemeeting.demo1103.beans;

public class Meeting {
    private int Meeting_id;
    private String Name;
    private String Sponsor;
    private long Start_time;
    private long End_time;
    private int Projector;
    private int Microphone;
    private String Status;//申请状态，为null或教室名；

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAdmName() {
        return AdmName;
    }

    public void setAdmName(String admName) {
        AdmName = admName;
    }

    private String user_id;//申请人ID,数据库中设varchar(30)；
    private String AdmName;
    private int Name_List_id;
    private int Headcount;


    public int getHeadcount() {
        return Headcount;
    }

    public void setHeadcount(int headcount) {
        Headcount = headcount;
    }

    public int getMeeting_id() {
        return Meeting_id;
    }

    public void setMeeting_id(int meeting_id) {
        Meeting_id = meeting_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSponsor() {
        return Sponsor;
    }

    public void setSponsor(String sponsor) {
        Sponsor = sponsor;
    }

    public long getStart_time() {
        return Start_time;
    }

    public void setStart_time(long start_time) {
        Start_time = start_time;
    }

    public long getEnd_time() {
        return End_time;
    }

    public void setEnd_time(long end_time) {
        End_time = end_time;
    }

    public int getProjector() {
        return Projector;
    }

    public void setProjector(int projector) {
        Projector = projector;
    }

    public int getMicrophone() {
        return Microphone;
    }

    public void setMicrophone(int microphone) {
        Microphone = microphone;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getName_List_id() {
        return Name_List_id;
    }

    public void setName_List_id(int name_List_id) {
        Name_List_id = name_List_id;
    }
}
